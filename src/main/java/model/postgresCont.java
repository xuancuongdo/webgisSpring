/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cuongdx
 */
public class postgresCont {

    Connection CreateConnection() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/test",
                            "postgres", "chaocanha");

        } catch (ClassNotFoundException | SQLException e) {

        }

        return c;
    }

    public List<tblThuaDat> getAllThuaDat() {
        List<tblThuaDat> lst = new ArrayList<>();
        try {
            Statement stmt = null;
            stmt=CreateConnection().createStatement();
            ResultSet rs= stmt.executeQuery("Select * from thuadat12457");
            while(rs.next()){
                tblThuaDat thuadat= new tblThuaDat();
                thuadat.gid=rs.getInt("gid");
                thuadat.ID=rs.getInt("id");
                thuadat.DIACHI=rs.getString("diachi");
                thuadat.DIADANH=rs.getString("diadanh");
                thuadat.DIENTICH=rs.getFloat("dientich");
                thuadat.DIENTICHPL=rs.getFloat("dientichpl");
                thuadat.DTSD=rs.getInt("dtsd");
                thuadat.DTTHOCU=rs.getString("DTTHOCU");
                thuadat.KH2003=rs.getString("KH2003");
                thuadat.KHLOAIDAT=rs.getString("KHLOAIDAT");
                thuadat.MALOAIDAT=rs.getString("MALOAIDAT");
                thuadat.MDSD2003=rs.getInt("MDSD2003");
                thuadat.MSCOLOR=rs.getInt("MSCOLOR");
                thuadat.SHBANDO=rs.getInt("SHBANDO");
                thuadat.SHTHUA=rs.getInt("SHTHUA");
                thuadat.SHTHUATAM=rs.getString("SHTHUATAM");
                thuadat.TENCHU=rs.getString("TENCHU");
                thuadat.THUAID=rs.getInt("THUAID");
                lst.add(thuadat);
            }
        } catch (Exception e) {
        }
        return lst;
    }
}
