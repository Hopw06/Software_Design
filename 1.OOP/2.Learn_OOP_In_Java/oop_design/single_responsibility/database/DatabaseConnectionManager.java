package com.company.oop_design.single_responsibility.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    private Connection mConnection;
    private static final DatabaseConnectionManager instance = new DatabaseConnectionManager();

    public static DatabaseConnectionManager getManagerInstance() {
        return instance;
    }

    public void connect(String database) {
        try {
            mConnection = DriverManager.getConnection("jdbc:sqlite:" + database);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnectionObject() {
        return mConnection;
    }

    public void disConnect() {
        try {
            mConnection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
