package com.gh90.example.domain.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void 유저생성테스트(){
        userRepository.save(new User("펭수"));
        User savedUser = userRepository.getById(1L);
        assertThat(savedUser.getName(), is("펭수"));
    }

}