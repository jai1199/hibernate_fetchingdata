package com.jsp.newhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program started!" );
        //Alien a1 = new Alien();
        Alien a1 = null;//we can do like this also (no changes if we do like this also)
		/*
		 * a1.setAid(113); a1.setAname("raindee_outer"); a1.setPhno(888888);
		 * a1.setAddress("tesla");
		 */
        Configuration con = new Configuration();
        con.configure();
        con.addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction trans = session.beginTransaction();
        //session.save(a1);
       a1=session.get(Alien.class, 111);//fetching data from database
        trans.commit();
        System.out.println(a1);
        System.out.println("program ended!");
    }
}
