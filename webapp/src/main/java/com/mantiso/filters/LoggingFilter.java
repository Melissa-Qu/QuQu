package com.mantiso.filters;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "*")
public class LoggingFilter implements Filter {

    static Logger logger = LogManager.getLogger(LoggingFilter.class);
    FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
        filterConfig.getServletContext().log("Initialised filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterConfig.getServletContext().log("doFilter");
        logger.info("request made to: '" + ((HttpServletRequest)servletRequest).getRequestURI() + "'");
        LogRequestWrapper wrapper = new LogRequestWrapper((HttpServletRequest)servletRequest, logger);
        filterChain.doFilter(wrapper, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
