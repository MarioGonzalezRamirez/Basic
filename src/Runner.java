public class Runner {


    public static void main(String[]args) {
    Car mario = new Car( 2020, "Audi", 25, "Luxury" );
    Rectangle wario = new Rectangle(20, 20);
    System.out.println(mario.theString());
        System.out.println(wario.area());
        System.out.println(wario.getDiagonal());
        System.out.println(wario.isSquare());
    }


}
