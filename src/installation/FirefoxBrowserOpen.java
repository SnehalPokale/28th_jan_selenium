package installation;

import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserOpen {

public static void main(String[] args) {
	
	//	FirefoxDriver d=new FirefoxDriver();
	EdgeDriver e=new EdgeDriver();
	e.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&passive=1209600&ifkv=AQMjQ7TANQMj_s88ofpiHRImRL8Fv4tCTaNQUTbajLhtfnSU4o9RhErMnoTL54AOkUNtrWvA1YC75g&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//e.quit();
		//e.close();
}
}
