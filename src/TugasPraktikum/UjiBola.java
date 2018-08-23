package TugasPraktikum;
public class UjiBola {
    public static void main(String[] args) {
        double jarijari=14;
        Bola bola = new Bola(7);
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
        System.out.println("\n");
        bola.setJarijari(jarijari);
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
    }
}
