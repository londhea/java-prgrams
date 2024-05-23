package com.techjivaa.fhirR4JsonConverter.dbConfig;

import com.techjivaa.fhirR4JsonConverter.user.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "userEmBuilder",
        transactionManagerRef = "userTransactionManager",
        basePackages = {"com.techjivaa.fhirR4JsonConverter.userrepository"}
)
public class SecondDatasourceConfig {

    @ConditionalOnBean
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.two")
    public DataSourceProperties userDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource twoDataSource(@Qualifier("userDataSourceProperties") DataSourceProperties userDataSourceProperties) {
        return userDataSourceProperties.initializeDataSourceBuilder().build();
    }

    @Bean(name = "userEmBuilder")
    public LocalContainerEntityManagerFactoryBean userLocalContainerEntityManagerFactoryBean(EntityManagerFactoryBuilder entityManagerFactoryBuilder,
                                                                                         @Qualifier("twoDataSource") DataSource dataSource) {

        return entityManagerFactoryBuilder.dataSource(dataSource).packages(User.class).build();
    }

    @Bean(name = "userTransactionManager")
    public PlatformTransactionManager userPlatformTransactionManager(@Qualifier("userEmBuilder") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}