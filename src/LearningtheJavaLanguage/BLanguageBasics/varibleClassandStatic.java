package LearningtheJavaLanguage.BLanguageBasics;

public class varibleClassandStatic {
    /*ini membicarakan tentang penamaan Variabel dan static*/
    int speed;//kecil
    int currentSpeed;// kecilBesar
    final int GEAR_SPEED = 6;// jika memakai final maka huruf besar semua
    private static int counter = 0;
    public final static double PHI = 3.14;

    /*Static merupakan variabel class sehingaa hanya satu memori walaupun di instance sebanyak apapun
    *jika static diberi private seperti private static int counter = 0; maka harus pakai instance
    * contoh memanggilnya
    *   varibleClassandStatic vc = new varibleClassandStatic();
        vc.counting();
        vc.getCounter();
    */

    public int getCounter() {
        return counter;
    }

    void counting() {
        counter++;
    }

    /*jika modifier dibuat public maka bisa dipanggil tanpa instance
    * contoh :
    *   int r = 5;
        double luasLingkaran = varibleClassandStatic.PHI * Math.pow(r,2);
        System.out.println(luasLingkaran);
    * */
    public static double luasLingkaran(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    /*jika mau setiap instance nambah counter bisa seperti ini*/
    public varibleClassandStatic() {
        counter++;
    }
    /*jika mau harus pakai static dan tidak bisa instance maka buat constructor menjadi private*/


/*    Data Type Default Value (for fields
    byte	0
    short	0
    int	0
    long	0L
    float	0.0f
    double	0.0d
    char	'\u0000'
    String (or any object)  	null
    boolean	false*/

    boolean result = true;
    char capitalC = 'C';
    byte b = 100;
    short s = 10000;

    int i = 100000;
    // The number 26, in decimal
    int decVal = 26;
    //  The number 26, in hexadecimal
    int hexVal = 0x1a;
    // The number 26, in binary
    int binVal = 0b11010;
    double d1 = 123.4;
    // same value as d1, but in scientific notation
    double d2 = 1.234e2;
    float f1 = 123.4f;

    //Using Underscore Characters in Numeric Literals
    long creditCardNumber = 1234_5678_9012_3456L;
    long socialSecurityNumber = 999_99_9999L;
    float pi = 3.14_15F;
    long hexBytes = 0xFF_EC_DE_5E;
    long hexWords = 0xCAFE_BABE;
    long maxLong = 0x7fff_ffff_ffff_ffffL;
    byte nybbles = 0b0010_0101;
    long bytes = 0b11010010_01101001_10010100_10010010;

    // Invalid: cannot put underscores
    // adjacent to a decimal point
    //float pi1 = 3_.1415F;
    // Invalid: cannot put underscores
    // adjacent to a decimal point
    //float pi2 = 3._1415F;
    // Invalid: cannot put underscores
    // prior to an L suffix
    //long socialSecurityNumber1 = 999_99_9999_L;

    // OK (decimal literal)
    int x1 = 5_2;
    // Invalid: cannot put underscores
    // At the end of a literal
    //int x2 = 52_;
    // OK (decimal literal)
    int x3 = 5_______2;

    // Invalid: cannot put underscores
    // in the 0x radix prefix
    //int x4 = 0_x52;
    // Invalid: cannot put underscores
    // at the beginning of a number
    //int x5 = 0x_52;
    // OK (hexadecimal literal)
    int x6 = 0x5_2;
    // Invalid: cannot put underscores
    // at the end of a number
    //int x7 = 0x52_;
}
