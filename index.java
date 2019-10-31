package practice;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {1,2,3,4,5,6};
		for(int i=0; i<=num.length; i++){
			if(num[i]==5){
				System.out.println("Number is found at index:"+ i);
				break;
			}
//			else{
//				System.out.println("Number not found");
//			}
		}

	}

}
