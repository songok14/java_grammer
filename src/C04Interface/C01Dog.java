package C04Interface;

public class C01Dog implements C01AnimalInterface1, C01AnimalInterface2{
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    @Override
    public String play(String a, String b) {
        return a + "과(와) " + b + "(이)가 " + "산책을 하고 있습니다.";
    }
}
