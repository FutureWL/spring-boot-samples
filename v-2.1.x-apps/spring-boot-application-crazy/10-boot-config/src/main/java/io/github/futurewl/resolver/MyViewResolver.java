package io.github.futurewl.resolver;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.AbstractCachingViewResolver;
import org.thymeleaf.TemplateEngine;

import java.util.Locale;

/**
 * 自定义视图解析器
 *
 * @author 杨恩雄
 */
public class MyViewResolver extends AbstractCachingViewResolver {

    // 模板引擎对象
    private TemplateEngine templateEngine;

    // 视图类
    private Class viewClass = MyView.class;

    public void setTemplateEngine(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    /**
     * 根据名称加载视图对象
     */
    @Override
    protected View loadView(String viewName, Locale locale) throws Exception {
        System.out.println("11111111111111111");
        // 获取bean工厂实例
        AutowireCapableBeanFactory beanFactory = getApplicationContext()
                .getAutowireCapableBeanFactory();
        boolean beanExists = beanFactory.containsBean(viewName);
        MyView view;
        // 判断bean实例是否存在
        if (beanExists) {
            // 存在直接获取
            view = (MyView) beanFactory.getBean(viewName);
        } else {
            // 不存在则创建一个View实例
            MyView viewInstance = (MyView) BeanUtils
                    .instantiateClass(viewClass);
            view = (MyView) beanFactory.initializeBean(viewInstance, viewName);
        }
        // 设置模板名称与模板引擎
        view.setTemplateEngine(this.templateEngine);
        view.setTemplate(viewName);
        return view;
    }

}
