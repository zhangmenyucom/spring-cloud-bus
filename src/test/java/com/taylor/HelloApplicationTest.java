package com.taylor;

import com.netflix.discovery.converters.Auto;
import com.taylor.amq.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xiaolu.zhang
 * @desc:
 * @date: 2017/7/3 15:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=HelloApplication.class)
public class HelloApplicationTest {
    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception{
        sender.send();
    }
}
