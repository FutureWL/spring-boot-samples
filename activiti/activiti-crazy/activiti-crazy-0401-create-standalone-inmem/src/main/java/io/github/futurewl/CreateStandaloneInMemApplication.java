package io.github.futurewl;

import org.activiti.engine.ProcessEngineConfiguration;

public class CreateStandaloneInMemApplication {
    public static void main(String[] args) {
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createStandaloneInMemProcessEngineConfiguration();
        System.out.println(configuration.getDatabaseSchemaUpdate());
        System.out.println(configuration.getJdbcUrl());
    }
}
