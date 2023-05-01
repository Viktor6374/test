package ru.subbotin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.subbotin.dao.DaoRepositoryCats;
import ru.subbotin.dao.DaoRepositoryOwners;

@SpringBootApplication()
@EnableJpaRepositories
public class Application {
    @Autowired
    private DaoRepositoryOwners repositoryOwners;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}