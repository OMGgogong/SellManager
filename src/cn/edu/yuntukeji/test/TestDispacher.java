package cn.edu.yuntukeji.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import cn.edu.yuntukeji.finacing.controller.Dispacher;

public class TestDispacher {
public static void main(String[] args) {
	Dispacher dp = new Dispacher();
	
	Map<String, Object> request = new HashMap<>();
	request.put("url", "Customer/findById/10");
	
//	Map<String,Object> o = new LinkedHashMap<>();
//	o.put("id", 10);
//	o.put("customerSimpleName", "customerSimpleName");
//	
//	Map<String,Object> salersMan  = new HashMap<>();
//	salersMan.put("salesMamId", 1);
//	salersMan.put("chineseName", 23);
//	o.put("salersManId", salersMan) ;
//	request.put("data", o);
	
	dp.execute(request);
}
}
