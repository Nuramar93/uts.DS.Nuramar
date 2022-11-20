public class soal1 {
    public static void main(String[] args) {
        int [] bil = {3, 8, 12, 80, 43, 52, 78, 42, 48, 25, 23, 10, 18, 54, 39};
        System.out.print("Bilangan Genap  :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2 == 0) {
                System.out.print(bil[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan Ganjil :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2!= 0){
                System.out.print(bil[i] + " ");
            }
        }
        System.out.println("");
    }
}