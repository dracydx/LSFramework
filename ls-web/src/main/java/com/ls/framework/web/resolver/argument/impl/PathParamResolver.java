package com.ls.framework.web.resolver.argument.impl;

import com.ls.framework.core.utils.ConvertUtil;
import com.ls.framework.core.utils.StringKit;
import com.ls.framework.web.annotation.LSPathParam;
import com.ls.framework.web.annotation.LSRequestParam;
import com.ls.framework.web.resolver.argument.ParameterResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Parameter;
import java.util.Map;

public class PathParamResolver implements ParameterResolver {
    @Override
    public boolean filter(Parameter parameter, HttpServletRequest request, HttpServletResponse response, Map<String, String> pathParamMap) {
        return parameter.isAnnotationPresent(LSPathParam.class);
    }

    @Override
    public Object handle(Parameter parameter, HttpServletRequest request, HttpServletResponse response, Map<String, String> pathParamMap) {
        String paramName = parameter.getAnnotation(LSPathParam.class).value();
        String param = pathParamMap.get(paramName);
        if (StringKit.isBlank(param))
            return null;
        return ConvertUtil.convert(param, parameter.getType());
    }
}