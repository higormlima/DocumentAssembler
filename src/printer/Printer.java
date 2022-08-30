package printer;

import document.Document;

/**
 * Interface para classes responsáveis por imprimir conteúdo de um {@link document.Document}
 */
public interface Printer {

  /**
   * Método responsável por imprimir conteúdo de um documento
   *
   * @param document documento no qual deve ser printado
   */
  void print(Document document);


}
