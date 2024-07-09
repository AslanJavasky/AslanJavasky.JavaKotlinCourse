package mod1_syntax.lesson22_switch_when;

public class SwitchDemo {
    public static void main(String[] args) {

        System.out.println("The house " +
                WhenDemoKt.getWinner(20, 30, 500, 23)
                + " is Winner!"
        );
    }

//    public static String getWinner(
//            int gryffindorPoints, int slytherinPoints,
//            int ravenclawPoints, int hufflepuffPoints
//    ) {
//        int maxPoints = Math.max(
//                Math.max(Math.max(
//                        gryffindorPoints, slytherinPoints),
//                        ravenclawPoints), hufflepuffPoints);
//
//        return switch (maxPoints) {
//            case gryffindorPoints -> "Gryffindor";
//            case slytherinPoints -> "Slytherin";
//            case ravenclawPoints -> "Ravenclaw";
//            default -> "Hufflepuff";
//        };
//
//    }
}
