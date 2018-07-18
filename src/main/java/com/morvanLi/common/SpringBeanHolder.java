package com.morvanLi.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanHolder implements ApplicationContextAware {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private static ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext;
        logger.info("设置ApplicationContext");
    }


    public static <T> T getBean(Class<T> cls) {
        return ctx.getBean(cls);
    }

    public static <T> T getBean(String name, Class<T> cls) {
        return ctx.getBean(name, cls);
    }
}
