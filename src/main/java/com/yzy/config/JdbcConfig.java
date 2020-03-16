package com.yzy.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
/*@PropertySource("classpath:jdbc.properties")*/
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {
   /* @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.username}")
    private String userName;

    @Value("${jdbc.driver}")
    private String driver;*/

   @Autowired
   private JdbcProperties jdbcProperties;

    @Bean
    public DataSource dataSource(){
        DruidDataSource source = new DruidDataSource();
        source.setDriverClassName(jdbcProperties.getDriver());
        source.setUrl(jdbcProperties.getUrl());
        source.setUsername(jdbcProperties.getUserName());
        source.setPassword(jdbcProperties.getPassword());
        return source;
    }
}
