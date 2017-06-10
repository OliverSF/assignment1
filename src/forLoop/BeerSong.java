/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
package forLoop;

public class BeerSong {

	public static void main(String[] args) {
		
		//Declare and initialize variables
		String word = "bottles";
		
		//Creating for loop
		for (int beerNum =99; beerNum >=1;){
			
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			
			beerNum = beerNum -1;
			
			//Creating condition for the occasion when there is only 1 bottle left on the wall
			if (beerNum ==1){
			word = "bottle";
			}
		
			if (beerNum > 0) {
			System.out.println(beerNum + " " + word + " of beer on the wall");
			}
			else {
			System.out.println("No more bottles of beer on the wall");
			/*Creating if else condition for the occasion when there are bottles on the wall 
			 *and when there are no more bottles are left on the wall
			 */
		
			}
		} //ending for loop
	} //ending main method
} //ending class
