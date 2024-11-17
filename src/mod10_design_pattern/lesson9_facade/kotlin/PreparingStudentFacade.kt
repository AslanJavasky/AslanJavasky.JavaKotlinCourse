package mod10_design_pattern.lesson9_facade.kotlin

class PreparingStudentFacade {
    private val bookShop = BookShop()
    private val broomShop = BroomShop()
    private val wandShop = WandShop()
    private val owlShop = OwlShop()
    private val ticketBooth = TicketBooth()


    fun prepareStudentToHogwarts() {
        bookShop.buyBooks()
        broomShop.buyBroom()
        owlShop.buyOwl()
        wandShop.buyWand()
        ticketBooth.buyTicket()
    }
}