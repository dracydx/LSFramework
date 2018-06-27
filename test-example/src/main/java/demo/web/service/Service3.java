package demo.web.service;


import com.ls.framework.core.annotation.LSAround;
import com.ls.framework.core.annotation.LSBean;
import demo.web.Action;

@LSBean("service3")
public class Service3 implements IService {

    @LSAround(Action.class)
    @Override
    public String test() {
        System.out.println("IOC2 test success");
        return "";
    }
}