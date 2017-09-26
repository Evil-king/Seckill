package com.hwq.dao;

import com.hwq.entity.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccesssKillDaoTest {
    @Resource
    private SuccessKillDao successKillDao;

    @Test
    /**
     第一次：insertCount:1
     第二次：insertCount:0
     */
    public void insertSuccessKilled() throws Exception {
        long id = 1001L;
        long userPhone = 13755588989L;
        int insertCount = successKillDao.insertSuccessKilled(id,userPhone);
        System.out.println("insertCount:"+insertCount);
    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        long id = 1001L;
        long userPhone = 13755588989L;
        SuccessKilled successKilled = successKillDao.queryByIdWithSeckill(id,userPhone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
    }

}