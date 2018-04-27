package com.cdr.bc.restApiBC.service.implementation;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdr.bc.restApiBC.dao.UserRepository;
import com.cdr.bc.restApiBC.domain.BcUserTable;
import com.cdr.bc.restApiBC.service.LoginService;

@Service
@Transactional
public class LoginServiceImpl implements LoginService, UserDetailsService {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2621248206633974496L;
	
	
	@Autowired
	UserRepository userRepo;
	
	public BcUserTable getUserDetails(String who, String orgId){
		
		BcUserTable userDetails =userRepo.findByWhoAndPermit(who, orgId);
		
		System.out.println(userDetails);
		
		return userDetails;
	}
	
	
	@Override
    public UserDetails loadUserByUsername(String who) throws UsernameNotFoundException {
		BcUserTable user = userRepo.findByWho(who);

        if(user == null) {
            throw new UsernameNotFoundException(String.format("The username %s doesn't exist", who));
        }

        UserDetails userDetails = null;

       userDetails = new org.springframework.security.core.userdetails.
                User(user.getWho(), user.getPermit(), new ArrayList<GrantedAuthority>());

        return userDetails;
    }
	
}
