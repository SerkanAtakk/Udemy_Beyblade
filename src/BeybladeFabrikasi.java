public class BeybladeFabrikasi {
    public Beyblade beybladeUret(String beyblade_turu) {
        if (beyblade_turu.equalsIgnoreCase("dragon")) {
            return new Dragon("Takao", 800, 300, "Mavi Ejderha", "Kutsal Canavarla Konuşma");
        }
        else if (beyblade_turu.equalsIgnoreCase("dranza")) {
            return new Dranza("Kai", 600, 400, "Kırmızı Anka Kuşu");
        }
        else if (beyblade_turu.equalsIgnoreCase("dragya")){
            return new Drayga("Rei", 800, 250, "Beyaz Kaplan");
        }
        else if (beyblade_turu.equalsIgnoreCase("draciel")) {
            return new Draciel("Max", 400, 1000, "Kara Kaplumbağa");
        }
        else {
            return null;
        }
    }
}
