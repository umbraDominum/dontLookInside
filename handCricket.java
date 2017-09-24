/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * ~~  DOCUMNETATIONS(NOT TO BE REMOVED)                                                                                                                                 ~~
 * ~~  ~~~~~~~~~~~~                                                                                                                                                      ~~
 * ~~  DESCRIPTION:                                                                                                                                                      ~~
 * ~~  ~~~~~~~~~~~~                                                                                                                                                      ~~
 * ~~  THIS PROGRAM IS USED TO PLAY HAND CRICKET AGAISNT COMPUTER.                                                                                                       ~~
 * ~~  THIS USES SIMPLE JAVA CODING AND PACKAGES OF BUFFERED READER AND SCANNER AND SOME OF ITS PRE-DEFINED FUNCTIONS.                                                   ~~
 * ~~  THIS USES THE USER DEFINED FUNCTIONS OF "BAT()","BALL()" AND "TOSS()",ALL INVOKED ORDERLY FROM "MAIN()".                                                          ~~
 * ~~  THIS USES THE VARIABLE DATATYPES OF STRING,INT&DOUBLE.                                                                                                            ~~
 * ~~  THIS PROGRAM HAS 321 LINES OF CODE INCLUDING SPACES AND COMMENTS.                                                                                                 ~~
 * ~~  ~~~~~~~~~~~~                                                                                                                                                      ~~
 * ~~  PROGRAMMER:                                                                                                                                                       ~~
 * ~~  ~~~~~~~~~~~~                                                                                                                                                      ~~
 * ~~  NAME: SRINJOY GHOSE.                                                                                                                                              ~~
 * ~~  CLASS: 10                                                                                                                                                         ~~
 * ~~  SECTION: A                                                                                                                                                        ~~
 * ~~  ROLL NUMBER : 21                                                                                                                                                  ~~
 * ~~  YEAR : 2017-2018                                                                                                                                                  ~~
 * ~~  ~~~~~~~~~~~~                                                                                                                                                      ~~
 * ~~   VERSIONS:                                                                                                                                                        ~~
 * ~~  ~~~~~~~~~~~~                                                                                                                                                      ~~
 * ~~  V1.0(05.23.2017):TOTAL WRITING(NO FUNCTIONS)(SOURCED).                                                                                                            ~~
 * ~~  V1.1(05.25.2017):LINEAR GRAPHICS ADDED.                                                                                                                           ~~
 * ~~  V1.2(05.26.2017):GRAPHICAL CHANGES MADE.COMMENTS ADDED.                                                                                                           ~~
 * ~~  V2.0(06.13.2017):TOSS FUNCTION CREATED.[refer to V2.1]                                                                                                            ~~
 * ~~  V2.1(06.27.2017):[contd.V2.0]TOSS FUNCTION IMPLEMENTED.                                                                                                           ~~
 * ~~  V3.0(07.12.2017):BAT FUNCTION CREATED AND IMPLEMENTED.                                                                                                            ~~
 * ~~  V3.1(08.06.2017):BALL FUNCTION CREATED.[refer to V3.2]                                                                                                            ~~
 * ~~  V3.2(08.15.2017):[contd.V3.1]BALL FUNCTION IMPLEMENTED.                                                                                                           ~~
 * ~~  V3.3(08.25.2017):ALL FUNCTIONS SYNC-ED.                                                                                                                           ~~
 * ~~  V4.0(08.26.2017):MINOR FIXES AND ENCHANCEMENTS.                                                                                                                   ~~
 * ~~  V5.0(08.29.2017)[FINAL]: TITLE GRAPHICS ADDED.DOCUMENTATION ADDED.[FINAL]                                                                                         ~~
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
import java.io.*;
import java.util.Scanner;
public class handCricket

{
    
     public static int toss()
    {
        Scanner sc = new Scanner(System.in);
        String temp="",temp1="";
        int HEADS = 1;
        int TAILS = 0;
        double randomChoice = Math.random();
        System.out.println("NOW, it is the time for toss,Enter \"HEADS\" or \"TAILS\" :");
        String input = sc.next();
        if(randomChoice>=0.5 && randomChoice<=1)
        
            temp = "HEADS";
        else if(randomChoice<=0.5 && randomChoice>=0)
            temp = "TAILS";
        if(temp.equalsIgnoreCase(input))
          {
             System.out.println("YOU WIN !!!!");
             System.out.println("WHAT IS YOUR CHOICE : \"BATTING\" OR \"BOWLING\"");
             temp1 = sc.next();
             if(temp1.equalsIgnoreCase("batting")){return(1);} else {return(0);}
          }
        else
          { System.out.println("SORRY,YOU LOSE :(");
            return((int)Math.random());}
    }
    public static int bat() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int temp1;
        String name; // to accept the player's name;
        int aa; // converting the random real number generated by 'rr' into a random whole number run for the computer;
        int i; // used in for loops;
        int bb; // to accept the player's number;
        double rr; // to generate a random real number;
        int cheat; // to end the game if wrong input is entered; to keep a check whilst the game is running as to whether the game has ended or not;
        int score1; // to store the latest runs scored by the player;
        int score2; // to store the latest runs scored by the computer;
        int c; // used in for loops to create a specific design;
        int choice; // used to decide whether the game needs to be ended or restarted;
        
        name=" ";
        aa=0;
        i=0;
        bb=0; 
        rr=0;
        cheat=0;
        score1=0;
        score2=0;
        c=0;
        choice=0;
        
        System.out.println("YOU ARE BATTING:");
                
                for(c=0;c<=2;c++) { System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); } 
                for(i=1;i>0;i++)
                {
                    System.out.println("");
                    System.out.print("Enter Your Number: ");
                    bb=Integer.parseInt(br.readLine());
                    rr=((Math.random())*6);
                    rr=rr+1;
                    aa=(int)(rr);
                    System.out.println("");
                    System.out.println("Computer's Number: "+aa);
                    System.out.println("");
                    System.out.println("**********");
                    System.out.println("");

                    if(bb==aa)
                    {
                        System.out.println(" ");
                        System.out.println("OUT!!!!!!");
                        System.out.println(" ");
                        System.out.println("################");
                        System.out.println("################");
                        System.out.println("YOUR FINAL SCORE = "+score1);
                        System.out.println("################");
                        System.out.println("################");
                        System.out.println(" ");
                        break;
                    }
                    
                    else if(bb>0&&bb<=6) { score1=score1+bb; } else if(bb>6||bb<=0)
                    {
                        for(c=0;c<=2;c++)
                        {
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        }
                        System.out.println("You have either tried to cheat or entered a wrong input. Game Over!");
                        cheat++;
                        break;
                    }

                    System.out.println("Your Current Score Is "+score1);
                    System.out.println("");
                    System.out.println("**********");
                    }
                return(score1);
            }
      public static int ball() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int temp1;
        String name; // to accept the player's name;
        int aa; // converting the random real number generated by 'rr' into a random whole number run for the computer;
        int i; // used in for loops;
        int bb; // to accept the player's number;
        double rr; // to generate a random real number;
        int cheat; // to end the game if wrong input is entered; to keep a check whilst the game is running as to whether the game has ended or not;
        int score1; // to store the latest runs scored by the player;
        int score2; // to store the latest runs scored by the computer;
        int c; // used in for loops to create a specific design;
        
        
        name=" ";
        aa=0;
        i=0;
        bb=0; 
        rr=0;
        cheat=0;
        score1=0;
        score2=0;
        c=0;
        
        
        System.out.println("YOU ARE BOWLING:");
                
                for(c=0;c<=2;c++) { System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); } 
                for(i=1;i>0;i++)
                {
                    System.out.println("");
                    System.out.print("ENTER YOUR NUMBER: ");
                    bb=Integer.parseInt(br.readLine());
                    rr=((Math.random())*6);
                    rr=rr+1;
                    aa=(int)(rr);
                    System.out.println("");
                    System.out.println("COMPUTER'S NUMBER: "+aa);
                    System.out.println("");
                    System.out.println("**********");
                    System.out.println("");

                    if(bb==aa)
                    {
                        System.out.println(" ");
                        System.out.println("OUT!!!!!!");
                        System.out.println(" ");
                        System.out.println("#################");
                        System.out.println("#################");
                        System.out.println("COMPUTER'S FINAL SCORE = "+score1);
                        System.out.println("#################");
                        System.out.println("#################");
                        System.out.println(" ");
                        break;
                    }
                    
                    else if(bb>0&&bb<=6) { score1=score1+aa; } else if(bb>6||bb<=0)
                    {
                        for(c=0;c<=2;c++)
                        {
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        }
                        System.out.println("You have either tried to cheat or entered a wrong input. Game Over!");
                        cheat++;
                        break;
                    }

                    System.out.println("COMPUTER'S CURRENT SCORE IS : "+score1);
                    System.out.println("");
                    System.out.println("**********");
                    }
                return(score1);
    }
    
    public static void main(String args[])throws IOException
    
    {
        Scanner sc = new Scanner(System.in);
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int temp1;
        String name; // to accept the player's name;
        int aa; // converting the random real number generated by 'rr' into a random whole number run for the computer;
        int i; // used in for loops;
        int bb; // to accept the player's number;
        double rr; // to generate a random real number;
        int cheat; // to end the game if wrong input is entered; to keep a check whilst the game is running as to whether the game has ended or not;
        int score1; // to store the runs scored by the player;
        int score2; // to store the runs scored by the computer;
        int c; // used in for loops to create a specific design;
        int choice; // used to decide whether the game needs to be ended or restarted;
        int infinity=1; // used to keep the game running until the player decides to end the game;
        while(infinity>0)
        {
            
            name=" ";
            aa=0;
            i=0;
            bb=0;
            rr=0;
            cheat=0;
            score1=0;
            score2=0;
            c=0;
            choice=0;
            infinity=1;
        
        System.out.println("*   *      * * *     *       *  *  *      *****   *****   *  *******   *  *      *******   *****");
        System.out.println("*   *     *     *    * *     *  *    *    *       *   *   *  *         * *       *           *");        
        System.out.println("*****    ********    *   *   *  *      *  *       ******  *  *         ***       *****       *");
        System.out.println("*   *   *        *   *     * *  *    *    *       * *     *  *         *  *      *           *");
        System.out.println("*   *   *          * *       *  *         *****   *   *   *  *******   *    *    *******     *");
        
        System.out.println();   
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("| WELCOME TO THE HAND CRICKET GAME |");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("");
            System.out.print("Enter Your Name: ");
            name=br.readLine();
            
                for(c=0;c<=2;c++)
                {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
                
                System.out.println("Hello "+name+",");
                System.out.println(".");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Instructions:");
                System.out.println(".");
                System.out.println("You Will Play According to the Toss. Enter Any Number From 1 To 6.");
                System.out.println(".");
                System.out.println("If The Number Entered By The Computer Is Same As The Number Entered By You,");
                System.out.println("You Will Be Declared As Out.");
                System.out.println(".");
                System.out.println("Your Final Score Will Be The Sum Of The Numbers You Entered Before Getting Out.");
                System.out.println(".");
                System.out.println("After Getting Out, You Will Have To Bowl.");
                System.out.println(".");
                System.out.println("Try To Enter A Number Similar To The Number Entered By The Computer.");
                System.out.println(".");
                System.out.println("If The Sum Of Numbers Entered By The Computer Becomes More Than Your Score, It Will Win.");
                System.out.println(".");
                System.out.println("But If You Enter A Number Same As The Number Entered By The Computer, You Can Win!");
                System.out.println(".");
                temp1 = toss();
                for(c=0;c<=2;c++)
                {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
              if(temp1==1)
                {
                score1 = bat();
                score2 = ball();
              }
              else{
                 score2 = ball();
                 score1 = bat();}
               for(i=0;i<1;i++) { if(cheat>0)
                    {
                        break;
                    }
                    
                    System.out.println(" ");
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println("YOUR FINAL SCORE = "+score1);
                    System.out.println("COMPUTER'S FINAL SCORE = "+score2);
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println(" ");

                    if((score1)>(score2))
                    {
                        System.out.println("CONGRATULATIONS "+name+"!! You Have Defeated The Almighty Computer!!:)");
                    }
                    
                    else if((score1)<(score2))
                    {
                        System.out.println("SORRY "+name+", But The Computer Has Defeated You..!.BETTER LUCK NEXT TIME!!:(");
                    }
                    
                    else
                    {
                        System.out.println("It's a Tie..! :|");
                    }
                    
                }
                
                for(c=0;c<=2;c++)
                {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
            
            System.out.println("");
            System.out.println("Enter 1 To Play This Game Again.");
            System.out.println("");
            System.out.println("Enter 0 Or Any Other Number To Quit.");
            choice=Integer.parseInt(br.readLine());
            System.out.println("");
            
            if(choice==1)
            {
                System.out.print('\f');
            }
            
            else
            {
                System.out.print('\f');
                System.out.println("GOOD BYE!!");
                break;
            }
            
        }

    }
}
//CREATED BY SRINJOY GHOSE