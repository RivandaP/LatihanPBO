public class Pesawat_Telepon {

/**
 *
 * @author Rivanda Putra - 202043500136
 **/


    String gagang_telepon, kabel, bentuk;
    Boolean terima_panggilan, melakukan_panggilan;

    public String getGagang_telepon() {
        return this.gagang_telepon;
    }

    public void setGagang_telepon(String gagang_telepon) {
        this.gagang_telepon = gagang_telepon;
    }

    public String getKabel() {
        return this.kabel;
    }

    public void setKabel(String kabel) {
        this.kabel = kabel;
    }

    public String getBentuk() {
        return this.bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }


    Boolean terima_panggilan(Boolean tp){
        return tp;
    }

    Boolean melakukan_panggilan(Boolean mp){
        return mp;
    }
    
}