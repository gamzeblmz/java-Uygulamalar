package org.example.core;

public class DatabaseLogger implements ILogger{
    @Override
    public void Log(String message) {
        System.out.println("Database log: "+ message);
    }
}
