package cn.edu.yuntukeji.finacing.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import cn.edu.yuntukeji.tools.DataVo;

public class Dispacher {

	private static final Boolean SUCCESS = true;
	private static final Boolean FALIUER = false;
	private static final String ISSUCCESS = "isSuccess";
	private static final String RESULT = "result";

	private Class pojozz;

	public Map<String, Object> execute(Map<String, Object> request) {
		// 结果集
		Map<String, Object> resoult = new HashMap<>();
		resoult.put(ISSUCCESS, FALIUER);

		String url = (String) request.get("url");
		String pojoName = url.split("/")[0];
		String pojoMethod = url.split("/")[1];

		Integer number = null;
		if (url.split("/").length >= 3) {
			number = Integer.parseInt(url.split("/")[2]);
		} else {

		}

		Map dataMap = (Map) request.get("data");

		Map paramMap = (Map) request.get("param");

		Class servicezz;

		List<Object> data = new ArrayList<>();
		try {
			pojozz = Class.forName("cn.edu.yuntukeji.finacing.pojos."
					+ pojoName);
			if (number != null) {
				data.add(number);
			} else {
				if (dataMap != null) {
					data.add(DataVo.transMap2Bean2(dataMap, pojozz));
				} else {

					if (paramMap != null) {
						Iterator it = paramMap.keySet().iterator();
						while (it.hasNext()) {
							Object key = it.next();
							// System.out.println(key.toString());
							data.add(paramMap.get(key));
						}
					}

				}
			}

			String serviceName = "cn.edu.yuntukeji.finacing.service."
					+ pojozz.getSimpleName() + "ServiceImpl";
			servicezz = Class.forName(serviceName);
			Method[] mm = servicezz.getMethods();
			Class[] parameterClass = null;
			for (Method method : mm) {

				if (method.getName().toString().equals(pojoMethod)) {

					parameterClass = method.getParameterTypes();
					break;
				}

			}

			Method method = null;

			if (parameterClass == null || parameterClass.length == 0) {
				System.out.println(pojoMethod);
				method = servicezz.getMethod(pojoMethod);
				System.out.println(method);
				Object o = method.invoke(servicezz.newInstance());

				resoult.put(ISSUCCESS, SUCCESS);
				resoult.put(RESULT, o);

			} else {
				method = servicezz.getMethod(pojoMethod, parameterClass);
				for (int i = 0; i < data.size(); i++) {
					System.out.println("DDD"+data.get(i));
				}
				Object o = method.invoke(servicezz.newInstance(),
						data.toArray());
				resoult.put(ISSUCCESS, SUCCESS);
				resoult.put(RESULT, o);
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resoult;
	}

}
