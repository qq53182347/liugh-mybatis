package com.liugh;

import com.liugh.bean.User;
import com.liugh.mapper.UserMapper;
import com.liugh.sqlSession.MySqlsession;

public class TestMybatis {
	
    public static void main(String[] args) {  
        MySqlsession sqlsession=new MySqlsession();  
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);  
        User user = mapper.getUserById("2");  
        System.out.println(user);
    } 

}
