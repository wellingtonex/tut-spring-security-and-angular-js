//package demo;
//
//import org.springframework.core.annotation.Order;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Order(-1)
//public class MyWebSecurity extends WebSecurityConfigurerAdapter {
//   @Override
//   protected void configure(HttpSecurity http) throws Exception {
//       http
//          .authorizeRequests()
//          .antMatchers(HttpMethod.OPTIONS, "/oauth/token").permitAll();
//   }
//}