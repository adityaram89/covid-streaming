# covid-streaming
A springboot application to stream data from github and process the content

Sample output when `canada` is selected.

"C:\Program Files\Java\jdk1.8.0_151\bin\java.exe" -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:60000,suspend=y,server=n -Dserver.port=9090 -javaagent:C:\Users\ad185283\.IdeaIC2019.1\system\captureAgent\debugger-agent.jar -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_151\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\rt.jar;C:\personal\Projects\covid-streaming\target\classes;C:\Users\ad185283\.m2\repository\org\springframework\boot\spring-boot-starter-web\2.3.3.RELEASE\spring-boot-starter-web-2.3.3.RELEASE.jar;C:\Users\ad185283\.m2\repository\org\springframework\boot\spring-boot-starter\2.3.3.RELEASE\spring-boot-starter-2.3.3.RELEASE.jar;C:\Users\ad185283\.m2\repository\org\springframework\boot\spring-boot\2.3.3.RELEASE\spring-boot-2.3.3.RELEASE.jar;C:\Users\ad185283\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\2.3.3.RELEASE\spring-boot-autoconfigure-2.3.3.RELEASE.jar;C:\Users\ad185283\.m2\repository\org\springframework\boot\spring-boot-starter-logging\2.3.3.RELEASE\spring-boot-starter-logging-2.3.3.RELEASE.jar;C:\Users\ad185283\.m2\repository\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;C:\Users\ad185283\.m2\repository\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;C:\Users\ad185283\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.13.3\log4j-to-slf4j-2.13.3.jar;C:\Users\ad185283\.m2\repository\org\apache\logging\log4j\log4j-api\2.13.3\log4j-api-2.13.3.jar;C:\Users\ad185283\.m2\repository\org\slf4j\jul-to-slf4j\1.7.30\jul-to-slf4j-1.7.30.jar;C:\Users\ad185283\.m2\repository\jakarta\annotation\jakarta.annotation-api\1.3.5\jakarta.annotation-api-1.3.5.jar;C:\Users\ad185283\.m2\repository\org\yaml\snakeyaml\1.26\snakeyaml-1.26.jar;C:\Users\ad185283\.m2\repository\org\springframework\boot\spring-boot-starter-json\2.3.3.RELEASE\spring-boot-starter-json-2.3.3.RELEASE.jar;C:\Users\ad185283\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.11.2\jackson-datatype-jdk8-2.11.2.jar;C:\Users\ad185283\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.11.2\jackson-datatype-jsr310-2.11.2.jar;C:\Users\ad185283\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.11.2\jackson-module-parameter-names-2.11.2.jar;C:\Users\ad185283\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\2.3.3.RELEASE\spring-boot-starter-tomcat-2.3.3.RELEASE.jar;C:\Users\ad185283\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\9.0.37\tomcat-embed-core-9.0.37.jar;C:\Users\ad185283\.m2\repository\org\glassfish\jakarta.el\3.0.3\jakarta.el-3.0.3.jar;C:\Users\ad185283\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\9.0.37\tomcat-embed-websocket-9.0.37.jar;C:\Users\ad185283\.m2\repository\org\springframework\spring-web\5.2.8.RELEASE\spring-web-5.2.8.RELEASE.jar;C:\Users\ad185283\.m2\repository\org\springframework\spring-beans\5.2.8.RELEASE\spring-beans-5.2.8.RELEASE.jar;C:\Users\ad185283\.m2\repository\org\springframework\spring-webmvc\5.2.8.RELEASE\spring-webmvc-5.2.8.RELEASE.jar;C:\Users\ad185283\.m2\repository\org\springframework\spring-aop\5.2.8.RELEASE\spring-aop-5.2.8.RELEASE.jar;C:\Users\ad185283\.m2\repository\org\springframework\spring-context\5.2.8.RELEASE\spring-context-5.2.8.RELEASE.jar;C:\Users\ad185283\.m2\repository\org\springframework\spring-expression\5.2.8.RELEASE\spring-expression-5.2.8.RELEASE.jar;C:\Users\ad185283\.m2\repository\org\projectlombok\lombok\1.18.12\lombok-1.18.12.jar;C:\Users\ad185283\.m2\repository\org\slf4j\slf4j-api\1.7.30\slf4j-api-1.7.30.jar;C:\Users\ad185283\.m2\repository\org\springframework\spring-core\5.2.8.RELEASE\spring-core-5.2.8.RELEASE.jar;C:\Users\ad185283\.m2\repository\org\springframework\spring-jcl\5.2.8.RELEASE\spring-jcl-5.2.8.RELEASE.jar;C:\Users\ad185283\.m2\repository\org\springframework\boot\spring-boot-starter-activemq\2.3.3.RELEASE\spring-boot-starter-activemq-2.3.3.RELEASE.jar;C:\Users\ad185283\.m2\repository\org\springframework\spring-jms\5.2.8.RELEASE\spring-jms-5.2.8.RELEASE.jar;C:\Users\ad185283\.m2\repository\org\springframework\spring-messaging\5.2.8.RELEASE\spring-messaging-5.2.8.RELEASE.jar;C:\Users\ad185283\.m2\repository\org\springframework\spring-tx\5.2.8.RELEASE\spring-tx-5.2.8.RELEASE.jar;C:\Users\ad185283\.m2\repository\jakarta\jms\jakarta.jms-api\2.0.3\jakarta.jms-api-2.0.3.jar;C:\Users\ad185283\.m2\repository\org\apache\activemq\activemq-broker\5.15.13\activemq-broker-5.15.13.jar;C:\Users\ad185283\.m2\repository\org\apache\activemq\activemq-client\5.15.13\activemq-client-5.15.13.jar;C:\Users\ad185283\.m2\repository\org\apache\geronimo\specs\geronimo-jms_1.1_spec\1.1.1\geronimo-jms_1.1_spec-1.1.1.jar;C:\Users\ad185283\.m2\repository\org\fusesource\hawtbuf\hawtbuf\1.11\hawtbuf-1.11.jar;C:\Users\ad185283\.m2\repository\org\apache\geronimo\specs\geronimo-j2ee-management_1.1_spec\1.0.1\geronimo-j2ee-management_1.1_spec-1.0.1.jar;C:\Users\ad185283\.m2\repository\org\apache\activemq\activemq-openwire-legacy\5.15.13\activemq-openwire-legacy-5.15.13.jar;C:\Users\ad185283\.m2\repository\com\google\guava\guava\28.2-jre\guava-28.2-jre.jar;C:\Users\ad185283\.m2\repository\com\google\guava\failureaccess\1.0.1\failureaccess-1.0.1.jar;C:\Users\ad185283\.m2\repository\com\google\guava\listenablefuture\9999.0-empty-to-avoid-conflict-with-guava\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar;C:\Users\ad185283\.m2\repository\com\google\code\findbugs\jsr305\3.0.2\jsr305-3.0.2.jar;C:\Users\ad185283\.m2\repository\org\checkerframework\checker-qual\2.10.0\checker-qual-2.10.0.jar;C:\Users\ad185283\.m2\repository\com\google\errorprone\error_prone_annotations\2.3.4\error_prone_annotations-2.3.4.jar;C:\Users\ad185283\.m2\repository\com\google\j2objc\j2objc-annotations\1.3\j2objc-annotations-1.3.jar;C:\Users\ad185283\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.11.2\jackson-databind-2.11.2.jar;C:\Users\ad185283\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.11.2\jackson-annotations-2.11.2.jar;C:\Users\ad185283\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.11.2\jackson-core-2.11.2.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.3\lib\idea_rt.jar" com.poc.covidstreaming.CovidStreamingApplication
Connected to the target VM, address: '127.0.0.1:60000', transport: 'socket'

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.3.RELEASE)

2020-08-25 23:31:45.265  INFO 40024 --- [           main] c.p.c.CovidStreamingApplication          : Starting CovidStreamingApplication on WINAD185283-IZQ with PID 40024 (C:\personal\Projects\covid-streaming\target\classes started by ad185283 in C:\personal\Projects\covid-streaming)
2020-08-25 23:31:45.269  INFO 40024 --- [           main] c.p.c.CovidStreamingApplication          : No active profile set, falling back to default profiles: default
2020-08-25 23:31:48.580  INFO 40024 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 9090 (http)
2020-08-25 23:31:48.598  INFO 40024 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-08-25 23:31:48.598  INFO 40024 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.37]
2020-08-25 23:31:48.758  INFO 40024 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-08-25 23:31:48.758  INFO 40024 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 3401 ms
2020-08-25 23:31:49.165  INFO 40024 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-08-25 23:31:49.378  INFO 40024 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService 'taskScheduler'
2020-08-25 23:31:49.471  INFO 40024 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 9090 (http) with context path ''
2020-08-25 23:31:49.638  INFO 40024 --- [           main] o.apache.activemq.broker.BrokerService   : Using Persistence Adapter: MemoryPersistenceAdapter
2020-08-25 23:31:49.698  INFO 40024 --- [  JMX connector] o.a.a.broker.jmx.ManagementContext       : JMX consoles can connect to service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi
2020-08-25 23:31:49.902  INFO 40024 --- [           main] o.apache.activemq.broker.BrokerService   : Apache ActiveMQ 5.15.13 (localhost, ID:WINAD185283-IZQ-60015-1598378509680-0:1) is starting
2020-08-25 23:31:49.908  INFO 40024 --- [           main] o.apache.activemq.broker.BrokerService   : Apache ActiveMQ 5.15.13 (localhost, ID:WINAD185283-IZQ-60015-1598378509680-0:1) started
2020-08-25 23:31:49.908  INFO 40024 --- [           main] o.apache.activemq.broker.BrokerService   : For help or more information please see: http://activemq.apache.org
2020-08-25 23:31:49.950  INFO 40024 --- [           main] o.a.activemq.broker.TransportConnector   : Connector vm://localhost started
2020-08-25 23:31:50.012  INFO 40024 --- [           main] c.p.c.CovidStreamingApplication          : Started CovidStreamingApplication in 5.364 seconds (JVM running for 6.272)
                    State                   Country                    Total cases  No.Of Cases Reported last day

                  Alberta                    Canada                          13006                            258

         British Columbia                    Canada                           5184                            269

         Diamond Princess                    Canada                              0                              0

           Grand Princess                    Canada                             13                              0

                 Manitoba                    Canada                            993                             49

            New Brunswick                    Canada                            189                              0

Newfoundland and Labrador                    Canada                            268                              0

    Northwest Territories                    Canada                              5                              0

              Nova Scotia                    Canada                           1080                              0

                  Ontario                    Canada                          43454                            131

     Prince Edward Island                    Canada                             44                              0

                   Quebec                    Canada                          61741                             68

             Saskatchewan                    Canada                           1602                              2

                    Yukon                    Canada                             15                              0

