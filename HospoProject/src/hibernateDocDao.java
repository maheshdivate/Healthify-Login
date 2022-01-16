import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class hibernateDocDao {
	
	public void insertUser(docter d)
	{
		
		//Create configuration object
		Configuration con=new Configuration().configure();
		
		//Load meta Information
		con.addAnnotatedClass(user.class);       //for user table
		con.addAnnotatedClass(docter.class);     //for docter table
		
		StandardServiceRegistryBuilder builder=
				new StandardServiceRegistryBuilder().applySettings(con.getProperties());
		
		//Create Session factory object
		SessionFactory factory =con.buildSessionFactory(builder.build());
		
		//Make hibernate API call on session object
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(d);
        tx.commit();
        System.out.println("record inserted");
        session.close();
		
	}
	
	
	public boolean validateUser(String email)
	{
		boolean r = false;
		Configuration con=new Configuration().configure();
		
		//Load meta Information
		con.addAnnotatedClass(user.class);
		
		StandardServiceRegistryBuilder builder=
				new StandardServiceRegistryBuilder().applySettings(con.getProperties());
		
		//Create Session factory object
		SessionFactory factory =con.buildSessionFactory(builder.build());
		
		//Make hibernate API call on session object
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
//		String Email=u.getEmail();
		
		System.out.println(email);
		
		Query query=session.createQuery("from user where Email=:email");
		query.setString("email", email);
		
		List<docter> result=query.list();
		
		for(docter d:result)
		{
			if(d !=null)
				r=true;
			else
			   r=false;
		}
		return r;
		
				
	}
	
	

}