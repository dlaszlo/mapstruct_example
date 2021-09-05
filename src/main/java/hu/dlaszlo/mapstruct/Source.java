package hu.dlaszlo.mapstruct;

import java.io.Serializable;
import java.util.Objects;

public class Source implements Serializable {

    private static final long serialVersionUID = -6751277866406497820L;

    private String abcd;

    private SourceA sourceA;

    public String getAbcd() {
        return abcd;
    }

    public void setAbcd(String abcd) {
        this.abcd = abcd;
    }

    public SourceA getSourceA() {
        return sourceA;
    }

    public void setSourceA(SourceA sourceA) {
        this.sourceA = sourceA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Source source = (Source) o;
        return Objects.equals(abcd, source.abcd) && Objects.equals(sourceA, source.sourceA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abcd, sourceA);
    }

    @Override
    public String toString() {
        return "Source{" +
                "abcd='" + abcd + '\'' +
                ", sourceA=" + sourceA +
                '}';
    }
}
