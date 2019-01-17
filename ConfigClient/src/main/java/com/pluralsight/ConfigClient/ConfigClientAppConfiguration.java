package com.pluralsight.ConfigClient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "some")
public class ConfigClientAppConfiguration {
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    private String property;
}
