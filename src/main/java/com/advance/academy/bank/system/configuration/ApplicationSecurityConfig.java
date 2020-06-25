package com.advance.academy.bank.system.configuration;

import com.advance.academy.bank.system.domain.services.UserService;
import com.advance.academy.bank.system.exeption.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Slf4j
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .cors().disable()
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/","/users/register","/users/login").anonymous()
                .antMatchers(HttpMethod.POST, "/api/users/register").permitAll();
//                .antMatchers(HttpMethod.POST, "/**")
 //               .hasAnyAuthority("USER", "ADMIN")
//                .antMatchers(HttpMethod.PUT, "/**")
//                .hasAnyAuthority("USER", "ADMIN")
//                .antMatchers(HttpMethod.DELETE, "/**").hasAuthority("ADMIN")
//                .antMatchers("/**").permitAll()
//                .anyRequest().authenticated();
//                .and()
//                .formLogin()
//                .loginPage("/users/login")
//                .usernameParameter("username")
//                .passwordParameter("password")
//                .defaultSuccessUrl("/home")
//                .and()
//                .logout()
//                .logoutSuccessUrl("/");

    }

    @Bean
    public UserDetailsService userDetailsService(UserService userService) {
        return username -> {
            try {
                UserDetails found = userService.loadUserByUsername(username);
                log.debug(">>> User authenticated for username: {} is {}", username, found);
                return found;
            } catch (EntityNotFoundException ex) {
                throw new UsernameNotFoundException(ex.getMessage(), ex);
            }
        };
    }

//    @Bean
//    @Override
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }


}

