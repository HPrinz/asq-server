package asq

import asq.data.QuestionsDAO
import asq.data.QuestionsListImpl
import org.springframework.web.bind.annotation.*
import java.time.Instant
import java.util.concurrent.atomic.AtomicLong

@RestController()
@RequestMapping("/api/questions")
class QuestionsController() {

    val counter = AtomicLong()

    val questionsDao: QuestionsDAO = QuestionsListImpl()

//    @GetMapping()
//    fun hello(@RequestParam(value = "name", defaultValue = "World") name: String) =
//            Greeting(counter.incrementAndGet(), "Hello, $name")

    @GetMapping()
    fun getQuestions(): List<Question> {
        val question = Question(counter.incrementAndGet(), "Wo gibt es gutes Essen in Berlin?", "user1", Instant.now())
        questionsDao.saveQuestion(question)
        return questionsDao.getQuestions()
    }

    @PutMapping()
    fun addQuestion(@RequestBody question: NewQuestion) {
        questionsDao.saveQuestion(Question(counter.incrementAndGet(), question.question, question.username, Instant.now()))
    }

}