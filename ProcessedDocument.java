public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdfDoc = registry.getDocument("PDF");
        pdfDoc.open();
        System.out.println("Type: " + pdfDoc.getType() + ", File: " + ((PdfDocument) pdfDoc).getFileName() + ", Author: " + ((PdfDocument) pdfDoc).getAuthor() + ", Pages: " + ((PdfDocument) pdfDoc).getPageCount());

        Document textDoc = registry.getDocument("Text");
        textDoc.open();
        System.out.println("Type: " + textDoc.getType() + ", Path: " + ((TextDocument) textDoc).getFilePath() + ", Encoding: " + ((TextDocument) textDoc).getEncoding() + ", Words: " + ((TextDocument) textDoc).getWordCount());

        Document spreadsheetDoc = registry.getDocument("Spreadsheet");
        spreadsheetDoc.open();
        System.out.println("Type: " + spreadsheetDoc.getType() + ", Name: " + ((SpreadsheetDocument) spreadsheetDoc).getSpreadsheetName() + ", Rows: " + ((SpreadsheetDocument) spreadsheetDoc).getRowCount() + ", Columns: " + ((SpreadsheetDocument) spreadsheetDoc).getColumnCount());

        Document anotherPdfDoc = registry.getDocument("PDF");
        ((PdfDocument) anotherPdfDoc).setFileName("summary_report.pdf");
        ((PdfDocument) anotherPdfDoc).setPageCount(30);
        anotherPdfDoc.open();
    }
}