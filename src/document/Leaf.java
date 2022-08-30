package document;

/**
 * Classe de abstração de um nó de um {@link Document} do tipo Leaf
 */
public class Leaf extends Node {

  /**
   * Texto associado ao nó
   */
  private String text;

  public Leaf(String name, String text) {
    super(name);
    this.text = text;
  }

  public String getText() {
    return this.text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
