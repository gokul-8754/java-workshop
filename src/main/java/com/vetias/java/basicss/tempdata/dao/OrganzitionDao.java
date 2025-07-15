package com.vetias.java.basicss.tempdata.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.jdbcx.JdbcDataSource;

public class OrganzitionDao {
    public void createTable() throws SQLException{
        JdbcDataSource jdbcDataSource=new JdbcDataSource();
            jdbcDataSource.setUrl("jdbc:h2:mem:tempdataDB"); 
           jdbcDataSource.setUser("sa");  
  try(Connection connection = jdbcDataSource.getConnection();
          Statement statement = connection.createStatement()) {
            statement.execute("""
                 create table organization(
                    id int auto_increment primary key,
                    name varchar(255) ,
                    address varchar(255) ,
                    website varchar(255) ,
                    email varchar(255) ,
                    phone varchar(255))
                    """);        


          }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    }
            