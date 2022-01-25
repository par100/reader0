package config;

import Repository.AccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public interface RepositoryConfig {

    @Bean
    AccountRepository accountRepository();
}