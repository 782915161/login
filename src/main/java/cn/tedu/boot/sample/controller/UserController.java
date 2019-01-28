package cn.tedu.boot.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.boot.entity.User;
import cn.tedu.boot.sample.service.IUserService;
import cn.tedu.boot.sample.util.ResponseResult;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	//Controller	>Service	>Mapper		业务流程
	
	@RequestMapping("/reg")
	public ResponseResult<Void> handleReg(User user){
		//注册业务
		userService.reg(user);
		return new ResponseResult<Void>(1,"注册成功!");
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseResult<Void> handleException(Exception e){
		
		return new ResponseResult<Void>(2,e);
	}
}
