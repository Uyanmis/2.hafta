public class Main {
    public static void main(String[] args) {
        for(int i=2;i<10;i+=2)

        {
            System.out.println(i);
        }
        System.out.println("FOR döngü bitti");

        int i=1;
        while(i<10) {
            System.out.println(i);
            i++;

        }
        System.out.println("While döngü bitti");

        int j=100;
        do {
            System.out.println(j);
            j+=2;
        }
        while(j<10);
        System.out.println("do - while döngü bitti");

    }
}