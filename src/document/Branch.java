package document;

import java.util.List;

/**
 * Classe de abstração de um nó de um {@link Document} do tipo Branch
 */
public class Branch extends Node {

  /**
   * Nós filhos
   */
  private List<Node> childrens;

  public Branch(String name) {
    super(name);
  }

  public void addChild(Node child) {
    this.childrens.add(child);
  }

  public List<Node> getChildrens() {
    return this.childrens;
  }

  public void setChildrens(List<Node> childrens) {
    this.childrens = childrens;
  }
}