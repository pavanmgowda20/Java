public class Logicalop {
   public static void main(String[] args){
    //Logical operator

    int a=30;
    int b=40;
    if(a<50 && b<50)
        System.out.println("both less than 50");

    //or operator
    if(a<50 || b<50)
        System.out.println("atleast one less than 50");

    boolean isAdult=true;
    if(isAdult==true)
        System.out.println("is adult");
    else
        System.out.println("Not adult");
   } 
}
