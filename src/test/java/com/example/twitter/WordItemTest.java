package com.example.twitter;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class WordItemTest {

    @Test
    public void compareTwoItems() {
        WordItem item1 = new WordItem("justin", 0);
        WordItem item2 = new WordItem("bieber", 1);

       assertThat(item1.compareTo(item2)).isGreaterThan(0);
    }

    @Test
    public void compareToShouldResultInDecendingOrder() {
        WordItem item1 = new WordItem("justin", 0);
        WordItem item2 = new WordItem("bieber", 1);

        List<WordItem> items = Arrays.asList(item1, item2);
        List<WordItem> sortedItems = items.stream()
                .sorted()
                .collect(Collectors.toList());

        assertThat(sortedItems.size()).isEqualTo(2);
        assertThat(sortedItems.get(0).getCount()).isGreaterThan(sortedItems.get(1).getCount());

    }
}