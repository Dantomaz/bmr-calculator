package bmr.calculator.formulas;

import java.math.BigDecimal;

public interface FormulaCalculator {

  BigDecimal calculate(boolean isMale, BigDecimal weightInKg, BigDecimal heightInCm, BigDecimal ageInYears);

  void print(BigDecimal value);
}
