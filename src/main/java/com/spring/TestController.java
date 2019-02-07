package com.spring;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.pojo.Transaction;
import com.spring.pojo.User;
import com.spring.service.UserService;

@Controller
public class TestController {

	/*@Autowired
	private SessionFactory sessionfactory = null;
	
	@Autowired
	private HibernateTemplate template;
	*/
	@Autowired
	private UserService uService=null;
		
	@RequestMapping(value="gotoregister" , method=RequestMethod.GET)
	public String gotoRegister(){
		return "register";
	}
	
	@RequestMapping(value="register" , method=RequestMethod.POST)
	public String register(User user, Model m){
		return uService.register(user, m);
		}
	
	
	@RequestMapping(value="login" , method=RequestMethod.POST)
	public String login(User user, Model model){
		
	/*	Session session = sessionfactory.openSession();
		
		Query query = session.createQuery("from User where uname=? and password=?");
		query.setParameter(0, user.getUname());
		query.setParameter(1, user.getPassword());
		List list = query.list();
		
		if(list==null || list.isEmpty()){
			model.addAttribute("msg", "invalid user");
			return "login";
		}else{
			return "home";
		}
*/		return null;
	}
}
