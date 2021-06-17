package me.zlataovce.sysmonitor.datatypes;

import lombok.Getter;

public class SystemResources {
    @Getter
    private final double cpuPercent;

    @Getter
    private final long ramUsed;

    @Getter
    private final long ramTotal;

    @Getter
    private final long ramAvailable;

    @Getter
    private final Processor processor;

    public SystemResources(double cpuPercent, long ramUsed, long ramTotal, long ramAvailable, Processor processor) {
        this.cpuPercent = cpuPercent;
        this.ramUsed = ramUsed;
        this.ramTotal = ramTotal;
        this.ramAvailable = ramAvailable;
        this.processor = processor;
    }
}
