package cdef;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test1 {
	

public Properties readprop () throws IOException {
	//read the configuration from properties file
	FileInputStream fis= new FileInputStream("src/test/resources/configtest.properties");
	Properties prop = new Properties();
	prop.load(fis);
	return prop;
	
}

}
