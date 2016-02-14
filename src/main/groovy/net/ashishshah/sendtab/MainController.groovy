package net.ashishshah.sendtab

import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.stereotype.*
import org.springframework.web.bind.annotation.*

@Controller
class MainController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        "Hello World!"
    }
}
