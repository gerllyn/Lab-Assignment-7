public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        System.out.println("Creating a PDF Document prototype.");
        pdfPrototype = new PdfDocument("annual_report_2024.pdf", "Acme Corp", 150, "Annual Report");

        System.out.println("Creating a Text Document prototype.");
        textPrototype = new TextDocument("meeting_notes.txt", "UTF-8", 250);

        System.out.println("Creating a Spreadsheet Document prototype.");
        spreadsheetPrototype = new SpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
    }

    public Document getDocument(String type) {
        if (type.equalsIgnoreCase("PDF")) {
            return pdfPrototype.clone();
        } else if (type.equalsIgnoreCase("Text")) {
            return textPrototype.clone();
        } else if (type.equalsIgnoreCase("Spreadsheet")) {
            return spreadsheetPrototype.clone();
        }
        return null;
    }
}
