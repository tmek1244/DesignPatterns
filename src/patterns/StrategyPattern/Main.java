package patterns.StrategyPattern;

import patterns.StrategyPattern.doorOpening.NoDoor;
import patterns.StrategyPattern.doorOpening.NormalDoor;
import patterns.StrategyPattern.moving.InTheAir;
import patterns.StrategyPattern.moving.OnGround;
import patterns.StrategyPattern.moving.OnWater;
import patterns.StrategyPattern.ticketBuying.NoTicket;
import patterns.StrategyPattern.ticketBuying.NormalTicket;

public class Main {
    public static void main(String[] args) {
        Vehicle plane = new Vehicle(new NormalDoor(), new InTheAir(), new NormalTicket());
        Vehicle car = new Vehicle(new NormalDoor(), new OnGround(), new NoTicket());
        Vehicle ship = new Vehicle(new NoDoor(), new OnWater(), new NormalTicket());
    }
}
