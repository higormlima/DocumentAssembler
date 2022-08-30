import document.Document;
import ui.UserInterface;
import util.ExampleInitializer;
import logger.Logger;
import printer.ByLevelPrinter;
import printer.PreorderPrinter;
import printer.Printer;


public class DocumentAssembler {

  public static void main(String[] args) {
    Logger logger = Logger.getInstance();

    logger.logMessage("Aplicação iniciada");

    logger.logMessage("Inicializando exemplos");

    System.out.println("Exemplos:");

    Document emptyDocument = ExampleInitializer.emptyDocument();
    Document exampleOne = ExampleInitializer.exampleOne();

    Printer preorderPrinter = new PreorderPrinter();
    Printer byLevelPrinter = new ByLevelPrinter();

    preorderPrinter.print(emptyDocument);
    preorderPrinter.print(exampleOne);

    System.out.println(" ");
    byLevelPrinter.print(emptyDocument);
    byLevelPrinter.print(exampleOne);
    System.out.println(" ");

    logger.logMessage("Finalizando exemplos");


    UserInterface userInterface = new UserInterface();
    userInterface.init();

    logger.logMessage("Aplicação finalizada");
  }
}
