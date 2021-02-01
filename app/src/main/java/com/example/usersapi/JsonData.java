package com.example.usersapi;

//This class for fetch User by ID

public class JsonData {
    private User data;

    public String getFname(){
        return data.getFirst_name();
    }
    public String getLname(){
        return data.getLast_name();
    }
    public String getEmail(){
        return data.getEmail();
    }
    public String getId_str(){ //return ID as string
        return data.getId_str();
    }
    public Integer getId(){ //Return ID as number
        return data.getId();
    }
    public String getAvatar(){
        return data.getAvatar();
    }
    public String toString() {
        return "UserApiResponse [data=" + data + "]";
    }
}
