public class Practica1 {
    public static void main(String[] args) {
        for (String s:
                args) {
            int n = Integer.parseInt(s);

           Thread t = new Thread( new Factorial(n));
           t.start();
        }
    }
}
