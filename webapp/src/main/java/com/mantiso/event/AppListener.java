package com.mantiso.event;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {
        ServletContext ctx = event.getServletContext();
        ctx.log("Context initialised");
        String productName = event.getServletContext().getInitParameter("ProductName");
        ctx.log("Context initialised: " + productName);
    }
}
