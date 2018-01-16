package asq.data

import asq.Question

class QuestionsListImpl : QuestionsDAO{

    val qs : MutableList<Question> = mutableListOf<Question>()

    override fun getQuestions(): List<Question> {
        return qs
    }

    override fun saveQuestion(question: Question) {
        qs.add(question)

    }
}