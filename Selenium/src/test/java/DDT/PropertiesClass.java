package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
	public static void main(String[]args) throws IOException {
	
		FileInputStream fis= new FileInputStream("./Config.properties");
     Properties property = new Properties();
     property.load(fis);
     System.out.println(property.getProperty("url"));
}
}