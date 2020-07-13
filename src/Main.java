import java.io.File;
//Im sorry for the terrible code
public class Main {
	
	public static void main(String [] args) {
		
		Runtime rt = Runtime.getRuntime();
		String path ="./";
		File folder = new File(path);
		
		System.out.println(folder);
		
		System.out.println(folder.exists());
		String[] listOfFiles = folder.list();
		
		
		
		try
        { 
            
			String command = "at9tool -e -d ";
			for(int i =0;i<listOfFiles.length;i++) {
				command+=listOfFiles[i]+" ";
				
				command+=listOfFiles[i].substring(0,5)+".wav";
				//System.out.println(command);
				Process p1= rt.exec("cmd /c start cmd.exe /K \" "+ command+" \"");
				p1.waitFor();
				command = "at9tool -e -d ";
			}
			
           

  
        } 
		catch(Exception e){
			
			System.out.println("Something went wrong.");
			e.printStackTrace();
		}
	}
	
	
	public static void listFiles(String[] fileList) {
		
		
	}

}
