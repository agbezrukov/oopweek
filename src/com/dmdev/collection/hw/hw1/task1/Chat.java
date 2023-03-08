package com.dmdev.collection.hw.hw1.task1;

public class Chat implements Comparable<Chat> {

    private String name;
    private int numberUsers;

    public Chat(String name, int numberUsers) {
        this.name = name;
        this.numberUsers = numberUsers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberUsers() {
        return numberUsers;
    }

    public void setNumberUsers(int numberUsers) {
        this.numberUsers = numberUsers;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", numberUsers=" + numberUsers +
                '}';
    }

    @Override
    public int compareTo(Chat o) {
        return getName().compareTo(o.getName());
    }

}
