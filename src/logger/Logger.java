package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Singleton para realizar registro de monitoramento da aplicação.
 */
public class Logger {

  /**
   * Caminho e nome do arquivo onde deve ser registrado os logs
   */
  private final String LOG_FILE_PATH = "log_file.txt";

  private static Logger instance;

  private PrintWriter writer;

  private Logger() {
    try {
      FileWriter fileWriter = new FileWriter(LOG_FILE_PATH);
      writer = new PrintWriter(fileWriter, true);
    } catch (IOException e) {
      System.out.println("Erro ao criar novo logger");
    }
  }

  /**
   * Método para retornar instância única
   */
  public synchronized static Logger getInstance() {
    if (instance == null) {
      instance = new Logger();
    }

    return instance;
  }

  /**
   * Escreve mensagem passada como parâmetro no arquivo de registro
   *
   * @param message mensagem para ser registrada
   */
  public void logMessage(String message) {
    String now = getDate();
    writer.println(now + " : " + message);
  }

  /**
   * Retorna data e horário atual no seguinte formato: ano/mês/dia hora:minutos:segundos
   *
   * @return data e horário formatado
   */
  private String getDate() {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime dateTime = LocalDateTime.now();
    return dateTimeFormatter.format(dateTime);
  }
}
