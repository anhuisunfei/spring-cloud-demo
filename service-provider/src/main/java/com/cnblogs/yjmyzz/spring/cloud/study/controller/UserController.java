package com.cnblogs.yjmyzz.spring.cloud.study.controller;

import com.cnblogs.yjmyzz.spring.cloud.study.api.UserService;
import com.cnblogs.yjmyzz.spring.cloud.study.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangjunming on 2017/6/17.
 */
@RestController
public class UserController {

//    @Autowired
//    private DiscoveryClient client;

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public UserDTO findUser(@PathVariable Integer id) {
        return userService.findUser(id);
    }
}
