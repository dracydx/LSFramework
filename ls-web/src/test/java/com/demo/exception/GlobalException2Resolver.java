package com.demo.exception;

import com.ls.framework.web.handler.ActionHandler;
import com.ls.framework.web.resolver.exception.ExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GlobalException2Resolver implements ExceptionResolver {
    @Override
    public Object handle(ActionHandler actionHandler, Exception exception, HttpServletRequest request, HttpServletResponse response) {
        if (exception instanceof GlobalException2) {
            request.setAttribute("name", "global exception:\n" +exception.getMessage());
            return "test";
        }
        return null;
    }
}
