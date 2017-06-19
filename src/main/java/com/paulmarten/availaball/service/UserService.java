//package com.paulmarten.availaball.service;
//
//import com.paulmarten.availaball.model.Account;
//import com.paulmarten.availaball.repository.SurveyerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
///**
// * Created by paulms on 6/16/2017.
// */
//@Service
//public class UserService implements UserDetailsService {
//
//    @Autowired
//    private SurveyerRepository surveyerRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Account surveyer = surveyerRepository.findByName(username);
//
//        if(surveyer==null){
//            System.out.println("UsernameNotFoundException: Username not found for nim =====> "+ username );
//            throw new UsernameNotFoundException("Mahasiswa not found");
//        }
//
//        System.out.println("===================================");
//        System.out.println("Nama\t:"+surveyer.getUsername());
//        System.out.println("===================================");
//
//        List<GrantedAuthority> auth= AuthorityUtils.commaSeparatedStringToAuthorityList(surveyer.getUsername());
//        String password = surveyer.getPassword();
//
//        return new User(username,password,auth);
//    }
//}
