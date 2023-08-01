package bmr.calculator.formulas;

import java.math.BigDecimal;

import bmr.calculator.Printer;

public class MifflinStJeorFormula implements FormulaCalculator {

  private static final String NAME = "Mifflin-St Jeor Formula";
  private final Printer printer;

  public MifflinStJeorFormula(Printer printer) {
    this.printer = printer;
  }

  @Override
  public BigDecimal calculate(boolean isMale, BigDecimal weightInKg, BigDecimal heightInCm, BigDecimal ageInYears) {
    //    Men: (10 × weight in kg) + (6.25 × height in cm) - (5 × age in years) + 5
    //    Women: (10 × weight in kg) + (6.25 × height in cm) - (5 × age in years) - 161
    BigDecimal mod = isMale ? new BigDecimal("5") : new BigDecimal("-161");
    BigDecimal value = BigDecimal.TEN.multiply(weightInKg)
        .add(new BigDecimal("6.25").multiply(heightInCm))
        .subtract(new BigDecimal("5").multiply(ageInYears))
        .add(mod);
    print(value);
    return value;
  }

  @Override
  public void print(BigDecimal value) {
    printer.printKcal(NAME, value.toPlainString());
  }
}
