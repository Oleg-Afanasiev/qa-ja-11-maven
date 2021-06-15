package com.academy.lesson12;

import com.academy.lesson05.Gender;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        // select
        String url = "jdbc:mysql://localhost:3306/phone-book?user=root&password=root";
        String sqlSelect = "select * from subscriber";
        String sqlInsert = "insert into subscriber " +
                "(first_name, last_name, age, gender) " +
                "values(?, ?, ?, ?)";

        try(Connection connection = DriverManager.getConnection(url)) {
            // insert
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
            preparedStatement.setString(1, "Вася"); // values(?, ?, ?, ?) -> values('Вася', ?, ?, ?)
            preparedStatement.setString(2, "Кириленко");  // values('Вася', ?, ?, ?) -> values('Вася', 'Кириленко', ?, ?)
            preparedStatement.setInt(3, 18);
            preparedStatement.setString(4, "m");
            preparedStatement.execute();
            preparedStatement.close();

            // select
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlSelect);

            while (resultSet.next()) { // переводим курсор на след строку. Возвращает null, если данных нет
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                int age = resultSet.getInt("age");
                Gender gender = Gender.parse(resultSet.getString("gender"));

                System.out.printf("%s %s %d %s %n",
                        firstName, lastName, age, gender);
            }

            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            System.out.println("Connection error. Details: " + e.getMessage());
        }
    }
}
