package academy.devdojo.maratonajava.javacore.Dconsultores.test;


import academy.devdojo.maratonajava.javacore.Dconsultores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Goku", "TV", 12, "Ação");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();
    }
}