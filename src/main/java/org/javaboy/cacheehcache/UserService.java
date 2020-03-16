package org.javaboy.cacheehcache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Cacheable(cacheNames = "mycache")
    public User getUserById(Integer id){
        System.out.println("getUserById>>>"+id);
        return new User(id, "username", "address");
    }

}
