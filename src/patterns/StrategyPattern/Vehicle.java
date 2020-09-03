package patterns.StrategyPattern;

import patterns.StrategyPattern.doorOpening.IDoorOpeningBehavior;
import patterns.StrategyPattern.moving.IMovingBehavior;
import patterns.StrategyPattern.ticketBuying.ITicketBuyingBehavior;

public class Vehicle{
    private IDoorOpeningBehavior doorOpening;
    private IMovingBehavior moving;
    private ITicketBuyingBehavior ticketBuying;

    public Vehicle(IDoorOpeningBehavior doorOpening, IMovingBehavior moving, ITicketBuyingBehavior ticketBuying)
    {
        this.doorOpening = doorOpening;
        this.moving = moving;
        this.ticketBuying = ticketBuying;
    }

    public void move()
    {
        this.moving.move();
    }

    public void openTheDoor()
    {
        this.doorOpening.openTheDoor();
    }

    public void buyTicket()
    {
        this.ticketBuying.buyTicket();
    }
}
