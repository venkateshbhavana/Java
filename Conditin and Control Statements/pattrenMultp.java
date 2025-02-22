/*8.	Print following series 2*3,3*4,4*5,......16*17       (Print in two ways – patter & multiplied value) */

class pattrenMultp{
public static void main(String[] args){
int p;
System.out.println("Pattren Series:");
for(int i=2;i<=16;i++){
    System.out.print(i+"*"+(i+1));
     if(i<16){
       System.out.print(",");
        }
    }
System.out.println();
System.out.println("Multiplication Series:");
for(int i=2;i<=16;i++){
     p=i*(i+1);
    System.out.print(p);
   if(i<16){
          System.out.print(",");
  }
}
}
   }  