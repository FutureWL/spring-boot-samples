package io.github.futurewl;

import org.activiti.engine.ProcessEngineConfiguration;

/**
 * 功能描述：读取自定义的配置文件 activiti.cfg.xml
 *
 * @author weilai
 */
public class ActivitiCrazy0401CreateResourceApplication {
    public static void main(String[] args) {
        ProcessEngineConfiguration configuration =
                ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("my-activiti1.xml");
//                ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("my-activiti2.xml", "test");
    }
}
