package com.ls.framework.web.resolver.argument;

import com.ls.framework.web.handler.ActionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Parameter;
import java.util.Map;

public interface ParameterResolver {

    boolean filter(Parameter parameter, HttpServletRequest request, HttpServletResponse response, Map<String, String> pathParamMap);
    Object handle(Parameter parameter, HttpServletRequest request, HttpServletResponse response, Map<String, String> pathParamMap);

}
