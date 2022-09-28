public class Main {
    public static void main(String[] args) {
        int number =1;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean inPrime=true;

        if (number<2){
            System.out.println("GEÇERSİZ");
        }

        for (int i=2; i<number; i++)
        {
            if(number % i ==0){
                inPrime=false;
            }

        }
        if (inPrime){
            System.out.println("Sayınız asaldır");
        } else{
            System.out.println("sayınız asal değildir");
        }
    }
}