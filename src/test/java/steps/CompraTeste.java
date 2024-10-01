package steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CompraTeste {

	WebDriver driver;
	ChromeOptions options = new ChromeOptions(); // É uma class do selenium
	// para adicionar alguns argumentos como opções

	@Test
	public void comprarAtivo() {
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("file:///C:/Users/admin/Desktop/hb/hb.html");
		driver.findElement(By.id("asset")).sendKeys("AAPL");
		driver.findElement(By.id("price")).sendKeys("25.00");
		driver.findElement(By.id("quantity")).sendKeys("10");
		driver.findElement(By.id("buy-button")).click();
		String saldoAtualizado = driver.findElement(By.id("balance")).getText();
		String carteiraAtualizada = driver.findElement(By.id("portfolio")).getText();
		assertEquals(saldoAtualizado, "R$9750.00");
		assertEquals(carteiraAtualizada, "AAPL: 10");
		driver.quit();
	}

	@Test
	public void comprarPrecoErrado() {
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("file:///C:/Users/admin/Desktop/hb/hb.html");
		driver.findElement(By.id("asset")).sendKeys("AAPL");
		driver.findElement(By.id("price")).sendKeys("2.00");
		driver.findElement(By.id("quantity")).sendKeys("10");
		driver.findElement(By.id("buy-button")).click();

		driver.switchTo().alert().getText();// capturar mensagem

		/*
		 * DESAFIO 1 Incluir um assert para validar o texto do alert Dados inválidos.
		 */

	}

	/*
	 * DESAFIO 2 ESTRUTURAR O PROJETO EM PACOTES DIFERENTES E CLASS COM
	 * RESPONSABILIDADES EXEMPLO: PACOTES: runner, drivers, metodos, elementos,
	 * steps etc Class: Executa, DriversFactory etc
	 */

	/*
	 * DESAFIO 3 INCLUIR EVIDÊNCIA DE TESTE | PRINT | commons io File takes |
	 * File.utils(CopyFile)
	 */
	
	/*Desafio 4 
	 * Comprar mais de um ativo 
	 * 
	 */

}
