package superset6419103.DesignPatternAndPrinciple.FactoryMethodPatternExample;

public class FactoryTest {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordFactory();

        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfFactory();

        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelfactory = new  ExcelFactory();

        Document excelDoc = excelfactory.createDocument();
        excelDoc.open();
    }
}
