
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Buffer_reader {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter writer=new BufferedWriter(new FileWriter("Output.txt"));
			
			writer.write("this is the first file");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}

}
