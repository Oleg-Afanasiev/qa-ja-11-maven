package com.academy.lesson12;

import com.academy.lesson05.Gender;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        // select
        String url = "jdbc:mysql://localhost:3306/phone-book?user=root&password=root";
        String sqlSelect = "select * from subscriber";

        try {
            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlSelect);

            resultSet.next(); // переводим курсор на первую полученную строку
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            int age = resultSet.getInt("age");
            Gender gender = Gender.parse(resultSet.getString("gender"));

            System.out.println(firstName);
            System.out.println(lastName);
            System.out.println(age);
            System.out.println(gender);

        } catch (SQLException e) {
            System.out.println("Connection error. Details: " + e.getMessage());
        }
    }
}
