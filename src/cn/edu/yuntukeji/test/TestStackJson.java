package cn.edu.yuntukeji.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import cn.edu.yuntukeji.finacing.pojos.Customer;
import net.sf.json.JSONArray;

public class TestStackJson {
public static void main(String[] args) {
	ObjectMapper mapper = new ObjectMapper();  
	
	Map<String,Object> o = new LinkedHashMap<>();
	o.put("id", 2);
	o.put("customerSimpleName", "namer");
	
	Map<String,Object> salersMan  = new HashMap<>();
	salersMan.put("salesMamId", "0002");
	salersMan.put("chineseName", "世界");
	o.put("salersManId", salersMan) ;

	JSONArray json =JSONArray.fromObject(o); 
    System.out.println( json ); 

    try {
    	Customer bj2 = mapper.readValue(json.toString(), Customer[].class)[0];
		System.out.println(bj2.getSalersManId());
	} catch (JsonParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
    
    
    
}
}
