package me.zlataovce.sysmonitor.wrappers;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

import java.util.ArrayList;
import java.util.List;

public class WrapperFactory {
    private final SystemInfo interf = new SystemInfo();
    private long[] ticks = new long[CentralProcessor.TickType.values().length];
    private final HardwareAbstractionLayer hal = interf.getHardware();
    private final CentralProcessor cpu = hal.getProcessor();
    private final GlobalMemory mem = hal.getMemory();
    private final List<HWDiskStore> disks = hal.getDiskStores();
    private final OperatingSystem os = interf.getOperatingSystem();

    public WrapperFactory() {}

    public MemoryWrapper wrapMemory() {
        return new MemoryWrapper(this.mem.getAvailable() / 1048576L, (this.mem.getTotal() - this.mem.getAvailable()) / 1048576L, this.mem.getTotal(), this.mem.getVirtualMemory(), this.mem.getPhysicalMemory());
    }

    public ProcessorWrapper wrapProcessor() {
        double utilization = this.cpu.getSystemCpuLoadBetweenTicks(ticks) * 100;
        this.ticks = this.cpu.getSystemCpuLoadTicks();
        List<Long> clampedFreq = new ArrayList<>();

        for (long freq : this.cpu.getCurrentFreq()) {
            clampedFreq.add(freq / 1000000);
        }

        return new ProcessorWrapper(clampedFreq, this.cpu.getLogicalProcessorCount(), this.cpu.getLogicalProcessors(), this.cpu.getMaxFreq(), this.cpu.getPhysicalPackageCount(), this.cpu.getPhysicalProcessorCount(), this.cpu.getProcessorIdentifier(), utilization);
    }

    public List<DiskWrapper> wrapDisks() {
        List<DiskWrapper> wrappedDisks = new ArrayList<>();

        for (HWDiskStore disk : this.disks) {
            if (disk.updateAttributes()) {
                wrappedDisks.add(new DiskWrapper(disk.getModel(),disk.getReadBytes() / 1048576L, disk.getReads(), disk.getSerial(), disk.getSize() / 1048576L, disk.getWriteBytes() / 1048576L, disk.getWrites()));
            }
        }
        return wrappedDisks;
    }

    public OSWrapper wrapOS() {
        return new OSWrapper(this.os.getBitness(), this.os.getFamily(), this.os.getManufacturer(), this.os.getProcessCount(), this.os.getSystemBootTime(), this.os.getSystemUptime(), this.os.getVersionInfo());
    }

    public MachineWrapper wrapMachine() {
        return new MachineWrapper(this.wrapProcessor(), this.wrapMemory(), this.wrapDisks(), this.wrapOS());
    }
}
