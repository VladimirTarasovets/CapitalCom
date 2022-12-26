package com.capital.pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public enum Languages {

//    EN($(byCssSelector(".cc-flags.cc-flags--gb"))),
    AR($(byCssSelector(".cc-flags.cc-flags--ab"))),
    ID($(byCssSelector(".cc-flags.cc-flags--id"))),
    BG($(byCssSelector(".cc-flags.cc-flags--bg"))),
    CZ($(byCssSelector(".cc-flags.cc-flags--cz"))),
    DA($(byCssSelector(".cc-flags.cc-flags--dk"))),
    DE($(byCssSelector(".cc-flags.cc-flags--de"))),
    ET($(byCssSelector(".cc-flags.cc-flags--ee"))),
    EL($(byCssSelector(".cc-flags.cc-flags--gr"))),
    ES($(byCssSelector(".cc-flags.cc-flags--es"))),
    FR($(byCssSelector(".cc-flags.cc-flags--fr"))),
    HR($(byCssSelector(".cc-flags.cc-flags--hr"))),
    IT($(byCssSelector(".cc-flags.cc-flags--it"))),
    LV($(byCssSelector(".cc-flags.cc-flags--lv"))),
    LT($(byCssSelector(".cc-flags.cc-flags--lt"))),
    HU($(byCssSelector(".cc-flags.cc-flags--hu"))),
    NL($(byCssSelector(".cc-flags.cc-flags--nl"))),
    PL($(byCssSelector(".cc-flags.cc-flags--pl"))),
    PT($(byCssSelector(".cc-flags.cc-flags--pt"))),
    RO($(byCssSelector(".cc-flags.cc-flags--ro"))),
    RU($(byCssSelector(".cc-flags.cc-flags--ru"))),
    SK($(byCssSelector(".cc-flags.cc-flags--sk"))),
    SL($(byCssSelector(".cc-flags.cc-flags--si"))),
    FI($(byCssSelector(".cc-flags.cc-flags--fi"))),
    SV($(byCssSelector(".cc-flags.cc-flags--se"))),
    VI($(byCssSelector(".cc-flags.cc-flags--vn"))),
    TH($(byCssSelector(".cc-flags.cc-flags--th"))),
    ZH($(byCssSelector(".cc-flags.cc-flags--zn"))),
    CN($(byCssSelector(".cc-flags.cc-flags--cn")));

    private final SelenideElement se;

    Languages(SelenideElement se) {
        this.se = se;
    }
    public SelenideElement value(){
        return se;
    }

    public void click() {
        click();
    }
}
