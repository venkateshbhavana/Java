/*3.	Declare & initialize a number. Check whether the number is in range 0-100 or not. If not in range print invalid input. Else – if the number is in range 90-100 then print Super Smart, 80-90 print Smart,70-80 print smart enough, 60-70 print just smart, 35-60 print no smart, 0-35 print dump.*/


import java.util.*;
class marks{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n<0 || n>100){
System.out.println("Invalid Input");
}
else if(n>=90 && n<=100){
System.out.println("Super Smart");
}
else if(n>=80 && n<=89){
System.out.println("Smart");
}
else if(n>=70 && n<=79){
System.out.println("Smart enough");
}
else if(n>=60 && n<=69){
System.out.println("Just Smart");
}
else if(n>=35 && n<=59){
System.out.println("No Smart");
}
else if(n>=0 && n<=34){
System.out.println("Dump");
}

}
}



