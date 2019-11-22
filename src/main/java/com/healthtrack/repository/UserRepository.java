package com.healthtrack.repository;

import com.healthtrack.entity.User;
import java.sql.*;

public class UserRepository {
    private String dbUrl = "jdbc:postgresql://db-postgresql-nyc1-13805-do-user-1783419-0.db.ondigitalocean.com:25060/defaultdb";
    private String dbUsername = "doadmin";
    private String dbPassword = "q3aqfudtgwr8y5og";

    public UserRepository() {}

    public User create(
            String name,
            String email,
            Double height,
            String password) {

        try {
            Connection connection = DriverManager.getConnection(this.dbUrl, this.dbUsername, this.dbPassword);
            Statement statement = connection.createStatement();

            statement.executeUpdate(
                    "insert into users (name, email, height, password, created_at, updated_at)\n" +
                            "values ("+ name +", "+ name +", "+ height +", "+ password +", NOW(), NOW());"
            );
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }

        return new User(name, email, height, password);
    }

    public User show(String email) {
        return new User("", "", 0.0, "12345678");
    }
}
