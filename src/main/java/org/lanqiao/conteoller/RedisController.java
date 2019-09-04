package org.lanqiao.conteoller;

import org.lanqiao.entity.Student;
import org.lanqiao.util.RedisUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisController {
    private static int ExpireTime = 60;   // redis中存储的过期时间60s

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("/set")
    public boolean redisset(String key, String value){
        key = "first";
        Student student = new Student();
        student.setName("dyq");
        student.setPassword("123456");

        return redisUtil.set(key,student,ExpireTime);
    }

    @RequestMapping("/get")
    public Object redisset(String key){
        key = "first";
        return redisUtil.get(key);
    }

}
