public class Binary{
	//instance variables
	int theNumbers[] = new int[] {1,2,5,6,9,12,14,19};
	int size = 8;
	int location;
	boolean missing = true;
		//methods
	int binarySearch (int findThis){
		int low = 0;
		int high = size -1;

		while(high >- low) {
			int middle = (low + high) /2;

			if(theNumbers[middle]== findThis){
				//System.out.println(middle);
				missing = false;
				location = middle;
			} 
			else if(theNumbers[middle] < findThis){
				low = middle +1;
			}
			else if(theNumbers[middle] > findThis){
				high = middle -1;
			}
			else {
				return 0;
			}			
		}
		if(missing==false){
			System.out.println("found in position "+ location);
			return 0;
		}else{
			System.out.println("not found");			
			return 0;
		}
	}
}