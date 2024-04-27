public class SmartTV {
    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void moreVolume() {
        volume += 1;
        System.out.println("Aumentou para: " + volume);
    }

    public void lessVolume() {
        volume -= 1;
        System.out.println("Diminuiu para: " + volume);
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
        System.out.println("Channel changed to: " + channel);
    }
}
