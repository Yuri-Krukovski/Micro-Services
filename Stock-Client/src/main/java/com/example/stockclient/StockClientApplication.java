package com.example.stockclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@SpringBootApplication
@EnableAsync
@Slf4j
public class StockClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockClientApplication.class, args);
    }

    @Bean (name = "taskExecutor")
    public Executor taskExecutor() {
        log.info("Creating Async Task Executor");
        final ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(2);
        executor.setQueueCapacity(100);
        executor.setThreadNamePrefix("CompanyThread-");
        executor.initialize();
        return executor;
    }
}


