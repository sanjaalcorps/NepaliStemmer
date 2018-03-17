package org.inepal.products.nlp.stemmer;


import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;


public class NepaliStemmerTest {

    @Test
    public void test_root_word_extraction() {
        Map<String, String> map = new HashMap<String, String>();

        map.put("पहिलेभन्दा", "पहिले");
        //map.put("समयभन्दा", "समय");
        //map.put("खत्तमै", "खत्तमै");
        map.put("ठिक्कै", "ठिक्कै");
        map.put("दलहरुप्रति", "दल");
        //map.put("आयुक्तसँगै", "आयुक्त");
        //map.put("बन्नुनपर्ने", "बन्नुनपर्ने");
        map.put("दैनिकीजस्तै", "दैनिकी");
        map.put("सीमाअनुसार", "सीमा");
        map.put("चलेजस्तो", "चले");
        //map.put("कांग्रेसएमालेबीच", "कांग्रेसएमाले");
        map.put("राज्यहरूमध्ये", "राज्य");
        map.put("चेलीबेटीहरूमध्य", "चेलीबेटी");
        //map.put("भर्भर", "भर्भर");
        map.put("छिमेकीजस्तै", "छिमेकी");
        map.put("मालूमै", "मालूमै");
        //map.put("उपस्थितहरू", "उपस्थित");
        map.put("जुलूमै", "जुलूमै");
        map.put("चालकबीचको", "चालक");
        map.put("कलकत्ताबीचको", "कलकत्ता");
        map.put("खेलाडीहरूकै", "खेलाडी");
        map.put("स्त्रीहरुमाथि", "स्त्री");
        map.put("क्रान्तिकारीहरुमा", "क्रान्ति");
        map.put("आत्माबिहिन", "आत्मा");
        map.put("ओबामादेखि", "ओबामा");
        map.put("नागरिकहरुलाइ", "नागरिक");
        map.put("चौकीभित्रसमेत", "चौकी");
        map.put("संशोधनपूर्वकै", "संशोधन");
        //map.put("संसद्सम्मै", "संसद्");
        map.put("पाण्डेज्युहरू", "पाण्डे");
        map.put("विषयलार्इ", "विषय");

        int failedCount = 0;
        boolean passed = true;
        for (String key : map.keySet()) {

            try {
                Assert.assertThat(NepaliStemmer.getNepaliRootWord(key), is(map.get(key)));
            } catch (Error e) {
                System.out.println((failedCount++) + " Failed " + key + " --> " + e.getMessage());
                passed = false;
            }
        }

        if(!passed) {
            Assert.fail("Root Word Extraction Failed. See Console for Details");
        }

    }

}