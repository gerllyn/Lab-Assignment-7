public class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;
    private String name;

    public PdfDocument(String fileName, String author, int pageCount, String name) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
        this.name = name;
    }

    public PdfDocument clone() {
        return new PdfDocument(this.fileName, this.author, this.pageCount, this.name);
    }

    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
    }

    public String getType() {
        return "PDF";
    }

    public String getFileName() {
        return fileName;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getName() {
        return name;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
