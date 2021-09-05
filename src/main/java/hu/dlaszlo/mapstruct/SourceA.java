package hu.dlaszlo.mapstruct;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class SourceA implements Serializable {

    private String a;

    private List<SourceB> sourceBList;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public List<SourceB> getSourceBList() {
        return sourceBList;
    }

    public void setSourceBList(List<SourceB> sourceBList) {
        this.sourceBList = sourceBList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SourceA sourceA = (SourceA) o;
        return Objects.equals(a, sourceA.a) && Objects.equals(sourceBList, sourceA.sourceBList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, sourceBList);
    }

    @Override
    public String toString() {
        return "SourceA{" +
                "a='" + a + '\'' +
                ", sourceBList=" + sourceBList +
                '}';
    }

}
