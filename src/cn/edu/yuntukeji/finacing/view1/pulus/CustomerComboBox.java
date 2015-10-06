package cn.edu.yuntukeji.finacing.view1.pulus;

import java.util.HashMap;
import java.util.Map;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

import cn.edu.yuntukeji.finacing.controller.Dispacher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class CustomerComboBox extends JComboBox{
	private static Dispacher dp  = new Dispacher();
	
	public CustomerComboBox() {
		initModel();
		
	}

public  void initModel(){
	this.setModel(new javax.swing.DefaultComboBoxModel(
			findAllDate()));
}

private String [] findAllDate(){
	
	Map<String, Object> request = new HashMap<>();
	request.put("url", "Customer/findAll");	
	Map<String, Object> reMap = dp.execute(request);
	JSONArray json = JSONArray.fromObject(reMap.get("result"));
	String [] o = new String [json.size()];
	for (int i = 0;i<json.size();i++) {
		o[i] = ((JSONObject)json.get(i)).getString("id");
		System.out.println("DDDCCCCCCDD"+o[i]);
	}
	
	return o;
}
}
