package cn.gxm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringBootApplication
@EnableHystrixDashboard
public class Application_dashboard {
	public static void main(String[] args)
	{
		SpringApplication.run(Application_dashboard.class, args);
	}
}
