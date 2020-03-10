import java.io.FileWriter;
import java.io.IOException;

public class DreamSense {

  private static String index;
  private static String tickercontent;
  private static String rules;
  private static StringBuilder sb;
  private static String NL = "\n";

  public DreamSense() {

  }

  public void init() {
    index = "ds.html";
    tickercontent = "tickercontent.txt";
    rules = "rules.html";
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

  private String[] quotes = {
    "Never forget who you are and what you can do.",
    "Look before you leap.",
    "Not all simple solutions are the right solution.",
    "Don't let your heart get in the way of your brain.",
    "If you don't think something matters, think again.",
    "Before you react, think to yourself one thing. Is it really worth it?",
    "If something feels like it's too good to be true, it most likely is.",
    "Follow your gut.",
    "Admitting you're wrong is not a sign of weakness.",
    "If someone is talking, don't interrupt them.",
    "It's not over until you're dead, and even then it's not over.",
    "The moment you take to look behind you is a second taken away from the end goal.",
    "Don't act differently when you think no one is watching.",
    "Keep track of your good days.",
    "If you keep telling yourself you aren't good enough, you will eventually believe it.",
    "There is no backspace key or white out when it comes to life. There is a learn and move forward option.",
    "Try your hardest. Try your best.",
    "Sometimes the bad guy gets away.",
    "Life doesn't have a pause button.",
    "If you think you are better than someone else, think again.",
    "Don't be a lemming.",
    "If you have something to say, say it. Before it's too late.",
    "Don't laugh at the wrong time. You'll only look like a fool.",
    "Selfish desires rarely lead to gold.",
    "Don't dance with the devil.",
    "You can't snooze through life.",
    "Being obsessed doesn't make you right.",
    "Don't say you're sorry when you have nothing to be sorry for.",
    "A conversation with yourself can lead to confusion.",
    "Never surrender if the cause is righteous.",
    "Fight for what you believe in.",
    "Sometimes you have to explain something over again until it sticks!",
    "Be positive. Think happy thoughts.",
    "Let's not dwell on all the things meant to be seen as stupid mediocrity."
  };

  public String createIndex() {
    sb.setLength(0);
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

  public String createRulesPage() {
    sb.setLength(0);
    sb.append("<!doctype html>");
    sb.append("<html>");
    sb.append("<head>");
    sb.append("<title>DreamSense</title>");
    sb.append("<style>body {background-color:#000; color:#fff; font-family:ariel, helvetica, sans-serif; font-size:16pt;} a {color:#fff}</style>");
    sb.append("</head>");
    sb.append("<body>");
    sb.append(text("h1", "DreamSense"));
    sb.append(text("h2", "Rules"));
    sb.append("<ol>");
    for (String line : quotes) {
      sb.append(text("li", line));
    }
    sb.append("</ol>");
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

  public String text(String element, String clazz, String t) {
    return "<" + element + " class=\"" + clazz + "\">" + t + "</" + element + ">";
  }

  public String elem(String element) {
    return "<" + element + "/>";
  }

  public String link(String page, String text) {
    return "<a href=\"" + page + "\">" + text + "</a>";
  }

  public String createTickerContent() {
    sb.setLength(0);
    sb.append("<div>");
    for (String line : quotes) {
      sb.append(text("div", "message", line));
      sb.append("\n");
    }
    sb.append("</div>");

    return sb.toString();
  }

  public void writeFile(String filename, String content) {
    try {
      FileWriter myWriter = new FileWriter(filename);
      myWriter.write(content);
      myWriter.close();
      System.out.printf("Successfully wrote to the file [%s].%n", filename);
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    DreamSense ds = new DreamSense();
    ds.init();
    String idx = ds.createIndex();
    ds.writeFile(index, idx);

    String q = ds.createTickerContent();
    ds.writeFile(tickercontent, q);

    String r = ds.createRulesPage();
    ds.writeFile(rules, r);
  }
}
