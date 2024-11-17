package mod10_design_pattern.lesson2_factory.java;

public class MagicalCreatureFactory {

    public static MagicalCreature createCreature(String type) {
        if (type.equalsIgnoreCase("griffin")){
            return new Griffin();
        }else if (type.equalsIgnoreCase("gragon")){
            return new Dragon();
        }else {
            throw new IllegalArgumentException(type + "is not exist!");
        }
    }
}
