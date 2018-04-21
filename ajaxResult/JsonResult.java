/*
package com.kenYa.ajaxResult;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Update;

import com.kenYa.controller.AjaxResultTest;

*/
/**

 *  create by Liujishuai on 2015年9月21日

 *//*

public class JsonResult {

	//{"method":"GET","canshu1":"null","canshu2":"null","result":[{"username":"Google","password":"admin123"},{"username":"Baidu","password":"w6332153"},{"username":"SoSo","password":"qwerzxcv"}]}
	
	//private String method;
	private Object Data;
	private Object Data1;
	private  String code;
	private String message;
	List<Object>list;
	Map<Object, Object> map;
	
	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public JsonResult() {
		super();
	}

	public JsonResult(String code, String message, Object data) {
		super();
		this.code = code;
		this.message = message;
		this.Data = data;
	}
*/
/*	private AjaxResult(String method, int canshu1, String canshu2, Object result) {
		this.method = method;
		this.error = canshu1;
		this.message = canshu2;
		this.Data = result;
	}
	
	@Override
	public String toString() {
		return "AjaxResult [method=" + method + ", canshu1=" + error + ", canshu2=" + message + ", result=" + Data
				+ "]";
	}*//*

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return Data;
	}
	public void setData(Object data) {
		Data = data;
	}
	*/
/*public void setData1(Object data1) {
		Data1 = data1;
	}*//*

    public static JsonResult getOK(Object obj){
    	//注册成功
    	JsonResult result = new JsonResult();
        
		result.setData(obj);
        result.setCode(JsonCodeEnum.RegisterSuccess.getCode());
        result.setMessage(JsonCodeEnum.RegisterSuccess.getMsg());
       
        return result;
    }
    public Object getData1() {
		return Data1;
	}

	public void setData1(Object data1) {
		Data1 = data1;
	}

	public static JsonResult UserNameExist(){
    	//用户存在
    	JsonResult result = new JsonResult();
        result.setCode(JsonCodeEnum.UserNameExist.getCode());
      
        result.setMessage(JsonCodeEnum.UserNameExist.getMsg());
        
        return result;
    }

    public static JsonResult getLoginOK(Object obj){
    	//登录成功
    	
    	JsonResult result = new JsonResult();
        
    	result.setData(obj);
        result.setCode(JsonCodeEnum.loginSuccess.getCode());
        result.setMessage(JsonCodeEnum.loginSuccess.getMsg());
       
        return result;
    }
    public static JsonResult LoginPswError(){
    	// 登录密码错误
    	JsonResult result = new JsonResult();
        result.setCode(JsonCodeEnum.LoginFail.getCode());
      
        result.setMessage(JsonCodeEnum.LoginFail.getMsg());
        
        return result;
    }
*/
/*    public static JsonResult UserExist(){
    	//用户存在
    	JsonResult result = new JsonResult();
        result.setCode(JsonCodeEnum.UserExist.getCode());
      
        result.setMessage(JsonCodeEnum.UserExist.getMsg());
        
        return result;
    }*//*

    public static JsonResult UserNoExist(){
    	//用户不存在
    	JsonResult result = new JsonResult();
        result.setCode(JsonCodeEnum.UserNameNotExist.getCode());
      
        result.setMessage(JsonCodeEnum.UserNameNotExist.getMsg());
        
        return result;
    }
 
    public static JsonResult updatePSOk(){
    	//更新密码成功
    	JsonResult result = new JsonResult();
        result.setCode(JsonCodeEnum.UpdatePWOk.getCode());
      
        result.setMessage(JsonCodeEnum.UpdatePWOk.getMsg());
        
        return result;
    }
    public static JsonResult updatePSFail(){
    	//更新密码失败
    	JsonResult result = new JsonResult();
        result.setCode(JsonCodeEnum.UpdatePWFail.getCode());
      
        result.setMessage(JsonCodeEnum.UpdatePWFail.getMsg());
        
        return result;
    }
    public static JsonResult parameterNotHealth () {
    	JsonResult result = new JsonResult();
        result.setCode(JsonCodeEnum.ParameterNotHealth.getCode());
        
        result.setMessage(JsonCodeEnum.ParameterNotHealth.getMsg());
		return result;
    	
    }
    public static JsonResult NotaPicture () {
    	JsonResult result = new JsonResult();
        result.setCode(JsonCodeEnum.NotaPicture.getCode());
        
        result.setMessage(JsonCodeEnum.NotaPicture.getMsg());
		return result;
    	
    }
    
    public static JsonResult PictureTooBig () {
    	JsonResult result = new JsonResult();
        result.setCode(JsonCodeEnum.PictureTooBig.getCode());
        
        result.setMessage(JsonCodeEnum.PictureTooBig.getMsg());
		return result;
    	
    }
    //二手发布成功
    public static JsonResult UsedGoodsPublishSuccess (Map<Object, Object> map) {
    	JsonResult result = new JsonResult();
    	result.setMap(map);
    	
        result.setCode(JsonCodeEnum.UsedGoodsPublishSuccess.getCode());
        
        result.setMessage(JsonCodeEnum.UsedGoodsPublishSuccess.getMsg());
		return result;
    	
    }

	public Map<Object, Object> getMap() {
		return map;
	}

	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "JsonResult [Data=" + Data + ", code=" + code + ", message=" + message + "]";
	}
	
}
*/
