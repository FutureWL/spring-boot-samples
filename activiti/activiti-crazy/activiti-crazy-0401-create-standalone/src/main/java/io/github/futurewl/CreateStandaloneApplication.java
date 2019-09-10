package io.github.futurewl;

import org.activiti.engine.ProcessEngineConfiguration;

public class CreateStandaloneApplication {
    public static void main(String[] args) {
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
        System.out.println(configuration.getDatabaseSchemaUpdate());
        System.out.println(configuration.getJdbcUrl());
    }
}
