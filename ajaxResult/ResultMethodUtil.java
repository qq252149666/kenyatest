/*
package com.kenYa.ajaxResult;

import java.util.List;

public class ResultMethodUtil {
	    */
/**
	     * 判断Integer类型的参数是否为空，为空则抛出参数异常 
	     * @param intergers 
	     * *//*

	    public static void judgeIntegerNull(Integer...integers)throws Exception{  
	    	
	        if ( integers==null || integers.length == 0) {  
	            throw new ParameterException(JsonCodeEnum.UpdatePWFail);  
	        }  
	        for(Integer i : integers){  
	            if(i==null){  
	                throw new ParameterException(JsonCodeEnum.MyException);  
	            }  
	        }  
	    }  
	      
	    */
/**
	     * 判断String类型的参数是否为空，为空则抛出参数异常 
	     * @param value 
	     * *//*

	    public static void judgeStringNull(String...value)throws Exception{  
	        for(String i : value){  
	            if(i=="" || i==null ||"".equals(i)){  
	                throw new ParameterException(JsonCodeEnum.SUCCESS);  
	            }  
	        }  
	    }  
	      
	    */
/**
	     * 判断返回值是否为空 
	     * *//*

*/
/*	    public static void judgeReturnNull(Object o){
	        if(o instanceof List){  
	            if(((List) o).size()==0 || o==null){  
	                throw new NotFoundException(JsonCodeEnum.SUCCESS);  
	            }  
	        }else{  
	            if(o==null || o.equals("") ){  
	                throw new NotFoundException(JsonCodeEnum.SUCCESS);  
	            }  
	        }  
	    } *//*

	      
	      
	} 


*/
