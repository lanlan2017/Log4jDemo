# 项目说明
Log4j Demo
## 文档

[Log4j教程](https://lanlan2017.github.io/blog/categories/%E7%BC%96%E7%A8%8B/Java/Log4j%E6%95%99%E7%A8%8B/)
	├─[Log4j概述](https://lanlan2017.github.io/blog/f69dab82/)
	├─[Log4j安装](https://lanlan2017.github.io/blog/27bc8c92/)
	├─[Log4j架构](https://lanlan2017.github.io/blog/39ac74b8/)
	├─[log4j配置](https://lanlan2017.github.io/blog/9c30cbde/)
	├─[Log4j示例程序](https://lanlan2017.github.io/blog/37d9cc03/)
	├─[Log4j Logger类方法](https://lanlan2017.github.io/blog/295e501e/)
	├─[Log4j 日志级别 Level类](https://lanlan2017.github.io/blog/9f922eef/)
	├─[Log4j 日志格式 Layout类](https://lanlan2017.github.io/blog/6356f492/)
	├─[Log4j 使用文件记录日志 FileAppender类](https://lanlan2017.github.io/blog/6296507b/)
	├─[Log4j 使用多个文件记录日志 RollingFileAppender类](https://lanlan2017.github.io/blog/cbcda66c/)
	├─[Log4j 逐日生成日志文件 DailyRollingFileAppender类](https://lanlan2017.github.io/blog/7cb1400/)
	├─[Log4j 使用数据库记录日志](https://lanlan2017.github.io/blog/17eaff0a/)
	├─[Log4j HTMLLayout](https://lanlan2017.github.io/blog/6cc119f/)
	├─[Log4j PatternLayout](https://lanlan2017.github.io/blog/5c0e8258/)
	└─[Log4j Debug记录](https://lanlan2017.github.io/blog/2efc4260/)


## 目录结构

<details><summary>展开/折叠</summary><pre>
\Log4jDemo
├─lib\
│ ├─commons-logging-1.2.jar
│ ├─log4j-1.2.17.jar
│ ├─log4j-api-2.13.3.jar
│ ├─log4j-core-2.13.3.jar
│ └─mysql-connector-java-8.0.17.jar
├─log.out
├─Log4jConfig\
│ ├─DailyRollingFileAppender\
│ │ └─log4j.properties
│ ├─file\
│ │ └─log4j.properties
│ ├─FileAppender\
│ │ ├─log4j.properties
│ │ └─log4j.xml
│ ├─file_and_stout\
│ │ └─log4j.properties
│ ├─grammar\
│ │ └─log4j.properties
│ ├─HTMLLayout\
│ │ └─log4j.properties
│ ├─JDBCAppender\
│ │ ├─log4j.properties
│ │ └─log4j.xml
│ ├─Level\
│ │ └─log4j.properties
│ ├─loggerPackage\
│ │ └─log4j.xml
│ ├─PatternLayout\
│ │ └─log4j.properties
│ ├─RollingFileAppender\
│ │ └─log4j.properties
│ ├─stdout\
│ │ └─log4j.properties
│ └─xml_file_stdout\
│   └─log4j.xml
├─README.md
└─src\
  ├─demo\
  │ ├─file\
  │ │ └─appender\
  │ │   └─XMLFileAppenderTest.java
  │ ├─level\
  │ │ ├─SetLevelByMethod.java
  │ │ └─SetLevleByConfig.java
  │ ├─Log4jExample.java
  │ ├─logpackage\
  │ │ └─LoggerPackage.java
  │ └─method\
  │   └─LoggerMethodTest.java
  └─log4j.properties
</pre></details>

- `lib`目录 存放的用到的依赖
- `Log4jConfig`目录 存放了用到的`Log4j`的配置文件,将这些配置文件复制,然后粘贴到`src`目录下,即可使用该配置文件。如果原来的`src`目录下已经存在`log4j.properties`或者`log4j.xml`文件,则覆盖旧的文件即可。
