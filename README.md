# Java logging framework
  - https://en.wikipedia.org/wiki/Java_logging_framework
  - Java didn't include logging initially. Hence it lead to many third party libraries for logging.
  
## Log4J
  - https://www.tutorialspoint.com/log4j/log4j_architecture.htm
  - log4j has three main components:
    - Example : https://github.com/eshita19/mlog/tree/master/src/main/java/org/emathur/log/log4j
    - loggers: Responsible for capturing logging information.
    - appenders: Responsible for publishing logging information to various preferred destinations.
    - layouts: Responsible for formatting logging information in different styles.
    
## logback
   - https://stackify.com/logging-logback/
   - Advantages:
     - Parameterized messages, no need of String concatenation.
     - compresssion of log files.
     - support of sl4j inbuilt.
     - supoort for filters(Level, Threshold, Evaluation)
     
## sl4j
  - sl4j is a facade which can work with either log4j, logback or Java logging API.
  - sl4j-api.jar + (specific logging framework jar) 
     
     
     
    
    
    

