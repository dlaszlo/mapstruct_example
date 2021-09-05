package hu.dlaszlo.mapstruct;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class SourceC implements Serializable {
    private static final long serialVersionUID = -1857729068946301681L;

    private Integer a;
    private BigDecimal b;
    private SourceEnum c;
    private LocalDateTime e;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public BigDecimal getB() {
        return b;
    }

    public void setB(BigDecimal b) {
        this.b = b;
    }

    public SourceEnum getC() {
        return c;
    }

    public void setC(SourceEnum c) {
        this.c = c;
    }

    public LocalDateTime getE() {
        return e;
    }

    public void setE(LocalDateTime e) {
        this.e = e;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SourceC sourceC = (SourceC) o;
        return Objects.equals(a, sourceC.a) && Objects.equals(b, sourceC.b) && c == sourceC.c && Objects.equals(e, sourceC.e);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, e);
    }

    @Override
    public String toString() {
        return "SourceC{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", e=" + e +
                '}';
    }
}
