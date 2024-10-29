public class Bai5_2 {
    public static void viDu1() {
        int a = 3;
        System.out.println(a++); 
        System.out.println(++a); 
        System.out.println(a+++1); 
        System.out.println(++a + 1); 
    }

    public static void viDu2() {
        int a = 0, b, c;
        a++;
        b = a; 
        c = a++; 
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c); 
    }

    public static void viDu3() {
        int a = 0, b, c;
        ++a;
        b = a; 
        c = ++a; 
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c); 
    }

    public static void viDu4() {
        int a = 0, b, c;
        ++a;
        b = ++a; 
        c = a++; 
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c); 
    }

    public static void viDu5() {
        int a = 0, b, c;
        ++a;
        b = ++a; 
        c = b++; 
        System.out.println(a);
        System.out.println(b); 
        System.out.println(c); 
    }

    public static void viDu6() {
        int a = 0, b, c;
        ++a;
        b = a++; 
        c = b++; 
        c += c; 
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c); 
    }

    public static void main(String[] args) {
        System.out.println("Ví dụ 1:");
        viDu1();
        System.out.println("\nVí dụ 2:");
        viDu2();
        System.out.println("\nVí dụ 3:");
        viDu3();
        System.out.println("\nVí dụ 4:");
        viDu4();
        System.out.println("\nVí dụ 5:");
        viDu5();
        System.out.println("\nVí dụ 6:");
        viDu6();
    }
}
        