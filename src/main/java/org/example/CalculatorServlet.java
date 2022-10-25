package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/calculate")
public class CalculatorServlet implements Servlet {
    /**
     * 서블릿 라이프 사이클과 관련된 메소드
     * init(), service(), destory()
     */

    Logger log = LoggerFactory.getLogger(CalculatorServlet.class);

    @Override
    public void init(ServletConfig config) throws ServletException {
        log.info("init");
    }


    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        log.info("service");
        String operand1 = request.getParameter("operand1");
        String operator = request.getParameter("operator");
        String operand2 = request.getParameter("operand2");
    }

    @Override
    public void destroy() {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }


}
