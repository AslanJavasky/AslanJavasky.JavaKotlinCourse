package mod10_design_pattern.lesson9_facade.java;

public class PreparingStudentFacade {
    private BookShop bookShop;
    private BroomShop broomShop;
    private OwlShop owlShop;
    private WandShop wandShop;
    private TicketBooth ticketBooth;

    public PreparingStudentFacade(BookShop bookShop, BroomShop broomShop, OwlShop owlShop, WandShop wandShop, TicketBooth ticketBooth) {
        this.bookShop = bookShop;
        this.broomShop = broomShop;
        this.owlShop = owlShop;
        this.wandShop = wandShop;
        this.ticketBooth = ticketBooth;
    }


    public void prepareStudentToHogwarts() {
        bookShop.buyBooks();
        broomShop.buyBroom();
        owlShop.buyOwl();
        wandShop.buyWand();
        ticketBooth.buyTicket();
    }
}
