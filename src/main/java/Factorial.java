public class Factorial implements Runnable{
    int numero = 1;
    public Factorial (int n){
        numero = n;
    }
    public void run(){
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        String name = Thread.currentThread().getName();
        System.out.println("Hilo: "+ name +" El factorial de "+ numero +" es: "+ factorial);
    }
}
