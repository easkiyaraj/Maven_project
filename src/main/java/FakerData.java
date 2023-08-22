import com.github.javafaker.Faker;

public class FakerData {
    public static void main(String[] args) {
        Faker f=new Faker();
        System.out.println(f.address().city());
    }
}
