// ////////////////////////ZFACTUUR/////////////////////
data class AdedLeverancier(
    var A700129Naam: String = "",
    var A700766PostadresStraat: String = "",
    var A700767PostadresHuisnummer: Int = 0,
    var A700768PostadresPlaats: String = "",
    var A204587PostadresPostcode: String = "",
    var A700770PostadresLand: String = "",
    var A702849EmailAdres: String = "",
    var A204581Iban: String = "",
    var A204582Bic: String = "",
    var A204651VatNumberInternational: String = ""
)
data class AdedAfnemer(
    var A700129Naam: String = "",
    var A700766PostadresStraat: String = "",
    var A700767PostadresHuisnummer: Any,
    var A700768PostadresPlaats: String = "",
    var A204587PostadresPostcode: Any,
    var A700770PostadresLand: String = "",
    var A702849EmailAdres: String = "",
    var A203813Relatienummer: Int = 0,
    var A203838CodeBetaling: Int = 0
)
data class AdedBtw(
    var A202637Btw: Double = 0.toDouble(),
    var A702004BedragBtw: Double = 0.toDouble()
)
data class AdedProdukt(
    var A203819Artikelcode: Int = 0,
    var A204662ArtikelomschrijvingKlant: String = "",
    var A401013PrijsBruto: Double = 0.toDouble(),
    var A203820OmschrijvingProdukt: String = "",
    @JacksonXmlProperty(localName = "AdedBtw")
    var adedBtw: AdedBtw
)
data class AdedLevering(
    // @JsonIgnore
    var A702078Regelnummer: Int = 0,
    var A702164DatumLevering: Date,
    var A300225BonnummerLeveringsbon: Int = 0,
    var A702165Leveringsbonregelnummer: Int = 0,
    var A702827OrderNummerLeverancier: Int = 0,
    var A203811BedragBrutoExBtw: Double = 0.toDouble(),
    var A203862BedragNettoExBtw: Double = 0.toDouble(),
    var A203822HoeveelheidProdukt: Double = 0.toDouble(),
    var A204652Eenheid: String = "",
    @JacksonXmlProperty(localName = "AdedProdukt")
    var adedProdukt: AdedProdukt
)
data class AdedBtw1(
    var A202637Btw: Double = 0.toDouble(),
    var A203836BtwGrondslag: Double = 0.toDouble(),
    var A702004BedragBtw: Double = 0.toDouble(),
)
data class AdedTotalen(
    var A700154Bedrag: Double = 0.toDouble(),
    var A204655Bedragqualifier: Int = 0,
)
data class AdedTransaction(
    var A402617CodeMuntsoort: String = "",
    var A201029SoortOverzicht: Int = 0,
    var A201136Faktuurnummer: Int = 0,
    var A201134Faktuurdatum: Date,
    var A203817DatumIncasso: Date,
    var A800004UniekBerichtNummer: String = "",
    var A800006AssociationAssignedCode: String = "",
    var A702856UrlDocument: String = "",
    var A204654Toelichting: String = "",
    @JacksonXmlProperty(localName = "AdedLeverancier")
    var adedLeverancier: AdedLeverancier,
    @JacksonXmlProperty(localName = "AdedAfnemer")
    var adedAfnemer: AdedAfnemer,
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "AdedLevering")
    var adedLevering: List<AdedLevering>,
    @JacksonXmlProperty(localName = "AdedBtw1")
    var adedBtw1: AdedBtw1,
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "AdedTotalen")
    var adedTotalen: List<AdedTotalen>
)

