package fetchTextFromImgOrPDF;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TextFromImg {

	public static void main(String[] args) throws TesseractException {
		// TODO Auto-generated method stub
		
		File imgFile = new File("C:\\Selenium_k\\jar\\Tess4J\\test\\resources\\test-data\\eurotext.png");
		ITesseract image = new Tesseract();
		image.setDatapath("C:\\Selenium_k\\jar\\Tessaract");
		image.setLanguage("eng");
		
		String str1 = image.doOCR(imgFile);
		System.out.println(str1);

	}

}
