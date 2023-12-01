// modificador de acesso => public, private
//static


import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Metodos {
    public static void main(String[] args) {

//        bemVindo("Fagner");
//        double raiz = raizQuadrada(400);
//        System.out.println(raiz);
//        mostraHora();
        Computador comp = new Computador();
        comp.ligar();
        comp.executar("youtube");

    //metodo é a mesma coisa que funcao

    }
    static void bemVindo(String nome){

        System.out.println("bem vinco,"+ nome);
    }
static void mostraHora(){
    LocalDateTime dataHora = LocalDateTime.now();
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.println(formatador.format(dataHora));

}
    static double raizQuadrada(double valor){
        return Math.sqrt(valor);

    }

    }
