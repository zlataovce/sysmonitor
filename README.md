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
  "cpuPercent": 7.68,
  "ramUsed": 8713,
  "ramTotal": 16332,
  "ramAvailable": 7619,
  "processor": {
    "cpuModel": "AuthenticAMD Family 23 Model 8 Stepping 2",
    "cpuFreq": 3700,
    "cpuPhysicalProcessors": 8
  }
}
```