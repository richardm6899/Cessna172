public class Main {
    public static void main(String[] args) {
        Cessna172 vliegtuig = new Cessna172(3500, 60, true, 3, true, true);
        vliegtuig.vraagToestemming();

        if (vliegtuig.heeftToestemming()) {
            double kosten = vliegtuig.berekenKosten();
            System.out.println("Kosten voor landen op Schiphol: €" + kosten);
        } else {
            System.out.println("Het vliegtuig mag niet opstijgen.");
        }
    }
}
