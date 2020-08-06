//package com.demo.springboot.helloworld;
//
//import com.demo.springboot.helloworld.common.domain.Company;
//import com.demo.springboot.helloworld.common.domain.User;
//import com.demo.springboot.helloworld.common.domain.UserExample;
//import com.demo.springboot.helloworld.mapper.CompanyMapper;
//import com.demo.springboot.helloworld.mapper.UserMapper;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
////测试类
////@SpringBootTest //启动springboot
//
//class HelloworldApplicationTests {
////    @Autowired
////    BookMapper bookMapper;
////    @Autowired
////    AdminMapper adminMapper;//忽略自动注入报错
////    @Test
////    void contextLoads() {
////        for (int i = 1; i <= 103; i++) {
////            Book book = new Book();
////            book.setAuthor("作者-"+i);
////            book.setName("名字-"+i);
////            book.setPrice(Math.random()*100);
////            book.setRemark("备注信息-"+i);
////            bookMapper.insert(book);
////        }
////    }
////    @Test
////    void test(){
////        //模拟登陆一一操作的admin
////        //自动注入接口
////        //根据id查询用户
////        String name = "admin";
////        String pwd = "admin";
////        AdminExample example = new AdminExample();
////        example.createCriteria().andLoginnameEqualTo(name).andPasswordEqualTo(pwd);
////        List<Admin> admins = adminMapper.selectByExample(example);
////    }
//    @Autowired
//    UserMapper userMapper;
//    @Autowired
//    CompanyMapper companyMapper;
//
////@Test
////    void test(){
////    //根据id查询用户
////    //User user = userMapper.selectByPrimaryKey(111l);
////    //select * from user where uidpk=111
////    //System.out.println();
////    //根据用户名和密码查询
////    String name="admin";
////    String password="admin";
//////    User user=new User();
//////    user.setName(name);
//////    user.setPassword(password);
////    UserExample example = new UserExample();//空模板
////    example.createCriteria().andNameEqualTo(name).andPasswordEqualTo(password);//name=admin and password=admin
////    List<User> users = userMapper.selectByExample(example);//查询所有
////    System.out.println(users);
//////查询id 1-5
////    example.createCriteria().andUidPkBetween(1l,5l);
////    example.createCriteria().andEmailLike("%hello%");
//////插入
////    User user=new User();
////    user.setName("ddd");
////    user.setPassword("ddd");
////    int i = userMapper.insert(user);
//////更新
////    userMapper.updateByPrimaryKey(user);
////
////
//////    UserExample example1=new UserExample();
//////    UserExample.Criteria criteria= example1.createCriteria();
//////    criteria.andNameEqualTo(name).andPasswordEqualTo(password);
//////    criteria.andUidPkBetween(1l,5l);  三个条件
////
////}
////
//
//@Test
//    void test2() {
//    //根据用户名查询用户
//    String name = "111";
//    String password = "111";
//    User user = new User();
//    user.setName(name);
//    user.setPassword(password);
////    UserExample example=new UserExample();
////    example.createCriteria().andNameEqualTo(name);
////    List<User> users = userMapper.selectByExample(example);
////    System.out.println(users);
////    List<User> users=userMapper.selectByName(name,password);
////    List<User> user1= userMapper.selectByAll(1,user);
//    }
//
//
//    @Test
//    void test3(){
//        List<Company> companies = companyMapper.myList();
//        System.out.println(companies);
//    }
//
//}
