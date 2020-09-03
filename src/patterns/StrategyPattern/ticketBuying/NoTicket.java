package patterns.StrategyPattern.ticketBuying;

public class NoTicket implements ITicketBuyingBehavior{

    @Override
    public void buyTicket() {
        System.out.println("Don't need any ticket");
    }
}
