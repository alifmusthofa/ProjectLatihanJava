package LearningtheJavaLanguage.AObjectOrientedProgrammingConcepts;

public interface karnivora {
    String daging = "daging";

    int dapatdaging();

    default void makandaging(){
        System.out.println("Saya makan : " + daging);
    }
}
