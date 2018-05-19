package com.kenya.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import com.kenya.dao.HttpRequestUtil;

public class SendMsgUtil {  
    /**  
     * 发送短信消息  
      * 方法说明  
      * @Discription:扩展说明  
      * @param phone  
      * @param content  
      * @return  
      * @return String  
     */  
	public  HashMap<String, Object> sendMsg(String phone,String content) {  
        //短信接口URL提交地址  
        String url = "https://45.79.185.110:8085/api/messaging/singleSms";  
  
        Map<String, String> params = new HashMap<String, String>();  
        //手机号码，多个号码使用英文逗号进行分割  
        params.put("mobileNumber", phone);  
        //将短信内容进行URLEncoder编码  
        params.put("messageContent", content);  
  
        return HttpRequestUtil.postRequest(url, params);  
    }  
  
    /**  
     * 随机生成6位随机验证码  
      * 方法说明  
      * @Discription:扩展说明  
      * @return  
      * @return String  
     */  
    public static String createRandomVcode(){  
        //验证码  
        String vcode = "";  
        for (int i = 0; i < 6; i++) {  
            vcode = vcode + (int)(Math.random() * 9); 
        }  
        return vcode;
    }  
  
}  