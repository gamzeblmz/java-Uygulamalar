package org.example.core.logging;

public class MailLoger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Mail gonderildi: " + data);
    }
}
