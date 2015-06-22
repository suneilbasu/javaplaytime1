public class Linear{
	//instance variables
	int theNumbers[] = new int[] {1,2,5,6,9,12,14,19};
	int location;
	boolean missing = true;
	//method
	int look(int findThis){
		for(int n=0; n < theNumbers.length; n++){
			if(findThis==theNumbers[n]){
				missing = false;
				location = n;
			}
		}
		if(missing==false){
				System.out.println("found in position "+location);
		} else {
			System.out.println("not found");
		}
	return 0;		
	}
}