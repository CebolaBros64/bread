package rhmodding.bread.util

object Credits {

    fun generateList(): List<Credit> {
        return listOf(
                Credit("Malalaika", "https://www.youtube.com/channel/UCw3s0K9zLcZwpKmm3KVUFbA"),
                Credit("chrislo27", "https://github.com/chrislo27"),
                Credit("@theonetruegarbo", "https://twitter.com/theonetruegarbo"),
                Credit("Lvl100Feraligatr", "https://www.youtube.com/channel/UCigmB3cCbQ7wuY4SKHAL4WQ")
                     )
    }
    
    data class Credit(val person: String, val url: String?)

}