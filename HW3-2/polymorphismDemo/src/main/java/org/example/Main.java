package org.example;
public class Main {
    public static void main(String[] args) {
       //EmailLogger emailLogger=new EmailLogger();
      // emailLogger.log("email");
       BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new DatabaseLogger(),new EmailLogger()};
       for (BaseLogger logger:loggers){
           logger.log("Log message");
       }
    }
}