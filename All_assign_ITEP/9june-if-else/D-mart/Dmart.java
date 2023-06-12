import java.util.Scanner;
class Dmart {
    public static void main(String args[]){
        float finaltp1=0,total_bill1=0,total_bill2=0,temp=0,gst,finaltp2,finalprice=0,finalprice1=0;
        String gift;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=obj.nextLine();

        System.out.println("Enter Your Gender(M/F)");
        char gender=obj.nextLine().charAt(0);

        System.out.println("Enter the quantity of first product");
        int quantity_1 = obj.nextInt();
        float total_price_1=10f*quantity_1;
        System.out.println("Total price of this product : "+total_price_1);

        System.out.println("Enter the quantity of second product");
        int quantity_2 = obj.nextInt();
        float total_price_2=20f*quantity_2;
        System.out.println("Total price of this product : "+total_price_2);

        System.out.println("Enter the quantity of third product");
        int quantity_3 = obj.nextInt();
        float total_price_3=30f*quantity_3;
        System.out.println("Total price of this product : "+total_price_3);

        System.out.println("Enter the quantity of fourth product");
        int quantity_4 = obj.nextInt();
        float total_price_4=40f*quantity_4;
        System.out.println("Total price of this product : "+total_price_4);

        System.out.println("Enter the quantity of fifth product");
        int quantity_5 = obj.nextInt();
        float total_price_5=50f*quantity_5;
        System.out.println("Total price of this product : "+total_price_5);

        System.out.println("Enter the quantity of sixth product");
        int quantity_6 = obj.nextInt();
        float total_price_6=60f*quantity_6;
        System.out.println("Total price of this product : "+total_price_6);
       
        System.out.println("Enter the quantity of seventh product");
        int quantity_7 = obj.nextInt();
        float total_price_7=70f*quantity_7;
        System.out.println("Total price of this product : "+total_price_7);

        System.out.println("Enter the quantity of eighth product");
        int quantity_8 = obj.nextInt();
        float total_price_8=80f*quantity_8;
        System.out.println("Total price of this product : "+total_price_8);
      
        System.out.println("Enter the quantity of ninth product");
        int quantity_9 = obj.nextInt();
        float total_price_9=90f*quantity_9;
        System.out.println("Total price of this product : "+total_price_9);

        System.out.println("Enter the quantity of tenth product");
        int quantity_10 = obj.nextInt();
        float total_price_10=100f*quantity_1;
        System.out.println("Total price of this product : "+total_price_10);
        float actualprice = total_price_1+total_price_2+total_price_3+total_price_4+total_price_5+total_price_6+total_price_7+total_price_8+total_price_9+total_price_10;
        if(quantity_1>4)
         {
            finaltp1 =total_price_1-((total_price_1*5)/100.0f);
         }  
         float finaltp5 = (total_price_5*10)/100f;
        float finaltp10 = (total_price_10*15)/100f;
        total_bill1 = finaltp1+total_price_2+ total_price_3+total_price_4+ finaltp5+total_price_6+total_price_7+total_price_8+total_price_9+finaltp10;
       if(total_bill1>10000){
                total_bill1=total_bill1-((15*total_bill1)/100f);
            }
            else if(total_bill1>5000 && total_bill1<10000 ){
               total_bill1=total_bill1-((10*total_bill1)/100f);
            }
        gst=(actualprice*10)/100;
        System.out.println("Do you want carrybag(y/n)");
        char bag=obj.next().charAt(0);
         System.out.println("\t\t\t\tDmart");
        System.out.println("Name : "+name+"\t\t\t\t\t\tDate : 09/06/2023");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Item Name\tQuantity\tPrice   \tTotal   \tAfter_Discount");
        if(quantity_1>4)
        {
             System.out.println("Item_1"+"\t\t   "+quantity_1+"\t\t10"+"\t\t "+total_price_1+"\t\t   "+finaltp1+" Rs");
        }
         System.out.println("Item_1"+"\t\t   "+quantity_1+"\t\t10"+"\t\t "+total_price_1+"\t\t   "+total_price_1+" Rs"); 
        System.out.println("Item_2"+"\t\t   "+quantity_2+"\t\t20"+"\t\t "+total_price_2+"\t\t   "+total_price_2+" Rs");
        System.out.println("Item_3"+"\t\t   "+quantity_2+"\t\t30"+"\t\t "+total_price_3+"\t\t   "+total_price_3+" Rs");
        System.out.println("Item_4"+"\t\t   "+quantity_2+"\t\t40"+"\t\t "+total_price_4+"\t\t   "+total_price_4+" Rs");
        System.out.println("Item_5"+"\t\t   "+quantity_2+"\t\t50"+"\t\t "+total_price_5+"\t\t   "+finaltp5+" Rs");
        System.out.println("Item_6"+"\t\t   "+quantity_2+"\t\t60"+"\t\t "+total_price_6+"\t\t   "+total_price_6+" Rs");
        System.out.println("Item_7"+"\t\t   "+quantity_2+"\t\t70"+"\t\t "+total_price_7+"\t\t   "+total_price_7+" Rs");
        System.out.println("Item_8"+"\t\t   "+quantity_2+"\t\t80"+"\t\t "+total_price_8+"\t\t   "+total_price_8+" Rs");
        System.out.println("Item_9"+"\t\t   "+quantity_2+"\t\t90"+"\t\t "+total_price_9+"\t\t   "+total_price_9+" Rs");
        System.out.println("Item_10"+"\t\t   "+quantity_2+"\t\t100"+"\t\t "+total_price_10+"\t\t   "+finaltp10+" Rs");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t  A.P"+"\t\t     D.P");
        System.out.print("\t\t\t\t\t\t"+actualprice);
        System.out.println("\t\t    "+total_bill1);
         if(gender=='m'||gender=='M'){
            System.out.println("Gift : ladger wallet\t\t\t\t  0.0\t\t     0.0");
        }
        else if(gender=='f'||gender=='F'){
            System.out.println("Gift : Cadeberry\t\t\t\t  0.0\t\t     0.0");
        }
         if(bag=='y'||bag=='Y'){
            System.out.println("Carry bag : yes\t\t\t\t\t 10.0\t\t    10.0");      
        }
        else{
            System.out.println("Carry bag : No\t\t\t\t\t 0.0\t\t0.0");
        }
        System.out.println("GST(10%):\t\t\t\t\t"+gst+"\t\t    "+gst);
        System.out.println("-----------------------------------------------------------------------------");
        finalprice=actualprice+10+gst;
        finalprice1=total_bill1+gst;
        System.out.println("\t\t\t\t\t\t"+finalprice+"\t\t    "+finalprice1);
        System.out.println("\n");
        System.out.println("\t\t\t\tThank You");
        System.out.println("\t\t\t\tTo Visit");
        System.out.println("\t\t\t\t  Dmart");
        System.out.println("-----------------------------------------------------------------------------");



    
    }
}
