package com.dev.taskmanager_api.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {};
    }
}
