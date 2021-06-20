package me.zlataovce.sysmonitor.wrappers;

import lombok.Getter;
import oshi.software.os.OperatingSystem;

public class OSWrapper {
    @Getter
    private final int bitness;

    @Getter
    private final String family;

    @Getter
    private final String manufacturer;

    @Getter
    private final int processCount;

    @Getter
    private final long systemBootTime;

    @Getter
    private final long systemUptime;

    @Getter
    private final OperatingSystem.OSVersionInfo versionInfo;

    public OSWrapper(int bitness, String family, String manufacturer, int processCount, long systemBootTime, long systemUptime, OperatingSystem.OSVersionInfo versionInfo) {
        this.bitness = bitness;
        this.family = family;
        this.manufacturer = manufacturer;
        this.processCount = processCount;
        this.systemBootTime = systemBootTime;
        this.systemUptime = systemUptime;
        this.versionInfo = versionInfo;
    }
}
