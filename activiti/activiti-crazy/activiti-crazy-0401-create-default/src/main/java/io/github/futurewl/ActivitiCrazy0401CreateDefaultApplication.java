package io.github.futurewl;

import org.activiti.engine.ProcessEngineConfiguration;

/**
 * 功能描述：读取默认的配置文件 activiti.cfg.xml
 *
 * @author weilai
 */
public class ActivitiCrazy0401CreateDefaultApplication {
    public static void main(String[] args) {
        ProcessEngineConfiguration configuration =
                ProcessEngineConfiguration.createProcessEngineConfigurationFromResourceDefault();
    }
}
