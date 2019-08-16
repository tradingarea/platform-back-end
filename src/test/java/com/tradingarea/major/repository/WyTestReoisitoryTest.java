/* CopyRight UMF */
package com.tradingarea.major.repository;

import com.tradingarea.major.entity.WyTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wangyu
 * @date 2019/8/16 14:52
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class WyTestReoisitoryTest {

    @Autowired
    WyTestRepository wyTestRepository;

    @Test
    public void findAllById() {
        WyTest wyTest = wyTestRepository.findAllById((long) 1);
        System.out.println(wyTest);
        // WyTest{id=1, a='a', b='b'}
    }
}
