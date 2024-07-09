package mod1_syntax.lesson22_switch_when

fun getWinner(    gryffindorPoints:Int, slytherinPoints:Int,
                  ravenclawPoints:Int, hufflepuffPoints:Int): String {

    val maxPoints= maxOf(gryffindorPoints, slytherinPoints,ravenclawPoints,hufflepuffPoints)

    return when(maxPoints){
        gryffindorPoints -> "Gryffindor"
        slytherinPoints -> "Slytherin"
        ravenclawPoints -> "Ravenclaw"
        else -> "Hufflepuff"
    }

}