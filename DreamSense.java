import java.io.FileWriter;
import java.io.IOException;

public class DreamSense {

  private static String index;
  private static StringBuilder sb;
  private static String NL = "\n";

  public DreamSense() {

  }

  public void init() {
    index = "ds.html";
    sb = new StringBuilder();
  }

  private String[] poetry = {
    "Life had little meaning",
    "It was difficult to understand",
    "Nothing made any sense",
    "Yet here we stood on solid ground",
    "If only we looked up to the stars",
    "From time to time, we might",
    "Understand all that is around us",
    "Nothing would matter",
    "Nothing would care",
    "If only we understood bravery",
    "Instead of looking at thin air",
    "Life doesn't understand",
    "What's going on in itself",
    "Simplification and grasping for straws",
    "We all end up here somewhere"
  };

  public String createIndex() {
    sb.append("<!doctype html>");
    sb.append("<html>");
    sb.append("<head>");
    sb.append("<title>DreamSense</title>");
    sb.append("<style>body {background-color:#000; color:#fff; font-family:ariel, helvetica, sans-serif; font-size:16pt; text-align:center;} a {color:#fff}</style>");
    sb.append("</head>");
    sb.append("<body>");
    sb.append(text("h1", "DreamSense"));
    sb.append(text("h2", "Poetry of the dream"));
    for (String line : poetry) {
      sb.append(text("p", line));
    }
    sb.append(elem("hr"));
    sb.append(text("address", "Copyright &copy; 2020 Kyle Eggleston"));
    sb.append(text("p", link("index.html", "home")));
    sb.append("</body>");
    sb.append("</html>");

    return sb.toString();
  }

  public String text(String element, String t) {
    return "<" + element + ">" + t + "</" + element + ">";
  }

  public String elem(String element) {
    return "<" + element + "/>";
  }

  public String link(String page, String text) {
    return "<a href=\"" + page + "\">" + text + "</a>";
  }

  public void writeIndex(String filename, String content) {
    try {
      FileWriter myWriter = new FileWriter(filename);
      myWriter.write(content);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    DreamSense ds = new DreamSense();
    ds.init();
    String idx = ds.createIndex();
    ds.writeIndex(index, idx);
  }
}
