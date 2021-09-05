package hu.dlaszlo.mapstruct;

import java.io.Serializable;
import java.util.Objects;

public class Target implements Serializable {

    private static final long serialVersionUID = -6751277866406497820L;

    private String abcd;

    private TargetA sourceA;

    public String getAbcd() {
        return abcd;
    }

    public void setAbcd(String abcd) {
        this.abcd = abcd;
    }

    public TargetA getSourceA() {
        return sourceA;
    }

    public void setSourceA(TargetA sourceA) {
        this.sourceA = sourceA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Target target = (Target) o;
        return Objects.equals(abcd, target.abcd) && Objects.equals(sourceA, target.sourceA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abcd, sourceA);
    }

    @Override
    public String toString() {
        return "Target{" +
                "abcd='" + abcd + '\'' +
                ", sourceA=" + sourceA +
                '}';
    }
}
