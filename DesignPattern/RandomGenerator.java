import java.util.Comparator;
import java.util.Random;

public class RandomGenerator {
    private static RandomGenerator gen = null;
    private Random random;

    public static RandomGenerator getInstence() {
        if(gen == null) gen = new RandomGenerator();
        return gen;
    }

    public RandomGenerator() {
        random = new Random();
    }

    public int getRandomInt() {
        return random.nextInt();
    }

    public double getRandomDouble() {
        return random.nextDouble();
    }

    public static void main(String args[]){
        RandomGenerator randomGenerator = RandomGenerator.getInstence();
        System.out.println("Random Integer : " + randomGenerator.getRandomInt());
        System.out.println("Random Double : " + randomGenerator.getRandomDouble());
    }
}
