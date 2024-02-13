package LearningtheJavaLanguage.AObjectOrientedProgrammingConcepts;

public class elang extends hewan implements burung,karnivora{
    public elang(String nama) {
        super(nama);
        makan();
        terbang();
        makandaging();
        System.out.println("dapat daging : " + dapatdaging());
    }
    public void makan(){
        System.out.println("saya suka makan" + daging);
    }

    @Override
    public void terbang() {
        System.out.println("max ketinggian " + maxketinggian);

    }

    @Override
    public int dapatdaging() {
        return 100;
    }
}
