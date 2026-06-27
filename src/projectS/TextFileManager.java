package projectS;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
//import java.nio.file.StandardOpenOption;
//import com.google.common.io.Files;

public class TextFileManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   String fileName = "AutoTextFile.txt";
	   
	   Path path = Paths.get(fileName);
	   
	   
	   try {
		   
		   List <String> linesToWrite = List.of(
				   
				   "Username: Aj",
				   "Password: VK@18",
				   "Role:  Administrator"
				   
				   );
		   
		   // write all lines
		   
	Files.write(path, linesToWrite);
        System.out.println("Test file written sucessfully at : "+ path.toAbsolutePath());		  
		
        
		   
		   
				   
	   }
	   
	   
	   catch(IOException e){
		   
		   System.out.println("error writing to file"+ e.getMessage());
		   
		   
	   }
	   
	   System.out.println();
	   
	   
	   // READING DATA
	   
	   
	   
	   
	   
	   

	}

}
