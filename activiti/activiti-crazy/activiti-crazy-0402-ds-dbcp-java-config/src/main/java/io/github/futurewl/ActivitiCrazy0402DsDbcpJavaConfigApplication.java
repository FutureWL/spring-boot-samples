package io.github.futurewl;

import org.activiti.engine.ProcessEngineConfiguration;
import org.apache.commons.dbcp.BasicDataSource;

import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 * 功能描述：
 *
 * @author weilai
 */
public class ActivitiCrazy0402DsDbcpJavaConfigApplication {
    public static void main(String[] args) throws FileNotFoundException, SQLException {

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db_activiti");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.getConnection().getMetaData(); // 验证是否连接成功

        ProcessEngineConfiguration configuration
                = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("dbcp-config.xml");
        configuration.setDataSource(dataSource);
        System.out.println(configuration.getDataSource());
    }
}
