package cn.tedu.boot.sample.mapper;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.boot.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTestCase {
	
	@Autowired
	UserMapper userMapper;
	
	@Test
	public void addnew() {
		User user=new User();
		user.setUsername("boot");
		user.setPassword("123456");
		user.setAge(16);
		user.setPhone("15523432534");
		user.setEmail("7829151@qq.com");
		Integer rows= userMapper.addnew(user);
		System.out.println("rows:"+rows);
	}
	
	@Test
	public void findAll() {
		User users =new User();
		List<User> rows=userMapper.findAll(users);
		for(User user:rows) {
			System.out.println(user);
		}		
	}
	
	@Test
	public  void findByUsername() {
		String username="boot";
		User user=userMapper.findByUsername(username);
		System.out.println(user);
	}
}
