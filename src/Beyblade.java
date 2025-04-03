public class Beyblade {

    private String beybladecininAdi;
    private int donusHizi;
    private int saldiriGucu;

    public Beyblade(String beybladecininAdi, int donusHizi, int saldiriGucu) {
        this.setBeybladecininAdi(beybladecininAdi);
        this.setDonusHizi(donusHizi);
        this.setSaldiriGucu(saldiriGucu);
    }

    public String getBeybladecininAdi() {
        return beybladecininAdi;
    }
    public void setBeybladecininAdi(String beybladecininAdi) {
        this.beybladecininAdi = beybladecininAdi;
    }

    public int getDonusHizi() {
        return donusHizi;
    }
    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }
    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }

    public void saldir() {
        System.out.println(beybladecininAdi + " " + saldiriGucu +  " saldırı gücü ve " + donusHizi + " dönüş hızı ile saldırıyor...");
    }

    public void kutsalCanavarOrtayaCikar() {
        System.out.println("Bu beyblade'nin kutsal canavarı bulunmuyor...");
    }

    public void bilgileriGoster() {
        System.out.println("Beybladeci ismi : " + beybladecininAdi);
        System.out.println("Saldırı Gücü : " + saldiriGucu);
        System.out.println("Dönüş Hızı : " + donusHizi);

    }
}
