package fetchTextFromImgOrPDF;

import java.io.IOException;

import com.testautomationguru.utility.PDFUtil;

public class TextFromPDF {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String pdfLocation = "C:\\Users\\dines\\OneDrive\\Desktop\\k\\bwKishoreSenthilkumarK.pdf";
		PDFUtil pdfUtil = new PDFUtil();
		String text = pdfUtil.getText(pdfLocation);

		System.out.println(text);
	}

}
