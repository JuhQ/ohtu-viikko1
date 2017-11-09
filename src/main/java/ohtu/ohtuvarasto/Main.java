package ohtu.ohtuvarasto;

public class Main {
    private final double tilavuus = 100;
    private final double negatiivinenTilavuus = -100;
    private final double alkusaldo = 20.2;
    private final double positiivinenMaara = 50.7;
    private final double negatiivinenMaara = -50.7;
    private final double isomaara = 1000;
    private final double olutMaaraLisaaVarastoon = -666;
    private final double maaraMehuaVarastosta = -32.9;

    private final double pi = 3.14;

    public void main(String[] args) {

        Varasto mehua = new Varasto(tilavuus);
        Varasto olutta = new Varasto(tilavuus, alkusaldo);

        // professionally splitted methods, very nice
        this.luonti(mehua, olutta);
        this.getterit(mehua, olutta);
        this.setterit(mehua, olutta);
        this.virhetilanteet(mehua, olutta);
        this.parhaat1(mehua, olutta);
        this.parhaat2(mehua, olutta);
    }
    public void luonti(Varasto mehua, Varasto olutta) {
        System.out.println("Luonnin jälkeen:");
        System.out.println("Mehuvarasto: " + mehua);
        System.out.println("Olutvarasto: " + olutta);
    }

    public void getterit(Varasto mehua, Varasto olutta) {
        System.out.println("Olutgetterit:");
        System.out.println("getSaldo()     = " + olutta.getSaldo());
        System.out.println("getTilavuus    = " + olutta.getTilavuus());
        System.out.println("paljonkoMahtuu = " + olutta.paljonkoMahtuu());
    }

    public void setterit(Varasto mehua, Varasto olutta) {
        System.out.println("Mehusetterit:");
        System.out.println("Lisätään " + positiivinenMaara);
        mehua.lisaaVarastoon(positiivinenMaara);
        System.out.println("Mehuvarasto: " + mehua);
        System.out.println("Otetaan " + pi);
        mehua.otaVarastosta(pi);
        System.out.println("Mehuvarasto: " + mehua);
    }

    public void virhetilanteet(Varasto mehua, Varasto olutta) {
        System.out.println("Virhetilanteita:");
        System.out.println("new Varasto(" + negatiivinenTilavuus + ");");
        Varasto huono = new Varasto(negatiivinenTilavuus);
        System.out.println(huono);

        System.out.println("new Varasto("+ tilavuus + " " + negatiivinenMaara + ")");
        huono = new Varasto(tilavuus, negatiivinenMaara);
        System.out.println(huono);
    }

    public void parhaat1(Varasto mehua, Varasto olutta) {
        System.out.println("Olutvarasto: " + olutta);
        System.out.println("olutta.lisaaVarastoon(" + isomaara + ")");
        olutta.lisaaVarastoon(isomaara);
        System.out.println("Olutvarasto: " + olutta);

        System.out.println("Mehuvarasto: " + mehua);
        System.out.println("mehua.lisaaVarastoon(" + olutMaaraLisaaVarastoon + ")");
        mehua.lisaaVarastoon(olutMaaraLisaaVarastoon);
        System.out.println("Mehuvarasto: " + mehua);
    }

    public void parhaat2(Varasto mehua, Varasto olutta) {
        System.out.println("Olutvarasto: " + olutta);
        System.out.println("olutta.otaVarastosta(" + isomaara + ")");
        double saatiin = olutta.otaVarastosta(isomaara);
        System.out.println("saatiin " + saatiin);
        System.out.println("Olutvarasto: " + olutta);

        System.out.println("Mehuvarasto: " + mehua);
        System.out.println("mehua.otaVarastosta(" + maaraMehuaVarastosta + ")");
        saatiin = mehua.otaVarastosta(maaraMehuaVarastosta);
        System.out.println("saatiin " + saatiin);
        System.out.println("Mehuvarasto: " + mehua);
    }
}
