package asq

import org.springframework.web.bind.annotation.*

@RestController()
@RequestMapping("/")
class HelloController() {

    @GetMapping()
    fun getQuestions(): String {
        return "HELLO ASQ*";
    }

}