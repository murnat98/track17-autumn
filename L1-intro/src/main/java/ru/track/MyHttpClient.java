package ru.track;

import com.mashape.unirest.http.Unirest;

public class MyHttpClient {
    public static void main(String[] args) throws Exception {
        Unirest.post("https://guarded-mesa-31536.herokuapp.com/track")
                .field("name", "name")
                .field("github", "github")
                .field("email", "email")
                .asString();
    }
}
