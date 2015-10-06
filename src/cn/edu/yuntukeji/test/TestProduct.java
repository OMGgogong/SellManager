package cn.edu.yuntukeji.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import cn.edu.yuntukeji.finacing.controller.Dispacher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TestProduct {
	public static void testSave(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Product/save");
	
		Map<String,Object> salersMan  = new HashMap<>();
		salersMan.put("priductId", 2);
		salersMan.put("productName", "张国帅213");
		salersMan.put("lastPurchaseDate",new Date().getTime());
		request.put("data", salersMan);
		
		dp.execute(request);
	}
	
	public static void testUpdate(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Product/update");
	
		Map<String,Object> salersMan  = new HashMap<>();
		salersMan.put("priductId", 3);
		//salersMan.put("productName", "修改后的");
		salersMan.put("lastPurchaseDate",new Date().getTime());
		request.put("data", salersMan);
		
		dp.execute(request);
	}
	public static void testFindById(){
		Dispacher dp = new Dispacher();
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Product/findById/5");	
		Map<String, Object> reMap = dp.execute(request);
		JSONObject json = JSONObject.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	public static void testRemoveById(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Product/removeById/6");	
		Map<String, Object> reMap = dp.execute(request);
		JSONObject json = JSONObject.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	public static void testQuery(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Product/findAll");	
		Map<String, Object> reMap = dp.execute(request);
		JSONArray json = JSONArray.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	
	public static void testOther(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "SalesMan/other");	
		Map<String,Object> salersMan  = new HashMap<>();
		salersMan.put("jidu", 5);
		salersMan.put("name", "张国帅213");
	
		request.put("param", salersMan);
		Map<String, Object> reMap = dp.execute(request);
		JSONArray json = JSONArray.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	
	public static void main(String[] args) {
	    testSave();
		//testUpdate();
		// testFindById();
		//testRemoveById();
		//testQuery();
		//testOther();
	}
}
