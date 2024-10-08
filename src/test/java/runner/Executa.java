package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.Drivers;

public class Executa extends Drivers{

	
	public static void iniciarTeste() {
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("file:///C:/Users/admin/Desktop/hb/hb.html");
	}

	public static void finalizarTeste() {
		driver.quit();
	}

}
