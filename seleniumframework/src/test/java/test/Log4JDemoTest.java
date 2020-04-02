package test;

public class Log4JDemoTest {

}
/*Log4j is a java based logging framework
Is simple, flexible, reliable and fast
Is configured through a configuration file
Log4j.xml OR log4j.properties etc...

Practical Example

Step 1:Add Log4j libraries in the java project
Can add jar files or maven dependency

if you are adding jar then donwload the jars , RIght click on project, go to Build Path, CLick configure Buildpath, Libraries, Add External jars

https://logging.apache.org/log4j/2.x/...

Step 2 : Create reference for Logger in the class
Class where you want to add log statements

Step 3 : Create log4j.xml or log4j.properties file
What is the difference ?

Step 4 : Run and Validate

Log4j - log levels

TRACE
Most detailed information. Expect these to be written to logs only. Since version 1.2.12

DEBUG
Detailed information on the flow through the system. Expect these to be written to logs only. Generally speaking, most lines logged by your application should be written as DEBUG

INFO
Interesting runtime events (startup/shutdown). Expect these to be immediately visible on a console, so be conservative and keep to a minimum.

WARN
Use of deprecated APIs, poor use of API, 'almost' errors, other runtime situations that are undesirable or unexpected, but not necessarily "wrong". Expect these to be immediately visible on a status console.

ERROR
Other runtime errors or unexpected conditions. Expect these to be immediately visible on a status console.

FATAL
Severe errors that cause premature termination. Expect these to be immediately visible on a status console.

OFF
The highest possible rank and is intended to turn off logging.

** built-in log levels with increasing order of severity

helpful tips

You can configure to append or overwrite logs in file

You can set logging OFF when not required
in case heavy logging is making your runs slower...

Log4j  - Configuration File

Log4j is configured through a configuration file

Configuration files can be written in XML, JSON, YAML, or properties file format

Set of key-value pairs

Within a configuration you can define three main components: 
Loggers
Appenders
Layouts

Configuring logging via a file has the advantage that logging can be turned on or off without modifying the application that uses Log4j.

Log4j  - FAQ

Written in Java  |  Cross platform

part of the Apache Logging Services

initial release  -  January 8, 2001

Repository - https://github.com/apache/logging-log4j2

Website - https://logging.apache.org/log4j/2.x/

On August 5, 2015 the Apache Logging Services Project Management Committee announced that Log4j 1 had reached end of life and that users of Log4j 1 are recommended to upgrade to Apache Log4j 2.

REFERENCES
https://springframework.guru/log4j-2-configuration-using-properties-file/
https://logging.apache.org/log4j/2.x/manual/configuration.html

https://www.quora.com/Why-use-Log4j#

https://www.quora.com/What-is-the-difference-between-log4j-xml-and-log4j-properties-in-Java

PLAYLISTS

KATALON STUDIO
*/