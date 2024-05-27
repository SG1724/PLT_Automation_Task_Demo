package Demo.PLT_Automation_Task.testbase;

import Demo.PLT_Automation_Task.propertyreader.PropertyReader;
import Demo.PLT_Automation_Task.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility{
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}

