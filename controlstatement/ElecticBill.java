class ElecticBill{
   public static void main(String args[]){
       int unit=204;        
       int charges=0;

       if(unit<=100){
          charges=unit*2;
       }else if(unit>100 && unit<=200){
     	  charges=(100*2)+((unit-100)*3);
       }else if(unit>200 && unit<=300){
     	  charges=(100*2)+(100*3)+((unit-200))*5;
       }else{
	  charges=(100*2)+(100*3)+(100*5)+((unit-300))*10;
       }
       System.out.println("Charges : "+charges);
   }
}