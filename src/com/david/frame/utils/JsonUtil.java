package com.david.frame.utils;

import com.google.gson.Gson;

public class JsonUtil {
	private static Gson gson = null;  
    
    static {  
        if (gson == null) {  
            gson = new Gson();  
        }  
    }  
  
    private JsonUtil() {  
      
    }  
    
    /** 
     * 将json转换成bean对象 
     *  
     * @param jsonStr 
     * @return 
     */  
    public static Object jsonToBean(String jsonStr, Class<?> cl) {  
        Object obj = null;  
        if (gson != null) {  
            obj = gson.fromJson(jsonStr, cl);  
        }  
        return obj;  
    }
}
