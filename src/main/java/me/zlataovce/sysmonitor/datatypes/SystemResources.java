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

    public SystemResources(double cpuPercent, long ramUsed, long ramTotal, long ramAvailable) {
        this.cpuPercent = cpuPercent;
        this.ramUsed = ramUsed;
        this.ramTotal = ramTotal;
        this.ramAvailable = ramAvailable;
    }
}
