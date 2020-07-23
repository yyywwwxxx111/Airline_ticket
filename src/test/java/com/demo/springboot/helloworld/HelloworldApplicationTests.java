package com.demo.springboot.helloworld;

import com.demo.springboot.helloworld.common.domain.Admin;
import com.demo.springboot.helloworld.common.domain.AdminExample;
import com.demo.springboot.helloworld.common.domain.Book;
import com.demo.springboot.helloworld.mapper.AdminMapper;
import com.demo.springboot.helloworld.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HelloworldApplicationTests {
    @Autowired
    BookMapper bookMapper;
    @Autowired
    AdminMapper adminMapper;//忽略自动注入报错
    @Test
    void contextLoads() {
        for (int i = 1; i <= 103; i++) {
            Book book = new Book();
            book.setAuthor("作者-"+i);
            book.setName("名字-"+i);
            book.setPrice(Math.random()*100);
            book.setRemark("备注信息-"+i);
            bookMapper.insert(book);
        }
    }
    @Test
    void test(){
        //模拟登陆一一操作的admin
        //自动注入接口
        //根据id查询用户
        String name = "admin";
        String pwd = "admin";
        AdminExample example = new AdminExample();
        example.createCriteria().andLoginnameEqualTo(name).andPasswordEqualTo(pwd);
        List<Admin> admins = adminMapper.selectByExample(example);
    }


}
