package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class H2ConnectionFactory implements ConnectionFactory {
    // Write your code here!

    @Override
    public Connection createConnection() {
        try {
            Properties prop = new Properties();
            FileInputStream file = new FileInputStream("db.properties");
            prop.load(file);
            return DriverManager.getConnection(prop.getProperty("db_url"), prop.getProperty("user"), prop.getProperty("password"));
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

