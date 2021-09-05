package hu.dlaszlo.mapstruct;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        SourceC sourceC1 = new SourceC();
        sourceC1.setA(1);
        sourceC1.setB(new BigDecimal("1"));
        sourceC1.setC(SourceEnum.A);
        sourceC1.setE(LocalDateTime.now());

        SourceC sourceC2 = new SourceC();
        sourceC2.setA(2);
        sourceC2.setB(new BigDecimal("2"));
        sourceC2.setC(SourceEnum.B);
        sourceC2.setE(LocalDateTime.now());

        SourceC sourceC3 = new SourceC();
        sourceC3.setA(3);
        sourceC3.setB(new BigDecimal("3"));
        sourceC3.setC(SourceEnum.C);
        sourceC3.setE(LocalDateTime.now());

        SourceC sourceC4 = new SourceC();
        sourceC4.setA(4);
        sourceC4.setB(new BigDecimal("4"));
        sourceC4.setC(SourceEnum.A);
        sourceC4.setE(LocalDateTime.now());

        SourceB sourceB1 = new SourceB();
        sourceB1.setSourceCSet(new HashSet<>());
        sourceB1.setSourceCMap(new HashMap<>());
        sourceB1.getSourceCSet().add(sourceC1);
        sourceB1.getSourceCSet().add(sourceC2);
        sourceB1.getSourceCMap().put("3", sourceC3);
        sourceB1.getSourceCMap().put("4", sourceC4);

        SourceB sourceB2 = new SourceB();
        sourceB2.setSourceCSet(new LinkedHashSet<>());
        sourceB2.setSourceCMap(new LinkedHashMap<>());
        sourceB2.getSourceCSet().add(sourceC3);
        sourceB2.getSourceCSet().add(sourceC4);
        sourceB2.getSourceCMap().put("1", sourceC1);
        sourceB2.getSourceCMap().put("2", sourceC1);

        SourceA sourceA = new SourceA();
        sourceA.setA("Próba123");
        sourceA.setSourceBList(Arrays.asList(sourceB1, sourceB2));

        Source source = new Source();
        source.setAbcd("abcd");
        source.setSourceA(sourceA);

        Target target = SourceMapper.INSTANCE.sourceToTarget(source);

        System.out.println(target);

        Source source1 = TargetMapper.INSTANCE.sourceToTarget(target);

        System.out.println(source1);

    }

}
