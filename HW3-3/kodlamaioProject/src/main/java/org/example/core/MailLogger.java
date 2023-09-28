package org.example.core;

public class MailLogger implements ILogger{
    @Override
    public void Log(String message) {
        System.out.println("Mail log: "+message);
    }
}
