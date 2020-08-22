package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
//import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void findById(){
        //获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        //dao测试
        //从容器中拿到所需的dao的代理对象
        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        //调用方法
        Items items = itemsDao.findById(1);
        System.out.println(items.getName());
        //service测试
        /*ItemsService itemsService = ac.getBean(ItemsService.class);
        //调用方法
        Items items = itemsService.findById(2);
        System.out.println(items.getName());*/
        //我也该了你要怎样？

        //1.0版本记录，打个tags

        //来了个通讯的模块，加进去之后，打个分支出来。
    }
}
