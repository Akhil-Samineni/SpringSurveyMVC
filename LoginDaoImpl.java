package com.uhcl.Dao;

import com.uhcl.model.LoginClass;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

@Repository
public class LoginDaoImpl implements LoginDao{
    public static HashMap<String,String> surveyMap=new HashMap<String,String>();
    public static Connection connection;


    public boolean connect(){

        try{
            System.out.println("inside me");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost;databaseName=courseSurvey;integratedSecurity=true;";
            connection= DriverManager.getConnection(url);
            System.out.println("Connection successful");
            System.out.println(connection.getMetaData());
            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }
    public int checkLogin(LoginClass loginClass) {


        int count=0;
        String query="select count(*) as count, user_id from userTable where user_id=? and pass=? and groupName=? group by user_id";

        //#sql { select * from userTable };

        try{
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setInt(1, loginClass.getUsername());
            statement.setString(2, loginClass.getPassword());
            statement.setString(3, loginClass.getGroup());
            ResultSet rs=statement.executeQuery();
            while(rs.next()){
                count= rs.getInt("count");
                surveyMap.put("user_id", Integer.toString(rs.getInt("user_id")));
                System.out.println("user id is "+ surveyMap.get("user_id"));

            }

            if(count>0){
                System.out.println("Valid credentials");
            }else{
                System.out.println("Invalid credentials");
            }
            statement.close();
            connection.close();

        }catch(Exception e){
            e.printStackTrace();
        }

        return count;
    }
}
