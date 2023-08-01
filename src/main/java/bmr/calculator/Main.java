package bmr.calculator;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import bmr.calculator.formulas.AverageCalculator;
import bmr.calculator.formulas.HarrisBenedictFormula;
import bmr.calculator.formulas.HarrisBenedictFormulaRevised;
import bmr.calculator.formulas.MifflinStJeorFormula;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Printer printer = new Printer();
    MifflinStJeorFormula mifflinStJeorFormula = new MifflinStJeorFormula(printer);
    HarrisBenedictFormula harrisBenedictFormula = new HarrisBenedictFormula(printer);
    HarrisBenedictFormulaRevised harrisBenedictFormulaRevised = new HarrisBenedictFormulaRevised(printer);
    AverageCalculator averageCalculator = new AverageCalculator(printer);

    printer.welcomePrompt();
    printer.genderPrompt();
    boolean isMale = scanner.nextLine().equalsIgnoreCase("y");
    printer.weightPrompt();
    BigDecimal weightInKg = scanner.nextBigDecimal();
    printer.heightPrompt();
    BigDecimal heightInCm = scanner.nextBigDecimal();
    printer.agePrompt();
    BigDecimal ageInYears = scanner.nextBigDecimal();

    printer.resultPrompt();
    BigDecimal value1 = mifflinStJeorFormula.calculate(isMale, weightInKg, heightInCm, ageInYears);
    BigDecimal value2 = harrisBenedictFormula.calculate(isMale, weightInKg, heightInCm, ageInYears);
    BigDecimal value3 = harrisBenedictFormulaRevised.calculate(isMale, weightInKg, heightInCm, ageInYears);
    averageCalculator.calculate(List.of(value1, value2, value3));
  }
}
