package handson3;

public class ForEach {
    public static void main(String[] args) {
        //membuaat array angka dari 1 hingga 20
        int[] angka = new int[20];
        for (int i = 0; i < angka.length; i++) {
            angka[i] = i + 1;
        }
        for (int num : angka) {
            if (num > 15) {
                break;
            }
            if (num % 3 == 0) {
                continue;
            }
            System.out.println(num + "");
        }
    }
}
