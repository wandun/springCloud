package cn.gxm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
//开启feign
@EnableFeignClients(basePackages= {"cn.gxm"})
@ComponentScan("cn.gxm")
public class ConsumerApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
