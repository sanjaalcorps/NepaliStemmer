package org.inepal.products.nlp.stemmer;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;


public class NepaliStemmerTest {

    @Test
    public void test_root_word_formation() {
        String input = "विषयलार्इ";
        String output = NepaliStemmer.getNepaliRootWord(input);
        String expected = "विषय";

        Assert.assertThat(output, is(expected));

    }

}