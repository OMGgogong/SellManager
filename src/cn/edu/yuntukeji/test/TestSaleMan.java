package cn.edu.yuntukeji.test;

import java.util.HashMap;
import java.util.Map;

import cn.edu.yuntukeji.finacing.controller.Dispacher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TestSaleMan {
	public static void testSave(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "SalesMan/save");
	
		Map<String,Object> salersMan  = new HashMap<>();
		salersMan.put("salesMamId", 5);
		salersMan.put("chineseName", "张国帅213");
		salersMan.put("englishName", "adashd");
		request.put("data", salersMan);
		
		dp.execute(request);
	}
	
	public static void testUpdate(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "SalesMan/update");
	
		Map<String,Object> salersMan  = new HashMap<>();
		salersMan.put("salesMamId", 5);
		salersMan.put("chineseName", "张asdas国帅213");
	
		request.put("data", salersMan);
		
		dp.execute(request);
	}
	public static void testFindById(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "SalesMan/findById/5");	
		Map<String, Object> reMap = dp.execute(request);
		JSONObject json = JSONObject.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	public static void testRemoveById(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "SalesMan/removeById/5");	
		Map<String, Object> reMap = dp.execute(request);
		JSONObject json = JSONObject.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	public static void testQuery(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "SalesMan/findAll");	
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
		//testSave();
		//testUpdate();
		//testFindById();
		//testRemoveById();
		testQuery();
		//testOther();
	}
}
