import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Lakis");
		lista.add("Takis");
		lista.add("Makis");
		
		File f = new File("source.html");
		BufferedWriter bw;
		try {

			bw = new BufferedWriter(new FileWriter(f));
			bw.write("<html>");
			bw.write("<body>");
			bw.write("<center>");
			bw.write("<h1>My family</h1>");
			bw.write("<h2>");
			for(String s:lista) {
				                        // HTML SPACE
//				bw.write("<p>"+s.getId()+"&nbsp;&nbsp;"+s.getName()+"</p>");
				bw.write("<p>"+s+"</p>");
			}
			bw.write("</h2>");
			bw.write("</center>");
			bw.write("</body>");
			bw.write("</html>");
			bw.close();
			Desktop.getDesktop().browse(f.toURI());
		}catch(IOException e) {
			
		}
		
		
		
		
		

	}

}
