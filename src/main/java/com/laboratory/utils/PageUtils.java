package com.laboratory.utils;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class PageUtils {

	public static void calculate(Map<String,Object> map){
		Integer count=Integer.valueOf(map.get("count").toString());
		Integer page=1;
		if(map.containsKey("page")){
			if(map.get("page") != null && !"".equals(map.get("page"))){
				page=Integer.parseInt(map.get("page").toString());
			}
		}
		Integer pageSize=10;
		if(map.containsKey("pageSize")){
			pageSize=Integer.parseInt(map.get("pageSize").toString());
		}
		Integer pageTotal=(int) Math.ceil((double)count/(double)pageSize);
		Integer pageStart=(page-1)*10;
		Integer previous=1;
		Integer last=pageTotal;
		Integer next=page+1;
		if(next>=pageTotal){
			next = pageTotal;
		}
		if(page>1){
			previous=page-1;
		}
		map.put("pageTotal", pageTotal);//总页数
		map.put("pageStart", pageStart);//数据库从那条开始查询
		map.put("pageSize", pageSize);//每页显示
		map.put("page", page);//当前页
		map.put("count", count);//总条数
		map.put("first", "1");//第一页
		map.put("previous", previous);//上一页
		map.put("next", next);
		map.put("last", last);
		
		}

	public static Map<String, Object> Page(HttpServletRequest request, Map<String, Object> map) {
		Integer page=1;
		if(map.containsKey("page")){
			if(map.get("page") != null && !"".equals(map.get("page"))){
				page=Integer.valueOf(map.get("page").toString());
				if(page <= 0){
					page = 1;
					map.put("page", 1);
				}
			}
		}
		Integer pageStart=(page-1)*10;
		map.put("pageStart", pageStart);//数据库从那条开始查询
		
		Integer pageSize=10;
		if(map.containsKey("pageSize")){
			pageSize=Integer.parseInt(map.get("pageSize").toString());
		}
		map.put("pageSize", pageSize);
		
		
		Integer count=0;
		if(map.containsKey("count")){
			count=Integer.parseInt(map.get("count").toString());
		}
		request.setAttribute("map", map);
		return map;
	}
}
