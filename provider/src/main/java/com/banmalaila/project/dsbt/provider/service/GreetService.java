package com.banmalaila.project.dsbt.provider.service;

import com.banmalaila.project.dsbt.api.Greet;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author chenjh
 * @since 2022-11-17
 */
@DubboService(version = "1.0.0")
public class GreetService implements Greet {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
