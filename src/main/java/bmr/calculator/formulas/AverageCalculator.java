package bmr.calculator.formulas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import bmr.calculator.Printer;

public class AverageCalculator {

  private final static String NAME = "Average";
  private final Printer printer;

  public AverageCalculator(Printer printer) {
    this.printer = printer;
  }

  public void calculate(List<BigDecimal> values) {
    BigDecimal value = values.stream()
        .reduce(BigDecimal::add)
        .orElse(BigDecimal.ONE)
        .divide(new BigDecimal(values.size()), RoundingMode.HALF_UP);
    print(value);
  }

  public void print(BigDecimal value) {
    printer.printKcal(NAME, value.toPlainString());
  }
}
