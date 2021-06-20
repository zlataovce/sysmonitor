package me.zlataovce.sysmonitor.wrappers;

import lombok.Getter;

public class DiskWrapper {
    @Getter
    private final String model;

    @Getter
    private final long read;

    @Getter
    private final long readCount;

    @Getter
    private final String serial;

    @Getter
    private final long size;

    @Getter
    private final long write;

    @Getter
    private final long writeCount;

    public DiskWrapper(String model, long read, long readCount, String serial, long size, long write, long writeCount) {
        this.model = model;
        this.read = read;
        this.readCount = readCount;
        this.serial = serial;
        this.size = size;
        this.write = write;
        this.writeCount = writeCount;
    }
}
