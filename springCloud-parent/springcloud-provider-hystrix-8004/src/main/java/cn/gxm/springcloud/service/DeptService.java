package cn.gxm.springcloud.service;

import java.util.List;

import cn.gxm.bean.Dept;

public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
