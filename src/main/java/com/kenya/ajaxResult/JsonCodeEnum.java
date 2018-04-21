package com.kenya.ajaxResult;



/**

 *  create by Liujishuai on 2015年9月21日
s
 */
public enum JsonCodeEnum {
	
	
 
	 /**
     * 成功. ErrorCode : 0
     */
   
    /**
     * 未知异常. ErrorCode : 01
     */
    UnknownException("01","未知异常"),
    /**
     * 系统异常. ErrorCode : 02
     */
    SystemException("02","系统异常"),
    /**
     * 业务错误. ErrorCode : 03
     */
    MyException("03","业务错误"),
    /**
     * 提示级错误. ErrorCode : 04
     */
    InfoException("04", "提示级错误"),
    /**
     * 数据库操作异常. ErrorCode : 020001
     */
    DBException("020001","数据库操作异常"),
    /**
     * 参数验证错误. ErrorCode : 040001
     */
  //  ParamException("040001","参数验证错误"),
    SUCCESS("","成功"),
	UserNameExist("042","该用户已存在"),
	RegisterSuccess("000","注册成功"),
	loginSuccess("000","登录成功"),
	LoginFail("043","手机号错误或密码错误"),
	UserNameNotExist("044","该用户不存在"),
	//PhoneNumberNotExist("046","该用户不存在"),
	UpdatePWOk("000","更新密码成功"),
	UpdatePWFail("051","不能和上次密码相同"),
	ParameterNotHealth("601","参数不健全，请补充"),
	NotaPicture("702","请检查是否为图片？"),
	PictureTooBig("701","图片太大了"),
	NotaPicture1("code:","702","message:","asssss"),
	
	UsedGoodsPublishSuccess("000","发布成功");
	
	

    private String _code;
    private String _msg;

    private JsonCodeEnum(String code, String msg){
        _code = code;
        _msg = msg;
    }
    private JsonCodeEnum(String code, String msg,String ss,String sss){
        _code = code;
        _msg = msg;
    }


    public String getCode(){
        return _code;
    }
    public String getMsg(){
        return _msg;
    }
    
    

    public static JsonCodeEnum getByCode(int code){
        for(JsonCodeEnum ec : JsonCodeEnum.values()){
        	  if(ec.getCode().equals(code)){
        	
                return ec;
            }
        }
       
        return null;
    }
}

