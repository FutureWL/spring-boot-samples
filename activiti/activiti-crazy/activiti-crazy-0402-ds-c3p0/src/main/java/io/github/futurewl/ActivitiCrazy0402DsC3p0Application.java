package io.github.futurewl;

import org.activiti.engine.ProcessEngineConfiguration;

import javax.sql.DataSource;
import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 * 功能描述：
 *
 * @author weilai
 */
public class ActivitiCrazy0402DsC3p0Application {
    public static void main(String[] args) throws FileNotFoundException, SQLException {
        ProcessEngineConfiguration configuration
                = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("c3p0-config.xml");
        DataSource dataSource = configuration.getDataSource();
        dataSource.getConnection().getMetaData();
        System.out.println(dataSource.getClass().getName());
    }
}
