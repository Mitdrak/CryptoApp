package com.example.cryptoapp.data.model.dto
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

@Serializable
data class WhitebitResponse (
    @SerialName("1INCH")
    val the1Inch: The1_Inch? = null,

    @SerialName("AAVE")
    val aave: The1_Inch? = null,

    @SerialName("ACE")
    val ace: Ace? = null,

    @SerialName("ACH")
    val ach: The1_Inch? = null,

    @SerialName("ACT")
    val act: Act? = null,

    @SerialName("ACX")
    val acx: The1_Inch? = null,

    @SerialName("ADA")
    val ada: Ada? = null,

    @SerialName("ADK")
    val adk: Adk? = null,

    @SerialName("ADX")
    val adx: The1_Inch? = null,

    @SerialName("AERGO")
    val aergo: The1_Inch? = null,

    @SerialName("AEVO")
    val aevo: The1_Inch? = null,

    @SerialName("AGENT")
    val agent: Agent? = null,

    @SerialName("AGLD")
    val agld: The1_Inch? = null,

    @SerialName("AGRS")
    val agrs: Agrs? = null,

    @SerialName("AI")
    val ai: Ace? = null,

    @SerialName("AIXBT")
    val aixbt: Agent? = null,

    @SerialName("AKRO")
    val akro: Akro? = null,

    @SerialName("AKTIO")
    val aktio: The1_Inch? = null,

    @SerialName("ALGO")
    val algo: Algo? = null,

    @SerialName("ALICE")
    val alice: The1_Inch? = null,

    @SerialName("ALPACA")
    val alpaca: Ace? = null,

    @SerialName("ALPHA")
    val alpha: The1_Inch? = null,

    @SerialName("ALT")
    val alt: The1_Inch? = null,

    @SerialName("AMB")
    val amb: Amb? = null,

    @SerialName("AMP")
    val amp: The1_Inch? = null,

    @SerialName("ANIME")
    val anime: Anime? = null,

    @SerialName("ANKR")
    val ankr: Ankr? = null,

    @SerialName("APE")
    val ape: The1_Inch? = null,

    @SerialName("API3")
    val api3: The1_Inch? = null,

    @SerialName("APT")
    val apt: Apt? = null,

    @SerialName("AR")
    val ar: Ar? = null,

    @SerialName("ARB")
    val arb: Anime? = null,

    @SerialName("ARK")
    val ark: Ark? = null,

    @SerialName("ARKM")
    val arkm: The1_Inch? = null,

    @SerialName("ARPA")
    val arpa: The1_Inch? = null,

    @SerialName("ASH")
    val ash: Ash? = null,

    @SerialName("ASTR")
    val astr: Astr? = null,

    @SerialName("ATH")
    val ath: The1_Inch? = null,

    @SerialName("ATOM")
    val atom: Atom? = null,

    @SerialName("AUCTION")
    val auction: The1_Inch? = null,

    @SerialName("AUDIO")
    val audio: The1_Inch? = null,

    @SerialName("AURORA")
    val aurora: The1_Inch? = null,

    @SerialName("AVA")
    val ava: Ava? = null,

    @SerialName("AVAIL")
    val avail: Avail? = null,

    @SerialName("AVAX")
    val avax: Avax? = null,

    @SerialName("AXEL")
    val axel: Axel? = null,

    @SerialName("AXL")
    val axl: The1_Inch? = null,

    @SerialName("AXS")
    val axs: The1_Inch? = null,

    @SerialName("AZERO")
    val azero: Azero? = null,

    @SerialName("BADGER")
    val badger: The1_Inch? = null,

    @SerialName("BAL")
    val bal: The1_Inch? = null,

    @SerialName("BANANA")
    val banana: The1_Inch? = null,

    @SerialName("BAND")
    val band: The1_Inch? = null,

    @SerialName("BAT")
    val bat: The1_Inch? = null,

    @SerialName("BB")
    val bb: Bb? = null,

    @SerialName("BCCOIN")
    val bccoin: Ace? = null,

    @SerialName("BCH")
    val bch: Bch? = null,

    @SerialName("BEAM")
    val beam: The1_Inch? = null,

    @SerialName("BGN")
    val bgn: Bgn? = null,

    @SerialName("BICO")
    val bico: The1_Inch? = null,

    @SerialName("BIO")
    val bio: The1_Inch? = null,

    @SerialName("BITCI")
    val bitci: Bitci? = null,

    @SerialName("BLUR")
    val blur: The1_Inch? = null,

    @SerialName("BNB")
    val bnb: Bnb? = null,

    @SerialName("BNT")
    val bnt: The1_Inch? = null,

    @SerialName("BOME")
    val bome: Act? = null,

    @SerialName("BONK")
    val bonk: Act? = null,

    @SerialName("BSPT")
    val bspt: Ankr? = null,

    @SerialName("BSX")
    val bsx: Bsx? = null,

    @SerialName("BTC")
    val btc: Btc? = null,

    @SerialName("BTCZ")
    val btcz: Btcz? = null,

    @SerialName("BTT")
    val btt: Btt? = null,

    @SerialName("C98")
    val c98: Ace? = null,

    @SerialName("CAKE")
    val cake: Ace? = null,

    @SerialName("CATI")
    val cati: Cati? = null,

    @SerialName("CCAT")
    val ccat: Ava? = null,

    @SerialName("CCC")
    val ccc: Ccc? = null,

    @SerialName("CCOH")
    val ccoh: The1_Inch? = null,

    @SerialName("CELO")
    val celo: Celo? = null,

    @SerialName("CETUS")
    val cetus: Cetus? = null,

    @SerialName("CGPT")
    val cgpt: Ace? = null,

    @SerialName("CHR")
    val chr: The1_Inch? = null,

    @SerialName("CHZ")
    val chz: The1_Inch? = null,

    @SerialName("CKB")
    val ckb: Ckb? = null,

    @SerialName("CLV")
    val clv: The1_Inch? = null,

    @SerialName("COMP")
    val comp: The1_Inch? = null,

    @SerialName("COTI")
    val coti: The1_Inch? = null,

    @SerialName("CRV")
    val crv: The1_Inch? = null,

    @SerialName("CTSI")
    val ctsi: The1_Inch? = null,

    @SerialName("CVC")
    val cvc: The1_Inch? = null,

    @SerialName("CVP")
    val cvp: The1_Inch? = null,

    @SerialName("CYBER")
    val cyber: Ace? = null,

    @SerialName("CZK")
    val czk: Czk? = null,

    @SerialName("DAI")
    val dai: The1_Inch? = null,

    @SerialName("DASH")
    val dash: Dash? = null,

    @SerialName("DATA")
    val data: The1_Inch? = null,

    @SerialName("DBTC")
    val dbtc: Dbtc? = null,

    @SerialName("DBX")
    val dbx: The1_Inch? = null,

    @SerialName("DECL")
    val decl: Decl? = null,

    @SerialName("DEGEN")
    val degen: Agent? = null,

    @SerialName("DEXE")
    val dexe: The1_Inch? = null,

    @SerialName("DF")
    val df: The1_Inch? = null,

    @SerialName("DFIND")
    val dfind: Ace? = null,

    @SerialName("DIA")
    val dia: The1_Inch? = null,

    @SerialName("DODO")
    val dodo: The1_Inch? = null,

    @SerialName("DOGE")
    val doge: Doge? = null,

    @SerialName("DOGS")
    val dogs: Cati? = null,

    @SerialName("DOP")
    val dop: The1_Inch? = null,

    @SerialName("DOT")
    val dot: Dot? = null,

    @SerialName("DRIP")
    val drip: The1_Inch? = null,

    @SerialName("DTNG")
    val dtng: Ace? = null,

    @SerialName("DUSDT")
    val dusdt: Dusdt? = null,

    @SerialName("DYDX")
    val dydx: Ankr? = null,

    @SerialName("DYM")
    val dym: Dym? = null,

    @SerialName("EDC")
    val edc: The1_Inch? = null,

    @SerialName("EGLD")
    val egld: Egld? = null,

    @SerialName("EIGEN")
    val eigen: The1_Inch? = null,

    @SerialName("ENA")
    val ena: The1_Inch? = null,

    @SerialName("ENJ")
    val enj: Enj? = null,

    @SerialName("ENS")
    val ens: The1_Inch? = null,

    @SerialName("EOS")
    val eos: EOS? = null,

    @SerialName("EQ")
    val eq: Eq? = null,

    @SerialName("ETC")
    val etc: Etc? = null,

    @SerialName("ETH")
    val eth: Eth? = null,

    @SerialName("ETHFI")
    val ethfi: The1_Inch? = null,

    @SerialName("ETHW")
    val ethw: Ethw? = null,

    @SerialName("EUR")
    val eur: Eur? = null,

    @SerialName("EURI")
    val euri: The1_Inch? = null,

    @SerialName("FET")
    val fet: The1_Inch? = null,

    @SerialName("FIL")
    val fil: Fil? = null,

    @SerialName("FIS")
    val fis: The1_Inch? = null,

    @SerialName("FLOKI")
    val floki: The1_Inch? = null,

    @SerialName("FLOW")
    val flow: Flow? = null,

    @SerialName("FLUX")
    val flux: The1_Inch? = null,

    @SerialName("FRBK")
    val frbk: Frbk? = null,

    @SerialName("FTM")
    val ftm: Ftm? = null,

    @SerialName("FTN")
    val ftn: Ftn? = null,

    @SerialName("FXS")
    val fxs: The1_Inch? = null,

    @SerialName("G")
    val g: The1_Inch? = null,

    @SerialName("GALA")
    val gala: The1_Inch? = null,

    @SerialName("GBP")
    val gbp: Gbp? = null,

    @SerialName("GLM")
    val glm: The1_Inch? = null,

    @SerialName("GLMR")
    val glmr: Glmr? = null,

    @SerialName("GMT")
    val gmt: Gmt? = null,

    @SerialName("GMX")
    val gmx: Anime? = null,

    @SerialName("GNO")
    val gno: The1_Inch? = null,

    @SerialName("GRT")
    val grt: The1_Inch? = null,

    @SerialName("GULF")
    val gulf: Ace? = null,

    @SerialName("GULFOLD")
    val gulfold: Gulfold? = null,

    @SerialName("HAI")
    val hai: Hai? = null,

    @SerialName("HBAR")
    val hbar: Hbar? = null,

    @SerialName("HDN")
    val hdn: Anime? = null,

    @SerialName("HIFI")
    val hifi: The1_Inch? = null,

    @SerialName("HOGE")
    val hoge: The1_Inch? = null,

    @SerialName("HOOK")
    val hook: Ace? = null,

    @SerialName("HOT")
    val hot: Hot? = null,

    @SerialName("HZM")
    val hzm: The1_Inch? = null,

    @SerialName("ICP")
    val icp: ICP? = null,

    @SerialName("ICX")
    val icx: Icx? = null,

    @SerialName("ID")
    val id: Ace? = null,

    @SerialName("IDEX")
    val idex: The1_Inch? = null,

    @SerialName("IJZ")
    val ijz: Ace? = null,

    @SerialName("ILV")
    val ilv: Ava? = null,

    @SerialName("IMX")
    val imx: The1_Inch? = null,

    @SerialName("INJ")
    val inj: Inj? = null,

    @SerialName("INTX")
    val intx: The1_Inch? = null,

    @SerialName("IO")
    val io: Act? = null,

    @SerialName("IOST")
    val iost: Iost? = null,

    @SerialName("IOTX")
    val iotx: Iotx? = null,

    @SerialName("IVPAY")
    val ivpay: Ace? = null,

    @SerialName("JAM")
    val jam: Hbar? = null,

    @SerialName("JASMY")
    val jasmy: The1_Inch? = null,

    @SerialName("JOE")
    val joe: Joe? = null,

    @SerialName("JOVJOU")
    val jovjou: The1_Inch? = null,

    @SerialName("JST")
    val jst: Btt? = null,

    @SerialName("JTC")
    val jtc: Agent? = null,

    @SerialName("JTO")
    val jto: Act? = null,

    @SerialName("JUP")
    val jup: Act? = null,

    @SerialName("KAIA")
    val kaia: Kaia? = null,

    @SerialName("KAVA")
    val kava: Kava? = null,

    @SerialName("KLC")
    val klc: Klc? = null,

    @SerialName("KNC")
    val knc: The1_Inch? = null,

    @SerialName("KSM")
    val ksm: Ksm? = null,

    @SerialName("KZT")
    val kzt: Kzt? = null,

    @SerialName("LDO")
    val ldo: The1_Inch? = null,

    @SerialName("LEKS")
    val leks: Leks? = null,

    @SerialName("LINA")
    val lina: The1_Inch? = null,

    @SerialName("LINK")
    val link: The1_Inch? = null,

    @SerialName("LM")
    val lm: The1_Inch? = null,

    @SerialName("LPT")
    val lpt: The1_Inch? = null,

    @SerialName("LQTY")
    val lqty: The1_Inch? = null,

    @SerialName("LRC")
    val lrc: The1_Inch? = null,

    @SerialName("LTC")
    val ltc: Ltc? = null,

    @SerialName("LUNA")
    val luna: Luna? = null,

    @SerialName("LUNC")
    val lunc: Lunc? = null,

    @SerialName("MAGIC")
    val magic: Anime? = null,

    @SerialName("MANA")
    val mana: The1_Inch? = null,

    @SerialName("MANTA")
    val manta: Manta? = null,

    @SerialName("MASK")
    val mask: The1_Inch? = null,

    @SerialName("MAV")
    val mav: Ace? = null,

    @SerialName("MDI")
    val mdi: The1_Inch? = null,

    @SerialName("MEME")
    val meme: The1_Inch? = null,

    @SerialName("METIS")
    val metis: The1_Inch? = null,

    @SerialName("MEW")
    val mew: Act? = null,

    @SerialName("MKR")
    val mkr: The1_Inch? = null,

    @SerialName("MLN")
    val mln: The1_Inch? = null,

    @SerialName("MLNK")
    val mlnk: EOS? = null,

    @SerialName("MOVE")
    val move: The1_Inch? = null,

    @SerialName("MTL")
    val mtl: Mtl? = null,

    @SerialName("MTO")
    val mto: The1_Inch? = null,

    @SerialName("MUSIC")
    val music: The1_Inch? = null,

    @SerialName("MWC")
    val mwc: MWC? = null,

    @SerialName("NAMX")
    val namx: The1_Inch? = null,

    @SerialName("NCDT")
    val ncdt: The1_Inch? = null,

    @SerialName("NCN")
    val ncn: Ncn? = null,

    @SerialName("NEAR")
    val near: Near? = null,

    @SerialName("NEIRO")
    val neiro: The1_Inch? = null,

    @SerialName("NEO")
    val neo: Neo? = null,

    @SerialName("NEXO")
    val nexo: The1_Inch? = null,

    @SerialName("NFP")
    val nfp: Ace? = null,

    @SerialName("NKN")
    val nkn: The1_Inch? = null,

    @SerialName("NMR")
    val nmr: The1_Inch? = null,

    @SerialName("NOT")
    val not: Cati? = null,

    @SerialName("OGN")
    val ogn: The1_Inch? = null,

    @SerialName("OM")
    val om: The1_Inch? = null,

    @SerialName("OMG")
    val omg: The1_Inch? = null,

    @SerialName("OMNI")
    val omni: The1_Inch? = null,

    @SerialName("ONDO")
    val ondo: Ava? = null,

    @SerialName("ONT")
    val ont: Ont? = null,

    @SerialName("OP")
    val op: Op? = null,

    @SerialName("ORBS")
    val orbs: The1_Inch? = null,

    @SerialName("ORCA")
    val orca: Act? = null,

    @SerialName("ORDER")
    val order: The1_Inch? = null,

    @SerialName("ORDI")
    val ordi: Ordi? = null,

    @SerialName("OSMO")
    val osmo: Osmo? = null,

    @SerialName("OXT")
    val oxt: The1_Inch? = null,

    @SerialName("PENDLE")
    val pendle: The1_Inch? = null,

    @SerialName("PEOPLE")
    val people: The1_Inch? = null,

    @SerialName("PEPE")
    val pepe: The1_Inch? = null,

    @SerialName("PHA")
    val pha: The1_Inch? = null,

    @SerialName("PIVX")
    val pivx: Pivx? = null,

    @SerialName("PIXEL")
    val pixel: The1_Inch? = null,

    @SerialName("PLN")
    val pln: Pln? = null,

    @SerialName("PNUT")
    val pnut: Act? = null,

    @SerialName("POL")
    val pol: Pol? = null,

    @SerialName("POLS")
    val pols: The1_Inch? = null,

    @SerialName("POND")
    val pond: The1_Inch? = null,

    @SerialName("PORTAL")
    val portal: The1_Inch? = null,

    @SerialName("POWR")
    val powr: The1_Inch? = null,

    @SerialName("PROMO")
    val promo: Promo? = null,

    @SerialName("PXP")
    val pxp: Joe? = null,

    @SerialName("PYR")
    val pyr: The1_Inch? = null,

    @SerialName("PYTH")
    val pyth: Act? = null,

    @SerialName("QNT")
    val qnt: The1_Inch? = null,

    @SerialName("QTUM")
    val qtum: Qtum? = null,

    @SerialName("RAD")
    val rad: The1_Inch? = null,

    @SerialName("RBT")
    val rbt: Rbt? = null,

    @SerialName("RDNT")
    val rdnt: Anime? = null,

    @SerialName("REEF")
    val reef: Ava? = null,

    @SerialName("REN")
    val ren: Ava? = null,

    @SerialName("RENDER")
    val render: Act? = null,

    @SerialName("REZ")
    val rez: The1_Inch? = null,

    @SerialName("RLC")
    val rlc: The1_Inch? = null,

    @SerialName("RON")
    val ron: Ron? = null,

    @SerialName("ROSE")
    val rose: Rose? = null,

    @SerialName("RPL")
    val rpl: The1_Inch? = null,

    @SerialName("RSR")
    val rsr: The1_Inch? = null,

    @SerialName("RTF")
    val rtf: Ankr? = null,

    @SerialName("RUNE")
    val rune: Rune? = null,

    @SerialName("RVN")
    val rvn: Rvn? = null,

    @SerialName("S")
    val s: S? = null,

    @SerialName("SAGA")
    val saga: Saga? = null,

    @SerialName("SAND")
    val sand: The1_Inch? = null,

    @SerialName("SCM")
    val scm: The1_Inch? = null,

    @SerialName("SCR")
    val scr: Scr? = null,

    @SerialName("SEI")
    val sei: SEI? = null,

    @SerialName("SFM")
    val sfm: Promo? = null,

    @SerialName("SHIB")
    val shib: The1_Inch? = null,

    @SerialName("SHRUB")
    val shrub: The1_Inch? = null,

    @SerialName("SKL")
    val skl: The1_Inch? = null,

    @SerialName("SNX")
    val snx: The1_Inch? = null,

    @SerialName("SOL")
    val sol: Act? = null,

    @SerialName("SONIC")
    val sonic: Sonic? = null,

    @SerialName("SPE")
    val spe: The1_Inch? = null,

    @SerialName("SSLX")
    val sslx: Sslx? = null,

    @SerialName("SSV")
    val ssv: The1_Inch? = null,

    @SerialName("STEEM")
    val steem: Steem? = null,

    @SerialName("STEMX")
    val stemx: Ace? = null,

    @SerialName("STG")
    val stg: The1_Inch? = null,

    @SerialName("STORJ")
    val storj: The1_Inch? = null,

    @SerialName("STORY")
    val story: Ace? = null,

    @SerialName("STPT")
    val stpt: The1_Inch? = null,

    @SerialName("STRK")
    val strk: Strk? = null,

    @SerialName("STX")
    val stx: Stx? = null,

    @SerialName("SUI")
    val sui: Cetus? = null,

    @SerialName("SUN")
    val sun: Btt? = null,

    @SerialName("SUPER")
    val whitebitResponseSUPER: The1_Inch? = null,

    @SerialName("SUSHI")
    val sushi: Ankr? = null,

    @SerialName("SXP")
    val sxp: Sxp? = null,

    @SerialName("SYS")
    val sys: Sys? = null,

    @SerialName("T")
    val t: The1_Inch? = null,

    @SerialName("TAO")
    val tao: TAO? = null,

    @SerialName("TCG2")
    val tcg2: The1_Inch? = null,

    @SerialName("TENET")
    val tenet: Tenet? = null,

    @SerialName("THETA")
    val theta: Theta? = null,

    @SerialName("TIA")
    val tia: Tia? = null,

    @SerialName("TNSR")
    val tnsr: Act? = null,

    @SerialName("TON")
    val ton: Cati? = null,

    @SerialName("TRB")
    val trb: The1_Inch? = null,

    @SerialName("TRUMP")
    val trump: Act? = null,

    @SerialName("TRX")
    val trx: Btt? = null,

    @SerialName("TRY")
    val whitebitResponseTRY: Try? = null,

    @SerialName("TUSD")
    val tusd: Tusd? = null,

    @SerialName("TYV")
    val tyv: Ace? = null,

    @SerialName("UAH")
    val uah: Uah? = null,

    @SerialName("UAHG")
    val uahg: Ankr? = null,

    @SerialName("UMA")
    val uma: The1_Inch? = null,

    @SerialName("UNI")
    val uni: The1_Inch? = null,

    @SerialName("USD")
    val usd: Usd? = null,

    @SerialName("USDC")
    val usdc: Usdc? = null,

    @SerialName("USDT")
    val usdt: Tusd? = null,

    @SerialName("USDTB")
    val usdtb: Usdtb? = null,

    @SerialName("USTC")
    val ustc: Lunc? = null,

    @SerialName("UTK")
    val utk: The1_Inch? = null,

    @SerialName("UWON")
    val uwon: Near? = null,

    @SerialName("VET")
    val vet: Hai? = null,

    @SerialName("VEXT")
    val vext: Pol? = null,

    @SerialName("VICA")
    val vica: The1_Inch? = null,

    @SerialName("VNT")
    val vnt: Vnt? = null,

    @SerialName("VOXEL")
    val voxel: Ccc? = null,

    @SerialName("W")
    val w: Act? = null,

    @SerialName("WAXP")
    val waxp: Waxp? = null,

    @SerialName("WBT")
    val wbt: Wbt? = null,

    @SerialName("WIF")
    val wif: Act? = null,

    @SerialName("WIN")
    val win: Btt? = null,

    @SerialName("WOJAK")
    val wojak: The1_Inch? = null,

    @SerialName("WOO")
    val woo: The1_Inch? = null,

    @SerialName("WSD")
    val wsd: The1_Inch? = null,

    @SerialName("XAI")
    val xai: Anime? = null,

    @SerialName("XAUT")
    val xaut: The1_Inch? = null,

    @SerialName("XDC")
    val xdc: Xdc? = null,

    @SerialName("XEC")
    val xec: Xec? = null,

    @SerialName("XEM")
    val xem: Xem? = null,

    @SerialName("XFC")
    val xfc: Xfc? = null,

    @SerialName("XLM")
    val xlm: Sslx? = null,

    @SerialName("XMR")
    val xmr: Xmr? = null,

    @SerialName("XRP")
    val xrp: Eq? = null,

    @SerialName("XTZ")
    val xtz: Xtz? = null,

    @SerialName("YFI")
    val yfi: The1_Inch? = null,

    @SerialName("YFII")
    val yfii: The1_Inch? = null,

    @SerialName("YGG")
    val ygg: The1_Inch? = null,

    @SerialName("ZEC")
    val zec: Zec? = null,

    @SerialName("ZEN")
    val zen: Zen? = null,

    @SerialName("ZERO")
    val zero: Zero? = null,

    @SerialName("ZETA")
    val zeta: The1_Inch? = null,

    @SerialName("ZIL")
    val zil: Zil? = null,

    @SerialName("ZK")
    val zk: Zk? = null,

    @SerialName("ZRO")
    val zro: The1_Inch? = null,

    @SerialName("ZRX")
    val zrx: The1_Inch? = null
)

@Serializable
data class The1_Inch (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: The1INCHConfirmations? = null,
    val limits: The1INCHLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class The1INCHConfirmations (
    @SerialName("ERC20")
    val erc20: Long? = null
)

@Serializable
data class The1INCHLimits (
    val deposit: PurpleDeposit? = null,
    val withdraw: PurpleDeposit? = null
)

@Serializable
data class PurpleDeposit (
    @SerialName("ERC20")
    val erc20: Erc20? = null
)

@Serializable
data class Erc20 (
    val min: String? = null
)

@Serializable
data class The1INCHNetworks (
    val deposits: List<String>? = null,
    val withdraws: List<String>? = null,
    val default: String? = null
)

@Serializable
data class Ace (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ACEConfirmations? = null,
    val limits: ACELimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ACEConfirmations (
    @SerialName("BEP20")
    val bep20: Long? = null
)

@Serializable
data class ACELimits (
    val deposit: FluffyDeposit? = null,
    val withdraw: FluffyDeposit? = null
)

@Serializable
data class FluffyDeposit (
    @SerialName("BEP20")
    val bep20: Erc20? = null
)

@Serializable
data class Act (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ACTConfirmations? = null,
    val limits: ACTLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ACTConfirmations (
    @SerialName("SOL")
    val sol: Long? = null
)

@Serializable
data class ACTLimits (
    val deposit: TentacledDeposit? = null,
    val withdraw: TentacledDeposit? = null
)

@Serializable
data class TentacledDeposit (
    @SerialName("SOL")
    val sol: Erc20? = null
)

@Serializable
data class Ada (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ADAConfirmations? = null,
    val limits: ADALimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ADAConfirmations (
    @SerialName("ADA")
    val ada: Long? = null
)

@Serializable
data class ADALimits (
    val deposit: StickyDeposit? = null,
    val withdraw: StickyDeposit? = null
)

@Serializable
data class StickyDeposit (
    @SerialName("ADA")
    val ada: Erc20? = null
)

@Serializable
data class Adk (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val confirmations: ADKConfirmations? = null,
    val limits: ADKLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ADKConfirmations (
    @SerialName("ADK")
    val adk: Long? = null
)

@Serializable
data class ADKLimits (
    val deposit: IndigoDeposit? = null,
    val withdraw: IndigoDeposit? = null
)

@Serializable
data class IndigoDeposit (
    @SerialName("ADK")
    val adk: Erc20? = null
)

@Serializable
data class ADKNetworks (
    val default: String? = null
)

@Serializable
data class Agent (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: AGENTConfirmations? = null,
    val limits: AGENTLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class AGENTConfirmations (
    @SerialName("BASE")
    val base: Long? = null
)

@Serializable
data class AGENTLimits (
    val deposit: IndecentDeposit? = null,
    val withdraw: IndecentDeposit? = null
)

@Serializable
data class IndecentDeposit (
    @SerialName("BASE")
    val base: Erc20? = null
)

@Serializable
data class Agrs (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ProvidersClass? = null,
    val confirmations: AGRSConfirmations? = null,
    val limits: AGRSLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class AGRSConfirmations (
    @SerialName("ERC20")
    val erc20: Long? = null,

    @SerialName("OMNI")
    val omni: Long? = null
)

@Serializable
data class AGRSLimits (
    val deposit: HilariousDeposit? = null,
    val withdraw: HilariousDeposit? = null
)

@Serializable
data class HilariousDeposit (
    @SerialName("ERC20")
    val erc20: Erc20? = null,

    @SerialName("OMNI")
    val omni: Erc20? = null
)

@Serializable
data class ProvidersClass (
    val deposits: List<String>? = null,
    val withdraws: List<String>? = null
)

@Serializable
data class Akro (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: AKRONetworks? = null,
    val confirmations: The1INCHConfirmations? = null,
    val limits: The1INCHLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class AKRONetworks (
    val withdraws: List<String>? = null,
    val default: String? = null
)

@Serializable
data class Algo (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ALGOConfirmations? = null,
    val limits: ALGOLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ALGOConfirmations (
    @SerialName("ALGORAND")
    val algorand: Long? = null
)

@Serializable
data class ALGOLimits (
    val deposit: AmbitiousDeposit? = null,
    val withdraw: AmbitiousDeposit? = null
)

@Serializable
data class AmbitiousDeposit (
    @SerialName("ALGORAND")
    val algorand: Erc20? = null
)

@Serializable
data class Amb (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: AMBConfirmations? = null,
    val limits: AMBLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class AMBConfirmations (
    @SerialName("AMB")
    val amb: Long? = null
)

@Serializable
data class AMBLimits (
    val deposit: CunningDeposit? = null,
    val withdraw: CunningDeposit? = null
)

@Serializable
data class CunningDeposit (
    @SerialName("AMB")
    val amb: Erc20? = null
)

@Serializable
data class Anime (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ANIMEConfirmations? = null,
    val limits: ANIMELimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ANIMEConfirmations (
    @SerialName("ARBITRUM")
    val arbitrum: Long? = null
)

@Serializable
data class ANIMELimits (
    val deposit: MagentaDeposit? = null,
    val withdraw: MagentaDeposit? = null
)

@Serializable
data class MagentaDeposit (
    @SerialName("ARBITRUM")
    val arbitrum: Erc20? = null
)

@Serializable
data class Ankr (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ProvidersClass? = null,
    val confirmations: Map<String, Long>? = null,
    val limits: ANKRLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ANKRLimits (
    val deposit: Map<String, Erc20>? = null,
    val withdraw: Map<String, Erc20>? = null
)

@Serializable
data class Apt (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: APTConfirmations? = null,
    val limits: APTLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class APTConfirmations (
    @SerialName("APT")
    val apt: Long? = null
)

@Serializable
data class APTLimits (
    val deposit: FriskyDeposit? = null,
    val withdraw: FriskyDeposit? = null
)

@Serializable
data class FriskyDeposit (
    @SerialName("APT")
    val apt: Erc20? = null
)

@Serializable
data class Ar (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ARConfirmations? = null,
    val limits: ARLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ARConfirmations (
    @SerialName("AR")
    val ar: Long? = null
)

@Serializable
data class ARLimits (
    val deposit: MischievousDeposit? = null,
    val withdraw: MischievousDeposit? = null
)

@Serializable
data class MischievousDeposit (
    @SerialName("AR")
    val ar: Erc20? = null
)

@Serializable
data class Ark (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ARKConfirmations? = null,
    val limits: ARKLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ARKConfirmations (
    @SerialName("ARK")
    val ark: Long? = null
)

@Serializable
data class ARKLimits (
    val deposit: BraggadociousDeposit? = null,
    val withdraw: BraggadociousDeposit? = null
)

@Serializable
data class BraggadociousDeposit (
    @SerialName("ARK")
    val ark: Erc20? = null
)

@Serializable
data class Ash (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ASHConfirmations? = null,
    val limits: ASHLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ASHConfirmations (
    @SerialName("ASH")
    val ash: Long? = null
)

@Serializable
data class ASHLimits (
    val deposit: Deposit1? = null,
    val withdraw: Deposit1? = null
)

@Serializable
data class Deposit1 (
    @SerialName("ASH")
    val ash: Erc20? = null
)

@Serializable
data class Astr (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ASTRConfirmations? = null,
    val limits: ASTRLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ASTRConfirmations (
    @SerialName("ASTR")
    val astr: Long? = null
)

@Serializable
data class ASTRLimits (
    val deposit: Deposit2? = null,
    val withdraw: Deposit2? = null
)

@Serializable
data class Deposit2 (
    @SerialName("ASTR")
    val astr: Erc20? = null
)

@Serializable
data class Atom (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ATOMConfirmations? = null,
    val limits: ATOMLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ATOMConfirmations (
    @SerialName("ATOM")
    val atom: Long? = null
)

@Serializable
data class ATOMLimits (
    val deposit: Deposit3? = null,
    val withdraw: Deposit3? = null
)

@Serializable
data class Deposit3 (
    @SerialName("ATOM")
    val atom: Erc20? = null
)

@Serializable
data class Ava (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val confirmations: The1INCHConfirmations? = null,
    val limits: The1INCHLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class Avail (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: AVAILConfirmations? = null,
    val limits: AVAILLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class AVAILConfirmations (
    @SerialName("AVAIL")
    val avail: Long? = null
)

@Serializable
data class AVAILLimits (
    val deposit: Deposit4? = null,
    val withdraw: Deposit4? = null
)

@Serializable
data class Deposit4 (
    @SerialName("AVAIL")
    val avail: Erc20? = null
)

@Serializable
data class Avax (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: AVAXConfirmations? = null,
    val limits: AVAXLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class AVAXConfirmations (
    @SerialName("CCHAIN")
    val cchain: Long? = null,

    @SerialName("XCHAIN")
    val xchain: Long? = null
)

@Serializable
data class AVAXLimits (
    val deposit: Deposit5? = null,
    val withdraw: Deposit5? = null
)

@Serializable
data class Deposit5 (
    @SerialName("CCHAIN")
    val cchain: Erc20? = null,

    @SerialName("XCHAIN")
    val xchain: Erc20? = null
)

@Serializable
data class Axel (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: AXELConfirmations? = null,
    val limits: AXELLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class AXELConfirmations (
    @SerialName("AXEL")
    val axel: Long? = null
)

@Serializable
data class AXELLimits (
    val deposit: Deposit6? = null,
    val withdraw: Deposit6? = null
)

@Serializable
data class Deposit6 (
    @SerialName("AXEL")
    val axel: Erc20? = null
)

@Serializable
data class Azero (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val confirmations: AZEROConfirmations? = null,
    val limits: AZEROLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class AZEROConfirmations (
    @SerialName("AZERO")
    val azero: Long? = null
)

@Serializable
data class AZEROLimits (
    val deposit: Deposit7? = null,
    val withdraw: Deposit7? = null
)

@Serializable
data class Deposit7 (
    @SerialName("AZERO")
    val azero: Erc20? = null
)

@Serializable
data class Bb (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val confirmations: BBConfirmations? = null,
    val limits: BBLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class BBConfirmations (
    @SerialName("BOUNCEBIT")
    val bouncebit: Long? = null
)

@Serializable
data class BBLimits (
    val deposit: Deposit8? = null,
    val withdraw: Deposit8? = null
)

@Serializable
data class Deposit8 (
    @SerialName("BOUNCEBIT")
    val bouncebit: Erc20? = null
)

@Serializable
data class Bch (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: BCHConfirmations? = null,
    val limits: BCHLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class BCHConfirmations (
    @SerialName("BCH")
    val bch: Long? = null
)

@Serializable
data class BCHLimits (
    val deposit: Deposit9? = null,
    val withdraw: Deposit9? = null
)

@Serializable
data class Deposit9 (
    @SerialName("BCH")
    val bch: Erc20? = null
)

@Serializable
data class Bgn (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val providers: Providers? = null,
    val limits: BGNLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class BGNLimits (
    val deposit: Deposit10? = null,
    val withdraw: Deposit10? = null
)

@Serializable
data class Deposit10 (
    @SerialName("BGN")
    val bgn: Erc20? = null
)

@Serializable
class Providers()

@Serializable
data class Bitci (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: BITCIConfirmations? = null,
    val limits: BITCILimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class BITCIConfirmations (
    @SerialName("BITCI")
    val bitci: Long? = null
)

@Serializable
data class BITCILimits (
    val deposit: Deposit11? = null,
    val withdraw: Deposit11? = null
)

@Serializable
data class Deposit11 (
    @SerialName("BITCI")
    val bitci: Erc20? = null
)

@Serializable
data class Bnb (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val confirmations: BNBConfirmations? = null,
    val limits: BNBLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class BNBConfirmations (
    @SerialName("BEP2")
    val bep2: Long? = null,

    @SerialName("BEP20")
    val bep20: Long? = null
)

@Serializable
data class BNBLimits (
    val deposit: Deposit12? = null,
    val withdraw: Deposit12? = null
)

@Serializable
data class Deposit12 (
    @SerialName("BEP2")
    val bep2: Erc20? = null,

    @SerialName("BEP20")
    val bep20: Erc20? = null
)

@Serializable
data class Bsx (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val confirmations: AGENTConfirmations? = null,
    val limits: AGENTLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class Btc (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: BTCConfirmations? = null,
    val limits: BTCLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class BTCConfirmations (
    @SerialName("BTC")
    val btc: Long? = null
)

@Serializable
data class BTCLimits (
    val deposit: Deposit13? = null,
    val withdraw: Deposit13? = null
)

@Serializable
data class Deposit13 (
    @SerialName("BTC")
    val btc: Erc20? = null
)

@Serializable
data class Btcz (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: BTCZConfirmations? = null,
    val limits: BTCZLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class BTCZConfirmations (
    @SerialName("BTCZ")
    val btcz: Long? = null
)

@Serializable
data class BTCZLimits (
    val deposit: Deposit14? = null,
    val withdraw: Deposit14? = null
)

@Serializable
data class Deposit14 (
    @SerialName("BTCZ")
    val btcz: Erc20? = null
)

@Serializable
data class Btt (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: BTTConfirmations? = null,
    val limits: BTTLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class BTTConfirmations (
    @SerialName("TRC20")
    val trc20: Long? = null
)

@Serializable
data class BTTLimits (
    val deposit: Deposit15? = null,
    val withdraw: Deposit15? = null
)

@Serializable
data class Deposit15 (
    @SerialName("TRC20")
    val trc20: Erc20? = null
)

@Serializable
data class Cati (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: CATIConfirmations? = null,
    val limits: CATILimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class CATIConfirmations (
    @SerialName("TON")
    val ton: Long? = null
)

@Serializable
data class CATILimits (
    val deposit: Deposit16? = null,
    val withdraw: Deposit16? = null
)

@Serializable
data class Deposit16 (
    @SerialName("TON")
    val ton: Erc20? = null
)

@Serializable
data class Ccc (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: CCCConfirmations? = null,
    val limits: CCCLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class CCCConfirmations (
    @SerialName("POLYGON")
    val polygon: Long? = null
)

@Serializable
data class CCCLimits (
    val deposit: Deposit17? = null,
    val withdraw: Deposit17? = null
)

@Serializable
data class Deposit17 (
    @SerialName("POLYGON")
    val polygon: Erc20? = null
)

@Serializable
data class Celo (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: CELOConfirmations? = null,
    val limits: CELOLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class CELOConfirmations (
    @SerialName("CELO")
    val celo: Long? = null
)

@Serializable
data class CELOLimits (
    val deposit: Deposit18? = null,
    val withdraw: Deposit18? = null
)

@Serializable
data class Deposit18 (
    @SerialName("CELO")
    val celo: Erc20? = null
)

@Serializable
data class Cetus (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: CETUSConfirmations? = null,
    val limits: CETUSLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class CETUSConfirmations (
    @SerialName("SUI")
    val sui: Long? = null
)

@Serializable
data class CETUSLimits (
    val deposit: Deposit19? = null,
    val withdraw: Deposit19? = null
)

@Serializable
data class Deposit19 (
    @SerialName("SUI")
    val sui: Erc20? = null
)

@Serializable
data class Ckb (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: CKBConfirmations? = null,
    val limits: CKBLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class CKBConfirmations (
    @SerialName("CKB")
    val ckb: Long? = null
)

@Serializable
data class CKBLimits (
    val deposit: Deposit20? = null,
    val withdraw: Deposit20? = null
)

@Serializable
data class Deposit20 (
    @SerialName("CKB")
    val ckb: Erc20? = null
)

@Serializable
data class Czk (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val providers: Providers? = null,
    val limits: CZKLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class CZKLimits (
    val deposit: Deposit21? = null,
    val withdraw: Deposit21? = null
)

@Serializable
data class Deposit21 (
    @SerialName("CZK")
    val czk: Erc20? = null
)

@Serializable
data class Dash (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: DASHConfirmations? = null,
    val limits: DASHLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class DASHConfirmations (
    @SerialName("DASH")
    val dash: Long? = null
)

@Serializable
data class DASHLimits (
    val deposit: Deposit22? = null,
    val withdraw: Deposit22? = null
)

@Serializable
data class Deposit22 (
    @SerialName("DASH")
    val dash: Erc20? = null
)

@Serializable
data class Dbtc (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val limits: DBTCLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class DBTCLimits (
    val deposit: Deposit23? = null,
    val withdraw: Deposit23? = null
)

@Serializable
data class Deposit23 (
    @SerialName("DBTC")
    val dbtc: Erc20? = null
)

@Serializable
data class Decl (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val limits: DECLLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class DECLLimits (
    val deposit: Deposit24? = null,
    val withdraw: Deposit24? = null
)

@Serializable
data class Deposit24 (
    @SerialName("DECL")
    val decl: Erc20? = null
)

@Serializable
data class Doge (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: DOGEConfirmations? = null,
    val limits: DOGELimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class DOGEConfirmations (
    @SerialName("DOGE")
    val doge: Long? = null
)

@Serializable
data class DOGELimits (
    val deposit: Deposit25? = null,
    val withdraw: Deposit25? = null
)

@Serializable
data class Deposit25 (
    @SerialName("DOGE")
    val doge: Erc20? = null
)

@Serializable
data class Dot (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ProvidersClass? = null,
    val confirmations: DOTConfirmations? = null,
    val limits: DOTLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class DOTConfirmations (
    @SerialName("ASSETHUB")
    val assethub: Long? = null,

    @SerialName("DOT")
    val dot: Long? = null
)

@Serializable
data class DOTLimits (
    val deposit: Deposit26? = null,
    val withdraw: Deposit26? = null
)

@Serializable
data class Deposit26 (
    @SerialName("ASSETHUB")
    val assethub: Erc20? = null,

    @SerialName("DOT")
    val dot: Erc20? = null
)

@Serializable
data class Dusdt (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val limits: DUSDTLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class DUSDTLimits (
    val deposit: Deposit27? = null,
    val withdraw: Deposit27? = null
)

@Serializable
data class Deposit27 (
    @SerialName("DUSDT")
    val dusdt: Erc20? = null
)

@Serializable
data class Dym (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: DYMConfirmations? = null,
    val limits: DYMLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class DYMConfirmations (
    @SerialName("DYM")
    val dym: Long? = null
)

@Serializable
data class DYMLimits (
    val deposit: Deposit28? = null,
    val withdraw: Deposit28? = null
)

@Serializable
data class Deposit28 (
    @SerialName("DYM")
    val dym: Erc20? = null
)

@Serializable
data class Egld (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val confirmations: EGLDConfirmations? = null,
    val limits: EGLDLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class EGLDConfirmations (
    @SerialName("EGLD")
    val egld: Long? = null
)

@Serializable
data class EGLDLimits (
    val deposit: Deposit29? = null,
    val withdraw: Deposit29? = null
)

@Serializable
data class Deposit29 (
    @SerialName("EGLD")
    val egld: Erc20? = null
)

@Serializable
data class Enj (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ENJConfirmations? = null,
    val limits: ENJLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ENJConfirmations (
    @SerialName("ENJ")
    val enj: Long? = null
)

@Serializable
data class ENJLimits (
    val deposit: Deposit30? = null,
    val withdraw: Deposit30? = null
)

@Serializable
data class Deposit30 (
    @SerialName("ENJ")
    val enj: Erc20? = null
)

@Serializable
data class EOS (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: EOSConfirmations? = null,
    val limits: EOSLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class EOSConfirmations (
    @SerialName("EOS")
    val eos: Long? = null
)

@Serializable
data class EOSLimits (
    val deposit: Deposit31? = null,
    val withdraw: Deposit31? = null
)

@Serializable
data class Deposit31 (
    @SerialName("EOS")
    val eos: Erc20? = null
)

@Serializable
data class Eq (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: EQConfirmations? = null,
    val limits: EQLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class EQConfirmations (
    @SerialName("XRP")
    val xrp: Long? = null
)

@Serializable
data class EQLimits (
    val deposit: Deposit32? = null,
    val withdraw: Deposit32? = null
)

@Serializable
data class Deposit32 (
    @SerialName("XRP")
    val xrp: Erc20? = null
)

@Serializable
data class Etc (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ETCConfirmations? = null,
    val limits: ETCLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ETCConfirmations (
    @SerialName("ETC")
    val etc: Long? = null
)

@Serializable
data class ETCLimits (
    val deposit: Deposit33? = null,
    val withdraw: Deposit33? = null
)

@Serializable
data class Deposit33 (
    @SerialName("ETC")
    val etc: Erc20? = null
)

@Serializable
data class Eth (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ETHConfirmations? = null,
    val limits: ETHLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ETHConfirmations (
    @SerialName("ARBITRUM")
    val arbitrum: Long? = null,

    @SerialName("BASE")
    val base: Long? = null,

    @SerialName("BEP20")
    val bep20: Long? = null,

    @SerialName("ERC20")
    val erc20: Long? = null,

    @SerialName("OPTIMISM")
    val optimism: Long? = null,

    @SerialName("SCROLL")
    val scroll: Long? = null,

    @SerialName("STARKNET")
    val starknet: Long? = null,

    @SerialName("ZKSYNC")
    val zksync: Long? = null
)

@Serializable
data class ETHLimits (
    val deposit: Deposit34? = null,
    val withdraw: Deposit34? = null
)

@Serializable
data class Deposit34 (
    @SerialName("ARBITRUM")
    val arbitrum: Erc20? = null,

    @SerialName("BASE")
    val base: Erc20? = null,

    @SerialName("BEP20")
    val bep20: Erc20? = null,

    @SerialName("ERC20")
    val erc20: Erc20? = null,

    @SerialName("OPTIMISM")
    val optimism: Erc20? = null,

    @SerialName("SCROLL")
    val scroll: Erc20? = null,

    @SerialName("STARKNET")
    val starknet: Erc20? = null,

    @SerialName("ZKSYNC")
    val zksync: Erc20? = null
)

@Serializable
data class Ethw (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ETHWConfirmations? = null,
    val limits: ETHWLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ETHWConfirmations (
    @SerialName("ETHW")
    val ethw: Long? = null
)

@Serializable
data class ETHWLimits (
    val deposit: Deposit35? = null,
    val withdraw: Deposit35? = null
)

@Serializable
data class Deposit35 (
    @SerialName("ETHW")
    val ethw: Erc20? = null
)

@Serializable
data class Eur (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val providers: ProvidersClass? = null,
    val limits: EURLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class EURLimits (
    val deposit: Deposit36? = null,
    val withdraw: Deposit36? = null
)

@Serializable
data class Deposit36 (
    @SerialName("EUR")
    val eur: Erc20? = null
)

@Serializable
data class Fil (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: FILConfirmations? = null,
    val limits: FILLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class FILConfirmations (
    @SerialName("FIL")
    val fil: Long? = null
)

@Serializable
data class FILLimits (
    val deposit: Deposit37? = null,
    val withdraw: Deposit37? = null
)

@Serializable
data class Deposit37 (
    @SerialName("FIL")
    val fil: Erc20? = null
)

@Serializable
data class Flow (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: FLOWConfirmations? = null,
    val limits: FLOWLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class FLOWConfirmations (
    @SerialName("FLOW")
    val flow: Long? = null
)

@Serializable
data class FLOWLimits (
    val deposit: Deposit38? = null,
    val withdraw: Deposit38? = null
)

@Serializable
data class Deposit38 (
    @SerialName("FLOW")
    val flow: Erc20? = null
)

@Serializable
data class Frbk (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: AKRONetworks? = null,
    val confirmations: ACEConfirmations? = null,
    val limits: ACELimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class Ftm (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val confirmations: FTMConfirmations? = null,
    val limits: FTMLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class FTMConfirmations (
    @SerialName("FANTOM")
    val fantom: Long? = null
)

@Serializable
data class FTMLimits (
    val deposit: Deposit39? = null,
    val withdraw: Deposit39? = null
)

@Serializable
data class Deposit39 (
    @SerialName("FANTOM")
    val fantom: Erc20? = null
)

@Serializable
data class Ftn (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: FTNConfirmations? = null,
    val limits: FTNLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class FTNConfirmations (
    @SerialName("FTN")
    val ftn: Long? = null
)

@Serializable
data class FTNLimits (
    val deposit: Deposit40? = null,
    val withdraw: Deposit40? = null
)

@Serializable
data class Deposit40 (
    @SerialName("FTN")
    val ftn: Erc20? = null
)

@Serializable
data class Gbp (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val providers: Providers? = null,
    val limits: GBPLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class GBPLimits (
    val deposit: Deposit41? = null,
    val withdraw: Deposit41? = null
)

@Serializable
data class Deposit41 (
    @SerialName("GBP")
    val gbp: Erc20? = null
)

@Serializable
data class Glmr (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: GLMRConfirmations? = null,
    val limits: GLMRLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class GLMRConfirmations (
    @SerialName("GLMR")
    val glmr: Long? = null
)

@Serializable
data class GLMRLimits (
    val deposit: Deposit42? = null,
    val withdraw: Deposit42? = null
)

@Serializable
data class Deposit42 (
    @SerialName("GLMR")
    val glmr: Erc20? = null
)

@Serializable
data class Gmt (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val confirmations: ACTConfirmations? = null,
    val limits: ACTLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class Gulfold (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val limits: GULFOLDLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class GULFOLDLimits (
    val deposit: Deposit43? = null,
    val withdraw: Deposit43? = null
)

@Serializable
data class Deposit43 (
    @SerialName("GULFOLD")
    val gulfold: Erc20? = null
)

@Serializable
data class Hai (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: HAIConfirmations? = null,
    val limits: HAILimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class HAIConfirmations (
    @SerialName("VET")
    val vet: Long? = null
)

@Serializable
data class HAILimits (
    val deposit: Deposit44? = null,
    val withdraw: Deposit44? = null
)

@Serializable
data class Deposit44 (
    @SerialName("VET")
    val vet: Erc20? = null
)

@Serializable
data class Hbar (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: HBARConfirmations? = null,
    val limits: HBARLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class HBARConfirmations (
    @SerialName("HBAR")
    val hbar: Long? = null
)

@Serializable
data class HBARLimits (
    val deposit: Deposit45? = null,
    val withdraw: Deposit45? = null
)

@Serializable
data class Deposit45 (
    @SerialName("HBAR")
    val hbar: Erc20? = null
)

@Serializable
data class Hot (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val limits: HOTLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class HOTLimits (
    val deposit: Deposit46? = null,
    val withdraw: Deposit46? = null
)

@Serializable
data class Deposit46 (
    @SerialName("HOT")
    val hot: Erc20? = null
)

@Serializable
data class ICP (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ICPConfirmations? = null,
    val limits: ICPLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ICPConfirmations (
    @SerialName("ICP")
    val icp: Long? = null
)

@Serializable
data class ICPLimits (
    val deposit: Deposit47? = null,
    val withdraw: Deposit47? = null
)

@Serializable
data class Deposit47 (
    @SerialName("ICP")
    val icp: Erc20? = null
)

@Serializable
data class Icx (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ICXConfirmations? = null,
    val limits: ICXLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ICXConfirmations (
    @SerialName("ICX")
    val icx: Long? = null
)

@Serializable
data class ICXLimits (
    val deposit: Deposit48? = null,
    val withdraw: Deposit48? = null
)

@Serializable
data class Deposit48 (
    @SerialName("ICX")
    val icx: Erc20? = null
)

@Serializable
data class Inj (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ProvidersClass? = null,
    val confirmations: INJConfirmations? = null,
    val limits: INJLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class INJConfirmations (
    @SerialName("ERC20")
    val erc20: Long? = null,

    @SerialName("INJECTIVE")
    val injective: Long? = null
)

@Serializable
data class INJLimits (
    val deposit: Deposit49? = null,
    val withdraw: Deposit49? = null
)

@Serializable
data class Deposit49 (
    @SerialName("ERC20")
    val erc20: Erc20? = null,

    @SerialName("INJECTIVE")
    val injective: Erc20? = null
)

@Serializable
data class Iost (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: IOSTConfirmations? = null,
    val limits: IOSTLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class IOSTConfirmations (
    @SerialName("IOST")
    val iost: Long? = null
)

@Serializable
data class IOSTLimits (
    val deposit: Deposit50? = null,
    val withdraw: Deposit50? = null
)

@Serializable
data class Deposit50 (
    @SerialName("IOST")
    val iost: Erc20? = null
)

@Serializable
data class Iotx (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: IOTXConfirmations? = null,
    val limits: IOTXLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class IOTXConfirmations (
    @SerialName("IOTX")
    val iotx: Long? = null
)

@Serializable
data class IOTXLimits (
    val deposit: Deposit51? = null,
    val withdraw: Deposit51? = null
)

@Serializable
data class Deposit51 (
    @SerialName("IOTX")
    val iotx: Erc20? = null
)

@Serializable
data class Joe (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: JOEConfirmations? = null,
    val limits: JOELimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class JOEConfirmations (
    @SerialName("CCHAIN")
    val cchain: Long? = null
)

@Serializable
data class JOELimits (
    val deposit: Deposit52? = null,
    val withdraw: Deposit52? = null
)

@Serializable
data class Deposit52 (
    @SerialName("CCHAIN")
    val cchain: Erc20? = null
)

@Serializable
data class Kaia (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: KAIAConfirmations? = null,
    val limits: KAIALimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class KAIAConfirmations (
    @SerialName("KAIA")
    val kaia: Long? = null
)

@Serializable
data class KAIALimits (
    val deposit: Deposit53? = null,
    val withdraw: Deposit53? = null
)

@Serializable
data class Deposit53 (
    @SerialName("KAIA")
    val kaia: Erc20? = null
)

@Serializable
data class Kava (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: KAVAConfirmations? = null,
    val limits: KAVALimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class KAVAConfirmations (
    @SerialName("KAVA")
    val kava: Long? = null
)

@Serializable
data class KAVALimits (
    val deposit: Deposit54? = null,
    val withdraw: Deposit54? = null
)

@Serializable
data class Deposit54 (
    @SerialName("KAVA")
    val kava: Erc20? = null
)

@Serializable
data class Klc (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: KLCConfirmations? = null,
    val limits: KLCLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class KLCConfirmations (
    @SerialName("KLC")
    val klc: Long? = null
)

@Serializable
data class KLCLimits (
    val deposit: Deposit55? = null,
    val withdraw: Deposit55? = null
)

@Serializable
data class Deposit55 (
    @SerialName("KLC")
    val klc: Erc20? = null
)

@Serializable
data class Ksm (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: KSMConfirmations? = null,
    val limits: KSMLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class KSMConfirmations (
    @SerialName("KSM")
    val ksm: Long? = null
)

@Serializable
data class KSMLimits (
    val deposit: Deposit56? = null,
    val withdraw: Deposit56? = null
)

@Serializable
data class Deposit56 (
    @SerialName("KSM")
    val ksm: Erc20? = null
)

@Serializable
data class Kzt (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val providers: ProvidersClass? = null,
    val limits: KZTLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class KZTLimits (
    val deposit: Deposit57? = null,
    val withdraw: Deposit57? = null
)

@Serializable
data class Deposit57 (
    @SerialName("KZT")
    val kzt: Erc20? = null
)

@Serializable
data class Leks (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ProvidersClass? = null,
    val confirmations: LEKSConfirmations? = null,
    val limits: LEKSLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class LEKSConfirmations (
    @SerialName("ERC20")
    val erc20: Long? = null,

    @SerialName("POLYGON")
    val polygon: Long? = null,

    @SerialName("WHITECHAIN")
    val whitechain: Long? = null
)

@Serializable
data class LEKSLimits (
    val deposit: Deposit58? = null,
    val withdraw: Deposit58? = null
)

@Serializable
data class Deposit58 (
    @SerialName("ERC20")
    val erc20: Erc20? = null,

    @SerialName("POLYGON")
    val polygon: Erc20? = null,

    @SerialName("WHITECHAIN")
    val whitechain: Erc20? = null
)

@Serializable
data class Ltc (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: LTCConfirmations? = null,
    val limits: LTCLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class LTCConfirmations (
    @SerialName("LTC")
    val ltc: Long? = null
)

@Serializable
data class LTCLimits (
    val deposit: Deposit59? = null,
    val withdraw: Deposit59? = null
)

@Serializable
data class Deposit59 (
    @SerialName("LTC")
    val ltc: Erc20? = null
)

@Serializable
data class Luna (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: LUNAConfirmations? = null,
    val limits: LUNALimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class LUNAConfirmations (
    @SerialName("LUNA")
    val luna: Long? = null
)

@Serializable
data class LUNALimits (
    val deposit: Deposit60? = null,
    val withdraw: Deposit60? = null
)

@Serializable
data class Deposit60 (
    @SerialName("LUNA")
    val luna: Erc20? = null
)

@Serializable
data class Lunc (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: AKRONetworks? = null,
    val confirmations: LUNCConfirmations? = null,
    val limits: LUNCLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class LUNCConfirmations (
    @SerialName("LUNC")
    val lunc: Long? = null
)

@Serializable
data class LUNCLimits (
    val deposit: Deposit61? = null,
    val withdraw: Deposit61? = null
)

@Serializable
data class Deposit61 (
    @SerialName("LUNC")
    val lunc: Erc20? = null
)

@Serializable
data class Manta (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: MANTAConfirmations? = null,
    val limits: MANTALimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class MANTAConfirmations (
    @SerialName("MANTA")
    val manta: Long? = null
)

@Serializable
data class MANTALimits (
    val deposit: Deposit62? = null,
    val withdraw: Deposit62? = null
)

@Serializable
data class Deposit62 (
    @SerialName("MANTA")
    val manta: Erc20? = null
)

@Serializable
data class Mtl (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: MTLConfirmations? = null,
    val limits: MTLLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class MTLConfirmations (
    @SerialName("METALL2")
    val metall2: Long? = null
)

@Serializable
data class MTLLimits (
    val deposit: Deposit63? = null,
    val withdraw: Deposit63? = null
)

@Serializable
data class Deposit63 (
    @SerialName("METALL2")
    val metall2: Erc20? = null
)

@Serializable
data class MWC (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: MWCConfirmations? = null,
    val limits: MWCLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class MWCConfirmations (
    @SerialName("MWC")
    val mwc: Long? = null
)

@Serializable
data class MWCLimits (
    val deposit: Deposit64? = null,
    val withdraw: Deposit64? = null
)

@Serializable
data class Deposit64 (
    @SerialName("MWC")
    val mwc: Erc20? = null
)

@Serializable
data class Ncn (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: NCNConfirmations? = null,
    val limits: NCNLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class NCNConfirmations (
    @SerialName("NCN")
    val ncn: Long? = null
)

@Serializable
data class NCNLimits (
    val deposit: Deposit65? = null,
    val withdraw: Deposit65? = null
)

@Serializable
data class Deposit65 (
    @SerialName("NCN")
    val ncn: Erc20? = null
)

@Serializable
data class Near (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: NEARConfirmations? = null,
    val limits: NEARLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class NEARConfirmations (
    @SerialName("NEAR")
    val near: Long? = null
)

@Serializable
data class NEARLimits (
    val deposit: Deposit66? = null,
    val withdraw: Deposit66? = null
)

@Serializable
data class Deposit66 (
    @SerialName("NEAR")
    val near: Erc20? = null
)

@Serializable
data class Neo (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: NEOConfirmations? = null,
    val limits: NEOLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class NEOConfirmations (
    @SerialName("NEO")
    val neo: Long? = null
)

@Serializable
data class NEOLimits (
    val deposit: Deposit67? = null,
    val withdraw: Deposit67? = null
)

@Serializable
data class Deposit67 (
    @SerialName("NEO")
    val neo: USDClass? = null
)

@Serializable
data class USDClass (
    val max: String? = null,
    val min: String? = null
)

@Serializable
data class Ont (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ONTConfirmations? = null,
    val limits: ONTLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ONTConfirmations (
    @SerialName("ONT")
    val ont: Long? = null
)

@Serializable
data class ONTLimits (
    val deposit: Deposit68? = null,
    val withdraw: Deposit68? = null
)

@Serializable
data class Deposit68 (
    @SerialName("ONT")
    val ont: Erc20? = null
)

@Serializable
data class Op (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: OPConfirmations? = null,
    val limits: OPLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class OPConfirmations (
    @SerialName("OPTIMISM")
    val optimism: Long? = null
)

@Serializable
data class OPLimits (
    val deposit: Deposit69? = null,
    val withdraw: Deposit69? = null
)

@Serializable
data class Deposit69 (
    @SerialName("OPTIMISM")
    val optimism: Erc20? = null
)

@Serializable
data class Ordi (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val limits: ORDILimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ORDILimits (
    val deposit: Deposit70? = null,
    val withdraw: Deposit70? = null
)

@Serializable
data class Deposit70 (
    @SerialName("ORDI")
    val ordi: Erc20? = null
)

@Serializable
data class Osmo (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: OSMOConfirmations? = null,
    val limits: OSMOLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class OSMOConfirmations (
    @SerialName("OSMO")
    val osmo: Long? = null
)

@Serializable
data class OSMOLimits (
    val deposit: Deposit71? = null,
    val withdraw: Deposit71? = null
)

@Serializable
data class Deposit71 (
    @SerialName("OSMO")
    val osmo: Erc20? = null
)

@Serializable
data class Pivx (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: PIVXConfirmations? = null,
    val limits: PIVXLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class PIVXConfirmations (
    @SerialName("PIVX")
    val pivx: Long? = null
)

@Serializable
data class PIVXLimits (
    val deposit: Deposit72? = null,
    val withdraw: Deposit72? = null
)

@Serializable
data class Deposit72 (
    @SerialName("PIVX")
    val pivx: Erc20? = null
)

@Serializable
data class Pln (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val providers: Providers? = null,
    val limits: PLNLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class PLNLimits (
    val deposit: Deposit73? = null,
    val withdraw: Deposit73? = null
)

@Serializable
data class Deposit73 (
    @SerialName("PLN")
    val pln: Erc20? = null
)

@Serializable
data class Pol (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ProvidersClass? = null,
    val confirmations: POLConfirmations? = null,
    val limits: POLLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class POLConfirmations (
    @SerialName("ERC20")
    val erc20: Long? = null,

    @SerialName("POLYGON")
    val polygon: Long? = null
)

@Serializable
data class POLLimits (
    val deposit: Deposit74? = null,
    val withdraw: Deposit74? = null
)

@Serializable
data class Deposit74 (
    @SerialName("ERC20")
    val erc20: Erc20? = null,

    @SerialName("POLYGON")
    val polygon: Erc20? = null
)

@Serializable
data class Promo (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val confirmations: ACEConfirmations? = null,
    val limits: ACELimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class Qtum (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: QTUMConfirmations? = null,
    val limits: QTUMLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class QTUMConfirmations (
    @SerialName("QTUM")
    val qtum: Long? = null
)

@Serializable
data class QTUMLimits (
    val deposit: Deposit75? = null,
    val withdraw: Deposit75? = null
)

@Serializable
data class Deposit75 (
    @SerialName("QTUM")
    val qtum: Erc20? = null
)

@Serializable
data class Rbt (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val confirmations: RBTConfirmations? = null,
    val limits: RBTLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class RBTConfirmations (
    @SerialName("RBT")
    val rbt: Long? = null
)

@Serializable
data class RBTLimits (
    val deposit: Deposit76? = null,
    val withdraw: Deposit76? = null
)

@Serializable
data class Deposit76 (
    @SerialName("RBT")
    val rbt: Erc20? = null
)

@Serializable
data class Ron (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: RONConfirmations? = null,
    val limits: RONLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class RONConfirmations (
    @SerialName("RON")
    val ron: Long? = null
)

@Serializable
data class RONLimits (
    val deposit: Deposit77? = null,
    val withdraw: Deposit77? = null
)

@Serializable
data class Deposit77 (
    @SerialName("RON")
    val ron: Erc20? = null
)

@Serializable
data class Rose (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ROSEConfirmations? = null,
    val limits: ROSELimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ROSEConfirmations (
    @SerialName("ROSE")
    val rose: Long? = null
)

@Serializable
data class ROSELimits (
    val deposit: Deposit78? = null,
    val withdraw: Deposit78? = null
)

@Serializable
data class Deposit78 (
    @SerialName("ROSE")
    val rose: Erc20? = null
)

@Serializable
data class Rune (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: RUNEConfirmations? = null,
    val limits: RUNELimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class RUNEConfirmations (
    @SerialName("THORCHAIN")
    val thorchain: Long? = null
)

@Serializable
data class RUNELimits (
    val deposit: Deposit79? = null,
    val withdraw: Deposit79? = null
)

@Serializable
data class Deposit79 (
    @SerialName("THORCHAIN")
    val thorchain: Erc20? = null
)

@Serializable
data class Rvn (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: RVNConfirmations? = null,
    val limits: RVNLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class RVNConfirmations (
    @SerialName("RAVENCOIN")
    val ravencoin: Long? = null
)

@Serializable
data class RVNLimits (
    val deposit: Deposit80? = null,
    val withdraw: Deposit80? = null
)

@Serializable
data class Deposit80 (
    @SerialName("RAVENCOIN")
    val ravencoin: Erc20? = null
)

@Serializable
data class S (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: SConfirmations? = null,
    val limits: SLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class SConfirmations (
    @SerialName("SONIC")
    val sonic: Long? = null
)

@Serializable
data class SLimits (
    val deposit: Deposit81? = null,
    val withdraw: Deposit81? = null
)

@Serializable
data class Deposit81 (
    @SerialName("SONIC")
    val sonic: Erc20? = null
)

@Serializable
data class Saga (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: SAGAConfirmations? = null,
    val limits: SAGALimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class SAGAConfirmations (
    @SerialName("SAGA")
    val saga: Long? = null
)

@Serializable
data class SAGALimits (
    val deposit: Deposit82? = null,
    val withdraw: Deposit82? = null
)

@Serializable
data class Deposit82 (
    @SerialName("SAGA")
    val saga: Erc20? = null
)

@Serializable
data class Scr (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: SCRConfirmations? = null,
    val limits: SCRLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class SCRConfirmations (
    @SerialName("SCROLL")
    val scroll: Long? = null
)

@Serializable
data class SCRLimits (
    val deposit: Deposit83? = null,
    val withdraw: Deposit83? = null
)

@Serializable
data class Deposit83 (
    @SerialName("SCROLL")
    val scroll: Erc20? = null
)

@Serializable
data class SEI (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: SEIConfirmations? = null,
    val limits: SEILimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class SEIConfirmations (
    @SerialName("SEI")
    val sei: Long? = null
)

@Serializable
data class SEILimits (
    val deposit: Deposit84? = null,
    val withdraw: Deposit84? = null
)

@Serializable
data class Deposit84 (
    @SerialName("SEI")
    val sei: Erc20? = null
)

@Serializable
data class Sonic (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: SONICNetworks? = null,
    val confirmations: ACTConfirmations? = null,
    val limits: ACTLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class SONICNetworks (
    val deposits: List<String>? = null,
    val default: String? = null
)

@Serializable
data class Sslx (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: SSLXConfirmations? = null,
    val limits: SSLXLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class SSLXConfirmations (
    @SerialName("STELLAR")
    val stellar: Long? = null
)

@Serializable
data class SSLXLimits (
    val deposit: Deposit85? = null,
    val withdraw: Deposit85? = null
)

@Serializable
data class Deposit85 (
    @SerialName("STELLAR")
    val stellar: Erc20? = null
)

@Serializable
data class Steem (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: STEEMConfirmations? = null,
    val limits: STEEMLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class STEEMConfirmations (
    @SerialName("STEEM")
    val steem: Long? = null
)

@Serializable
data class STEEMLimits (
    val deposit: Deposit86? = null,
    val withdraw: Deposit86? = null
)

@Serializable
data class Deposit86 (
    @SerialName("STEEM")
    val steem: Erc20? = null
)

@Serializable
data class Strk (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ProvidersClass? = null,
    val confirmations: STRKConfirmations? = null,
    val limits: STRKLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class STRKConfirmations (
    @SerialName("ERC20")
    val erc20: Long? = null,

    @SerialName("STARKNET")
    val starknet: Long? = null
)

@Serializable
data class STRKLimits (
    val deposit: Deposit87? = null,
    val withdraw: Deposit87? = null
)

@Serializable
data class Deposit87 (
    @SerialName("ERC20")
    val erc20: Erc20? = null,

    @SerialName("STARKNET")
    val starknet: Erc20? = null
)

@Serializable
data class Stx (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: STXConfirmations? = null,
    val limits: STXLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class STXConfirmations (
    @SerialName("STX")
    val stx: Long? = null
)

@Serializable
data class STXLimits (
    val deposit: Deposit88? = null,
    val withdraw: Deposit88? = null
)

@Serializable
data class Deposit88 (
    @SerialName("STX")
    val stx: Erc20? = null
)

@Serializable
data class Sxp (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: SXPConfirmations? = null,
    val limits: SXPLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class SXPConfirmations (
    @SerialName("SXP")
    val sxp: Long? = null
)

@Serializable
data class SXPLimits (
    val deposit: Deposit89? = null,
    val withdraw: Deposit89? = null
)

@Serializable
data class Deposit89 (
    @SerialName("SXP")
    val sxp: Erc20? = null
)

@Serializable
data class Sys (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val confirmations: SYSConfirmations? = null,
    val limits: SYSLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class SYSConfirmations (
    @SerialName("SYS")
    val sys: Long? = null
)

@Serializable
data class SYSLimits (
    val deposit: Deposit90? = null,
    val withdraw: Deposit90? = null
)

@Serializable
data class Deposit90 (
    @SerialName("SYS")
    val sys: Erc20? = null
)

@Serializable
data class TAO (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val confirmations: TAOConfirmations? = null,
    val limits: TAOLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class TAOConfirmations (
    @SerialName("TAO")
    val tao: Long? = null
)

@Serializable
data class TAOLimits (
    val deposit: Deposit91? = null,
    val withdraw: Deposit91? = null
)

@Serializable
data class Deposit91 (
    @SerialName("TAO")
    val tao: Erc20? = null
)

@Serializable
data class Tenet (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: TENETConfirmations? = null,
    val limits: TENETLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class TENETConfirmations (
    @SerialName("TENET")
    val tenet: Long? = null
)

@Serializable
data class TENETLimits (
    val deposit: Deposit92? = null,
    val withdraw: Deposit92? = null
)

@Serializable
data class Deposit92 (
    @SerialName("TENET")
    val tenet: Erc20? = null
)

@Serializable
data class Theta (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: THETAConfirmations? = null,
    val limits: THETALimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class THETAConfirmations (
    @SerialName("THETA")
    val theta: Long? = null
)

@Serializable
data class THETALimits (
    val deposit: Deposit93? = null,
    val withdraw: Deposit93? = null
)

@Serializable
data class Deposit93 (
    @SerialName("THETA")
    val theta: Erc20? = null
)

@Serializable
data class Tia (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: TIAConfirmations? = null,
    val limits: TIALimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class TIAConfirmations (
    @SerialName("CELESTIA")
    val celestia: Long? = null
)

@Serializable
data class TIALimits (
    val deposit: Deposit94? = null,
    val withdraw: Deposit94? = null
)

@Serializable
data class Deposit94 (
    @SerialName("CELESTIA")
    val celestia: Erc20? = null
)

@Serializable
data class Tusd (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: Map<String, Long>? = null,
    val limits: ANKRLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class Uah (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val providers: Providers? = null,
    val limits: UAHLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class UAHLimits (
    val deposit: Deposit96? = null,
    val withdraw: Deposit96? = null
)

@Serializable
data class Deposit96 (
    @SerialName("UAH")
    val uah: Erc20? = null
)

@Serializable
data class Usd (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val providers: ProvidersClass? = null,
    val limits: USDLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class USDLimits (
    val deposit: Deposit97? = null,
    val withdraw: Deposit97? = null
)

@Serializable
data class Deposit97 (
    @SerialName("USD")
    val usd: USDClass? = null
)

@Serializable
data class Usdc (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: USDCConfirmations? = null,
    val limits: USDCLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class USDCConfirmations (
    @SerialName("CCHAIN")
    val cchain: Long? = null,

    @SerialName("ERC20")
    val erc20: Long? = null,

    @SerialName("NEAR")
    val near: Long? = null,

    @SerialName("POLYGON")
    val polygon: Long? = null,

    @SerialName("SOL")
    val sol: Long? = null,

    @SerialName("STELLAR")
    val stellar: Long? = null,

    @SerialName("TRC20")
    val trc20: Long? = null,

    @SerialName("WHITECHAIN")
    val whitechain: Long? = null
)

@Serializable
data class USDCLimits (
    val deposit: Deposit98? = null,
    val withdraw: Deposit98? = null
)

@Serializable
data class Deposit98 (
    @SerialName("CCHAIN")
    val cchain: Erc20? = null,

    @SerialName("ERC20")
    val erc20: Erc20? = null,

    @SerialName("NEAR")
    val near: Erc20? = null,

    @SerialName("POLYGON")
    val polygon: Erc20? = null,

    @SerialName("SOL")
    val sol: Erc20? = null,

    @SerialName("STELLAR")
    val stellar: Erc20? = null,

    @SerialName("TRC20")
    val trc20: Erc20? = null,

    @SerialName("WHITECHAIN")
    val whitechain: Erc20? = null
)

@Serializable
data class Usdtb (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val limits: USDTBLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class USDTBLimits (
    val deposit: Deposit99? = null,
    val withdraw: Deposit99? = null
)

@Serializable
data class Deposit99 (
    @SerialName("USDTB")
    val usdtb: Erc20? = null
)

@Serializable
data class Vnt (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: VNTConfirmations? = null,
    val limits: VNTLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class VNTConfirmations (
    @SerialName("WHITECHAIN")
    val whitechain: Long? = null
)

@Serializable
data class VNTLimits (
    val deposit: Deposit100? = null,
    val withdraw: Deposit100? = null
)

@Serializable
data class Deposit100 (
    @SerialName("WHITECHAIN")
    val whitechain: Erc20? = null
)

@Serializable
data class Waxp (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: WAXPConfirmations? = null,
    val limits: WAXPLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class WAXPConfirmations (
    @SerialName("WAXP")
    val waxp: Long? = null
)

@Serializable
data class WAXPLimits (
    val deposit: Deposit101? = null,
    val withdraw: Deposit101? = null
)

@Serializable
data class Deposit101 (
    @SerialName("WAXP")
    val waxp: Erc20? = null
)

@Serializable
data class Wbt (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ProvidersClass? = null,
    val confirmations: WBTConfirmations? = null,
    val limits: WBTLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class WBTConfirmations (
    @SerialName("ERC20")
    val erc20: Long? = null,

    @SerialName("TRC20")
    val trc20: Long? = null,

    @SerialName("WHITECHAIN")
    val whitechain: Long? = null
)

@Serializable
data class WBTLimits (
    val deposit: Deposit102? = null,
    val withdraw: Deposit102? = null
)

@Serializable
data class Deposit102 (
    @SerialName("ERC20")
    val erc20: Erc20? = null,

    @SerialName("TRC20")
    val trc20: Erc20? = null,

    @SerialName("WHITECHAIN")
    val whitechain: Erc20? = null
)

@Serializable
data class Try (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val providers: ProvidersClass? = null,
    val limits: TRYLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class TRYLimits (
    val deposit: Deposit95? = null,
    val withdraw: Deposit95? = null
)

@Serializable
data class Deposit95 (
    @SerialName("TRY")
    val depositTRY: Erc20? = null
)

@Serializable
data class Xdc (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: XDCConfirmations? = null,
    val limits: XDCLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class XDCConfirmations (
    @SerialName("XDC")
    val xdc: Long? = null
)

@Serializable
data class XDCLimits (
    val deposit: Deposit103? = null,
    val withdraw: Deposit103? = null
)

@Serializable
data class Deposit103 (
    @SerialName("XDC")
    val xdc: Erc20? = null
)

@Serializable
data class Xec (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: XECConfirmations? = null,
    val limits: XECLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class XECConfirmations (
    @SerialName("XEC")
    val xec: Long? = null
)

@Serializable
data class XECLimits (
    val deposit: Deposit104? = null,
    val withdraw: Deposit104? = null
)

@Serializable
data class Deposit104 (
    @SerialName("XEC")
    val xec: Erc20? = null
)

@Serializable
data class Xem (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: XEMConfirmations? = null,
    val limits: XEMLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class XEMConfirmations (
    @SerialName("XEM")
    val xem: Long? = null
)

@Serializable
data class XEMLimits (
    val deposit: Deposit105? = null,
    val withdraw: Deposit105? = null
)

@Serializable
data class Deposit105 (
    @SerialName("XEM")
    val xem: Erc20? = null
)

@Serializable
data class Xfc (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: XFCConfirmations? = null,
    val limits: XFCLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class XFCConfirmations (
    @SerialName("XFC")
    val xfc: Long? = null
)

@Serializable
data class XFCLimits (
    val deposit: Deposit106? = null,
    val withdraw: Deposit106? = null
)

@Serializable
data class Deposit106 (
    @SerialName("XFC")
    val xfc: Erc20? = null
)

@Serializable
data class Xmr (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: XMRConfirmations? = null,
    val limits: XMRLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class XMRConfirmations (
    @SerialName("XMR")
    val xmr: Long? = null
)

@Serializable
data class XMRLimits (
    val deposit: Deposit107? = null,
    val withdraw: Deposit107? = null
)

@Serializable
data class Deposit107 (
    @SerialName("XMR")
    val xmr: Erc20? = null
)

@Serializable
data class Xtz (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: XTZConfirmations? = null,
    val limits: XTZLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class XTZConfirmations (
    @SerialName("XTZ")
    val xtz: Long? = null
)

@Serializable
data class XTZLimits (
    val deposit: Deposit108? = null,
    val withdraw: Deposit108? = null
)

@Serializable
data class Deposit108 (
    @SerialName("XTZ")
    val xtz: Erc20? = null
)

@Serializable
data class Zec (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ZECConfirmations? = null,
    val limits: ZECLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ZECConfirmations (
    @SerialName("ZEC")
    val zec: Long? = null
)

@Serializable
data class ZECLimits (
    val deposit: Deposit109? = null,
    val withdraw: Deposit109? = null
)

@Serializable
data class Deposit109 (
    @SerialName("ZEC")
    val zec: Erc20? = null
)

@Serializable
data class Zen (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ZENConfirmations? = null,
    val limits: ZENLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ZENConfirmations (
    @SerialName("ZEN")
    val zen: Long? = null
)

@Serializable
data class ZENLimits (
    val deposit: Deposit110? = null,
    val withdraw: Deposit110? = null
)

@Serializable
data class Deposit110 (
    @SerialName("ZEN")
    val zen: Erc20? = null
)

@Serializable
data class Zero (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: ADKNetworks? = null,
    val confirmations: ZEROConfirmations? = null,
    val limits: ZEROLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ZEROConfirmations (
    @SerialName("LINEA")
    val linea: Long? = null
)

@Serializable
data class ZEROLimits (
    val deposit: Deposit111? = null,
    val withdraw: Deposit111? = null
)

@Serializable
data class Deposit111 (
    @SerialName("LINEA")
    val linea: Erc20? = null
)

@Serializable
data class Zil (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ZILConfirmations? = null,
    val limits: ZILLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ZILConfirmations (
    @SerialName("ZIL")
    val zil: Long? = null
)

@Serializable
data class ZILLimits (
    val deposit: Deposit112? = null,
    val withdraw: Deposit112? = null
)

@Serializable
data class Deposit112 (
    @SerialName("ZIL")
    val zil: Erc20? = null
)

@Serializable
data class Zk (
    val name: String? = null,

    @SerialName("unified_cryptoasset_id")
    val unifiedCryptoassetID: Long? = null,

    @SerialName("can_withdraw")
    val canWithdraw: Boolean? = null,

    @SerialName("can_deposit")
    val canDeposit: Boolean? = null,

    @SerialName("min_withdraw")
    val minWithdraw: String? = null,

    @SerialName("max_withdraw")
    val maxWithdraw: String? = null,

    @SerialName("maker_fee")
    val makerFee: String? = null,

    @SerialName("taker_fee")
    val takerFee: String? = null,

    @SerialName("min_deposit")
    val minDeposit: String? = null,

    @SerialName("max_deposit")
    val maxDeposit: String? = null,

    val networks: The1INCHNetworks? = null,
    val confirmations: ZKConfirmations? = null,
    val limits: ZKLimits? = null,

    @SerialName("currency_precision")
    val currencyPrecision: Long? = null,

    @SerialName("is_memo")
    val isMemo: Boolean? = null
)

@Serializable
data class ZKConfirmations (
    @SerialName("ZKSYNC")
    val zksync: Long? = null
)

@Serializable
data class ZKLimits (
    val deposit: Deposit113? = null,
    val withdraw: Deposit113? = null
)

@Serializable
data class Deposit113 (
    @SerialName("ZKSYNC")
    val zksync: Erc20? = null
)

