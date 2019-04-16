package rocks.zipcode.io.collections;

import java.util.*;

/**
 * @author leon on 10/01/2019.
 */
public class PowerSet<TypeOfSet> {
    protected final Set<TypeOfSet> originalSet;

    public PowerSet(TypeOfSet[] originalSet) {
        this.originalSet = new HashSet<>(Arrays.asList(originalSet));
    }

    /**
     * @return the powerset of `originalSet`
     */
    public Set<Set<TypeOfSet>> permute() {
        List<Set<TypeOfSet>> listOfSets = new ArrayList<>();
        List<TypeOfSet> items = new ArrayList<>();
        items.addAll(this.originalSet);
        listOfSets.add(Collections.emptySet());
        Set<Set<TypeOfSet>> results = new HashSet<>();
        for (int i = 1; i <= items.size(); i++) {
            Set<TypeOfSet> set = new HashSet<>();
            for (int j = 0; j < items.size() - i; j++) {
                int k = j + i - 1;
                for (int l = j; l <= k ; l++) {
                    set.add(items.get(l));
                }
                listOfSets.add(set);
            }

        }
        results.addAll(listOfSets);
        results.add(this.originalSet);
            return results;
    }

    /**
     * @return `originalSet`
     */
    public Set<TypeOfSet> getOriginalSet() {
        return originalSet;
    }


}
