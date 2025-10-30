package lambda_expression;
interface LightPattern {
    void activate();
}

public class LightAutomation {
    public static void main(String[] args) {
        LightPattern motion = () -> System.out.println("Motion light on");
        LightPattern night = () -> System.out.println("Night light on");
        LightPattern voice = () -> System.out.println("Voice command light on");
        motion.activate();
        night.activate();
        voice.activate();
    }
}
