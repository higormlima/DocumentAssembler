package printer;

import document.Branch;
import document.Document;
import document.Leaf;
import document.Node;
import logger.Logger;

/**
 * Classe de implementação da interface {@link Printer}. Percorre a árvore do documento em Pré-Ordem
 * e imprime o texto de cada um dos nós do tipo {@link Leaf} percorridos.
 */
public class PreorderPrinter implements Printer {

  private Logger logger;

  public PreorderPrinter() {
    this.logger = Logger.getInstance();
  }

  public void print(Document document) {
    this.logger.logMessage("Iniciando preorder print!");

    final Long initialTime = System.nanoTime();

    final Node node = document.getRoot();

    printPreorder(node, 0);

    final Long finalTime = System.nanoTime();
    final Long executionTime = (finalTime - initialTime) / 1000000;
    this.logger.logMessage("Preorder print finalizado! - Tempo transcorrido: " + executionTime.toString() + "ms");
  }

  private void printPreorder(Node node, Integer depth) {
    if (node == null) {
      return;
    }

    if (node instanceof Leaf) {
      this.logger.logMessage("Acessou nó do tipo Folha '" + node.getName() + "': Profundidade - " + depth.toString());
      System.out.print(((Leaf) node).getText());
      return;
    }

    final Branch branch = (Branch) node;
    this.logger.logMessage("Acessou nó do tipo Branch '" + node.getName() + "': Profundidade - " + depth.toString());
    branch.getChildrens().stream().forEach(children -> {
      printPreorder(children, depth + 1);
    });
  }
}
