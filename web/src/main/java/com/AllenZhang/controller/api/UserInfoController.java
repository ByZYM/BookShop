package com.AllenZhang.controller.api;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.AllenZhang.dto.MetaDto;
import com.AllenZhang.entity.UserInfo;
import com.AllenZhang.service.UserService;
import com.AllenZhang.utils.Status;


/**
 * @author qrain
 *
 */
@Controller
@RequestMapping(value="/userInfo")
public class UserInfoController {
	@Autowired
	private UserService userService;
	
	private static final Log logger = LogFactory.getLog(UserInfoController.class);
	
	
	/**
	 * 获取用户详细信息
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/get/{userId}")
	public @ResponseBody MetaDto getUserInfo(@PathVariable("userId") Integer userId){
		MetaDto metaDto=new MetaDto();
		UserInfo userInfo=userService.getUserInfoByUserId(userId);
		if(userInfo==null){
			metaDto.setMessage("查找失败");
			metaDto.setData(Status.FAILED);
		}else{
			metaDto.setMessage("查找成功");
			metaDto.setData(Status.SUCCESS);
			metaDto.setData(userInfo);
		}
		return metaDto;
	}
	
	/**
	 *修改用户详细信息
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/update/{userId}")
	public @ResponseBody MetaDto updateUserInfo(@PathVariable("userId") Integer userId){
		//修改用户详细信息
		return null;
		
	}
	

}
