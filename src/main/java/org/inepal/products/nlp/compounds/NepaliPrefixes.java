package org.inepal.products.nlp.compounds;

/**
 * @author Kushal Paudyal
 * www.icodejava.com
 * This class represents a list of potential prefixes that are used in Nepali Languages.
 *
 * Prefixes do not have a meaning of their own independently, however, the word formed by
 * combining prefix with other words create meanings.
 *
 * Prefixes are called either PURVASARGA or UPASARGA in Nepali Language.
 *
 * Prefixes when combined to a word, can change the meaning of the original word they are attached to.
 *
 * References:
 * "Madhyamik Nepali Byakaran Abhibyakti Ra Abhyas" book by Professor Dr. Krishna Hari Baral
 * and Associate Professor Dr. Netra Atom.
 */
public enum NepaliPrefixes {

    /**
     * Adds "Lack of" or "Banned" meaning to the word it is attaching to
     *
     * e.g. Akaal, Agatilo, Achuk, Achet, Apug, Aber, Agyan, Asaman, Abato,
     * Asajilo, Ayogya, Ahit
     */
    A("अ"),

    /**
     * Adds "Extra" or "More" meaning to the word it is attaching to
     *
     * e.g. Atirikta, Atirathi, Atiit, Atishaya, Atyachar, Atikraman
     * Atisar, Atyanta (Ati +  Anta), Atyukti (Ati + Yukti), Atyachar (Ati +  Achar),
     * Atyadhunik (Ati +  Adhunik)
     */
    ATI("अति"),

    /**
     * Adds "Over", "More", "Good" menaing to the word it is attaching to
     *
     * e.g. Adhipati, Adhirajya, Adhikar, Adhinayak,
     * Adhyatma (Adhi + Atma), Adhyan (Adhi + Ayan), Adhyaya (Adhi + Aaya),
     * Adhibeshan (Adhi + Beshan), Adhimaas (Adhi +  Maas)
     */
    ADHI("अधि"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    ANA("अन"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    ANU("अनु"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    APA("अप"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    ABHI("अभि"),                                        //e.g. अभिव्यक्ति

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    AWA("अव"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */

    AA("आ"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    UT("उत्"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    UPA("उप"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    KU("कु"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    GAIR("गैर"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    DUR("दुर्"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    DUS("दुस्"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    NA("न"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    NAA("ना "),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    NI("नि"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    NIR("निर्"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    NIS("निस्"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    PARAA("परा"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    PARI("परि"),            //e.g. //परिसंवाद

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    PRA("प्र"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    PRATI("प्रति"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    BAD("बद"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    BI("बि"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    BE("बे"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    VI("वि"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    SA("स"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    SAM("सम्"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    SAHA("सह"),

    /**
     * Adds TODO meaning to the word it is attaching to.
     *
     * e.g.
     */
    SU("सु"),

    /**
     * Adds "Each" meaning to the word it is attaching to
     *
     * e.g. Harek, Harkshan, Hardin, Harbakhat, Harsambhav, Harpal
     */
    HAR("हर"),



    // The following seem to be the prefixes but were not found in the grammar book.
    // TODO: Validate.

    BAHU("बहु"),
    ANTAR("अन्तर"),
    ADHA("अध"),
    PUNA("पुनः"),
    //ABA(""), //could be grammatically incorrect.
    SHUBHA("शुभ"),
    NAWA("नव"),
    NAYAAN("नयाँ"),
    PURWA("पूर्व"),
    //परनिर्भरता
    ;

    //LAGHU

    private String nepaliPrefix;

    NepaliPrefixes(String nepaliPrefix) {
        this.nepaliPrefix = nepaliPrefix;
    }
}
