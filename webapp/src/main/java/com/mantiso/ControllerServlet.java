package com.mantiso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

public class ControllerServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        ApplicationSettings applicationSettings = new ApplicationSettings();
        CssClass cssClass = new CssClass();
        cssClass.setName("redUser");
        List<Tab> tabs = new ArrayList<>();
        tabs.add(new Tab("SignIn", "#signin"));
        tabs.add(new Tab("Home", "#home"));
        tabs.add(new Tab("Profile", "#profile"));
        tabs.add(new Tab("Messages", "#messages"));
        tabs.add(new Tab("Settings", "#settings"));
        applicationSettings.setTabs(tabs);
        String[] tabNames = {"SignIn", "Home", "Profile", "Settings"};
        applicationSettings.setTabNames(tabNames);
        applicationSettings.setFormCssClass(cssClass);
        getServletContext().setAttribute("app", applicationSettings);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setName("Kevin");
        user.setEmail("kevinj@mantiso.com");
        user.setAvatarUrl("images/kevin-head.jpg");
        user.addTodo("Finish Course", 1);
        user.addTodo("Go for a run", 3);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
        request.setAttribute("user", user);
        dispatcher.forward(request, response);
    }
}
