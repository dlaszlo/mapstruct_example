package hu.dlaszlo.mapstruct;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class TargetC implements Serializable {
    private static final long serialVersionUID = -1857729068946301681L;

    private String a;
    private String b;
    private String c;
    private String e;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargetC targetC = (TargetC) o;
        return Objects.equals(a, targetC.a) && Objects.equals(b, targetC.b) && Objects.equals(c, targetC.c) && Objects.equals(e, targetC.e);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, e);
    }

    @Override
    public String toString() {
        return "TargetC{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", e='" + e + '\'' +
                '}';
    }
}
