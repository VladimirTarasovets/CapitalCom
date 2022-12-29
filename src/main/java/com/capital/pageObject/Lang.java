package com.capital.pageObject;

import com.codeborne.selenide.SelenideElement;

public enum Lang {
//    EN(""),
    AR("ar?license=ASIC"),
    ID("id?license=ASIC"),
    BG("bg?license=ASIC"),
    CZ("cz"),
    DA("da"),
    DE("de"),
    ET("et"),
    EL("el"),
    ES("es"),
    FR("fr"),
    HR("hr"),
    IT("it"),
    LV("lv"),
    LT("lt"),
    HU("hu"),
    NL("nl"),
    PL("pl"),
    PT("pt"),
    RO("ro"),
    RU("ru"),
    SK("sk"),
    SL("sl"),
    FI("fi"),
    SV("sv"),
    VI("vi"),
    TH("th"),
    ZH("zh"),
    CN("cn");

    private final String string;

    Lang(String string) {
        this.string = string;
    }
    public String string(){
        return string;
    }

}
