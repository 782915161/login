package cn.tedu.boot.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.tedu.boot.entity.User;
@Mapper
public interface UserMapper {
	
	Integer addnew(User user);
	
	List<User> findAll(User user);
	
	User findByUsername(String username);
}
