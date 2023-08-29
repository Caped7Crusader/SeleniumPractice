package fetchTextFromImgOrPDF;

import java.io.IOException;

import com.testautomationguru.utility.PDFUtil;

public class ImgFromPdf {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String folderLocation = "C:\\Users\\dines\\Downloads\\New folder (2)";
		String pdfLocation = "C:\\Users\\dines\\OneDrive\\Desktop\\k\\KishoreSenthilkumarK.pdf";
		PDFUtil pdfUtil = new PDFUtil();
		pdfUtil.setImageDestinationPath(folderLocation);
		pdfUtil.extractImages(pdfLocation);
	}

}
