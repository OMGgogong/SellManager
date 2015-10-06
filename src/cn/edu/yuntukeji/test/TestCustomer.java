package cn.edu.yuntukeji.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import cn.edu.yuntukeji.finacing.controller.Dispacher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TestCustomer {
	
	public static void testSave(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Customer/save");
		
//		Map<String,Object> o = new LinkedHashMap<>();
//		o.put("id", 10);
//		o.put("customerSimpleName", "customerSimpleName");
	//	
		Map<String,Object> salersMan  = new HashMap<>();
		salersMan.put("id", 5);
		salersMan.put("customerSimpleName", "cccc");
		//o.put("salersManId", salersMan) ;
		request.put("data", salersMan);
		
		dp.execute(request);
	}
	public static void testUpdate(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Customer/update");
	
		Map<String,Object> salersMan  = new HashMap<>();
		salersMan.put("id", 1);
		salersMan.put("customerSimpleName", "3423");
		
		request.put("data", salersMan);
		
		dp.execute(request);
	}
	public static void testFindById(){
		Dispacher dp = new Dispacher();
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Customer/findById/5");	
		Map<String, Object> reMap = dp.execute(request);
		JSONObject json = JSONObject.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	public static void testRemoveById(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Customer/removeById/5");	
		Map<String, Object> reMap = dp.execute(request);
		JSONObject json = JSONObject.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	public static void testQuery(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Customer/findAll");	
		Map<String, Object> reMap = dp.execute(request);
		JSONArray json = JSONArray.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	
	public static void testOther(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Customer/other");	
		Map<String,Object> salersMan  = new HashMap<>();
		salersMan.put("jidu", 5);
		salersMan.put("name", "张国帅213");
	
		request.put("param", salersMan);
		Map<String, Object> reMap = dp.execute(request);
		JSONArray json = JSONArray.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	public static void queryTradeGroupByQuater(){
		Dispacher dp = new Dispacher();
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Customer/queryTradeGroupByQuater");	
		Map<String,Object> salersMan  = new HashMap<>();
		salersMan.put("jidu", 3);
		
		request.put("param", salersMan);
		Map<String, Object> reMap = dp.execute(request);
		JSONArray json = JSONArray.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}

	public static void main(String[] args) {
	   // testSave();
		//testUpdate();
		// testFindById();
		//testRemoveById();
		testQuery();
		//testOther();
		//queryTradeGroupByQuater();
	}

}
