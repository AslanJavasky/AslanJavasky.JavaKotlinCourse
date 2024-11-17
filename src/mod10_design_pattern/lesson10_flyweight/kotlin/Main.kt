package mod10_design_pattern.lesson10_flyweight.kotlin

fun main() {


//        MagicalCreature byklya = new Owl("owl", "white");
//        MagicalCreature sychik = new Owl("owl", "white");

    //flyweight factory
    val factory = CreatureFactory()

    val byklya = factory.getCreature("owl", "white")
    val sychik = factory.getCreature("owl", "white")


    //        MagicalCreature zhivoglot = new Cat("cat", "ginger");
//        MagicalCreature cat2 = new Cat("cat", "ginger");
    val zhivoglot = factory.getCreature("cat", "ginger")
    val cat2 = factory.getCreature("cat", "ginger")

    println(byklya === sychik)
    println(zhivoglot === cat2)

    byklya.display("Hedwig", "Harry Potter")
    sychik.display("Sichik", "Ron Weasley")

    zhivoglot.display("Zhivoglot", "Hermione Granger")
    cat2.display("McGonagall", "No")
}



