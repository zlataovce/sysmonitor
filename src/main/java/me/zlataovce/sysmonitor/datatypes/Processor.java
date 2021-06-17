package me.zlataovce.sysmonitor.datatypes;

import lombok.Getter;

public class Processor {
    @Getter
    private final String cpuModel;

    @Getter
    private final long cpuFreq;

    @Getter
    private final int cpuPhysicalProcessors;

    public Processor(String cpuModel, long cpuFreq, int cpuPhysicalProcessors) {
        this.cpuModel = cpuModel;
        this.cpuFreq = cpuFreq;
        this.cpuPhysicalProcessors = cpuPhysicalProcessors;
    }
}
