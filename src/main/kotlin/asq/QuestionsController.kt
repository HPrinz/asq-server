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

    @GetMapping()
    fun getQuestions(): List<Question> {
        return questionsDao.getQuestions()
    }

    @PutMapping()
    fun addQuestion(@RequestBody question: NewQuestion) {
        questionsDao.saveQuestion(Question(counter.incrementAndGet(), question.question, question.username, Instant.now()))
    }

}