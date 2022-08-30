package document;

/**
 * Classe de abstração de um nó da árvore de um {@link Document}
 */
public class Node {

  /**
   * Nome de identificação do nó
   */
  private String name;

  public Node(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
