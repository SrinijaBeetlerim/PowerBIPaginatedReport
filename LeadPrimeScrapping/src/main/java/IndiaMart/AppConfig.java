package IndiaMart;

public class AppConfig 
{
	public static String browserType = "webdriver.chrome.driver";
	//public static String browserPath = "../Leadprime Automation/Drivers/chromedriver.exe"; 
	public static String browserPath = "../LeadPrimeScrapping/Drivers/chromedriver.exe";
	public static String userCredentialsFilePath = "../LeadPrimeScrapping/LeadPrime Dependancy Files/IDMART Names & Pwds.xlsx";
	public static String indiaMartURL = "https://my.indiamart.com/";
    public static String userName = "7097895020";
    public static String password = "9669970040";
    //public static String productType  = "";
    public static String filePath = "../LeadPrimeScrapping/LeadPrime Dependancy Files/IndiaMart_Leads.xlsx";
    public static String leadPrimeCompanyID = "Bdmart";
    public static String leadPrimeUserNAme = "Test";
    public static String leadPrimePassword = "Welcome@123";
    public static String[] usersInLeadPrime = {"Sanjay H", "Supriya G"}; 
    public static String leadPrimeURL = "http://weblogin.leadprime.com/";
    public static String assignedUserForOutOfHYD = "Out of Station";
    public static String areaLocationsSheet = "../LeadPrimeScrapping/LeadPrime Dependancy Files/Area Locations.xlsx";
    public static String LeadPrimeStatus = "No";// No denotes that Both IndiaMart and LeadPrime applications run
}
