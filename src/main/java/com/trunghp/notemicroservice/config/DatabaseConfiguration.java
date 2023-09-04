package com.trunghp.notemicroservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({"com.trunghp.notemicroservice.repository"})
@EnableTransactionManagement
//@EnableElasticsearchRepositories("com.trunghp.notemicroservice.repository.search")
public class DatabaseConfiguration {

}
