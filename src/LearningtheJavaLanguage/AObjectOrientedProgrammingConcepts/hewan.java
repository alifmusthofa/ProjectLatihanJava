package LearningtheJavaLanguage.AObjectOrientedProgrammingConcepts;

public class hewan {
    private String nama;
    hewan(String nama){
        this.nama = nama;
    }

     public void setnama(String nama){
        this.nama = nama;
    }
     public void perkenalan(){
        System.out.println("nama saya adalah " + nama);
    }
     public void makan(){
        System.out.println("saya suka makan apa saja");
    }


}
