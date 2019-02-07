package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.spring.dao.TestDAO;
import com.spring.pojo.User;

@Service("uService")
//@Transactional//(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserService {
	@Autowired
	private TestDAO dao;

	@Transactional//(propagation= Propagation.REQUIRED, rollbackFor=Exception.class) 
	public String register(User user, Model m){
		return dao.register(user, m);
	}
		/*try{
			Session session = sessionfactory.openSession();
			
			session.save(user);
			
			Transaction t=new Transaction();
			t.setName("srinu");
			session.save(t);
			
			//session.beginTransaction().commit();
			}catch(HibernateException he){
				m.addAttribute("message", "the user already exists");
			}
			//System.out.println(user.getEmailId());
			return "login";
	}*/
}
