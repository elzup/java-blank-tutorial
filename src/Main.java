import java.io.*;
import java.util.ArrayList;

public class Main {

  static String readLine5(File file) {

    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      for (int j = 0; j < 4; j++) {
        br.readLine();
      }
      return br.readLine();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return "File read Error.";
  }

  public static void main(String[] args) {

    String path = System.getProperty("user.dir");
//    String path = "/Users/hiro/tmp/csv-merge";

    File dir = new File(path);
    File[] files = dir.listFiles();


    ArrayList<String> lines = new ArrayList<>();
    for (int i = 0; i < files.length; i++) {
      File file = files[i];
      if (file.isDirectory()) {
        continue;
      }
      String[] ws = file.getName().split("\\.");
      if (ws.length == 0) {
        continue;
      }
      String ext = ws[ws.length - 1];
      if ("csv".equals(ext)) {
        String line = readLine5(file);
        lines.add(line);
        System.out.println(file.getName());
      }
    }
    File outFile = new File(dir + "/csv-merge-result.txt");

    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
      PrintWriter pw = new PrintWriter(bw);
      for (int i = 0; i < lines.size(); i++) {
        pw.println(lines.get(i));
      }
      pw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
