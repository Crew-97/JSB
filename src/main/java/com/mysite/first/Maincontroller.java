package com.mysite.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Maincontroller {
    // getMapping : 고객이 요청한거
    @GetMapping("/First")
    public void index(){
        // 얘는 서버 안에서 출력됨.
        System.out.println("Home page requested");
        this.contact();
    }
    @GetMapping("/about")
    public void about() {
        System.out.println("about");
        this.contact();
    }

    public void contact() {
        // 얘는 맵핑이 없으니 손님용 아님.
        System.out.println("contact");
    }

}
