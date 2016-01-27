/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author cuongdx
 */
public class ThuaDatControl {

    public List<tblThuaDat> getAllLands() {
        List<tblThuaDat> lst = new ArrayList<>();
        SessionFactory factory = HibernateUltils2.getSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            //tat ca cac lenh hanh dong voi db thong qua hibernate
            //deu phai nam trong 1 giao dich
            //bat dau giao dich
            session.getTransaction().begin();
            //tao mot cau lenh HQL query object
            String sql = "select e from " + tblThuaDat.class.getName() + ""
                    + "order by e.SHBANDO";
            //tao query den csdl
            Query query = session.createQuery(sql);

            //thuc hien truy van
            lst = query.list();

            //commit du lieu
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            //rollback trong truong hop co loi
            session.getTransaction().rollback();
        }
        return lst;
    }
}
