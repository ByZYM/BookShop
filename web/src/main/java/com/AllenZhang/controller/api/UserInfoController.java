package com.AllenZhang.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.AllenZhang.dto.MetaDto;


/**
 * @author qrain
 *
 */
@Controller
@RequestMapping(value="/userInfo")
public class UserInfoController {
	
	/**
	 * 获取用户详细信息
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/get/{userId}")
	public @ResponseBody MetaDto getUserInfo(@PathVariable Integer userId){
		return null;
		
	}
	
	/**
	 * 获取用户详细信息
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/update/{userId}")
	public @ResponseBody MetaDto updateUserInfo(@PathVariable Integer userId){
		return null;
		
	}
	

}
