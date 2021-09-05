package hu.dlaszlo.mapstruct;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class SourceB implements Serializable {

    private Set<SourceC> sourceCSet;

    private Map<String, SourceC > sourceCMap;

    public Set<SourceC> getSourceCSet() {
        return sourceCSet;
    }

    public void setSourceCSet(Set<SourceC> sourceCSet) {
        this.sourceCSet = sourceCSet;
    }

    public Map<String, SourceC> getSourceCMap() {
        return sourceCMap;
    }

    public void setSourceCMap(Map<String, SourceC> sourceCMap) {
        this.sourceCMap = sourceCMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SourceB sourceB = (SourceB) o;
        return Objects.equals(sourceCSet, sourceB.sourceCSet) && Objects.equals(sourceCMap, sourceB.sourceCMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceCSet, sourceCMap);
    }

    @Override
    public String toString() {
        return "SourceB{" +
                "sourceCSet=" + sourceCSet +
                ", sourceCMap=" + sourceCMap +
                '}';
    }
}
