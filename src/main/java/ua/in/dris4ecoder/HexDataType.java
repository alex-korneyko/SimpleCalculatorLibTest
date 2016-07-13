package ua.in.dris4ecoder;

import ua.in.dris4ecoder.SimpleCalculator.ValueParser;

/**
 * Created by Alex Korneyko on 13.07.2016 10:10.
 */
public class HexDataType implements ValueParser {
    @Override
    public double parse(String s) throws NumberFormatException {
        return Integer.parseInt(s, 16);
    }

    @Override
    public String getString(double v) {
        return "";
    }

    @Override
    public void setPrecision(int i) {

    }

    @Override
    public char dataTypeIdentitySymbol() {
        return 'h';
    }
}
