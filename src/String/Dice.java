//WAJP for dice roll(1 to 6)
public class Dice {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++) {
            double roll=Math.random() * 6;
            int num=(int)Math.ceil(roll);
            System.out.println(num);
        }
    }
}
