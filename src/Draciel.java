public class Draciel extends Beyblade {

    private String kutsalCanavar;

    public Draciel(String beybladecininAdi, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladecininAdi,donusHizi,saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı : " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladecininAdi() + " " + kutsalCanavar + " ı ortaya çıkıyor... " );
        System.out.println(getBeybladecininAdi() + " " + " ın Savunması : Kale Savunması");
    }
}
