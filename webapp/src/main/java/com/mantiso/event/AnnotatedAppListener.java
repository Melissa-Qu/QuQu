package com.mantiso.event;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener()
public class AnnotatedAppListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {
        ServletContext ctx = event.getServletContext();
        ctx.log("AnnotatedAppListener Context initialised");
        String productName = event.getServletContext().getInitParameter("ProductName");
        ctx.log("AnnotatedAppListener Context initialised: " + productName);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext ctx = sce.getServletContext();
        ctx.log("AnnotatedAppListener Context destroyed");
    }
}
