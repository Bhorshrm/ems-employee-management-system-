package com.example.ems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class H2jdbcCreateDemo {
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:mem:testDB";

    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 3: Execute a query
            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();
            String sql = "CREATE TABLE   employee " +
                    "(empId INTEGER not NULL, " +
                    " empName VARCHAR(255), " +
                    " emailId VARCHAR(255), " +
                    " department VARCHAR(255), " +
                    " status VARCHAR(255), " +
                    " PRIMARY KEY ( empId ))";
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");

            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();
        }
        catch (SQLException se){
            se.printStackTrace();
        }
        catch (ClassNotFoundException c){
            c.printStackTrace();
        }
    }
}
