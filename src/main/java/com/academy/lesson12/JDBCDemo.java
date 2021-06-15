package com.academy.lesson12;

import com.academy.lesson05.Gender;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCDemo {
    public static void main(String[] args) {
        // select
//        String url = "jdbc:mysql://localhost:3306/phone-book?user=root&password=root";
        String url = readPropertyValue("jdbc.url");
        String sqlSelect = "select * from subscriber";
        String sqlInsert = "insert into subscriber " +
                "(first_name, last_name, age, gender) " +
                "values(?, ?, ?, ?)";

        String sqlUpdate = "update subscriber set age = ? where subscriber_id = ?";
        String sqlDelete = "delete from subscriber where subscriber_id = ?";

        try(Connection connection = DriverManager.getConnection(url)) {
            // insert
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);

            preparedStatement.setString(1, "Вася"); // values(?, ?, ?, ?) -> values('Вася', ?, ?, ?)
            preparedStatement.setString(2, "Кириленко");  // values('Вася', ?, ?, ?) -> values('Вася', 'Кириленко', ?, ?)
            preparedStatement.setInt(3, 18);
            preparedStatement.setString(4, "m");
//            preparedStatement.execute();
            preparedStatement.close();

            // update
            PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate.setInt(1, 19);
            preparedStatementUpdate.setInt(2, 17);
//            preparedStatementUpdate.execute();
            preparedStatementUpdate.close();

            // delete
            PreparedStatement preparedStatementDelete = connection.prepareStatement(sqlDelete);
            preparedStatementDelete.setInt(1, 17);
//            preparedStatementDelete.execute();
            preparedStatementDelete.close();

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
            System.out.println("JDBC error. Details: " + e.getMessage());
        }
    }

    public static String readPropertyValue(String key) {
        Properties properties = new Properties();
        InputStream is = JDBCDemo.class.getClassLoader().getResourceAsStream("config.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            System.out.println("error read property. Details: " + e.getMessage());
            return null;
        }
        String value = properties.getProperty(key);
        return value;
    }
}
