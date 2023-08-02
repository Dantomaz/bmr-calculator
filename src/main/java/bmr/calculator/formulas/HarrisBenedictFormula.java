package bmr.calculator.formulas;

import java.math.BigDecimal;

import bmr.calculator.Printer;

public class HarrisBenedictFormula implements FormulaCalculator {

  public static final String NAME = "Oryginalne równanie Harris-Benedict";
  private final Printer printer;

  public HarrisBenedictFormula(Printer printer) {
    this.printer = printer;
  }

  @Override
  public BigDecimal calculate(boolean isMale, BigDecimal weightInKg, BigDecimal heightInCm, BigDecimal ageInYears) {
    BigDecimal value = isMale
        ? calculateForMale(weightInKg, heightInCm, ageInYears)
        : calculateForFemale(weightInKg, heightInCm, ageInYears);
    print(value);
    return value;
  }

  private BigDecimal calculateForMale(BigDecimal weightInKg, BigDecimal heightInCm, BigDecimal ageInYears) {
//    Men: (13.7516 × weight in kg) + (5.0033 × height in cm) - (6.755 × age in years) + 66.473
    return (new BigDecimal("13.7516").multiply(weightInKg))
        .add(new BigDecimal("5.0033").multiply(heightInCm))
        .subtract(new BigDecimal("6.755").multiply(ageInYears))
        .add(new BigDecimal("66.473"));
  }

  private BigDecimal calculateForFemale(BigDecimal weightInKg, BigDecimal heightInCm, BigDecimal ageInYears) {
//    Women: (9.5634 × weight in kg) + (1.8496 × height in cm) - (4.6756 × age in years) + 655.0955
    return (new BigDecimal("9.5634").multiply(weightInKg))
        .add(new BigDecimal("1.8496").multiply(heightInCm))
        .subtract(new BigDecimal("4.6756").multiply(ageInYears))
        .add(new BigDecimal("655.0955"));
  }

  @Override
  public void print(BigDecimal value) {
    printer.printKcal(NAME, value.toPlainString());
  }
}
