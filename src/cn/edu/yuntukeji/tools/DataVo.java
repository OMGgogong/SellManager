package cn.edu.yuntukeji.tools;

import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import net.sf.json.JSONArray;

public class DataVo {
	public static String jsonToDate(String date){
		Pattern p=Pattern.compile(".*"); 
		Matcher m=p.matcher(date); 
		System.out.println(m.group());
		return date;
	}
	public static Object transMap2Bean2(Map<String, Object> map, Class<?> obj) {  
		Object resoult = null;
		ObjectMapper mapper = new ObjectMapper();  
		JSONArray json =JSONArray.fromObject(map); 
		
	    try {
	    	resoult = mapper.readValue(json.get(0).toString(), obj);
			//System.out.println(bj2.getSalersManId());
	    	
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
	    
        return resoult;  
    }  
	
	
}
