package hu.dlaszlo.mapstruct;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class TargetB implements Serializable {

    private Set<TargetC> sourceCSet;

    private Map<String, TargetC > sourceCMap;

    public Set<TargetC> getSourceCSet() {
        return sourceCSet;
    }

    public void setSourceCSet(Set<TargetC> sourceCSet) {
        this.sourceCSet = sourceCSet;
    }

    public Map<String, TargetC> getSourceCMap() {
        return sourceCMap;
    }

    public void setSourceCMap(Map<String, TargetC> sourceCMap) {
        this.sourceCMap = sourceCMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargetB targetB = (TargetB) o;
        return Objects.equals(sourceCSet, targetB.sourceCSet) && Objects.equals(sourceCMap, targetB.sourceCMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceCSet, sourceCMap);
    }

    @Override
    public String toString() {
        return "TargetB{" +
                "sourceCSet=" + sourceCSet +
                ", sourceCMap=" + sourceCMap +
                '}';
    }

}
