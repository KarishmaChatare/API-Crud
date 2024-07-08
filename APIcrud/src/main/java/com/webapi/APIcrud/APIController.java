package com.webapi.APIcrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class APIController {
	
	@Autowired
	SessionFactory sf;
	
	@RequestMapping("view")
	public String view() {
		return "reg";
		
	}

//	@RequestMapping("savedata")
//	public String savedata(ApiEntity ap) {
//		Session s=sf.openSession();
//		Transaction t=s.beginTransaction();
//		s.save(ap);
//		t.commit();
//		return "reg";
//		
//	}
	
	
	@RequestMapping("savedata")
	public ModelAndView savedata(ApiEntity api) {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		ModelAndView mv=new ModelAndView();
		try{
			s.save(api);
		t.commit();
		mv.addObject("msg","Registration Successful !");
		mv.setViewName("reg");
	}catch(Exception e) {
		mv.addObject("msg","Registration Failed !");
		mv.setViewName("reg");
    }
		return mv;
	}
		
		
		
		@RequestMapping("updatedata")
		public ModelAndView updatedata(ApiEntity api) {
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			ModelAndView mv=new ModelAndView();
			try{
				s.update(api);
			t.commit();
			mv.addObject("msg","Data Updated Successfully !");
			mv.setViewName("update");
			}catch(Exception e) {
			mv.addObject("msg","Update Failed !");
			mv.setViewName("update");
			}
			return mv;
	}
		
//		@RequestMapping("deletedata")
//		public String name(String id) {
//			Session openSession = sf.openSession();
//			Transaction beginTransaction = openSession.beginTransaction();
//			ApiEntity aa=openSession.get(ApiEntity.class, id);
//			openSession.delete(aa);
//			
//			beginTransaction.commit();
//			return "delete";
//			
//		}
		
		
		

		@RequestMapping("deletedata")
		public ModelAndView deletedata(String id) {
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			ModelAndView mv=new ModelAndView();
			ApiEntity api=s.get(ApiEntity.class, id);
			try{
				s.delete(api);
			t.commit();
			mv.addObject("msg","Data Updated Successfully !");
			mv.setViewName("update");
			}catch(Exception e) {
			mv.addObject("msg","Update Failed !");
			mv.setViewName("update");
			}
			return mv;
	}
		
		
}

		
		
		
		
		