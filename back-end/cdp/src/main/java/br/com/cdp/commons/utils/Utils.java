package br.com.cdp.commons.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import br.com.cdp.commons.exception.GlobalException;

@SuppressWarnings("all")
public class Utils {

  private static final String DIRETORIO_BASE = System.getProperty("diretorio_base");

  private Utils() {}

  /**
   * A common method for all enums since they can't have another base class
   * 
   * @param <T> Enum type
   * @param enumClass enum type. All enums must be all caps.
   * @param enumString case insensitive
   * @return corresponding enum, or null
   */
  public static <T extends Enum<T>> T getEnumFromString(Class<T> enumClass, String enumString) {
    if (enumClass != null && enumString != null) {
      try {
        return Enum.valueOf(enumClass, enumString.trim().toUpperCase());
      } catch (IllegalArgumentException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * Faz a conversão de uma data String para Timestamp
   * 
   * @param data String da data a ser convertida.
   * @param formatoData String de formato da data. Ex.: "dd/MM/yyyy hh:mm:ss"
   * @return timestamp
   */
  public static Timestamp converteStringEmTimestamp(String data, String formatoData) {
    try {
      SimpleDateFormat dateFormat = new SimpleDateFormat(formatoData);
      Date parsedDate = dateFormat.parse(data);
      Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
      return timestamp;
    } catch (Exception e) {
      throw new GlobalException(e.getMessage());
    }

  }

  /**
   * Faz o download do arquivo solicitado, que já existe previamente na pasta de downloads
   * 
   * @param nomeArquivo
   * @return ResponseEntity<byte[]>
   */
  public static ResponseEntity<byte[]> downloadArquivo(String nomeArquivo) {
    ResponseEntity<byte[]> respEntity = null;
    final File arquivo = new File(DIRETORIO_BASE + "/downloads/" + nomeArquivo);

    if (arquivo.exists()) {
      try (InputStream inputStream = new FileInputStream(arquivo)) {

        String type = URLConnection.guessContentTypeFromName(nomeArquivo);

        if (type == null) {
          type = "application/octet-stream";
        }

        final byte[] out = new byte[inputStream.available()];
        inputStream.read(out);

        final HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + nomeArquivo);
        responseHeaders.setContentType(MediaType.parseMediaType(type));

        return new ResponseEntity<>(out, responseHeaders, HttpStatus.OK);

      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

}
