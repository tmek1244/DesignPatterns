package patterns.CommandPattern;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Door exteriorDoor = new Door();

        var remote = new SmartHomeRemote(
                new TurnOnLightCommand(livingRoomLight),
                new TurnOffLightCommand(livingRoomLight),
                new OpenDoorCommand(exteriorDoor),
                new CloseDoorCommand(exteriorDoor));

        remote.useButton1();
        remote.useButton2();
        remote.useButton3();
        remote.useButton4();
    }
}
