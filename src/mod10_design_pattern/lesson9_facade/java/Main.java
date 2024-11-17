package mod10_design_pattern.lesson9_facade.java;

import mod10_design_pattern.lesson6_decorator.java.Wand;

public class Main {
    public static void main(String[] args) {

        //(without Facade) preparing first-year student for Hogwarts...
        BookShop bookShop = new BookShop();
        bookShop.buyBooks();
        BroomShop broomShop = new BroomShop();
        broomShop.buyBroom();
        OwlShop owlShop = new OwlShop();
        owlShop.buyOwl();
        WandShop wandShop = new WandShop();
        wandShop.buyWand();
        TicketBooth ticketBooth = new TicketBooth();
        ticketBooth.buyTicket();

        //with facade
        PreparingStudentFacade facade=new PreparingStudentFacade(
                new BookShop(),new BroomShop(), new OwlShop(), new WandShop(), new TicketBooth());
        facade.prepareStudentToHogwarts();



    }
}
