package handson1;

public class ForEach {
    public static void main(String[] args) {
       String[] KumpulanBuah = new String[]{"Apel", "Pisang", "Mangga", "Jeruk"};
       for (String namaBuah : KumpulanBuah){
           if (namaBuah.equals("Mangga")|| namaBuah.equals("Pisang")){
               continue;
           }
           System.out.println(namaBuah);
       }

    }
}
