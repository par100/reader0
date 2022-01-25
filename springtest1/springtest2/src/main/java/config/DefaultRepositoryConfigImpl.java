package config;

import Repository.AccountRepository;
import Repository.JdbcAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class DefaultRepositoryConfigImpl implements RepositoryConfig {
    private final DataSource dataSource;

    public DefaultRepositoryConfigImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public AccountRepository accountRepository() {
        return new JdbcAccountRepository(dataSource);
    }
}
