package mod1_syntax.lesson21_practise

fun main() {

    println("The winner is ${getWinner(300,1250,500,520)}")


}

fun getWinner(
    gryffindorPoints:Int, slytherinPoints:Int,
    ravenclawPoints:Int, hufflepuffPoints:Int
):String{

    return if (gryffindorPoints > slytherinPoints
        && gryffindorPoints >ravenclawPoints
        && gryffindorPoints>hufflepuffPoints){

        "Gryffindor"
    }else if(
        slytherinPoints > gryffindorPoints
        && slytherinPoints > ravenclawPoints
        && slytherinPoints > hufflepuffPoints
    ){
        "Slytherin"
    }else if (
        ravenclawPoints > gryffindorPoints
        && ravenclawPoints > slytherinPoints
        && ravenclawPoints > hufflepuffPoints
    ){
        "Ravenclaw"
    }else{
        "Hufflepuff"
    }
}