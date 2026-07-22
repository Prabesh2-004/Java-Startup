public class RandomNumber {
    public static void main(String[] args) {
//        int randomNumber = (int) ((Math.random() * 100) + 1);
//        System.out.println(randomNumber);

        String[] games = { "League Of Legend", "Hollow Knight", "Dark Soul", "Elden Ring", "CyberPunk" };
        int randomNumber = (int) ((Math.random() * games.length));
        System.out.println(games[randomNumber]);
    }
}
