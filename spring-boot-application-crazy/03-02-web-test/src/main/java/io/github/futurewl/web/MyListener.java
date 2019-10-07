package io.github.futurewl.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("context init");
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}