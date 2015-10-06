package cn.edu.yuntukeji.finacing.view1.pulus;

import java.util.HashMap;
import java.util.Map;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

import cn.edu.yuntukeji.finacing.controller.Dispacher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class SupplierComboBox extends JComboBox {
	private static Dispacher dp = new Dispacher();;

	public SupplierComboBox() {
		initModel();
	}

	public void initModel() {
		this.setModel(new javax.swing.DefaultComboBoxModel(findAllDate()));
	}

	private static String[] findAllDate() {

		Map<String, Object> request = new HashMap<>();
		request.put("url", "Supplier/findAll");
		Map<String, Object> reMap = dp.execute(request);
		JSONArray json = JSONArray.fromObject(reMap.get("result"));
		// System.out.println("saleman：："+json);
		String[] o = new String[json.size()];
		for (int i = 0; i < json.size(); i++) {
			o[i] = ((JSONObject) json.get(i)).getString("supplierId");
		}

		return o;
	}
}
