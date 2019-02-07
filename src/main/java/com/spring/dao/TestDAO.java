package com.spring.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.spring.pojo.User;

@Repository
public class TestDAO {
	
	/*@Autowired
	private SessionFactory sessionfactory;*/
	
	@Autowired
	private HibernateTemplate templateConnection;
	
	/*static{
		sessionfactory=new AnnotationConfiguration().configure().buildSessionFactory();
	}*/

	public String register(User user, Model m){
		
		templateConnection.save(user);
		
		/*try{
			
			template.save(user);
			
			
			User user2 = template.get(User.class, 17);
			System.out.println("User with 17 id is: "+user2.getFname());
			
			List<User> list = template.find("from User");
			for (User user3 : list) {
				System.out.println("All user names: : "+user3.getFname());
			}
			
			Session session = sessionfactory.openSession();
			session.save(user);
			
			Transaction transaction = session.beginTransaction();
			transaction.commit();
			session.close();
		
			
			//session.beginTransaction().commit();
			}catch(HibernateException he){
				m.addAttribute("message", "the user already exists");
			}
			//System.out.println(user.getEmailId());*/
			return "login";
	}
}
