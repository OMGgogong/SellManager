package cn.edu.yuntukeji.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import cn.edu.yuntukeji.finacing.controller.Dispacher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TestPurchaseMaster {
	public static void testSave(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "PurchaseMaster/save");
	
		Map<String,Object> salersMan  = new HashMap<>();
		salersMan.put("purchaseDetailId", 2);
		
		
		Map<String,Object> product  = new HashMap<>();
		product.put("priductId", 3);
		
		
		Map<String,Object> purchaseMaster  = new HashMap<>();
		purchaseMaster.put("purchaseId", 1);
		
		
		salersMan.put("productId", product);
		salersMan.put("purchaseId", purchaseMaster);
		request.put("data", salersMan);
		
		dp.execute(request);
	}
	
	public static void testUpdate(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "PurchaseMaster/update");
	
		Map<String,Object> salersMan  = new HashMap<>();
		salersMan.put("purchaseDetailId", 2);
		
		
		Map<String,Object> product  = new HashMap<>();
		product.put("priductId", 3);
		
		
		Map<String,Object> purchaseMaster  = new HashMap<>();
		purchaseMaster.put("purchaseId", 2);
		
		
		salersMan.put("productId", product);
		salersMan.put("purchaseId", purchaseMaster);
		request.put("data", salersMan);
		dp.execute(request);
	}
	public static void testFindById(){
		Dispacher dp = new Dispacher();
		Map<String, Object> request = new HashMap<>();
		request.put("url", "PurchaseMaster/findById/2");	
		Map<String, Object> reMap = dp.execute(request);
		JSONObject json = JSONObject.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	public static void testRemoveById(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "PurchaseMaster/removeById/2");	
		Map<String, Object> reMap = dp.execute(request);
		JSONObject json = JSONObject.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	public static void testQuery(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "PurchaseMaster/findAll");	
		Map<String, Object> reMap = dp.execute(request);
		JSONArray json = JSONArray.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	
	public static void queryAllPurchase(){
		Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "PurchaseMaster/queryAllPurchase");	
		Map<String,Object> salersMan  = new HashMap<>();
		Map<String, Object> reMap = dp.execute(request);
		JSONArray json = JSONArray.fromObject(reMap.get("result"));
		System.out.println("saleman：："+json);
	}
	public static void queryUngodownProduct(){
			Dispacher dp = new Dispacher();
		
		Map<String, Object> request = new HashMap<>();
		request.put("url", "PurchaseMaster/queryUngodownProduct");	
		Map<String,Object> salersMan  = new HashMap<>();
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
		//queryAllPurchase();
		//queryUngodownProduct();
	}
}
