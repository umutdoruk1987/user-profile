package com.todo.userProfile.business;

import com.todo.userProfile.entity.UserProfile;
import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserProfileManager implements UserProfileService {

    List<UserProfile> userProfileList = new ArrayList<>();
    long idToCreate=0;


    @Override
    public List<UserProfile> getAll() {
        return userProfileList;
    }

    @Override
    public UserProfile findById(long id) {
        UserProfile toReturn = null;

        Iterator iterator = userProfileList.iterator();
        while (iterator.hasNext()){
            UserProfile userProfile1 = (UserProfile) iterator.next();
            if (userProfile1.getId()==id){
                toReturn=userProfile1;
                break;
            }
        }
        return toReturn;
    }

    @Override
    public UserProfile updateUserProfile(UserProfile userProfile) {
        UserProfile toReturn = null;

        Iterator iterator = userProfileList.iterator();
        while (iterator.hasNext()){
            UserProfile userProfile1 = (UserProfile) iterator.next();
            if (userProfile1.getId()==userProfile.getId()){
                userProfileList.set(userProfileList.indexOf(userProfile1), userProfile);
                toReturn=userProfile;
                break;
            }
        }
        return toReturn;
    }

    @Override
    public UserProfile createUserProfile(UserProfile userProfile) {

        UserProfile toReturn = null;

        userProfile.setId(idToCreate);
        userProfileList.add((int) idToCreate, userProfile);
        idToCreate++;
        if (userProfileList.contains(userProfile)){
             toReturn=userProfile;
        }

        return toReturn;
    }

    @Override
    public void deleteUserprofile(long id) {
        Iterator iterator = userProfileList.iterator();
        while (iterator.hasNext()){
            UserProfile userProfile1 = (UserProfile) iterator.next();
            if (userProfile1.getId()==id){
                iterator.remove();
                break;
            }
        }
    }
}
