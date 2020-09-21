package patterns.CommandPattern;

public class OpenDoorCommand implements Command{
    private final Door door;

    public OpenDoorCommand(Door door)
    {
        this.door = door;
    }

    @Override
    public void execute() {
        door.openTheDoor();
    }

    @Override
    public void unExecute() {
        door.closeTheDoor();
    }
}
