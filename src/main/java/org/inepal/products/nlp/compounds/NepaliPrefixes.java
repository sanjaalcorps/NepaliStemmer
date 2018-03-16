package org.inepal.products.nlp.compounds;

/**
 * @author Kushal Paudyal
 * www.icodejava.com
 * This class represents a list of potential prefixes that are used in Nepali Languages.
 */
public enum NepaliPrefixes {

    ATI("अति"),
    BAHU("बहु"),
    PRATI("प्रति"),
    SARWA("अनु"),
    ANTAR("अन्तर"),
    ADHA("अध"),
    PUNA("पुनः"),
    APA(""),
    ABA(""),
    AWA(""),
    SAHA(""),
    ABHI("अभि"),                                        //e.g. अभिव्यक्ति
    PARI("परि"),            //e.g. //परिसंवाद
    SHUBHA("शुभ"),
    UPA("उप"),
    NAWA("नव"),
    NAYAAN("नयाँ"),
    PURWA("पूर्व"),
    PRATYA("प्रत्या"),
    GAIR("गैर"),

    //परनिर्भरता
    ;

    //LAGHU

    private String nepaliPrefix;

    NepaliPrefixes(String nepaliPrefix) {
        this.nepaliPrefix = nepaliPrefix;
    }
}
