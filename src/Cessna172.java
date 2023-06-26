public class Cessna172 {
    private boolean toestemmingVerkregen;
    private int gewicht;
    private int tegenwindSnelheid;
    private int aantalPassagiers;
    private boolean bagageAfgehandeld;
    private boolean isNederlands;
    private boolean goedWeer;

    public Cessna172(int gewicht, int tegenwindSnelheid, boolean goedWeer, int aantalPassagiers, boolean bagageAfgehandeld, boolean isNederlands) {
        this.gewicht = gewicht;
        this.tegenwindSnelheid = tegenwindSnelheid;
        this.goedWeer = goedWeer;
        this.aantalPassagiers = aantalPassagiers;
        this.bagageAfgehandeld = bagageAfgehandeld;
        this.isNederlands = isNederlands;
    }
    public Cessna172(int gewicht, int tegenwindSnelheid, boolean goedWeer){
        this.gewicht = gewicht;
        this.tegenwindSnelheid = tegenwindSnelheid;
        this.goedWeer = goedWeer;
    }


    public boolean heeftToestemming() {
        return toestemmingVerkregen;
    }

    public void vraagToestemming() {
        if ((tegenwindSnelheid > 50 || gewicht <= 1000)&&goedWeer) {
            toestemmingVerkregen = true;
        } else {
            toestemmingVerkregen = false;
        }
    }

    public double berekenKosten() {
        double kosten = 0;

        if (gewicht < 1000) {
            kosten += 100;
        } else if (gewicht < 5000) {
            kosten += 500;
        } else {
            kosten += 2500;
        }

        if (aantalPassagiers > 2) {
            kosten *= 1.5;
        }

        if (bagageAfgehandeld) {
            kosten += 800;
        }

        if (isNederlands) {
            kosten *= 1.21;
        }

        return kosten;
    }
}