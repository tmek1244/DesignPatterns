package patterns.StrategyPattern.ticketBuying;

public class NormalTicket implements ITicketBuyingBehavior{
    @Override
    public void buyTicket() {
        System.out.println("Buying normal ticket");
    }
}
