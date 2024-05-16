//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("pedro","teste@gmail.com");
        System.out.println(c1);
        Comida cm = new Comida("pão",2.50,"pão");
        Bebida bm = new Bebida("agua","agua",2.50 );
    }
}