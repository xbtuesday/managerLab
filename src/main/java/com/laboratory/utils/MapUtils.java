package com.laboratory.utils;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * map verify
 * Created by Lpan on 2017/12/22.
 */
public class MapUtils {

    public static boolean isEmptyS(Map<String,String> map){
        Boolean flag = false;
        if(null != map && !map.isEmpty() && map.size() > 0){
            flag = true;
        }
        return flag;
    }

    public static Map<String, String> getMapParams(HttpServletRequest request){
        Map<String, String> param = new HashMap<String, String>();
        Enumeration enumeration = request.getParameterNames();
        while(enumeration.hasMoreElements()){
            String paramName = (String) enumeration.nextElement();
            String[] values = request.getParameterValues(paramName);
            param.put(paramName, values[0]);
        }
        return param;
    }


}

