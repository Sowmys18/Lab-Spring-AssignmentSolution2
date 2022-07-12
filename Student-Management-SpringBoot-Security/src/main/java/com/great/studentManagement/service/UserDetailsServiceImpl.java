package com.great.studentManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.great.studentManagement.entity.User;
import com.great.studentManagement.repository.UserRepository;
import com.great.studentManagement.security.MyUserDetails;



public class UserDetailsServiceImpl implements UserDetailsService {

	   @Autowired
	    private UserRepository userRepository;
	     
	    @Override
	    public UserDetails loadUserByUsername(String username)
	            throws UsernameNotFoundException {
	    	List<User>users=userRepository.findAll();
	    	System.out.println(users);
	        User user = userRepository.getUserByUsername(username);
	        System.out.println(user);
	        if (user == null) {
	            throw new UsernameNotFoundException("Could not find user");
	        }
	         
	        return new MyUserDetails(user);
	    }

}
