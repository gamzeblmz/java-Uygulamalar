package org.example.core;

public class FileLogger implements ILogger{
    @Override
    public void Log(String message) {
        System.out.println("File Log: "+message);
    }
}
