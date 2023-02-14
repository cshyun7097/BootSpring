package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){   //Model은 MVC의 Model느낌
//        value에는 데이터를 넣어주면 data변수로 사용 가능함
        model.addAttribute("data","hello!!");
        return "hello";
    }
}
