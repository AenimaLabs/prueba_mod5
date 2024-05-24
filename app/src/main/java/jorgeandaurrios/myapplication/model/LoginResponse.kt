package jorge.andaur.rios.evaluacion5.model

data class LoginResponse(
    val accessToken: String?,
    val error: String?,
    val status: Int?
)
