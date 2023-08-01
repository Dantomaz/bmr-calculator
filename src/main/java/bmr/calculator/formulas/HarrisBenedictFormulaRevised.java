package bmr.calculator.formulas;

import java.math.BigDecimal;

import bmr.calculator.Printer;

public class HarrisBenedictFormulaRevised implements FormulaCalculator {

  private static final String NAME = "Harris-Benedict formula revised by Roza and Shizgal";
  private final Printer printer;

  public HarrisBenedictFormulaRevised(Printer printer) {
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
//    Men: (13.397 × weight in kg) + (4.799 × height in cm) - (5.677 × age in years) + 88.362
    return (new BigDecimal("13.397").multiply(weightInKg))
        .add(new BigDecimal("4.799").multiply(heightInCm))
        .subtract(new BigDecimal("5.677").multiply(ageInYears))
        .add(new BigDecimal("88.362"));
  }

  private BigDecimal calculateForFemale(BigDecimal weightInKg, BigDecimal heightInCm, BigDecimal ageInYears) {
//    Women: (9.247 × weight in kg) + (3.098 × height in cm) - (4.330 × age in years) + 447.593
    return (new BigDecimal("9.247").multiply(weightInKg))
        .add(new BigDecimal("3.098").multiply(heightInCm))
        .subtract(new BigDecimal("4.330").multiply(ageInYears))
        .add(new BigDecimal("447.593"));
  }

  @Override
  public void print(BigDecimal value) {
    printer.printKcal(NAME, value.toPlainString());
  }
}
