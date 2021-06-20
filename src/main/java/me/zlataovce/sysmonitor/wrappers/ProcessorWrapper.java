package me.zlataovce.sysmonitor.wrappers;

import lombok.Getter;
import oshi.hardware.CentralProcessor;

import java.util.List;

public class ProcessorWrapper {
    @Getter
    private final List<Long> currentFreq;

    @Getter
    private final int logicalProcessorsCount;

    @Getter
    private final List<CentralProcessor.LogicalProcessor> logicalProcessors;

    @Getter
    private final long maxFreq;

    @Getter
    private final int physicalPackageCount;

    @Getter
    private final int physicalProcessorCount;

    @Getter
    private final CentralProcessor.ProcessorIdentifier processorIdentifier;

    @Getter
    private final double utilization;

    public ProcessorWrapper(List<Long> currentFreq, int logicalProcessorsCount, List<CentralProcessor.LogicalProcessor> logicalProcessors, long maxFreq, int physicalPackageCount, int physicalProcessorCount, CentralProcessor.ProcessorIdentifier processorIdentifier, double utilization) {
        this.currentFreq = currentFreq;
        this.logicalProcessorsCount = logicalProcessorsCount;
        this.logicalProcessors = logicalProcessors;
        this.maxFreq = maxFreq;
        this.physicalPackageCount = physicalPackageCount;
        this.physicalProcessorCount = physicalProcessorCount;
        this.processorIdentifier = processorIdentifier;
        this.utilization = utilization;
    }
}
