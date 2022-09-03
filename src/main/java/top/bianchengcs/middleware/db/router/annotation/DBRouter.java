package top.bianchengcs.middleware.db.router.annotation;

import java.lang.annotation.*;

/**
 * @description: 路由注解
 * @author: EricCml
 * @date: 2022/9/2
 * @github: https://github.com/ericcml
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouter {

    /**
     * 分库分表字段
     */
    String key() default "";

}
