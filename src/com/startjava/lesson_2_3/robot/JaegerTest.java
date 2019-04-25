
public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Bracer Phoenix");
        jaegerOne.setMark("Mark-5");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(70.7f);
        jaegerOne.setWeight(2.1f);
        jaegerOne.setSpeed(3);
        jaegerOne.setStrength(8);
        jaegerOne.setArmor(9);

        System.out.println("First robot -> " + jaegerOne.getModelName() + "\n"
                + jaegerOne.getMark() + "\n"
                + jaegerOne.getOrigin() + "\n"
                + jaegerOne.getHeight() + "\n"
                + jaegerOne.getWeight() + "\n"
                + jaegerOne.getSpeed() + "\n"
                + jaegerOne.getStrength() + "\n"
                + jaegerOne.getArmor());

        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("Brawler Yukon");
        jaegerTwo.setMark("Mark-1");
        jaegerTwo.setOrigin("USA");
        jaegerTwo.setHeight(70.7f);
        jaegerTwo.setWeight(2.1f);
        jaegerTwo.setSpeed(3);
        jaegerTwo.setStrength(8);
        jaegerTwo.setArmor(9);

        System.out.println("Second robot -> " + jaegerTwo.getModelName() + "\n"
                + jaegerTwo.getMark() + "\n"
                + jaegerTwo.getOrigin() + "\n"
                + jaegerTwo.getHeight() + "\n"
                + jaegerTwo.getWeight() + "\n"
                + jaegerTwo.getSpeed() + "\n"
                + jaegerTwo.getStrength() + "\n"
                + jaegerTwo.getArmor());
        
    }
}
