package org.inepal.products.nlp.compounds;

/**
 * @author Kushal Paudyal
 * www.sanjaal.com | www.icodejava.com
 *
 * This enumeration represents suffixes that potentially make up a Nepali place name.
 *
 * PLACE NAMES POSTPOSITIONS
 */

public enum CompoundWordEndingPlaces {

    BAAS("बास"),
    BAASI("बासी"),
    BAGAR("बगर"),
    BAJAR("बजार"),
    BARI("बारी"),
    BASTI("बस्ती"),
    CHAUR("चौर"),
    CHAUUR("चउर"),
    CHOK("चोक"),
    DAANDA("डाँडा"),
    DHARA("धारा"),
    DHUNGA_1("ढुंगा"),
    DHUNGA_2("ढुङ्गा"),
    DHURA("धुरा"),
    GADHI("गढी"),
    GADI("गडी"),
    GANGA("गंगा"),
    GANJ("गन्ज"),
    GAUN("गाउँ"),
    GHAAT("घाट"),
    GOHA("गोह"),
    GRAAM("ग्राम"),
    KHAAL("खाल"),
    KHANI("खानी"),
    KHARKA("खर्क"),
    KHEL("खेल"),
    KHET("खेत"),
    KHOLAA("खोला"),
    KHORI("खोरी"),
    KOT("कोट"),
    KUNDA("कुण्ड"),
    LUNG("लुङ"),
    MAARAA("मारा"),
    MAARGA("मार्ग"),
    MOD("मोड"),
    NAGAR("नगर"),
    PAATA("पाटा"),
    PAATI("पाटी"),
    PANI("पानी"),
    PAUWA("पौवा"),
    POKHARI("पोखरी"),
    PUL("पुल"),
    PUR("पुर"),
    PURI("पुरी"),
    SHWARI("श्वरी"),
    SIDDI("सिद्धि"),
    STHAN("स्थान"),
    TAAR("टार"),
    THAAN("थान"),
    THALI("थली"),
    THUM("थुम"),
    TOL("टोल"),
    VAAS("वास"),
    VASTI("वस्ती"),
    VASTU("वस्तु"),
    VESI("वेसी");

    //फेदी
    private String placeEnding;

    CompoundWordEndingPlaces(String placeEnding) {

        this.placeEnding = placeEnding;
    }

    public String getPlaceEnding() {
        return placeEnding;
    }

    public void setPlaceEnding(String placeEnding) {
        this.placeEnding = placeEnding;
    }
}