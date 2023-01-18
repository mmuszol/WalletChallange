public class Main {


    public static void main(String[] args) {

        Wallet wallet = new Wallet(3000);
        for ( int i = 1;i <= 6; i++){
            System.out.println("Miesiac:"+i);
            wallet.addMoney(5000);
            wallet.removeMoney(2000);
            wallet.removeMoney(1000);
        }
        System.out.println( "podsumowanie wydatkoów po pół roku");
        wallet.printAmount();
    }
}
