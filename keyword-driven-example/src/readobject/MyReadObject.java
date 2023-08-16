package readobject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyReadObject {
	Properties p = new Properties(); //predefine class
	public Properties getObjectRepository() throws IOException{
		InputStream stream = new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\objects\\objects.properties"));
		  //load all objects
		  p.load(stream);
		   return p;
	}
}
