package me.zlataovce.sysmonitor.gatherers;

import me.zlataovce.sysmonitor.datatypes.SystemResources;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;

public class DataGatherer {
    private final HardwareAbstractionLayer hardware = new SystemInfo().getHardware();
    private long[] ticks = new long[CentralProcessor.TickType.values().length];

    public DataGatherer() {}

    public double getCPUPercent() {
        CentralProcessor cpu = hardware.getProcessor();
        double cpuLoad = cpu.getSystemCpuLoadBetweenTicks(ticks) * 100;
        ticks = cpu.getSystemCpuLoadTicks();
        return (double) Math.round(cpuLoad * 100d) / 100d;
    }

    public long getReadableRAMAvailable() {
        GlobalMemory ram = hardware.getMemory();
        return ram.getAvailable() / 1048576L;
    }

    public long getReadableRAMTotal() {
        GlobalMemory ram = hardware.getMemory();
        return ram.getTotal() / 1048576L;
    }

    public long getReadableRAMUsed() {
        GlobalMemory ram = hardware.getMemory();
        return (ram.getTotal() - ram.getAvailable()) / 1048576L;
    }

    public SystemResources getResource() {
        return new SystemResources(this.getCPUPercent(), this.getReadableRAMUsed(), this.getReadableRAMTotal(), this.getReadableRAMAvailable());
    }
}
