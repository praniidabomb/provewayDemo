package constraints;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class ApplicationConstants {


    public static Map<Long, WebDriver> driverMap = new HashMap<Long, WebDriver>();
    public static Map<String, String> globalDataMap = new HashMap<String, String>();

    public static final String ADMIN_ACCOUNT_USERNAME = "raashi.kuna@mtxb2b.com.dbrri.qa";
    public static final String ADMIN_ACCOUNT_PASSWORD = "Raashikuna@888";
    public static final String AUTH_END_POINT = "https://dbrri--qa.sandbox.my.salesforce.com/services/Soap/u/55.0";
    public static final String SF_URL = "https://dbrri--qa.sandbox.lightning.force.com/lightning";
    public static final String SF_ADMIN = "praneeth.chukarapu+co@mtxb2b.com";
    public static final String SF_PASSWD = "Mtx@123456";
    public static final String SF_ADMIN2 = "raashi.kuna@mtxb2b.com.dbrri.qa";
    public static final String SF_PASSWD2 = "Raashikuna@888";

    public static final String SF_RIDOH = "neha.gautam+ridohinternaluser@mtxb2b.com";
    public static final String SF_RIDOHPASSWD = "MtxRI@1234";
    public static final String Portal_URL = "https://dbrri--qa.sandbox.my.site.com/ricannabis/";
    public static final boolean IS_EXECUTION_ON_JENKINS = true;
    public static String PARENTWINDOWID = "";
    public static String CURRENT_TIME_STAMP = "";
    public static boolean IS_SALESFORCE_LOGIN = true;
    public static String PORTAL = "";
    public static String Registered_Portal_Username = "nikhil.soni+automation@mtxb2b.com";
    public static String Registered_Portal_Password = "Mtx@12345678";

    public static final String TEMP_URL="https://dbrri--uat.sandbox.my.site.com/ricannabis/s/intake-application?sid=a0w3S000000ATRHQA4";

}
