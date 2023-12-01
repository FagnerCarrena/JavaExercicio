import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio {

    public static void main(String[] args) {
//       double somar =  soma(100,34);
        ;
//        System.out.println(somar);
//        int x = 15;
//        int resultado = calcularFatorial(x);
//        System.out.println("O Fatorial de " + x + " é: " + resultado);
        ///..............................................................
//        int valorA = 140;
//        int valorB = 52;
//        int valorC = 3;
//
//        int maior = maiorNumero(valorA ,valorB,valorC );
//
//        System.out.println(maior);
//        boolean respsta = ehPrimo(97);
//
//        System.out.println(respsta);
        double[] numeros = {5.0, 10.0, 30.0, 20.0};

        double media = media(numeros);

        System.out.println("A média é: " + media);

    }


//    static double soma(int a, int b){
//    return a + b;
//
//    }
    //Método para calcular o fatorial
//    public static int calcularFatorial(int numero){
//        if (numero == 0 || numero == 1){
//            return 1;
//        }else{
//            return numero * calcularFatorial(numero - 1);
//        }
//    }

//    public static int maiorNumero(int a, int b, int c) {
//        int maior = a;
//
//        if (b > maior) {
//            maior = b;
//        }
//
//        if (c > maior) {
//            maior = c;
//        }
//
//        return maior;
//    }
public static boolean ehPrimo(int a) {
    if (a <= 1) {
        return false;
    }

    for (int i = 2; i <= Math.sqrt(a); i++) {
        if (a % i == 0) {
            return false;
        }
    }
return true;


}
public static double media(double [] array){
    if (array.length == 0) {
        return 0.0;
    }
    double soma = 0.0;

    for (double numero : array) {
        soma += numero;
    }
    return soma / array.length;
}




}
