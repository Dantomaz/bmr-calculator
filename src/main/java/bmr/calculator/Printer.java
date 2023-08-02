package bmr.calculator;

public class Printer {

  public void printKcal(String name, String value) {
    System.out.println(name + ": " + value + " kcal");
  }

  public void welcomePrompt() {
    System.out.println();
    System.out.println("<<<<< KALKULATOR PODSTAWOWEJ PRZEMIANY MATERII >>>>>");
    System.out.println("<<<<<    (BASAL METABOLIC RATE CALCULATOR)     >>>>>");
  }

  public void genderPrompt() {
    System.out.println();
    System.out.print("Jesteś mężczyzną? (tak/nie): ");
  }

  public void weightPrompt() {
    System.out.println();
    System.out.print("Podaj wagę w kg: ");
  }

  public void heightPrompt() {
    System.out.println();
    System.out.print("Podaj wzrost w cm: ");
  }

  public void agePrompt() {
    System.out.println();
    System.out.print("Podaj wiek w latach: ");
  }

  public void activityPrompt() {
    System.out.println();
    System.out.print("""
        Jaki jest twój poziom aktywności fizycznej w skali 1-2? Oto pewne wytyczne:
        - Leżący w łóżku (1,1) - osoba, która z różnych przyczyn (np. zdrowotnych)
            praktycznie nie rusza się w ciągu doby
        - Mało aktywny (1,2) - osoba, która nie trenuje i ma pracę siedzącą (np. biurową)
        - Umiarkowanie aktywny (1,225 - 1,375) - osoba, która ma pracę siedzącą i trenuje
            2-3 razy w tygodniu, lub osoba, która nie trenuje, ale ma fizyczny lub
            intensywny charakter pracy (np. kelnerka)
        - Aktywny (1,4 - 1,55) - osoba, która ma pracę siedzącą i trenuje 4-5 razy w
            tygodniu, lub osoba, która nie trenuje, ale ma ciężką pracę fizyczną
            (np. prace spawalnicze lub wykonywane na wysokości)
        - Bardzo aktywny (1,6 - 1,7) - osoba, która ma pracę fizyczną i dodatkowo trenuje
            2-3 razy w tygodniu
        - Niezwykle aktywny (1,725 - 1,8) - osoba, która ma pracę fizyczną i oprócz tego
            intensywnie trenuje 3-4 razy w tygodniu
        - Sport wyczynowy (1,85) - osoba, która wykonuje od kilku do kilkunastu jednostek
            treningowych w ciągu tygodnia, sport jest jej pracą
        - Sport ekstremalny (1,9) - osoba, której pracą jest sport, dodatkowo jest bardzo
            aktywna w ciągu reszty dnia
        
        Podaj swój aktualny poziom aktywności (z przecinkiem):\s""");
  }

  public void bmrPrompt() {
    System.out.println();
    System.out.println();
    System.out.println("Podstawowa przemiana materii (nie uwzględnia poziomu aktywności fizycznej):");
    System.out.println();
  }

  public void dailyKcalPrompt() {
    System.out.println();
    System.out.println();
    System.out.println("Dzienne zapotrzebowanie kaloryczne dla utrzymania masy ciała:");
    System.out.println();
  }

  public void exitPrompt() {
    System.out.println();
    System.out.println("Naciśnij dowolny klawisz aby wyjść...");
  }
}
