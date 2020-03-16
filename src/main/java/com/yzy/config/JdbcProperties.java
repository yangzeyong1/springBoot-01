package com.yzy.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "jdbc")
@Getter@Setter
public class JdbcProperties {
    private String url;

    private String password;

    private String userName;

    private String driver;

}
