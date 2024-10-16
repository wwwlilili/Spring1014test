package com.springformmvc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.User;

@RestController
@RequestMapping(value = "/member")
public class MemberController {

    @RequestMapping(value="/testJson1")   
    @ResponseBody
    public  Map<String,Object> testJson1( String name,String password,String age) {
    	Map<String, Object> result = null;  
        System.out.println("pname=" + name + ",password="
                + password + ",page=" + age);       
        result = new HashMap<String, Object>();  
        result.put("msg", "name="+name);  
        return result;  
    }
    
    @RequestMapping(value="/testJson2",method=RequestMethod.POST)   
    @ResponseBody
    public  String testJson2( String name,String password,String age) {
    	Map<String, Object> result = null;  
        System.out.println("pname=" + name + ",password="
                + password + ",page=" + age);       
        result = new HashMap<String, Object>();  
        result.put("msg", "name="+name);  
        return "sssss"+name; 
    }
 
    @RequestMapping(value="/testJson")
    @ResponseBody
    public  User testJson(@RequestBody User user) {

        System.out.println("pname=" + user.getUsername() + ",password="
                + user.getPassword() + ",page" + user.getAge());       
        return user;
    }
	
}
