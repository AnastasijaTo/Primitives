public class Main {
    public static void main(String[] args) {
        int ticket = 8000;
        int bonus = 20;

        int miles = ticket / bonus;

        System.out.println("При покупке билета стоимостью" + ticket + "начисляется" + miles + "бонусных миль");
    }
}