
public class bubbleSort1 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextIO.readFile("randomNumbers.txt");
		int[] randArray = new int[20];
		
		for (int i = 0; i < randArray.length; i++) {
			randArray[i] = TextIO.getlnInt();
			System.out.println(randArray[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		int tempIndex;
		int low;
		for(int i = 0; i < randArray.length - 1; i++) {
			tempIndex = i;
			low = randArray[i];
			for(int p = i+1; p < randArray.length; p++) {	
				if(randArray[p] < low) {
					low = randArray[p];		
					tempIndex = p;
				}
				
			}
			randArray[tempIndex] = randArray[i];
			randArray[i] = low;
		}
		//int temp;
		//	for(int i = 1; i < randArray.length; i++) {
		//		temp = randArray[i];
		//		for(int p = i-1; p < randArray.length; p++) {					
		//			if(randArray[p] < temp) {
		//				 temp = randArray[p];						
		//			}
		//			randArray[p] = randArray[i];
		//			randArray[i] = temp;
		//		}		
		//	}
		
		for (int i = 0; i < randArray.length; i++) {
			System.out.println(randArray[i]);
		}
	}

}
