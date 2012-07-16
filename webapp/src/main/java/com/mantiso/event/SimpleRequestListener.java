package com.mantiso.event;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener()
public class SimpleRequestListener implements ServletRequestListener {
    public void requestDestroyed(ServletRequestEvent sre) {
        sre.getServletContext().log("Request Destroyed");
    }


    public void requestInitialized(ServletRequestEvent sre) {
        sre.getServletContext().log("Request Initialized");
    }

}
