public class Baibuoi5Baibuoi {
    public static int tinhGiaTriLonNhat(int a, int b) {
        return a > b ? a : b;
    }

    public static int tinhGiaTriNhoNhat(int a, int b) {
        return a < b ? a : b;
    }
    public static void main(String[] args) {
        System.out.printf (" Gia tri lon nhat cua hai so %d và %d là: %d",3,5,tinhGiaTriLonNhat(3,5));
        System.out.printf (" Gia tri nho nhat cua hai so %d và %d là: %d",3,5,tinhGiaTriNhoNhat(3,5));
   
    }

}
