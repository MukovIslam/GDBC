package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;


//import jm.task.core.jdbc.util.Util;
//import jm.task.core.jdbc.util.Utilw;

public class Main {
    private final static UserService userService1 = new UserServiceImpl();


    public static void main(String[] args) {
        userService1.createUsersTable();
        userService1.saveUser("Игорь", "Игорев", (byte) 23);

        userService1.saveUser("Миша", "Михайлов", (byte) 20);

        userService1.saveUser("Жека", "Козлова", (byte) 22);

        userService1.saveUser("Люда", "Павлова", (byte) 25);


        for (User user : userService1.getAllUsers()) {
            System.out.println(user);
        }

        userService1.cleanUsersTable();

        userService1.dropUsersTable();
    }

}
