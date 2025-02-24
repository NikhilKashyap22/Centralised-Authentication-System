package com.tgl.Authentication.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tgl.Authentication.models.JwtUtil;
import com.tgl.Authentication.models.Role;
import com.tgl.Authentication.models.User;
import com.tgl.Authentication.repositories.UserRepository;

@Service
public class AuthService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	
	public User registerUser(User user) {
		if (user.getRole() == null) {
	        user.setRole(Role.USER);
	    }
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}
	
	public String login(String username, String password) {
      Optional<User> userOptional = userRepository.findByusername(username);
      

      if (userOptional.isPresent()) {
          User user = userOptional.get();
          if (passwordEncoder.matches(password, user.getPassword())) {
              return jwtUtil.generateToken(username);
          }
      }
      return null;
  }

}
