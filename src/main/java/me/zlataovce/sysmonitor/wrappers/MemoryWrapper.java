package me.zlataovce.sysmonitor.wrappers;

import lombok.Getter;
import oshi.hardware.PhysicalMemory;
import oshi.hardware.VirtualMemory;

import java.util.List;

public class MemoryWrapper {
    @Getter
    private final long available;

    @Getter
    private final long used;

    @Getter
    private final long total;

    @Getter
    private final VirtualMemory virtualMemory;

    @Getter
    private final List<PhysicalMemory> physicalMemory;

    public MemoryWrapper(long available, long used, long total, VirtualMemory virtualMemory, List<PhysicalMemory> physicalMemory) {
        this.available = available;
        this.used = used;
        this.total = total;
        this.virtualMemory = virtualMemory;
        this.physicalMemory = physicalMemory;
    }
}
