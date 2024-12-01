package today.opai.api.interfaces.modules.values;

import today.opai.api.interfaces.modules.Value;

public interface NumberValue extends Value<Double> {
    double getMinimum();

    double getMaximum();

    double getStep();

    NumberValue setSuffix(String s);
}
