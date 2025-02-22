/*Description:
A Tournament is happening in CvCorp So here C No of Players is Playing Cricket Match and R No of Matches played So take the Scores in 2D Array And Print the Highest Scorer in Every Match and Print the Highest Scorer in All Matches?


Constraints:
Input            : First Line of The Input Consists of One Integer Value Which Represents No of Matches

                       Second Line of the Input Consists of One Integer Value Which Represents No of Players 

                       And Next Line Consists of Match -1 Scores of All Players and in Next Line Consists of Match -2 Scores of All Players and so on for All R No of Matches 

Output         : Print the Highest Scorer Name And Score In Each and Every Match Separately after that Print the Highest Individual Scorer in All Matches.

Constraints  : NA


Example:
Input 1 :            3

                           3

                           3 5 6

                           7 8 9

                          12 15 12

Outupt 1 :         Player3 - 6

                          Player3 - 9

                          Player2 - 15

                          Player2 - 28

 

Input 2 :            5

                           4

                           2 15 12 13

                           8 5 0 19

                          18 17 4 7

                           9 18 4 19

                          15 14 13 2

Outupt 2 :         Player2 - 15

                          Player4 - 19

                          Player1 - 18

                          Player4 - 19

                          Player1 - 15

                          Player2 - 69

 


Explanation:
Input 1 :            3

                           3

                           3 5 6

                           7 8 9

                          12 15 12

Outupt 1 :         Player3 - 6

                          Player3 - 9

                          Player2 - 15

                          Player2 - 28

Explanation:

In This Tournament We Have 3 Matches (Match -1, Match -2, Match -3) with 3 Players (Player-1, Player-2, Player-3) 

In Match-1 ->  Player - 1 Score is 3, Player - 2 Score is 5, Player - 3 Score is 6, Here Highest Score is Player - 3 With Score 6, So Print Player3 - 6. 

In Match-2 ->  Player - 1 Score is 7, Player - 2 Score is 8, Player - 3 Score is 9, Here Highest Score is Player - 3 With Score 9, So Print Player3 - 9. 

In Match-3 ->  Player - 1 Score is 12, Player - 2 Score is 15, Player - 3 Score is 12, Here Highest Score is Player - 2 With Score 15, So Print Player2 - 15.

 

In All the 3 Matches

Player1 Scores  3, 7, 12. So Total Score is 3 + 7 + 12 = 22 

Player2 Scores  5, 8, 15. So Total Score is 5 + 8 + 15 = 28 

Player3 Scores  6, 9, 12. So Total Score is 6 + 9 + 12 = 27

Here Player2 Scores Highest Score in The Tournament, So Print Player2 - 28  

 

 

Input 2 :            5

                           4

                           2 15 12 13

                           8 5 0 19

                          18 17 4 7

                           9 18 4 19

                          15 14 13 2

Outupt 2 :         Player2 - 15

                          Player4 - 19

                          Player1 - 18

                          Player4 - 19

                          Player1 - 15

                          Player2 - 69

Explanation:

In This Tournament We Have 5 Matches (Match -1, Match -2, Match -3, Match - 4, Match - 5) with 4 Players (Player-1, Player-2, Player-3, Player-4) 

In Match-1 ->  Player - 1 Score is 2, Player - 2 Score is 15, Player - 3 Score is 12, Player - 4 Score is 13, Here Highest Score is Player - 2 With Score 12, So Print Player2 - 12. 

In Match-2 ->  Player - 1 Score is 8, Player - 2 Score is 5, Player - 3 Score is 0, Player - 4 Score is 19, Here Highest Score is Player - 4 With Score 19, So Print Player4 - 19. 

In Match-3 ->  Player - 1 Score is 18, Player - 2 Score is 17, Player - 3 Score is 4, Player - 4 Score is 7, Here Highest Score is Player - 1 With Score 18, So Print Player1 - 18. 

In Match-4 ->  Player - 1 Score is 9, Player - 2 Score is 18, Player - 3 Score is 4, Player - 4 Score is 19, Here Highest Score is Player - 4 With Score 19, So Print Player4 - 19. 

In Match-5 ->  Player - 1 Score is 15, Player - 2 Score is 14, Player - 3 Score is 13, Player - 4 Score is 2, Here Highest Score is Player - 1 With Score 15, So Print Player1 - 15. 

 

In All the 5 Matches

Player1 Scores  2, 8, 18, 9, 15. So Total Score is 2 + 8 + 18 + 9 + 15 = 52 

Player2 Scores  15, 5, 17, 18, 14. So Total Score is 15 + 5 + 17  + 18 + 14 = 69 

Player3 Scores  12, 0, 4, 4, 13. So Total Score is 12 + 0 + 4 + 4 + 13 = 33

Player4 Scores  13, 19, 7, 19, 2. So Total Score is 13 + 19 + 7 + 19 + 2 = 60

 

Here Player2 Scores Highest Score in The Tournament, So Print Player2 - 69  */



package TArrays;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(); // Number of matches
        int c = sc.nextInt(); // Number of players
        int a[][] = new int[r][c]; // Scores array

        // Input scores
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int s[] = new int[c]; // Total scores for each player

        // Loop through each match
        for (int i = 0; i < r; i++) {
            int h = a[i][0]; // Initialize highest score for the current match
            int p = 1; // Player with the highest score in the current match
            
            for (int j = 0; j < c; j++) {
                s[j] += a[i][j]; // Accumulate total scores for each player

                if (a[i][j] > h) { // Update highest score and player index
                    h = a[i][j];
                    p = j + 1; // Convert 0-based index to 1-based index
                }
            }

            // Output highest scorer of the current match
            System.out.println("Player" + p + " - " + h);
        }

        // Find the highest scorer across all matches
        int hs = s[0]; // Initialize highest total score
        int p = 1; // Player with the highest total score
        
        for (int i = 0; i < s.length; i++) {
            if (s[i] > hs) {
                hs = s[i];
                p = i + 1; // Convert 0-based index to 1-based index
            }
        }

        // Output the highest scorer across all matches
        System.out.println("Player" + p + " - " + hs);
    }
}

