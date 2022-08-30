package printer;

import document.Branch;
import document.Document;
import document.Leaf;
import document.Node;
import logger.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe de implementação da interface {@link Printer}. Percorre a árvore do documento por nível
 * e imprime o texto de cada um dos nós do tipo {@link Leaf} percorridos.
 */
public class ByLevelPrinter implements Printer {

  private Logger logger;

  public ByLevelPrinter() {
    this.logger = Logger.getInstance();
  }

  public void print(Document document) {
    this.logger.logMessage("Bylevel preorder print!");

    final Long initialTime = System.nanoTime();

    final Node node = document.getRoot();

    printLevel(node == null ? null : Arrays.asList(node), 0);

    final Long finalTime = System.nanoTime();
    final Long executionTime = (finalTime - initialTime) / 1000000;
    this.logger.logMessage("Bylevel print finalizado! - Tempo transcorrido: " + executionTime.toString() + "ms");
  }

  private void printLevel(List<Node> nodes, Integer level) {
    List<Node> nextLevel = new ArrayList<>();

    if (nodes == null || nodes.size() == 0) {
      return;
    }

    this.logger.logMessage("Acessou nível " + level + " do documento");

    nodes.stream().forEach(node -> {
      if (node instanceof Leaf) {
        this.logger.logMessage("  Acessou nó do tipo Folha " + node.getName());
        System.out.print(((Leaf) node).getText());
      } else {
        this.logger.logMessage("  Acessou nó do tipo Branch " + node.getName());
        nextLevel.addAll(((Branch) node).getChildrens());
      }
    });

    printLevel(nextLevel, level + 1);
  }
}
