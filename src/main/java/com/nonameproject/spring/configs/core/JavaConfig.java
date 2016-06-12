package com.nonameproject.spring.configs.core;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.net.UnknownHostException;

/**
 * Created by vlados on 5/24/2016.
 */
@Configuration
@ComponentScan(basePackages = {"com.nonameproject.spring.entities"})
//todo new config
@EnableMongoRepositories(basePackages = {"com.mongo.repositories"})
public class JavaConfig {

    public @Bean
    MongoDbFactory mongoDbFactory() throws UnknownHostException {
        return new SimpleMongoDbFactory(new MongoClient(), "test");
    }
    public @Bean
    MongoTemplate mongoTemplate() throws UnknownHostException {
        return new MongoTemplate(mongoDbFactory());
    }

}
