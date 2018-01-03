package githubfirst;

import java.util.*;

/**
 *
 * @author Nemanja Djorovic
 */
public class GitHubFirst {

    private static String[] args;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner i_input = new Scanner(System.in);
        Scanner s_input = new Scanner(System.in);

        int i_pick;

        System.out.println("Select :\n   1: String\n   2: List of Char\n   3: Number");
        try {
            i_pick = i_input.nextInt();

            switch (i_pick) {
                case 1:
                    string();
                    break;
                case 2:
                    listOfChar();
                    break;
                case 3:
                    System.out.println("3");
                    break;
                default:
                    System.out.println("Number is not valid");
                    GitHubFirst.main(args);
            }

        } catch (Exception e) {
            System.out.println("Use numbers [1, 2, 3] next time");
            GitHubFirst.main(args);
        }

    }
//Pick Words First Time
    private static void string() {
        Scanner s_input = new Scanner(System.in);

        String s_wordsArr[] = new String[5];

        try {
            System.out.println("Provide five words: ");
            for (int i = 0; i < s_wordsArr.length; i++) {
                s_wordsArr[i] = s_input.nextLine();
            }
            stringPick(s_wordsArr);

        } catch (Exception e) {
            System.out.println("Someting went wrong");
        }

    }
    
//    *********************************************************String Pick********************************************************************
//  Play width words
    private static void stringPick(String words[]) {
        Scanner i_input = new Scanner(System.in);
        Scanner s_input = new Scanner(System.in);
        int i_pick;
        String s_pick, s_old_char, s_new_char;

        System.out.println("\nWhat do you want to do?\n   1: Display words:\n   2: Search words by first letter:\n   "
                + "3: Search words by last letter:\n   4: Transform letters to upper case:\n   5: Transform letters to lower case:\n   "
                + "6: Replace letters in words:\n");
        try {
            i_pick = i_input.nextInt();
            switch (i_pick) {
                //Display words
                case 1:
                    System.out.println("\nYou choose Display Words:");
                    for (String word : words) {
                        System.out.printf("%s ", word);
                    }
                    System.out.println();
                    startFrom(words);
                    break;
                    //Search words by first letter
                case 2:
                    try {
                        System.out.println("\nYou choose Search words by starting letter/letters:");
                        System.out.println("Enter letter/letters:");
                        s_pick = s_input.nextLine();
                        System.out.println("Words are: ");
                        for (String word : words) {
                            if (word.startsWith(s_pick)) {
                                System.out.printf("%s ", word);
                            }
                        }

                    } catch (Exception e) {
                        System.out.println("No Word with thes letters / that letter");
                    }

                    System.out.println();
                    startFrom(words);
                    break;
                    //Search words by last letter
                case 3:
                    try {
                        System.out.println("\nYou choose Search words by ending letter/letters:");
                        System.out.println("Enter letter/letters:");
                        s_pick = s_input.nextLine();
                        System.out.println("Words are: ");
                        for (String word : words) {
                            if (word.endsWith(s_pick)) {
                                System.out.printf("%s ", word);
                            }
                        }

                    } catch (Exception e) {
                        System.out.println("No Word with thes letters / that letter");
                    }
                    System.out.println();
                    startFrom(words);
                    break;
                   // Transform letters to upper case
                case 4:
                    System.out.println("\nYou choose Transform letters to upper case:");
                    for (String word : words) {
                        System.out.printf("%s ", word.toUpperCase());
                    }
                    System.out.println();
                    startFrom(words);
                    break;
                    //You choose Transform letters to lower case
                case 5:
                    System.out.println("\nYou choose Transform letters to lower case:");
                    for (String word : words) {
                        System.out.printf("%s ", word.toLowerCase());
                    }
                    System.out.println();
                    startFrom(words);
                    break;
                    //You choose Replace letters in words
                case 6:
                    System.out.println("\nYou choose Replace letters in words:");
                    for (String word : words) {
                        System.out.printf("%s ", word);
                    }
                    System.out.println("\nEnter what you want to replace:");
                    s_old_char = s_input.nextLine();
                    System.out.println("Enter width what you want to replace it:");
                    s_new_char = s_input.nextLine();
                    for (String word : words) {
                        System.out.printf("%s ", word.replace(s_old_char, s_new_char));
                    }
                    System.out.println();
                    startFrom(words);
                    break;
                    //Number is not valid
                default:
                    System.out.println("Number is not valid");
                    string();
            }
        } catch (Exception e) {
            System.out.println("An error occurred");
            GitHubFirst.main(args);
        }
    }

    private static void startFrom(String words[]) {
        Scanner i_input = new Scanner(System.in);
        int i_pick;

        try {
            System.out.println("Choose:\n   1: Start from begining\n   2: Play with the words again\n   3: Close app");
            i_pick = i_input.nextInt();
            switch (i_pick) {
                case 1:
                    GitHubFirst.main(args);
                    break;
                case 2:
                    GitHubFirst.stringPick(words);
                    break;
                case 3:
                    System.out.println("App CLOSED");
                    break;
                default:
                    System.out.println("Pay attention to the question");
                    startFrom(words);

            }
        } catch (Exception e) {
            System.out.println("An error occurred");
            GitHubFirst.main(args);
        }
    }
    
    //***************************************************************List of Char Pick********************************************************************

    private static void listOfChar() {
       
    }
    

}
