package com.todo.userProfile.controller;

import com.todo.userProfile.business.UserProfileService;
import com.todo.userProfile.entity.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/UserProfile")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @GetMapping("/getAll")
    List<UserProfile> getAll() {
        return userProfileService.getAll();
    }

    @GetMapping("/findById")
    UserProfile findById(@RequestParam long id) {
        return userProfileService.findById(id);
    }

    @PutMapping("/updateUserProfile")
    UserProfile updateById(@RequestBody UserProfile userProfile) {
        return userProfileService.updateUserProfile(userProfile);
    }

    @PostMapping("/createUserProfile")
    UserProfile createUserProfile(@RequestBody UserProfile userProfile) {
        return userProfileService.createUserProfile(userProfile);
    }

    @DeleteMapping("/deleteUserProfile")
    void deleteUserprofile(@RequestParam long id) {
        userProfileService.deleteUserprofile(id);
    }


}
