package com.api.config;

import java.util.concurrent.Executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class AssyncMultiThread {
    private static final Logger logs = LoggerFactory.getLogger(AssyncMultiThread.class);

    @Bean(name = "taskExecutor")
    public Executor taskExecutor() {
        logs.debug("Creating Async Task Executor");
        final ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(2);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("TaskExecutor-");
        executor.initialize();
        return executor;
    }
}
