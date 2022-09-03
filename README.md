# db-router-spring-boot-starter
db-router-spring-boot-starter：一个自研的分库分表组件

- 基于 HashMap 核心设计原理，使用哈希散列+扰动函数的方式，把数据散列到多个库表中的组件。
- 主要用到的技术点包括：散列算法、数据源切换、AOP切面、SpringBoot Starter 开发等