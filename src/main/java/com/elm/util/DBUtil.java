package com.elm.util;

import java.io.IOException;
import java.sql.*;

public class DBUtil {
    public static Connection getConnection(){       //创建连接
        Connection conn = null;                     //conn来连接
        try{
            Class.forName(ConfigUtil.getProp("driver"));
            conn= DriverManager.getConnection(ConfigUtil.getProp("url"),ConfigUtil.getProp("user"),ConfigUtil.getProp("password"));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(ResultSet rs, PreparedStatement pst,Connection con){
        if(rs!=null){
            try {
                rs.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        if(pst!=null){
            try {
                pst.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        if(con!=null){
            try {
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
