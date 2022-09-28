public class Main {
    private static int aranacak;

    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();

    }
    public static void  sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int arancak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == arancak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println("Sayı Mevcuttur:" + aranacak);
        } else {
            System.out.println("Sayı  Mevcut Değildir:"+ aranacak);
        }
    }
        public static void mesajVar(String mesaj) {
        System.out.println(mesaj);
}
}