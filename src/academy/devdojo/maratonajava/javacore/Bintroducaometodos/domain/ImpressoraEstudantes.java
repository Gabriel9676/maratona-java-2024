package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class ImpressoraEstudantes {
    public void imprime(Estudante estudante){
        System.out.println("-------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
