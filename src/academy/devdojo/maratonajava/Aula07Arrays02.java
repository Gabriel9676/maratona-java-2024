package academy.devdojo.maratonajava;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double  0
        //char '\u0000'
        //boolean false
        //String null

        String[] idades = new String[3];
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);



        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }



    }
}
