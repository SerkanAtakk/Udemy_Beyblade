public class Dragon extends Beyblade {
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladecininAdi, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladecininAdi,donusHizi,saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı : " + kutsalCanavar);
        System.out.println("Gizli Yetenek " + gizliYetenek);
    }
    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladecininAdi() + " " + kutsalCanavar + "'ı ortaya çıkıyor... " );
        System.out.println(getBeybladecininAdi() + " " + " ın Saldırısı : Hayalet Kasırgası");
    }
}
