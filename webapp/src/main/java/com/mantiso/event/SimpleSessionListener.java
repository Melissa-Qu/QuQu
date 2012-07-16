package com.mantiso.event;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener()
public class SimpleSessionListener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent se) {
        se.getSession().getServletContext().log("Session Initialised");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        se.getSession().getServletContext().log("Session Destroyed");
    }
}
