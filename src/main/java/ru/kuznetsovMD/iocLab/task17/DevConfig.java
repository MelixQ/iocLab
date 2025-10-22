package ru.kuznetsovMD.iocLab.task17;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import ru.kuznetsovMD.iocLab.task6.DatabaseService;


@Configuration
@Profile("dev")
public class DevConfig {
    @Bean
    public DatabaseService databaseService() {
        return new DatabaseService("dev connection");
    }
}
