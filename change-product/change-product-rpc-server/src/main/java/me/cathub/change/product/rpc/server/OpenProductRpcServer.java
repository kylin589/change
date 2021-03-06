package me.cathub.change.product.rpc.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 开启Product模块Rpc服务
 *
 * @author cheng
 */
public class OpenProductRpcServer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring/spring-product-service.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}