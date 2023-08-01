package bmr.calculator;

public class Printer {

  public void printKcal(String name, String value) {
    System.out.println();
    System.out.println(name + ": " + value + " kcal");
  }

  public void welcomePrompt() {
    System.out.println();
    System.out.println("<<<<< BASAL METABOLIC RATE CALCULATOR >>>>>");
  }

  public void genderPrompt() {
    System.out.println();
    System.out.print("Calculate for male? (y/n): ");
  }

  public void weightPrompt() {
    System.out.println();
    System.out.print("Provide weight in kg: ");
  }

  public void heightPrompt() {
    System.out.println();
    System.out.print("Provide height in cm: ");
  }

  public void agePrompt() {
    System.out.println();
    System.out.print("Provide age in years: ");
  }

  public void resultPrompt() {
    System.out.println();
    System.out.println("Calculated values:");
  }
}
