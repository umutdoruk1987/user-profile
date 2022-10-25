package com.todo.userProfile.business;

import com.todo.userProfile.entity.UserProfile;

import java.util.ArrayList;
import java.util.List;

public interface UserProfileService {

    List<UserProfile> getAll();

    UserProfile findById(long id);

    UserProfile updateUserProfile(UserProfile userProfile);

    UserProfile createUserProfile(UserProfile userProfile);

    void deleteUserprofile(long id);


}
