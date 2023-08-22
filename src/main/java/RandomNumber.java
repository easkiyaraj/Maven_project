import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random r=new Random();
        System.out.println(r.nextLong(999999999));
    }
}
