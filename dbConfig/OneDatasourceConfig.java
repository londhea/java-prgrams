package com.techjivaa.fhirR4JsonConverter.dbConfig;

import com.techjivaa.fhirR4JsonConverter.patient.MstPatient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
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
        entityManagerFactoryRef = "patientEmBuilder",
        transactionManagerRef = "patientTransactionManager",
        basePackages = {"com.techjivaa.fhirR4JsonConverter.patientrepository"})
public class OneDatasourceConfig {

    @Primary
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.one")
    public DataSourceProperties patientDataSourceProperties() {
        return new DataSourceProperties();
    }


    @Primary
    @Bean
    public DataSource oneDataSource(@Qualifier("patientDataSourceProperties") DataSourceProperties patientDataSourceProperties) {
        return patientDataSourceProperties.initializeDataSourceBuilder().build();
    }

    @Primary
    @Bean(name = "patientEmBuilder")
    public LocalContainerEntityManagerFactoryBean patientLocalContainerEntityManagerFactoryBean(
            @Qualifier("oneDataSource") DataSource dataSource,
            EntityManagerFactoryBuilder entityManagerFactoryBuilder
            ) {

        return entityManagerFactoryBuilder.dataSource(dataSource).packages(MstPatient.class).build();
    }

    @Primary
    @Bean(name = "patientTransactionManager")
    public PlatformTransactionManager patientPlatformTransactionManager(@Qualifier("patientEmBuilder") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
