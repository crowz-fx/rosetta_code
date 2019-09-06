import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * Task - https://rosettacode.org/wiki/HTTPS
 * 
 * @author Lui Crowie
 */
public class HTTPS {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String website = "https://sourceforge.net";
		
		URL url = new URL(website);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		Scanner input = new Scanner(connection.getInputStream());
		
		input.forEachRemaining((line) -> {
			System.out.println(line);
		});
		
		input.close();
		connection.disconnect();
	}

}
