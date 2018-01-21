package asq

import asq.data.QuestionsDAO
import asq.data.QuestionsListImpl
import org.springframework.web.bind.annotation.*
import java.time.Instant
import java.util.concurrent.atomic.AtomicLong

@RestController()
@RequestMapping("/")
class HelloController() {

    @GetMapping()
    fun getQuestions(): String {
        return "HELLO ASQ*";
    }

}