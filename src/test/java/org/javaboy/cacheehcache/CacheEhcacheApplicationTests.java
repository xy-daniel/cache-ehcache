package org.javaboy.cacheehcache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CacheEhcacheApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void getUserById() {
        User user = userService.getUserById(1);
        System.out.println(user);
        User user2 = userService.getUserById(1);
        System.out.println(user2);
    }

}
