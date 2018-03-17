package org.inepal.products.nlp.compounds;

/**
 * @author Kushal Paudyal
 * www.inepal.org | www.icodejava.com
 * This class represents a list of potential suffixes that are used in Nepali Languages.
 * Some of these could be independent words in themselves and act as suffix
 * when attached to another word.
 *
 * This list can be useful for stemming.
 */
public enum NepaliSuffixes {

    DRISTI("दृष्टि"),               //e.g.
    DAATAA("दाता"),             //e.g. संवाददाता
    PRATI("प्रति"),
    PREMI("प्रेमी"),
    DAAR("दार"),               //e.g. पहरेदार
    PRANALI("प्रणाली"),        //e.g. शासनप्रणाली
    KARMI("कर्मी"),             //e.g. स्वास्थ्यकर्मी
    KARMA("कर्म"),
    KARAN("करण"),                //e.g. बजारीकरण
    PATRA("पत्र"),                  //e.g. विरोधपत्र
    KAAR("कार"),                   //e.g. साहित्यकार
    KAANDA("काण्ड"),
    TWA("त्व"),
    PADDATI("पद्धति"),              //e.g. कार्यपद्धति
    MANTRI("मन्त्री"),                //e.g. कानुनमन्त्री
    TANTRA("तन्त्र"),
    BIDHI("विधि"),              //e.g. प्रयोगविधि
    SUTRA("सूत्र"),
    SHASHTRA("शास्त्र"),            //e.g. काव्यशास्त्र
    KAARITA("कारिता"),          //e.g. कथाकारिता
    WALA("वाला"),               //e.g. खच्चडवाला
    MADHYAM("माध्यम"),          //e.g. संचारमाध्यम

    ;
    //KARAK
    //KARTA
    //HARAN
    //GAT
    //PIDIT
    //KARAN
    //KAAL
    //हीनता
    //इलमवृत्ति
    //विज्ञ



    private String nepaliSuffix;

    NepaliSuffixes(String nepaliSuffix) {
        this.nepaliSuffix = nepaliSuffix;
    }
}
