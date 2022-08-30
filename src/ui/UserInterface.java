package ui;

import document.Branch;
import document.Leaf;
import service.DocumentService;

import java.util.Scanner;

public class UserInterface {

  private Scanner scanner;
  private DocumentService documentService;

  public UserInterface() {
    this.scanner = new Scanner(System.in);
    this.documentService = new DocumentService();
  }

  public void init() {
    Scanner scanner = new Scanner(System.in);

    Boolean running = true;

    System.out.println("=== Document Assembler ===");

    while (running) {
      System.out.println("Digite o número referente a ação que você gostaria de fazer:");
      System.out.println("1 - Criar novo documento");
      System.out.println("2 - Finalizar aplicação");
      getUserCommand();
    }
  }

  private void getUserCommand() {
    String command = this.scanner.nextLine();

    switch (command) {
      case "1":
        criaNovoDocumento();
        break;
      case "2":
        finalizarAplicacao();
    }

  }


  private void criaNovoDocumento() {
    System.out.println("Qual o tipo de raiz? 1 (leaf) 2 (branch)?");
    final String rootType = this.scanner.nextLine();

    switch (rootType) {
      case "1":
        System.out.println("Digite o nome da folha:");
        final String leafName = this.scanner.nextLine();
        System.out.println("Digite o texto da folha:");
        final String leafText = this.scanner.nextLine();
        this.documentService.createDocument(new Leaf(leafName, leafText));
        System.out.println("Documento criado com sucesso!");
        break;
      case "2":
        System.out.println("Digite o nome do ramo:");
        this.documentService.createDocument(new Branch(this.scanner.nextLine()));
        System.out.println("Documento criado com sucesso!");
        break;
      default:
        System.out.println("Comando inválido - Não foi possível cria um novo documento");
        break;
    }
  }

  private void finalizarAplicacao() {
    this.scanner.close();
    System.out.println("Aplicação finalizada!");
    System.exit(0);
  }
}
