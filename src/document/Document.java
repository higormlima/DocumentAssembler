package document;

/**
 * Classe de abstração de um Documento
 */
public class Document {

  /**
   * Nó raiz do documento
   */
  private Node root;

  public Document() {
    this.root = null;
  }

  public Document(Node root) {
    this.root = root;
  }

  public Node getRoot() {
    return this.root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }
}
