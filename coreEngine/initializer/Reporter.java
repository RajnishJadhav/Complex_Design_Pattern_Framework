package initializer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reporter {
	public static String screenCapture(WebDriver driver,String emulation) throws IOException {

		TakesScreenshot takeSS = (TakesScreenshot) driver;

		File sourceOutputFile = takeSS.getScreenshotAs(OutputType.FILE);
		File Dest = new File("./Screenshot/"+emulation+".png");
		FileUtils.copyFile(sourceOutputFile, new File("./Screenshot/"+emulation+".png"));
		String errflpath = Dest.getAbsolutePath();
		return errflpath;
	}

}
