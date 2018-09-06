package com.spring.controller;

import com.spring.dao.CyUserDao;
import com.spring.model.CyUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class CyController {

	private Logger logger = LoggerFactory.getLogger(CyController.class);

	@Autowired
	private CyUserDao cyUserDao ;

	@GetMapping("/{id}/showUser")
	public CyUser getUserById(@PathVariable Long id){
		System.out.println("%%%%%%%%%% id :  %%%%%% " + id);
		CyUser cyUser = cyUserDao.getUserById(id) ;
		logger.info("  result = {} ", cyUser);
		return cyUser ;
	}

}
