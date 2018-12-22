package cn.gxm.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.gxm.bean.Dept;

//表明需要使用哪一个服务,所以不需要实现，通过服务名称再到提供者，让她处理即可
@FeignClient(value = "SPRINGCLOUD-PROVIDER")
public interface DeptService {
	//以后访问时，就是http://SPRINGCLOUD-PROVIDER/dept/get/{id}
	
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") long id);

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list();

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(Dept dept);
}
