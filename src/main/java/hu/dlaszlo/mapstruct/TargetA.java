package hu.dlaszlo.mapstruct;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class TargetA implements Serializable {

    private String a;

    private List<TargetB> sourceBList;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public List<TargetB> getSourceBList() {
        return sourceBList;
    }

    public void setSourceBList(List<TargetB> sourceBList) {
        this.sourceBList = sourceBList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargetA targetA = (TargetA) o;
        return Objects.equals(a, targetA.a) && Objects.equals(sourceBList, targetA.sourceBList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, sourceBList);
    }

    @Override
    public String toString() {
        return "TargetA{" +
                "a='" + a + '\'' +
                ", sourceBList=" + sourceBList +
                '}';
    }
}
