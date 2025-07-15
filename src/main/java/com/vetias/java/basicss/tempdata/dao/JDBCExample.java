package com.vetias.java.basicss.tempdata.dao;

import java.sql.SQLException;

public class JDBCExample {


    public static void main(String[] args) throws SQLException {
        OrganzitionDao organzitionDao= new OrganzitionDao();
        organzitionDao .createTable();
}
    }
