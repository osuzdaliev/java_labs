package edu.dp.sau.osuzdaliev.lr4.controller;
import edu.dp.sau.osuzdaliev.lr4.model.Group;
import edu.dp.sau.osuzdaliev.lr4.model.Human;
public class GroupCreator {
    public static Group createGroup(String name, Human head) {
        return new Group(name, head);
    }
}

