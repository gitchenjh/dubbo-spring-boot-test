package com.banmalaila.project.dsbt.consumer.service;

import com.banmalaila.project.dsbt.api.Greet;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

/**
 * @author chenjh
 * @since 2022-11-17
 */
@Service
public class GreetService implements ApplicationRunner {

    private final Logger logger = LoggerFactory.getLogger(GreetService.class);

    @DubboReference(version = "1.0.0")
    private Greet greet;

    public void greet() {
        String hello = greet.sayHello("consumer");
        logger.info("Greet ====> {}", hello);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        this.greet();
    }
}
