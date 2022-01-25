package Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;


@Component
public class JdbcAccountRepository implements AccountRepository {
    private DataSource datasource;

    @Autowired
    public JdbcAccountRepository(DataSource datasource) {
        this.datasource = datasource;
    }
}
