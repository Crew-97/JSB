package com.mysite.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Maincontroller {
    // getMapping : 고객이 요청한거
    @GetMapping("/First")
    public void index(){
        // 얘는 서버 안에서 출력됨.
        // 실제로 고객이 볼수는 없음
        System.out.println("Home page requested");
        this.contact();
    }
    @GetMapping("/about")
    @ResponseBody
    //이건 고객한테 출력!
    public String about() {
        System.out.println("about");
        return "안녕하세용";
    }

    public void contact() {
        // 얘는 맵핑이 없으니 손님용 아님.
        System.out.println("contact");
    }

}
