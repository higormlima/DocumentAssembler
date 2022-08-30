package service;

import document.Document;
import document.Node;
import logger.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Serviço para manipulação de documentos
 */
public class DocumentService {

  private List<Document> documents;
  private Logger logger = Logger.getInstance();

  public DocumentService() {
    this.documents = new ArrayList<>();
  }

  public void createDocument(Node node) {
    documents.add(new Document(node));
    logger.logMessage("Novo documento criado");
  }
}
