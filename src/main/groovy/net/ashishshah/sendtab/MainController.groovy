package net.ashishshah.sendtab

import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.stereotype.*
import org.springframework.web.bind.annotation.*
import groovy.util.logging.Slf4j

@Slf4j
@Controller
class MainController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        log.debug("Handling the root logging request")
        "Hello World!"
    }
}
