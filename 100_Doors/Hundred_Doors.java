/**
 * Task - https://rosettacode.org/wiki/100_doors
 * 
 * @author Lui Crowie
 */
public class Hundred_Doors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// zero-index array, hence + 1 to total
		boolean[] doors = new boolean[101];
		
		for(int i = 1; i < doors.length; i++) {
			for(int j = i; j < doors.length; j += i) {
				doors[j] = !doors[j];
			}
		}
		
		for(int i = 1; i < doors.length; i++) {
			if(doors[i]) {
				System.out.println("Door " + i + " is open!");
			}
		}
	}

}
