package me.cathub.change.storehouse.rpc.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 开启Storehouse模块Rpc服务
 *
 * @author cheng
 */
public class OpenStorehouseServer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:spring/spring-storehouse-service.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
