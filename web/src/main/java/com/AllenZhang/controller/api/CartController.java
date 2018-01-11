package com.AllenZhang.controller.api;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.AllenZhang.dto.CartViewDto;
import com.AllenZhang.dto.MetaDto;
import com.AllenZhang.entity.UserCart;
import com.AllenZhang.service.CartService;
import com.AllenZhang.utils.Status;


/**
 * @author qrain
 *
 */
//@Controller
@RequestMapping(value="/api/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	private static final Log logger = LogFactory.getLog(CartController.class);

	/**
	 * 获取用户购物车
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/get/{userId}")
	public @ResponseBody MetaDto getCartById(@PathVariable("userId") Integer userId){
		MetaDto metaDto=new MetaDto();
		List<UserCart> listCart=cartService.getUserCartsByUserId(userId);
		if(listCart!=null){
			metaDto.setMessage("获得用户购物车商品");
			metaDto.setStatus(Status.SUCCESS);
			metaDto.setData(listCart);
		}else{
			metaDto.setMessage("未找到购物车信息");
			metaDto.setStatus(Status.FAILED);
		}
		return metaDto;
		
	}
	
	/**
	 * 删除用户购物车某项商品
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/get/{userId}/delete/{cartId}")
	public @ResponseBody MetaDto deleteCartById(@PathVariable("cartId") Integer cartId, @PathVariable("userId") String userId){
		MetaDto metaDto=new MetaDto();
		boolean flag=cartService.deleteUserCartByCartId(cartId);
		if(flag){
			metaDto.setMessage("删除成功");
			metaDto.setStatus(Status.SUCCESS);
		}else{
			metaDto.setMessage("删除失败");
			metaDto.setStatus(Status.FAILED);
		}
		return metaDto;
	}
	
	/**
	 * 修改用户购物车某项商品数量
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/get/{userId}/update/{cartId}")
	public @ResponseBody MetaDto updateCartById(@PathVariable Integer cartId, @RequestBody CartViewDto cartViewDto, @PathVariable("userId") String userId){
		MetaDto metaDto=new MetaDto();
		//通过cartid获得userCart修改num
//        cartService.updateUserCartNum();
		return null;
		
	}
	
	/**
	 * 新增用户购物车商品
	 * @param userCart
	 * @return
	 */
	@RequestMapping(value="/get/{userId}/add")
	public @ResponseBody MetaDto updateCartById(@RequestBody UserCart userCart, @PathVariable("userId") String userId){

		return null;
		
	}
}
