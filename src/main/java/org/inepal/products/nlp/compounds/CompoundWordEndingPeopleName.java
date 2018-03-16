package org.inepal.products.nlp.compounds;

/**
 * @author Kushal Paudyal
 * www.inepal.org | www.icodejava.com
 */
public enum CompoundWordEndingPeopleName {

    BABU("बाबु"),
    BAHADUR("बहादुर"),
    BHADRA("भद्र"),
    CHANDRA_LAL("चन्द्रलाल"),
    CHANDRA("चन्द्र"),
    CHARAN("चरण"),
    DEEP("दीप"),
    DEV("देव"),
    DEVI("देवी"),
    GOPAL("गोपाल"),
    HARI("हरि"),
    JANG_1("जंग"),
    JANGA_2("जङ्ग"),
    KANTA("कान्त"),
    KANTAA("कान्ता"),
    KUMAR("कुमार"),
    KUMARI("कुमारी"),
    LAAL("लाल"),
    LAKSHMI("लक्ष्मी"),
    MAAN("मान"),
    MANI("मणि"),
    MAYA("माया"),
    NARAYAN("नारायण"),
    PRAKASH("प्रकाश"),
    PRASAD("प्रसाद"),
    RAJ("राज"),
    RAM("राम"),
    RATNA("रत्न"),
    SHAMSHER_1("शंशेर"),
    SHAMSHER_2("शमशेर"),
    SHWAR("श्वर"),
    SINHA("सिंह"),

    //SURNAMES BELOW
    KOTI("कोटी"),

    ;

    //narendra
    //
    //BHAKTA





    private String nameEnding;

    CompoundWordEndingPeopleName(String nameEnding) {

        this.nameEnding = nameEnding;
    }

    public String getNameEnding() {

        return nameEnding;
    }
}


