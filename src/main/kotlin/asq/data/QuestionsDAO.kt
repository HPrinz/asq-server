package asq.data

import asq.Question

interface QuestionsDAO {

    fun saveQuestion(question: Question)

    fun getQuestions() : List<Question>

}