package com.AllenZhang.controller.api;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.AllenZhang.dto.MetaDto;
import com.AllenZhang.entity.UserAccount;
import com.AllenZhang.service.UserService;
import com.AllenZhang.utils.Status;
/**
 * @author qrain
 *
 */
@Controller
@RequestMapping(value="/api/userAccount")
public class UserAccountController {
	
	   @Autowired
	   private UserService userService;
	
	private static final Log logger = LogFactory.getLog(UserAccountController.class);
	
	/**
	 * 获取用户账号
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/get/{userId}")
	public @ResponseBody MetaDto getUserAccount(@PathVariable("userId") Integer userId){
		MetaDto metaDto=new MetaDto();
		UserAccount userAccount=userService.getUserAccountByUserId(userId);
		if(userAccount!=null){
			metaDto.setMessage("获得用户账户");
			metaDto.setStatus(Status.SUCCESS);
			metaDto.setData(userAccount);
		}else{
			metaDto.setMessage("未找到用户账户");
			metaDto.setStatus(Status.FAILED);
		}
		return metaDto;
		
	}
	
	
	/**
	 * 修改用户账户
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/update/{userId}")
	public @ResponseBody MetaDto updateUserAccount(@PathVariable("userId") Integer userId,@RequestBody UserAccount userAccount){
		MetaDto metaDto=new MetaDto();
		UserAccount returnDate=userService.getUserAccountByUserId(userId);
		if(returnDate!=null){
			boolean flag=userService.updateUserPassword(userAccount);
			if(flag){
				metaDto.setMessage("修改成功");
				metaDto.setStatus(Status.SUCCESS);
			}else{
				metaDto.setMessage("修改失败");
				metaDto.setStatus(Status.FAILED);
			}
		}else{
			metaDto.setMessage("修改非法");
			metaDto.setStatus(Status.FAILED);
		}
		return metaDto;
		
	}

}
