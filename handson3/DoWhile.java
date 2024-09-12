package handson3;

public class DoWhile {
    public static void main(String[] args) {
        // inisialisasi variable counter
        int couenter = 1;

        //loop dengan doWhile
        do {
            if (couenter > 15) {
                break;
            }
            if (couenter % 3 != 0) {
                System.out.println(couenter + " ");
            }
            couenter++;
        } while (couenter <= 20);

    }
}
