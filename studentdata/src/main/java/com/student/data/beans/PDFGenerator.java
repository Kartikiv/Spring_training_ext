package com.student.data.beans;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFGenerator {
	public static ByteArrayInputStream generatePdf() throws DocumentException, MalformedURLException, IOException {
	    String ARABIC="النقاط";
		Document document = new Document(PageSize.A4);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		PdfWriter writer = PdfWriter.getInstance(document, out);

		document.open();
		Font f = FontFactory.getFont("c:/windows/fonts/arial.ttf",BaseFont.IDENTITY_H, BaseFont.EMBEDDED,17.00f);
	    f.setStyle(Font.BOLD);
	    ColumnText column = new ColumnText(writer.getDirectContent());
	    column.setSimpleColumn(50, 850, 350, 50);
	    column.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
	    column.setAlignment(Element.TITLE);
	    column.addElement(new Paragraph(ARABIC, f));
	    column.go();
		
		
		
	

//		PdfContentByte canvas = writer.getDirectContent();
//		canvas.moveTo(document.getPageSize().getWidth() / 2, document.getPageSize().getHeight());
//		canvas.lineTo(document.getPageSize().getWidth() / 2, document.getPageSize().getHeight() / 1.18);
//		canvas.stroke();
//
//		canvas.moveTo(document.getPageSize().getWidth() / 2, document.getPageSize().getHeight() / 1.18);
//		canvas.lineTo(document.getPageSize().getWidth() / 1, document.getPageSize().getHeight() / 1.18);
//		canvas.stroke();
//		canvas.moveTo(document.getPageSize().getWidth() / 2, document.getPageSize().getHeight() / 1.18);
//		canvas.lineTo(0, document.getPageSize().getHeight() / 1.18);
//		canvas.stroke();
		Font font = FontFactory.getFont(FontFactory.COURIER, 14, BaseColor.BLACK);
		
       PdfContentByte para =writer.getDirectContent();
      
		
		
		Image img = new Image(Image.getInstance(
				"C:\\Users\\karth\\OneDrive\\Desktop\\Crop-Yield-Prediction-using-ML-master\\imgs\\input1.jpg")) {

		};
		img.setAbsolutePosition(5, document.top()-1.06f);
		
		img.setAlignment(Element.ALIGN_LEFT);
		img.setScaleToFitHeight(true);
		img.setScaleToFitLineWhenOverflow(true);
		img.scalePercent(3);
	
		
		document.add(img);
		document.addTitle("Drucare Invoice");
		PdfPTable table = new PdfPTable(2);
		Paragraph paragraph = new Paragraph();
		paragraph.setAlignment(Element.ALIGN_LEFT);
		paragraph.add(new Phrase("orgId: 1",f));
		paragraph.add(Chunk.NEWLINE);
		paragraph.add(new Phrase("name : Drucare",f));
		Paragraph paragraph2 = new Paragraph();
		List list = new List();

		paragraph2.setAlignment(Element.ALIGN_LEFT);
		paragraph2.add(new Phrase("Patient Name: kartik",f));
		paragraph2.add(Chunk.NEWLINE);
        paragraph2.add("Doctor : Dr Ram Mohan");
		paragraph2.add(Chunk.NEWLINE);
		paragraph2.add("Diagnosis: Asthama");
		paragraph2.add(Chunk.NEWLINE);
		paragraph2.add("Joined Date : " + java.time.LocalDate.now());
       paragraph2.add(list);
	   PdfPCell cell=new PdfPCell();
	   cell.addElement(paragraph);
	   PdfPCell cell1=new PdfPCell();
	   cell1.addElement(paragraph2);
	  
	   table.addCell(cell);
	   table.addCell(cell1);
	   table.setTotalWidth(document.getPageSize().getWidth()-50);
	   table.writeSelectedRows(0, -1, document.left()-1, document.top()-35,para);
	  PdfPTable table1=new  PdfPTable(4);
	  PdfPCell idCell=new PdfPCell(new Phrase("Service Id",f));
	  PdfPCell ServiceCell=new PdfPCell(new Phrase("Service Name",f));
	  PdfPCell quantiCell=new PdfPCell(new Phrase("Quantity",f));
	  PdfPCell priceCell=new PdfPCell(new Phrase("Price",f));
	  table1.addCell(idCell);
	  table1.addCell(ServiceCell);
	  table1.addCell(quantiCell);
	  table1.addCell(priceCell);
	  table1.setHeaderRows(4);
	 
	   table1.setTotalWidth(document.getPageSize().getWidth()-50);
	   for (int i=4;i<24;i++) {
		   table1.addCell(""+i);
		   table1.addCell(new Phrase("service"));
		   table1.addCell("1");
		   table1.addCell("120.01");
		   
	   }
	  table1.writeSelectedRows(0, -1, document.left()-1, document.top()-table.getTotalHeight()-45,para);
	 
		document.close();
		return new ByteArrayInputStream(out.toByteArray());
	}
}
	