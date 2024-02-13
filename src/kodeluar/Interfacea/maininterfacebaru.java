package kodeluar.Interfacea;

public class maininterfacebaru {
    public static void main(String[] args) {
        jalan();
    }

    public static void jalan() {
        /*penggunaan type data yang sama dengan interface pada var Elang untuk Enkapsulasi/perbatasan
        * akses ke kelas elang*/
        Hewanburungpemburu Elang = new elang("elangjawa");
        burungpemburu elangjawa = new burungpemburu(Elang);
        Elang.nama();
        elangjawa.terbang();
        elangjawa.terbang();
        elangjawa.terbang();
        elangjawa.terbang();
        elangjawa.turun();
        elangjawa.makandaging("ular");

        System.out.println();
        /*penggunaan type data yang sama dengan class pada var Elang sehingga bisa mengakses class elang*/
        elang el = new elang("elang sumatra");
        burungpemburu elangsumatra = new burungpemburu(el);
        el.nama();
        el.switchterbang();
        elangsumatra.turun();
        elangsumatra.terbang();
        elangsumatra.terbang();
        elangsumatra.makandaging("sapi");

        /*penggunaan type data yang sama dengan interface pada var Elang untuk Enkapsulasi/perbatasan
         * akses ke kelas elang*/
        System.out.println();
        Hewanburungpemburu aya = new ayam();
        burungpemburu ayamjago = new burungpemburu(aya);
        aya.nama();
        ayamjago.terbang();
        ayamjago.turun();
        ayamjago.makandaging("cacing");
    }
}
