import java.util.*;

class q35{

static Scanner sc=new Scanner(System.in);
q35(){
System.out.println("default");
}

q35(q35 o){
System.out.println(o);
}

public static void main(String[] args){
q35 obj=new q35();
//q35 obj=new q35(obj);
q35 ob2=new q35(new q35());

}
}
