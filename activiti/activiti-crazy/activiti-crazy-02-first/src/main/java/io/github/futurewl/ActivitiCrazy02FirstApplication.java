package io.github.futurewl;

import org.activiti.engine.*;
import org.activiti.engine.task.Task;

public class ActivitiCrazy02FirstApplication {
    public static void main(String[] args) {
        // 1. 创建流程引擎
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        // 2. 得到流程存储服务组件
        RepositoryService repositoryService = engine.getRepositoryService();
        // 3. 得到运行时服务组件
        RuntimeService runtimeService = engine.getRuntimeService();
        // 4. 获取流程服务组件
        TaskService taskService = engine.getTaskService();
        // 5. 部署流程文件
        repositoryService.createDeployment().addClasspathResource("first.bpmn").deploy();
        // 6. 启动流程
        runtimeService.startProcessInstanceByKey("process1");
        // 7. 查询第一个任务
        Task task = taskService.createTaskQuery().singleResult();
        System.out.println("第一个任务完成钱，当前任务名称：" + task.getName());
        // 8. 完成第一个任务
        taskService.complete(task.getId());
        // 9. 查询第二个任务
        task = taskService.createTaskQuery().singleResult();
        System.out.println("第二个任务完成钱，当前任务名称：" + task.getName());
        // 10. 完成第二个任务（流程结束）
        taskService.complete(task.getId());
        task = taskService.createTaskQuery().singleResult();
        System.out.println("流程结束后，查找任务：" + task);
        engine.close();
        // 11. 退出
        System.exit(0);
    }
}
