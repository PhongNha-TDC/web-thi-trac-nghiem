package vn.codegym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class WebThiTracNghiemApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebThiTracNghiemApplication.class, args);
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//
//        System.out.println(passwordEncoder.encode("123"));
    }

}
