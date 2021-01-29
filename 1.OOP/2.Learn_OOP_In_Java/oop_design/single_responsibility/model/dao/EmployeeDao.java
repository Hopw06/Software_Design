package com.company.oop_design.single_responsibility.model.dao;

import com.company.oop_design.single_responsibility.database.DatabaseConnectionManager;
import com.company.oop_design.single_responsibility.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDao {
    private DatabaseConnectionManager mConnectionManager;

    public EmployeeDao() {
        mConnectionManager = DatabaseConnectionManager.getManagerInstance();
        mConnectionManager.connect("employee.db");
        try {
            Connection connection = mConnectionManager.getConnectionObject();
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            statement.executeUpdate("DROP TABLE IF EXISTS employee");
            statement.executeUpdate("CREATE TABLE employee (id INTEGER PRIMARY KEY AUTOINCREMENT, name STRING, department STRING, working NUMBER(1))");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveEmployee(Employee emp) {
        String query = "INSERT INTO employee(name, department, working) VALUES(?, ?, ?)";

        try {
            Connection connection = mConnectionManager.getConnectionObject();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, emp.getName());
            preparedStatement.setString(2, emp.getDepartment());
            preparedStatement.setInt(3, emp.isWorking() ? 1 : 0);
            preparedStatement.executeUpdate();
            mConnectionManager.disConnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(Employee emp) {
        String query = "DELETE FROM employee WHERE name = ? AND department = ?";

        try {
            Connection connection = mConnectionManager.getConnectionObject();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, emp.getName());
            preparedStatement.setString(2, emp.getDepartment());
            preparedStatement.executeUpdate();
            mConnectionManager.disConnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
