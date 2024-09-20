import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            int ans = 0;
            String play = " ";

            System.out.println("Velkommen til gæt et tal");
            int dif = chooseDifficulty();

            if (dif == 1) {
                ans = (int) (Math.random() * 10);
                System.out.println("Gæt et tal mellem 0 og 10");
            } else if (dif == 2) {
                ans = (int) (Math.random() * 20);
                System.out.println("Gæt et tal mellem 0 og 20");
            } else if (dif == 3) {
                ans = (int) (Math.random() * 100);
                System.out.println("Gæt et tal mellem 0 og 100");
            }
            System.out.println("Indtast dit gæt");
            int guess = input.nextInt();

            checkAnswer(guess, ans);

            System.out.println("Tillykke, du gættede tallet");

            System.out.println("Vil du spille igen - ja/nej");
            play = input.next();

            handlePlayAgain(play);


        }
    }
    public static int chooseDifficulty () {
        Scanner input1 = new Scanner(System.in) ;
        System.out.println("Indtast sværhedsgrad; 1,2 eller 3") ;
        int dif = input1.nextInt() ;
        return dif ;
    }

    public static void checkAnswer (int guess, int ans) {
        Scanner input2 = new Scanner(System.in) ;

        while (guess != ans) {
            if (guess < ans) {
                System.out.println("Dit gæt er for lavt - prøv igen") ;
                guess = input2.nextInt() ;
            }
            else {
                System.out.println("Dit gæt er for højt - prøv igen") ;
                guess = input2.nextInt() ;
            }
        }
    }
    public static void handlePlayAgain (String play) {
        switch (play) {
            case "ja":
                System.out.println("Alrighty then") ;
                break ;
            case "nej":
                System.out.println("Farvel og tak") ;
                System.exit(0) ;
            default:
                System.out.println("Ugyldigt valg - farvel") ;
                System.exit(0) ;
        }
    }
}
