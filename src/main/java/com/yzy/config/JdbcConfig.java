package com.yzy.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {
    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.username}")
    private String userName;

    @Value("${jdbc.driver}")
    private String driver;

    @Bean
    public DataSource dataSource(){
        DruidDataSource source = new DruidDataSource();
        source.setDriverClassName(driver);
        source.setUrl(url);
        source.setUsername(userName);
        source.setPassword(password);
        return source;
    }
}
