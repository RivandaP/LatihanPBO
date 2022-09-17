public class Main {

/**
 *
 * @author Rivanda Putra - 202043500136
 **/

    public static void main(String[] args) {

        Hewan hewan = new Hewan();
        Manusia manusia = new Manusia();
        Pesawat_Telepon telepon = new Pesawat_Telepon();


            manusia.setRambut("Pendek Lurus Ala Ala Japanese");
            manusia.setMata("Cokelat");
            manusia.setMulut("Berbibir Tipis");
            manusia.setTelinga("Sedikit Runcing");
            manusia.setKaki(2);
            manusia.setTangan(2);

       
            hewan.setMata("Biru");
            hewan.setEkor("Panjang Tebal");

            telepon.setBentuk("Melengkung");
            telepon.setGagang_telepon("Melengkung");
    

       System.out.println("Manusia bernama Rivanda merupakan manusia biasa yang ciri cirinya memiliki :");
       System.out.println(" - "+manusia.getKaki()+" Kaki");
       System.out.println(" - "+manusia.getTangan()+" Tangan");
       System.out.println(" - Rambutnya "+manusia.getRambut());
       System.out.println(" - Warna Matanya "+manusia.getMata());
       System.out.println(" - Mulutnya "+manusia.getMulut());
       System.out.println(" - Telinganya "+manusia.getTelinga());

       System.out.println();

       System.out.println("Dia suka melakukan beberapa aktivitas mainstream seperti :");
       System.out.print("Memasak "+manusia.Memasak("Air, "));
       System.out.print("Bermain dengan Kucingnya yang mempunyai mata "+hewan.getMata()+" dan Berekor "+hewan.getEkor());
       System.out.print(", Serta Menerima panggilan jika Telepon Berdering = "+telepon.terima_panggilan(true));
       System.out.print(" di Telepon yang Bentuknya "+telepon.getBentuk()+" dan Gagangnya "+telepon.getGagang_telepon());


    }
}

