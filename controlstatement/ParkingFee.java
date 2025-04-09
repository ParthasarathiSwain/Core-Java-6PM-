class ParkingFee{
	public static void main(String args[]){
           int hours=4;
           if(hours<=1){
		System.out.println("Parking Fee 10/- ");
           }else if(hours>1 && hours<=2){
		System.out.println("Parking Fee 20/- ");
           }else if(hours>2 && hours<=3){
		System.out.println("Parking Fee 30/- ");
           }else if(hours>3 && hours<=6){
		System.out.println("Parking Fee 50/- ");
           }else{
		System.out.println("Parking Fee 100/- ");
           }



        }
}