package com.annz.pokemon.other;


import java.sql.*;

public class RefreshData {
    public static final String URL = "jdbc:mysql://localhost:1350/pokemon?useUnicode=true&amp;characterEncoding=UTF-8";
    public static final String USER = "root";
    public static final String PASSWORD = "s104881472waz";
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement st = conn.createStatement();
            String sql = "select * from pokemon";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
               System.err.println(rs.getString("id")+"  名字  "+rs.getString("name"));
            }
        }
            catch(SQLException e)
            {
                e.printStackTrace();
            }

    }
}