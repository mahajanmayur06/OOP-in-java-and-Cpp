public class Car implements Brake, Engine, Media{
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    public void stop() {
        System.out.println("Car is stopping like a Engine");
    }

    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    public void brake() {
        System.out.println("Car is braking");
    }

    public void play() {
        System.out.println("Playing media in the car");
    }

    public void pause() {
        System.out.println("Pausing media in the car");
    }

    public static void main(String[] args) {
        
    }
}
