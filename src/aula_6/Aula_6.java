package aula_6;

public class Aula_6 {
    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[4];
        lutador[0] = new Lutador("Lucas","Brasil",22,1.75,75.2f);
        lutador[1] = new Lutador("Benzema", "França",35,1.83,85.3f);
        lutador[2] = new Lutador("Sofia", "India",20,1.55,45f);
        lutador[3] = new Lutador("Belinha","Alemanha", 14,1.20, 78);


        Luta lutaCaotica = new Luta( lutador[0], lutador[3], 3 );
        lutaCaotica.lutar();

        System.out.println(lutador[0].status());
        System.out.println(lutador[3].status());




    }
}
