package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Cliente;

public class ClientTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", "PESSOA_FISICA");
        Cliente cliente2 = new Cliente("Tsubasa", "PESSOA_JURIDICA");
        Cliente cliente3 = new Cliente("Tsubasa", "pessoa fisica");
        Cliente cliente4 = new Cliente("Tsubasa", "pessoa Juridica");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

    }
}
