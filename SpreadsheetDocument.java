import java.lang.annotation.Documented;

public class SpreadsheetDocument implements Document {
    private String spreadsheetName;
    private int rowCount;
    private int columnCount;

    public SpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount) {
        this.spreadsheetName = spreadsheetName;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }

    public SpreadsheetDocument clone() {
        return new SpreadsheetDocument(this.spreadsheetName, this.rowCount, this.columnCount);
    }

    public void open() {
        System.out.println("Opening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
    }

    public String getType() {
        return "Spreadsheet";
    }

    public String getSpreadsheetName() {
        return spreadsheetName;
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }
}
