package ch.weetech.authenticatingldap;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.Customizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.LdapShaPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class WebSecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
      .authorizeRequests()
        .anyRequest().fullyAuthenticated()
        .and()
      .formLogin();

    return http.build();
  }

  @Autowired
  public void configure(AuthenticationManagerBuilder auth) throws Exception {

    auth
      .ldapAuthentication()
        .userDnPatterns("uid={0},ou=People")
        .groupSearchBase("ou=Group")
        .contextSource()
          .url("ldap://foobar.acme.com:636/dc=acme,dc=com")
          .and()
        .passwordCompare()
          .passwordEncoder(new LdapShaPasswordEncoder())
          .passwordAttribute("userPassword");
  }

}

//@Configuration
//public class WebSecurityConfig {

//  @Bean
//  public SecurityFilterChain configure(HttpSecurity http) throws Exception {
//    return http
//      .authorizeRequests()
//      .anyRequest().authenticated()
//      .and()
//      .formLogin(Customizer.withDefaults())
//      .build();
//  }
//}
