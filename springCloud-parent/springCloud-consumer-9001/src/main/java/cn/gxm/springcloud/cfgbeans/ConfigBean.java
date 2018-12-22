package cn.gxm.springcloud.cfgbeans;

import java.util.Random;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;


@Configuration
public class ConfigBean //boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
{ 
	@Bean
	@LoadBalanced//在连接服务消费者的时候表明自己需要使用默认的负载均衡算法
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	
	/**
	 * 配置负载均衡，使用的算法是轮询
	 * @return
	 */
	@Bean
	public IRule getRule() {
		return new RandomRule();
	}
	
}
