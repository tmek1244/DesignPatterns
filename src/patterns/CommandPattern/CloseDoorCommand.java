package patterns.CommandPattern;

public class CloseDoorCommand implements Command{
    private final Door door;

    public CloseDoorCommand(Door door)
    {
        this.door = door;
    }

    @Override
    public void execute() {
        door.closeTheDoor();
    }

    @Override
    public void unExecute() {
        door.openTheDoor();
    }
}
