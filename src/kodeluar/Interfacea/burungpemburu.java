package kodeluar.Interfacea;

public class burungpemburu {
    private final Hewanburungpemburu hewan;



    public burungpemburu(Hewanburungpemburu hewan) {
        this.hewan = hewan;
    }

    void terbang() {
        this.hewan.terbang();
    }

    void turun() {
        this.hewan.turun();
    }

    void makandaging(String value) {
        this.hewan.makandaging(value);
    }

}
