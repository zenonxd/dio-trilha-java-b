
public class Main {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        System.out.println(smartTV.on);
        System.out.println(smartTV.channel);
        System.out.println(smartTV.volume);

        System.out.println();

        smartTV.turnOn();
        System.out.println(smartTV.on);
        smartTV.moreVolume();
        smartTV.changeChannel(2);
    }
}