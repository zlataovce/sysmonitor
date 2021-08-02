# sysmonitor

A simple RESTful API serving the resources statistics of the hosting system.  
Written in Java and Spring Framework.

## Building
 - Build the project using gradle, run the task `bootJar` to produce a executable JAR file.

## API
**localhost:8080/api?key=**
 - *key*: the token generated in app.config

*Note:* RAM sizes are written in **MB** and CPU frequency is written in **MHz**.

**Example response:**
```json
{
  "processor": {
    "currentFreq": [
      3700,
      3700,
      3700,
      3700,
      3700,
      3700,
      3700,
      3700,
      3700,
      3700,
      3700,
      3700,
      3700,
      3700,
      3700,
      3700
    ],
    "logicalProcessorsCount": 16,
    "logicalProcessors": [
      {
        "processorNumber": 0,
        "physicalProcessorNumber": 0,
        "physicalPackageNumber": 0,
        "numaNode": 0,
        "processorGroup": 0
      },
      {
        "processorNumber": 1,
        "physicalProcessorNumber": 0,
        "physicalPackageNumber": 0,
        "numaNode": 0,
        "processorGroup": 0
      },
      {
        "processorNumber": 2,
        "physicalProcessorNumber": 1,
        "physicalPackageNumber": 0,
        "numaNode": 0,
        "processorGroup": 0
      },
      {
        "processorNumber": 3,
        "physicalProcessorNumber": 1,
        "physicalPackageNumber": 0,
        "numaNode": 0,
        "processorGroup": 0
      },
      {
        "processorNumber": 4,
        "physicalProcessorNumber": 2,
        "physicalPackageNumber": 0,
        "numaNode": 0,
        "processorGroup": 0
      },
      {
        "processorNumber": 5,
        "physicalProcessorNumber": 2,
        "physicalPackageNumber": 0,
        "numaNode": 0,
        "processorGroup": 0
      },
      {
        "processorNumber": 6,
        "physicalProcessorNumber": 3,
        "physicalPackageNumber": 0,
        "numaNode": 0,
        "processorGroup": 0
      },
      {
        "processorNumber": 7,
        "physicalProcessorNumber": 3,
        "physicalPackageNumber": 0,
        "numaNode": 0,
        "processorGroup": 0
      },
      {
        "processorNumber": 8,
        "physicalProcessorNumber": 4,
        "physicalPackageNumber": 0,
        "numaNode": 0,
        "processorGroup": 0
      },
      {
        "processorNumber": 9,
        "physicalProcessorNumber": 4,
        "physicalPackageNumber": 0,
        "numaNode": 0,
        "processorGroup": 0
      },
      {
        "processorNumber": 10,
        "physicalProcessorNumber": 5,
        "physicalPackageNumber": 0,
        "numaNode": 0,
        "processorGroup": 0
      },
      {
        "processorNumber": 11,
        "physicalProcessorNumber": 5,
        "physicalPackageNumber": 0,
        "numaNode": 0,
        "processorGroup": 0
      },
      {
        "processorNumber": 12,
        "physicalProcessorNumber": 6,
        "physicalPackageNumber": 0,
        "numaNode": 0,
        "processorGroup": 0
      },
      {
        "processorNumber": 13,
        "physicalProcessorNumber": 6,
        "physicalPackageNumber": 0,
        "numaNode": 0,
        "processorGroup": 0
      },
      {
        "processorNumber": 14,
        "physicalProcessorNumber": 7,
        "physicalPackageNumber": 0,
        "numaNode": 0,
        "processorGroup": 0
      },
      {
        "processorNumber": 15,
        "physicalProcessorNumber": 7,
        "physicalPackageNumber": 0,
        "numaNode": 0,
        "processorGroup": 0
      }
    ],
    "maxFreq": 3700000000,
    "physicalPackageCount": 1,
    "physicalProcessorCount": 8,
    "processorIdentifier": {
      "processorID": "xxxxxxxxxxxxx",
      "cpu64bit": true,
      "name": "AMD Ryzen 7 2700X Eight-Core Processor         ",
      "family": "23",
      "identifier": "AuthenticAMD Family 23 Model 8 Stepping 2",
      "model": "8",
      "microarchitecture": "Zen+",
      "vendor": "AuthenticAMD",
      "stepping": "2",
      "vendorFreq": 3693000000
    },
    "utilization": 6.022770901938638
  },
  "memory": {
    "available": 6430,
    "used": 9901,
    "total": 17125572608,
    "virtualMemory": {
      "virtualMax": 22762717184,
      "swapPagesIn": 23351453,
      "swapPagesOut": 574416,
      "virtualInUse": 13872844800,
      "swapTotal": 5637144576,
      "swapUsed": 38567936
    },
    "physicalMemory": [
      {
        "bankLabel": "P0 CHANNEL A",
        "capacity": 8589934592,
        "clockSpeed": 2133000000,
        "manufacturer": "Unknown",
        "memoryType": "DDR4"
      },
      {
        "bankLabel": "P0 CHANNEL B",
        "capacity": 8589934592,
        "clockSpeed": 2133000000,
        "manufacturer": "Unknown",
        "memoryType": "DDR4"
      }
    ]
  },
  "disks": [
    {
      "model": "SAMSUNG SSD PM830 2.5\" 7mm 128GB (Standardní diskové jednotky)",
      "read": 14985,
      "readCount": 334516,
      "serial": "xxxxxxx",
      "size": 122103,
      "write": 7393,
      "writeCount": 107748
    },
    {
      "model": "WDC WDS120G2G0B-00EPW0 (Standardní diskové jednotky)",
      "read": 74272,
      "readCount": 2395030,
      "serial": "xxxxxx",
      "size": 114478,
      "write": 78583,
      "writeCount": 2311202
    },
    {
      "model": "ST1000DM010-2EP102 (Standardní diskové jednotky)",
      "read": 20508,
      "readCount": 207356,
      "serial": "xxxxxx",
      "size": 953867,
      "write": 2878,
      "writeCount": 35142
    }
  ],
  "os": {
    "bitness": 64,
    "family": "Windows",
    "manufacturer": "Microsoft",
    "processCount": 224,
    "systemBootTime": 1627498831,
    "systemUptime": 417807,
    "versionInfo": {
      "version": "10",
      "codeName": "Home",
      "buildNumber": "19042"
    }
  }
}
```
