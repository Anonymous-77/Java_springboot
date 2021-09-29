package com.masood.userDetails.Service;

import com.masood.userDetails.UserInputs.UserData;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Service
public class UserService {

    public List<UserData> userList = Arrays.asList(new UserData("masood" , "MCA" , "Q-22322" , "MCA"));


    public List<UserData> getData(){

        return userList;

    }

    public UserData addData(UserData u){
        userList.add(u);
        return u;
    }

}
