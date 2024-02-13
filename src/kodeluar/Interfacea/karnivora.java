package kodeluar.Interfacea;

public interface karnivora extends hewan {
    default void makandaging() {
        System.out.println("makan daging yummy");
    }

    void makandaging(String value);
}
