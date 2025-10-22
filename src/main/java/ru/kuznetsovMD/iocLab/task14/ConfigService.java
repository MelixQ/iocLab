package ru.kuznetsovMD.iocLab.task14;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigService {
    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    public void getAppConfig() {
        System.out.println("App Name: " + appName);
        System.out.println("App Version: " + appVersion);
    }
}
