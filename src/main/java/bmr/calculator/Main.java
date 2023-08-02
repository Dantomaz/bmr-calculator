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
    boolean isMale = scanner.nextLine().equalsIgnoreCase("tak");
    printer.weightPrompt();
    BigDecimal weightInKg = scanner.nextBigDecimal();
    printer.heightPrompt();
    BigDecimal heightInCm = scanner.nextBigDecimal();
    printer.agePrompt();
    BigDecimal ageInYears = scanner.nextBigDecimal();
    printer.activityPrompt();
    BigDecimal activity = scanner.nextBigDecimal();

    printer.bmrPrompt();
    BigDecimal bmr1 = mifflinStJeorFormula.calculate(isMale, weightInKg, heightInCm, ageInYears);
    BigDecimal bmr2 = harrisBenedictFormula.calculate(isMale, weightInKg, heightInCm, ageInYears);
    BigDecimal bmr3 = harrisBenedictFormulaRevised.calculate(isMale, weightInKg, heightInCm, ageInYears);
    averageCalculator.calculate(List.of(bmr1, bmr2, bmr3));

    printer.dailyKcalPrompt();
    BigDecimal dailyKcal1 = bmr1.multiply(activity);
    BigDecimal dailyKcal2 = bmr2.multiply(activity);
    BigDecimal dailyKcal3 = bmr3.multiply(activity);
    printer.printKcal(MifflinStJeorFormula.NAME, dailyKcal1.toPlainString());
    printer.printKcal(HarrisBenedictFormula.NAME, dailyKcal2.toPlainString());
    printer.printKcal(HarrisBenedictFormulaRevised.NAME, dailyKcal3.toPlainString());
    averageCalculator.calculate(List.of(dailyKcal1, dailyKcal2, dailyKcal3));

    printer.exitPrompt();
    scanner.nextLine();
    scanner.nextLine();
  }
}
