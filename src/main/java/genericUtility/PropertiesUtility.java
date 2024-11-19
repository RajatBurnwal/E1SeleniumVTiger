package genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * This is utility class to work with Properties file
 * @author rajat burnwal
 * @version 18.10.24
 */
public class PropertiesUtility {

	/**
	 * This is a generic method to fetch the data from Properties file
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public String getDataFromPropertiesFile(String key) throws Exception
	{
		FileInputStream fis=new FileInputStream(IPathConstant.propertiesPath);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}
}
