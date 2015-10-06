package cn.edu.yuntukeji.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import cn.edu.yuntukeji.finacing.controller.Dispacher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TestSupplier {
	public static void testSave(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Supplier/save");
	
		Map<String,Object> salersMan  = new HashMap<>();
		salersMan.put("supplierId", 3);
		salersMan.put("supplierSimpleName", "阿斯达斯");
	//	salersMan.put("lastPurchaseDate",new Date().getTime());
		request.put("data", salersMan);
		
		dp.execute(request);
	}
	
	public static void testUpdate(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Supplier/update");
	
		Map<String,Object> salersMan  = new HashMap<>();
		salersMan.put("supplierId", 6);
		salersMan.put("supplierSimpleName", "修改后的");
		//salersMan.put("supplierSimpleName",new Date().getTime());
		request.put("data", salersMan);
		
		dp.execute(request);
	}
	public static void testFindById(){
		Dispacher dp = new Dispacher();
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Supplier/findById/6");	
		Map<String, Object> reMap = dp.execute(request);
		JSONObject json = JSONObject.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	public static void testRemoveById(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Supplier/removeById/6");	
		Map<String, Object> reMap = dp.execute(request);
		JSONObject json = JSONObject.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	public static void testQuery(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Supplier/findAll");	
		Map<String, Object> reMap = dp.execute(request);
		JSONArray json = JSONArray.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	
	public static void testOther(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Supplier/other");	
		Map<String,Object> salersMan  = new HashMap<>();
		salersMan.put("jidu", 5);
		salersMan.put("name", "张国帅213");
	
		request.put("param", salersMan);
		Map<String, Object> reMap = dp.execute(request);
		JSONArray json = JSONArray.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	public static void queryTradesGroupQuarterById(){
		
	Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "Supplier/queryTradesGroupQuarterById");	
		Map<String,Object> salersMan  = new HashMap<>();
		salersMan.put("id", 1);
		salersMan.put("quarter", 3);
	
		request.put("param", salersMan);
		Map<String, Object> reMap = dp.execute(request);
		JSONArray json = JSONArray.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	
	public static void main(String[] args) {
	    //testSave();
		//testUpdate();
		// testFindById();
		//testRemoveById();
		//testQuery();
		//testOther();
		queryTradesGroupQuarterById();
	}
}
