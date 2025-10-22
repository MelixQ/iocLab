package ru.kuznetsovMD.iocLab.task6;

public class DatabaseService {
    public String connectionUrl;
    public DatabaseService(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }
    public void connect() {
        System.out.println("Connecting to Database....");
    }
}
