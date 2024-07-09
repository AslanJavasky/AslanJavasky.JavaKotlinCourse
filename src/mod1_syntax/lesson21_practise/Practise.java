package mod1_syntax.lesson21_practise;

public class Practise {
    public static void main(String[] args) {


        System.out.println("The winner is "+
                PractiseKt.getWinner(100,120,80,80));
        System.out.println("The winner is "+
                getWinner(100,120,80,80));

    }


    public static String getWinner(
            int gryffindorPoints,int slytherinPoints,
            int ravenclawPoints, int hufflepuffPoints
    ){
        if (gryffindorPoints > slytherinPoints
                && gryffindorPoints >ravenclawPoints
                && gryffindorPoints>hufflepuffPoints){

            return "Gryffindor";
        }else if(
                slytherinPoints > gryffindorPoints
                        && slytherinPoints > ravenclawPoints
                        && slytherinPoints > hufflepuffPoints
        ){
            return "Slytherin";
        }else if (
                ravenclawPoints > gryffindorPoints
                        && ravenclawPoints > slytherinPoints
                        && ravenclawPoints > hufflepuffPoints
        ){
            return "Ravenclaw";
        }else{
            return "Hufflepuff";
        }
    }
}
