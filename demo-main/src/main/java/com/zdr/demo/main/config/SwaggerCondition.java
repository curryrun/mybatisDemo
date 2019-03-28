package com.zdr.demo.main.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class SwaggerCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if ((context.getEnvironment().getProperty("spring.profiles.active")) == null)
            return false;
        return !(context.getEnvironment().getProperty("spring.profiles.active")).contains("performance");
    }

}
