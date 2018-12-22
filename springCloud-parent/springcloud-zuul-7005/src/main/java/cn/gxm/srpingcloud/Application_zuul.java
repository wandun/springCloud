package cn.gxm.srpingcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy//启动路由功能
public class Application_zuul {
	
	public static void main(String[] args) {
		SpringApplication.run(Application_zuul.class, args);
	}
}
