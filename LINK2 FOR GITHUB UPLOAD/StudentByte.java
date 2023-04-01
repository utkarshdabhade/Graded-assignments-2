import java.io.FileInputStream;
import java.io.IOException;

public class StudentByte {
  public static void main(String[] args) {
    try {
      FileInputStream file1 = new FileInputStream("reportCard.csv");
      byte[] data1 = new byte[file1.available()];
      file1.read(data1);
      file1.close();
      String report = new String(data1);
      String[] lines = report.split("\n");
      for (int i = 1; i < lines.length; i++) {
        String[] values = lines[i].split(",");
        int rollNo = Integer.parseInt(values[0].trim());
        String name = values[1].trim();
        int science = Integer.parseInt(values[2].trim());
        int math = Integer.parseInt(values[3].trim());
        int socialScience = Integer.parseInt(values[4].trim());
        int lang1 = Integer.parseInt(values[5].trim());
        int lang2 = Integer.parseInt(values[6].trim());
        int total = science + math + socialScience + lang1 + lang2;
        System.out.println(name + " has obtained total marks = " + total);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
