package Stack;

public class TumpukanApp {
    public static void main(String[] args) {
        Tumpukan tumpukan = new Tumpukan(10);
        tumpukan.push(50);
        tumpukan.baca();
        tumpukan.push(100);
        tumpukan.baca();
        long nilai1 = tumpukan.pop();
//        System.out.println("nilai1 = " +nilai1);
//        System.out.println(" ");
        tumpukan.baca();
        tumpukan.push(60);
        tumpukan.baca();
        tumpukan.push(80);
        tumpukan.baca();
        long nilai2 = tumpukan.pop();
//        System.out.println("nilai2 = " +nilai2);
//        System.out.println(");
        tumpukan.baca();
        long nilai3 = tumpukan.pop();
        System.out.println("");
        System.out.println("nilai top = " +nilai3);
    }
}
