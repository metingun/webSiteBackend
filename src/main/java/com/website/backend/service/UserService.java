package com.website.backend.service;

import com.website.backend.model.ChangePasswordModel;
import com.website.backend.model.UserModel;
import com.website.backend.repository.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public String createUser(UserModel userModel) {
        userRepo.save(userModel);
        return "Saved Successfully";
    }

    public String changePassword(ChangePasswordModel changePasswordModel) {
        UserModel user = userRepo.findByUserNameAndPassword(changePasswordModel.getUserName(),changePasswordModel.getPassword());
        if (user != null) {
            user.setPassword(changePasswordModel.getNewPassword());
            userRepo.save(user);
            return "Change Password Successfully";
        }
        else{
            return null;
        }
    }

    public String login(UserModel userModel) {
        UserModel user = userRepo.findByUserNameAndPassword(userModel.getUserName(),userModel.getPassword());
        if (user!=null) {
            sessionChange(1);
            return "Giriş Başarılı";
        } else {
            return null;
        }
    }

    public void sessionChange(int activity) {
        UserModel user=userRepo.findAll().get(0);
        user.setSession(activity);
        userRepo.save(user);
    }

    public int getSession() {
        return userRepo.findAll().get(0).getSession();
    }

}
