package com.panda.diary.repository;

import com.panda.diary.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Long> {
    UserModel findByUserNameAndPassword(String userName,String password);
}
