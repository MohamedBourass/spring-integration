package com.mbo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mbo.si.security.MessageConsumer;
import com.mbo.si.security.SecuredDirectChannel;
import com.mbo.si.security.SecurityConfig;
import com.mbo.si.security.SecurityPubSubChannel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SecurityConfig.class, SecuredDirectChannel.class, SecurityPubSubChannel.class,
		MessageConsumer.class })
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
