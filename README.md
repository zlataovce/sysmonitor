# sysmonitor

A simple RESTful API serving the resources statistics of the hosting system.  
Written in Java and Spring Framework.

## Building
 - Build the project using gradle, run the task `bootJar` to produce a executable JAR file.

## API
**localhost:8080/api?key=**
 - *key*: the token generated in app.config

*Note:* Sizes are written in **megabytes**.

**Example response:**
```json
{
  "cpuPercent": 2.96,
  "ramUsed": 11428,
  "ramTotal": 16332,
  "ramAvailable": 4903
}
```