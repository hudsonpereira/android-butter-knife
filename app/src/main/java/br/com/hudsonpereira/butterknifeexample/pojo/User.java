package br.com.hudsonpereira.butterknifeexample.pojo;

/**
 * Created by hudson on 17/04/18.
 */

public class User {
    String name;

    String imageUrl;

    public User(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
