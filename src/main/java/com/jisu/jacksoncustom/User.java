package com.jisu.jacksoncustom;

public class User {

    private String name;

    @CustomSerializer(value = SerializerType.TIME_SERIALIZER)
    private long time;

    private UserType userType;

    private int age;

    public User(String name, long time, UserType userType, int age) {
        this.name = name;
        this.time = time;
        this.userType = userType;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public long getTime() {
        return time;
    }

    public UserType getUserType() {
        return userType;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", userType=" + userType +
                ", age=" + age +
                '}';
    }
}
