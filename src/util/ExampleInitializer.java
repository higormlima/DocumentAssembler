package util;

import document.Branch;
import document.Document;
import document.Leaf;
import document.Node;

import java.util.Arrays;

/**
 * Classe auxiliar para inicializar alguns exemplos de Documentos previamente criados
 */
public class ExampleInitializer {

  /**
   * Função para retornar documento vazio
   *
   * @return documento vazio
   */
  public static Document emptyDocument() {
    return new Document();
  }

  /**
   * Função para retornar documento com algumas folhas e ramos
   *
   * @return retorna documento preenchido
   */
  public static Document exampleOne() {

    Branch root = new Branch("a");
    Branch b = new Branch("b");
    Node c = new Leaf("c", "C");
    Node d = new Leaf("d", "D");

    Node e = new Leaf("e", "E");
    Node f = new Leaf("f", "F");

    b.setChildrens(Arrays.asList(e, f));
    root.setChildrens(Arrays.asList(b, c, d));

    return new Document(root);
  }
}
