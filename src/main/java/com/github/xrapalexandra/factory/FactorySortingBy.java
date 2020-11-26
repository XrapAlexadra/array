package com.github.xrapalexandra.factory;

import com.github.xrapalexandra.factory.impl.*;
import com.github.xrapalexandra.model.Criterion;

import java.util.HashMap;
import java.util.Map;

public class FactorySortingBy {

    private final Map<Criterion, SortingBy> sortingByMap = new HashMap<>();

    {
        sortingByMap.put(Criterion.MIN, new SortingByMin());
        sortingByMap.put(Criterion.MAX, new SortingByMax());
        sortingByMap.put(Criterion.SUM, new SortingBySum());
        sortingByMap.put(Criterion.MIN_DESC, new SortingByMinDesc());
        sortingByMap.put(Criterion.MAX_DESC, new SortingByMaxDesc());
        sortingByMap.put(Criterion.SUM_DESC, new SortingBySumDesc());
    }

    public SortingBy getSortingBy(Criterion criterion) {
        return sortingByMap.get(criterion);
    }
}
