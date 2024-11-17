package mod10_design_pattern.lesson10_flyweight.java;

import java.util.HashMap;
import java.util.Map;

public class CreatureFactory {

    private Map<String, MagicalCreature> creatureMap = new HashMap<>();

    public MagicalCreature getCreature(String type, String color){

        String key= type+":"+color;//"owl:white"

        if (!creatureMap.containsKey(key)){
            switch(type){
                case "owl":
                    creatureMap.put(key,new Owl(type, color));
                    break;
                case "cat":
                    creatureMap.put(key,new Cat(type, color));
                    break;
                default:
                    throw new IllegalArgumentException("Unknown creature type");
            }
        }
        return creatureMap.get(key);
    }
}
