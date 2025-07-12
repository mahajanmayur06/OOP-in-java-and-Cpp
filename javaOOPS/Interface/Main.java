public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.accelerate();
        car.brake();
        car.stop();


        Engine engine = new Car();
        engine.start();
        engine.stop();

        Media media = new Car();
        media.play();
        media.pause();
        media.stop();
    }
}
