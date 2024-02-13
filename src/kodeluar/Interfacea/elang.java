package kodeluar.Interfacea;

public class elang implements Hewanburungpemburu {
    private final String nama;
    private int ketinggian;
    private boolean isterbang = true;
    private String daging = "kelinci";

    public elang(String nama) {
        this.nama = nama;
        ketinggian = 0;
    }

    public int getketinggian() {
        return ketinggian;
    }

    public void setdaging(String daging) {
        this.daging = daging;
    }

    @Override
    public void nama() {
        System.out.println("nama saya " + nama);
    }

    @Override
    public void terbang() {
        if (isterbang) {
            if (ketinggian <= maxketinggian) {
                ketinggian += 10;
                System.out.println("saya sedang terbang ketinggian " + ketinggian);
            } else {
                System.out.println("saya sedang terbang full ketinggian " + ketinggian);
            }
        } else {
            System.out.println("Cannot terbang");
        }
    }

    @Override
    public void turun() {
        if (isterbang) {
            if (ketinggian >= minketinggian) {
                ketinggian -= 10;
                System.out.println("saya sedang turun ketinggian " + ketinggian);
            } else {
                System.out.println("saya sedang turun ditanah");
            }
        } else {
            System.out.println("Cannot terbang");
        }
    }

    @Override
    public void makandaging(String value) {
        if (isterbang) {
            System.out.println("tidak bisa makan");
        } else {
            System.out.println("kesukaan saya adalah : " + daging + " namun saya sedang makan " + value);
        }
    }

    public void switchterbang() {
        isterbang = !isterbang;
    }
}
