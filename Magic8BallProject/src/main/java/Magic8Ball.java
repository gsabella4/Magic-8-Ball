import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\n\n\n\t\t☆～☆～☆～☆～☆～☆～☆～ Welcome to the Magic 8-Ball ～☆～☆～☆～☆～☆～☆～☆");
        System.out.println("\nAsk a question, any question, you'll be guided in the right direction! .... Good Luck :)");
        System.out.println("\n\n゜。+。゜゜。*。゜゜。＋。゜*゜。゜。+。゜゜。*。゜゜。＋。゜*゜。゜。+。゜゜。*。゜゜。＋。゜*゜。゜。+。゜゜。*。");
        System.out.print("\n\nType your question here, followed by the <Enter> key:  ");
        String userQuestion = userInput.nextLine();
        System.out.println("\n。☆。・゛★゛・。☆。・゛★゛・。☆。・゛★゛・。☆。・゛★゛・。☆。・゛★゛・。・゛★゛・。☆。・゛★゛・。・゛★゛・。");

        int randomNumber = new Random().nextInt(15);

        if (randomNumber == 0){
            System.out.println("\n\n\t\t\t\t\tYES, absolutely. Why would you think any different?");
        }
        else if (randomNumber == 1){
            System.out.println("\n\n\t\t\tNo, I don't see that in your future. As one door closes, another opens");
        }
        else if (randomNumber == 2){
            System.out.println("\n\n\t\t\t\t\t\t\t\tConcentrate and ask again");
        }
        else if (randomNumber == 3){
            System.out.println("\n\n\t\t\t\t\t\tThe outlook is good, I'd bet the farm on it");
        }
        else if (randomNumber == 4){
            System.out.println("\n\n\t\t\t\t\t\t\t\t\tMy sources say... No");
        }
        else if (randomNumber == 5){
            System.out.println("\n\n\t\t\t\t\tBest not to tell you now, come back when you're ready");
        }
        else if (randomNumber == 6){
            System.out.println("\n\n\t\t\t\t\tAs I see it, Yes... but my vision's kinda blurry");
        }
        else if (randomNumber == 7){
            System.out.println("\n\n\t\t\t\t\t\tAll signs point to yes, but what do i know? ;)");
        }
        else if (randomNumber == 8){
            System.out.println("\n\n\t\t\t\t\tI cannot predict this right now, try again later?");
        }
        else if (randomNumber == 9){
            System.out.println("\n\n\t\t\t\t\tIf you can believe it, good things will come your way");
        }
        else if (randomNumber == 10){
            System.out.println("\n\n\t\t\t\t\tNo, That sounds awful, but it depends how you look at it");
        }
        else if (randomNumber == 11){
            System.out.println("\n\n\t\t\t\t\t\t\t\tDon't know, don't care");
        }
        else if (randomNumber == 12){
            System.out.println("\n\n\t\t\t\t\t\t\tI have a headache. Ask again later");
        }
        else if (randomNumber == 13){
            System.out.println("\n\n\t\t\t\t\t\t\t\t100%, no doubt about that");
        }
        else if (randomNumber == 14){
            System.out.println("\n\n\t\t\t\tEven a blind squirrel finds a nut every now and then");
        }
    }
}
