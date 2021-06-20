package me.zlataovce.sysmonitor.wrappers;

import lombok.Getter;

import java.util.List;

public class MachineWrapper {
    @Getter
    private final ProcessorWrapper processor;

    @Getter
    private final MemoryWrapper memory;

    @Getter
    private final List<DiskWrapper> disks;

    @Getter
    private final OSWrapper os;

    public MachineWrapper(ProcessorWrapper processor, MemoryWrapper memory, List<DiskWrapper> disks, OSWrapper os) {
        this.processor = processor;
        this.memory = memory;
        this.disks = disks;
        this.os = os;
    }
}
