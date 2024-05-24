package jorge.andaur.rios.evaluacion5.model

data class AccoutResponse(
    val creationDate : String,
    val money : Double,
    val isBlocked : Boolean,
    val userId : Int,
    val error : Int,
    val status : Int
)
