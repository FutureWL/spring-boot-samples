package io.github.futurewl;

import org.activiti.engine.ProcessEngineConfiguration;

import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 功能描述：读取自定义的配置文件 activiti.cfg.xml
 *
 * @author weilai
 */
public class ActivitiCrazy0401CreateInputStreamApplication {
    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("input-stream.xml");
//        InputStream inputStream = new FileInputStream(file);
        InputStream inputStream =
                ActivitiCrazy0401CreateInputStreamApplication.class
                        .getClassLoader()
                        .getResourceAsStream("input-stream.xml");
        ProcessEngineConfiguration configuration =
                ProcessEngineConfiguration.createProcessEngineConfigurationFromInputStream(inputStream);
    }
}
