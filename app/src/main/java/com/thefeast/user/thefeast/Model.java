package com.thefeast.user.thefeast;

/**
 * Created by User on 2/4/2016.
 */
public class Model {
    String name;
    int value; /* 0 -&gt; checkbox disable, 1 -&gt; checkbox enable */

    Model(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }

}
