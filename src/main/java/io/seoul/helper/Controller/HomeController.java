package io.seoul.helper.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

   @GetMapping(value = "/")
   public String home() {
      return "index";
   }

   @GetMapping(value = "/set-time")
   public String time() {
      return "set-time";
   }
}
