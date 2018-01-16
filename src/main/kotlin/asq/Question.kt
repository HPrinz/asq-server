package asq

import com.fasterxml.jackson.annotation.JsonCreator
import java.time.Instant

data class Question constructor(
        var id: Long,
        var question: String,
        var username: String,
        var posted: Instant
)

data class NewQuestion @JsonCreator constructor(
        var question: String,
        var username: String
)
