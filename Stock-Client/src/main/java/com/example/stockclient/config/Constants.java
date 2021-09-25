package com.example.stockclient.config;

public interface Constants {

    interface Endpoints {

        String SYMBOLS_API = "https://sandbox.iexapis.com/stable/ref-data/symbols?token=Tpk_ee567917a6b640bb8602834c9d30e571";
        String COMPANY_DATA_API = "https://cloud.iexapis.com/stable/stock/%s/quote?token=sk_cbf6f475799a4c259262732a6d029893";
        String SANBOX_TOKEN = "token=Tpk_ee567917a6b640bb8602834c9d30e571";
    }

    interface MockedJsonResponses{
        String AMZN = "{\n" +
                "    \"symbol\": \"AMZN\",\n" +
                "    \"companyName\": \"Amazon.com Inc.\",\n" +
                "    \"primaryExchange\": \"EGSE QLAR)ACM/(DKGNSTT NA EBSAOLL\",\n" +
                "    \"calculationPrice\": \"close\",\n" +
                "    \"open\": 3331.3,\n" +
                "    \"openTime\": 1633638169932,\n" +
                "    \"openSource\": \"iilfafoc\",\n" +
                "    \"close\": 3391.38,\n" +
                "    \"closeTime\": 1696529069255,\n" +
                "    \"closeSource\": \"ffalioci\",\n" +
                "    \"high\": 3427.49,\n" +
                "    \"highTime\": 1656221714064,\n" +
                "    \"highSource\": \"ud5tym ed aenlce1ripie \",\n" +
                "    \"low\": 3381.74,\n" +
                "    \"lowTime\": 1623683111472,\n" +
                "    \"lowSource\": \"t yeunmar5ep ceei1ddli \",\n" +
                "    \"latestPrice\": 3301.03,\n" +
                "    \"latestSource\": \"Close\",\n" +
                "    \"latestTime\": \"May 7, 2021\",\n" +
                "    \"latestUpdate\": 1691701762855,\n" +
                "    \"latestVolume\": 4830087,\n" +
                "    \"iexRealtimePrice\": null,\n" +
                "    \"iexRealtimeSize\": null,\n" +
                "    \"iexLastUpdated\": null,\n" +
                "    \"delayedPrice\": 3421.57,\n" +
                "    \"delayedPriceTime\": 1654808211278,\n" +
                "    \"oddLotDelayedPrice\": 3376.36,\n" +
                "    \"oddLotDelayedPriceTime\": 1675121643922,\n" +
                "    \"extendedPrice\": 3363.4,\n" +
                "    \"extendedChange\": -1.12,\n" +
                "    \"extendedChangePercent\": -0.00034,\n" +
                "    \"extendedPriceTime\": 1696505464561,\n" +
                "    \"previousClose\": 3343.27,\n" +
                "    \"previousVolume\": 4664462,\n" +
                "    \"change\": -14.81,\n" +
                "    \"changePercent\": -0.00451,\n" +
                "    \"volume\": 4784635,\n" +
                "    \"iexMarketPercent\": null,\n" +
                "    \"iexVolume\": null,\n" +
                "    \"avgTotalVolume\": 4241236,\n" +
                "    \"iexBidPrice\": null,\n" +
                "    \"iexBidSize\": null,\n" +
                "    \"iexAskPrice\": null,\n" +
                "    \"iexAskSize\": null,\n" +
                "    \"iexOpen\": 3395.721,\n" +
                "    \"iexOpenTime\": 1630523055269,\n" +
                "    \"iexClose\": 3346.781,\n" +
                "    \"iexCloseTime\": 1697414873687,\n" +
                "    \"marketCap\": 1690777283378,\n" +
                "    \"peRatio\": 64.95,\n" +
                "    \"week52High\": 3594,\n" +
                "    \"week52Low\": 2343,\n" +
                "    \"ytdChange\": 0.006283395147343738,\n" +
                "    \"lastTradeTime\": 1694412463328,\n" +
                "    \"isUSMarketOpen\": false\n" +
                "}";

        String MSFT = "{\n" +
                "    \"symbol\": \"MSFT\",\n" +
                "    \"companyName\": \"Microsoft Corporation\",\n" +
                "    \"primaryExchange\": \"ATG/ASL T)BSGMQDSOLRENNA( LKCAE E\",\n" +
                "    \"calculationPrice\": \"close\",\n" +
                "    \"open\": 263.67,\n" +
                "    \"openTime\": 1675891740250,\n" +
                "    \"openSource\": \"oiafclif\",\n" +
                "    \"close\": 255.04,\n" +
                "    \"closeTime\": 1666653006412,\n" +
                "    \"closeSource\": \"iiaflocf\",\n" +
                "    \"high\": 257.9,\n" +
                "    \"highTime\": 1638693541636,\n" +
                "    \"highSource\": \"eem1paieclid edru nyt5 \",\n" +
                "    \"low\": 262.24,\n" +
                "    \"lowTime\": 1663472505776,\n" +
                "    \"lowSource\": \"yecnrdluim etp5e  eaid1\",\n" +
                "    \"latestPrice\": 262.53,\n" +
                "    \"latestSource\": \"Close\",\n" +
                "    \"latestTime\": \"May 7, 2021\",\n" +
                "    \"latestUpdate\": 1647753128809,\n" +
                "    \"latestVolume\": 27121184,\n" +
                "    \"iexRealtimePrice\": null,\n" +
                "    \"iexRealtimeSize\": null,\n" +
                "    \"iexLastUpdated\": null,\n" +
                "    \"delayedPrice\": 255.94,\n" +
                "    \"delayedPriceTime\": 1654525664134,\n" +
                "    \"oddLotDelayedPrice\": 260.57,\n" +
                "    \"oddLotDelayedPriceTime\": 1640208277359,\n" +
                "    \"extendedPrice\": 259.8,\n" +
                "    \"extendedChange\": 0.15,\n" +
                "    \"extendedChangePercent\": 0.00055,\n" +
                "    \"extendedPriceTime\": 1642759997062,\n" +
                "    \"previousClose\": 259.94,\n" +
                "    \"previousVolume\": 26720703,\n" +
                "    \"change\": 2.79,\n" +
                "    \"changePercent\": 0.01126,\n" +
                "    \"volume\": 27210097,\n" +
                "    \"iexMarketPercent\": null,\n" +
                "    \"iexVolume\": null,\n" +
                "    \"avgTotalVolume\": 27572182,\n" +
                "    \"iexBidPrice\": null,\n" +
                "    \"iexBidSize\": null,\n" +
                "    \"iexAskPrice\": null,\n" +
                "    \"iexAskSize\": null,\n" +
                "    \"iexOpen\": 264.97,\n" +
                "    \"iexOpenTime\": 1665595161870,\n" +
                "    \"iexClose\": 255.86,\n" +
                "    \"iexCloseTime\": 1661156145942,\n" +
                "    \"marketCap\": 1989102034280,\n" +
                "    \"peRatio\": 35.6,\n" +
                "    \"week52High\": 274.42,\n" +
                "    \"week52Low\": 181.53,\n" +
                "    \"ytdChange\": 0.15262541797383228,\n" +
                "    \"lastTradeTime\": 1627178069597,\n" +
                "    \"isUSMarketOpen\": false\n" +
                "}";

        String GOOGL = "{\n" +
                "    \"symbol\": \"GOOGL\",\n" +
                "    \"companyName\": \"Alphabet Inc - Class A\",\n" +
                "    \"primaryExchange\": \"RNOAEB/C KM(SENQ LAASLDLETSGAT)G \",\n" +
                "    \"calculationPrice\": \"close\",\n" +
                "    \"open\": 2364.38,\n" +
                "    \"openTime\": 1682351871705,\n" +
                "    \"openSource\": \"filfaoci\",\n" +
                "    \"close\": 2367.47,\n" +
                "    \"closeTime\": 1657439585420,\n" +
                "    \"closeSource\": \"aficoilf\",\n" +
                "    \"high\": 2371.51,\n" +
                "    \"highTime\": 1648086315727,\n" +
                "    \"highSource\": \" ee eytpmeiurdad1 n5cli\",\n" +
                "    \"low\": 2416,\n" +
                "    \"lowTime\": 1649082189795,\n" +
                "    \"lowSource\": \"ecpmeX ril ieaE tIr\",\n" +
                "    \"latestPrice\": 2444.06,\n" +
                "    \"latestSource\": \"Close\",\n" +
                "    \"latestTime\": \"May 7, 2021\",\n" +
                "    \"latestUpdate\": 1677100210758,\n" +
                "    \"latestVolume\": 1462891,\n" +
                "    \"iexRealtimePrice\": null,\n" +
                "    \"iexRealtimeSize\": null,\n" +
                "    \"iexLastUpdated\": null,\n" +
                "    \"delayedPrice\": 2446.87,\n" +
                "    \"delayedPriceTime\": 1636822989091,\n" +
                "    \"oddLotDelayedPrice\": 2419.6,\n" +
                "    \"oddLotDelayedPriceTime\": 1632626831143,\n" +
                "    \"extendedPrice\": 2408.9,\n" +
                "    \"extendedChange\": 1.28,\n" +
                "    \"extendedChangePercent\": 0.00056,\n" +
                "    \"extendedPriceTime\": 1679474789446,\n" +
                "    \"previousClose\": 2352.79,\n" +
                "    \"previousVolume\": 1310126,\n" +
                "    \"change\": 14.84,\n" +
                "    \"changePercent\": 0.00644,\n" +
                "    \"volume\": 1466863,\n" +
                "    \"iexMarketPercent\": null,\n" +
                "    \"iexVolume\": null,\n" +
                "    \"avgTotalVolume\": 1680701,\n" +
                "    \"iexBidPrice\": null,\n" +
                "    \"iexBidSize\": null,\n" +
                "    \"iexAskPrice\": null,\n" +
                "    \"iexAskSize\": null,\n" +
                "    \"iexOpen\": 2438.33,\n" +
                "    \"iexOpenTime\": 1644603903355,\n" +
                "    \"iexClose\": 2358.42,\n" +
                "    \"iexCloseTime\": 1638649977268,\n" +
                "    \"marketCap\": 1648658554773,\n" +
                "    \"peRatio\": 32.28,\n" +
                "    \"week52High\": 2456,\n" +
                "    \"week52Low\": 1349.4,\n" +
                "    \"ytdChange\": 0.3587864348398042,\n" +
                "    \"lastTradeTime\": 1637073107222,\n" +
                "    \"isUSMarketOpen\": false\n" +
                "}";

        String COIN = "{\n" +
                "    \"symbol\": \"COIN\",\n" +
                "    \"companyName\": \"Coinbase Global Inc - Class A\",\n" +
                "    \"primaryExchange\": \" QALTRNAC SMA(OSENED/AGBGLT)KSL E\",\n" +
                "    \"calculationPrice\": \"close\",\n" +
                "    \"open\": 271.34,\n" +
                "    \"openTime\": 1650132169435,\n" +
                "    \"openSource\": \"oiflfaic\",\n" +
                "    \"close\": 264.6,\n" +
                "    \"closeTime\": 1667030315830,\n" +
                "    \"closeSource\": \"folaciif\",\n" +
                "    \"high\": 272.258,\n" +
                "    \"highTime\": 1690694285816,\n" +
                "    \"highSource\": \"ariedteyd5pen u1eciml  \",\n" +
                "    \"low\": 263.94,\n" +
                "    \"lowTime\": 1642505521388,\n" +
                "    \"lowSource\": \"daue1elipcmy en rd t5ei\",\n" +
                "    \"latestPrice\": 276.6,\n" +
                "    \"latestSource\": \"Close\",\n" +
                "    \"latestTime\": \"May 7, 2021\",\n" +
                "    \"latestUpdate\": 1655139765529,\n" +
                "    \"latestVolume\": 4255675,\n" +
                "    \"iexRealtimePrice\": null,\n" +
                "    \"iexRealtimeSize\": null,\n" +
                "    \"iexLastUpdated\": null,\n" +
                "    \"delayedPrice\": 264.62,\n" +
                "    \"delayedPriceTime\": 1689693716409,\n" +
                "    \"oddLotDelayedPrice\": 263.6,\n" +
                "    \"oddLotDelayedPriceTime\": 1628057125384,\n" +
                "    \"extendedPrice\": 277.1,\n" +
                "    \"extendedChange\": 0.6,\n" +
                "    \"extendedChangePercent\": 0.00239,\n" +
                "    \"extendedPriceTime\": 1621225897525,\n" +
                "    \"previousClose\": 259.79,\n" +
                "    \"previousVolume\": 8454006,\n" +
                "    \"change\": 7.11,\n" +
                "    \"changePercent\": 0.0271,\n" +
                "    \"volume\": 4425396,\n" +
                "    \"iexMarketPercent\": null,\n" +
                "    \"iexVolume\": null,\n" +
                "    \"avgTotalVolume\": 14660765,\n" +
                "    \"iexBidPrice\": null,\n" +
                "    \"iexBidSize\": null,\n" +
                "    \"iexAskPrice\": null,\n" +
                "    \"iexAskSize\": null,\n" +
                "    \"iexOpen\": 267.33,\n" +
                "    \"iexOpenTime\": 1622493443935,\n" +
                "    \"iexClose\": 272.76,\n" +
                "    \"iexCloseTime\": 1689973811360,\n" +
                "    \"marketCap\": 70384505841,\n" +
                "    \"peRatio\": 174.92,\n" +
                "    \"week52High\": 450.81,\n" +
                "    \"week52Low\": 261.66,\n" +
                "    \"ytdChange\": -0.1757044167759372,\n" +
                "    \"lastTradeTime\": 1663159601645,\n" +
                "    \"isUSMarketOpen\": false\n" +
                "}";

        String NFLX = "{\n" +
                "    \"symbol\": \"NFLX\",\n" +
                "    \"companyName\": \"NetFlix Inc\",\n" +
                "    \"primaryExchange\": \"OCEART KQNNLADB GESGSLM(/LAT) AES\",\n" +
                "    \"calculationPrice\": \"close\",\n" +
                "    \"open\": 514.47,\n" +
                "    \"openTime\": 1670895503147,\n" +
                "    \"openSource\": \"iaifolcf\",\n" +
                "    \"close\": 525.81,\n" +
                "    \"closeTime\": 1688938632396,\n" +
                "    \"closeSource\": \"flaifoci\",\n" +
                "    \"high\": 522.2,\n" +
                "    \"highTime\": 1658169840615,\n" +
                "    \"highSource\": \"eea u tric5 lypdmneied1\",\n" +
                "    \"low\": 522.34,\n" +
                "    \"lowTime\": 1694783831596,\n" +
                "    \"lowSource\": \"e edime  caru5d1tpynile\",\n" +
                "    \"latestPrice\": 509.9,\n" +
                "    \"latestSource\": \"Close\",\n" +
                "    \"latestTime\": \"May 7, 2021\",\n" +
                "    \"latestUpdate\": 1663797954024,\n" +
                "    \"latestVolume\": 3185081,\n" +
                "    \"iexRealtimePrice\": null,\n" +
                "    \"iexRealtimeSize\": null,\n" +
                "    \"iexLastUpdated\": null,\n" +
                "    \"delayedPrice\": 509.79,\n" +
                "    \"delayedPriceTime\": 1633930872806,\n" +
                "    \"oddLotDelayedPrice\": 509,\n" +
                "    \"oddLotDelayedPriceTime\": 1622142453683,\n" +
                "    \"extendedPrice\": 528.4,\n" +
                "    \"extendedChange\": 0.47,\n" +
                "    \"extendedChangePercent\": 0.00095,\n" +
                "    \"extendedPriceTime\": 1631983324658,\n" +
                "    \"previousClose\": 501.45,\n" +
                "    \"previousVolume\": 3840330,\n" +
                "    \"change\": 4.44,\n" +
                "    \"changePercent\": 0.00897,\n" +
                "    \"volume\": 3142597,\n" +
                "    \"iexMarketPercent\": null,\n" +
                "    \"iexVolume\": null,\n" +
                "    \"avgTotalVolume\": 5601144,\n" +
                "    \"iexBidPrice\": null,\n" +
                "    \"iexBidSize\": null,\n" +
                "    \"iexAskPrice\": null,\n" +
                "    \"iexAskSize\": null,\n" +
                "    \"iexOpen\": 518.51,\n" +
                "    \"iexOpenTime\": 1663458945838,\n" +
                "    \"iexClose\": 521.67,\n" +
                "    \"iexCloseTime\": 1677448348852,\n" +
                "    \"marketCap\": 229976905202,\n" +
                "    \"peRatio\": 63,\n" +
                "    \"week52High\": 593.33,\n" +
                "    \"week52Low\": 408.54,\n" +
                "    \"ytdChange\": -0.06004764694377125,\n" +
                "    \"lastTradeTime\": 1677860815029,\n" +
                "    \"isUSMarketOpen\": false\n" +
                "}";

        String ALL_COMPANIES = " {\n" +
                "        \"symbol\": \"AMZN\",\n" +
                "        \"exchange\": \"NYS\",\n" +
                "        \"exchangeSuffix\": \"NU\",\n" +
                "        \"exchangeName\": \"OEK NH X,SO EGKRWCCNTEI C.NYA\",\n" +
                "        \"name\": \"cl.Tlns IieiAgeo onnhgcte\",\n" +
                "        \"date\": \"2021-05-09\",\n" +
                "        \"type\": \"cs\",\n" +
                "        \"iexId\": \"IEX_46574843354B2D52\",\n" +
                "        \"region\": \"US\",\n" +
                "        \"currency\": \"USD\",\n" +
                "        \"isEnabled\": true,\n" +
                "        \"figi\": \"2G0C300B6BVD\",\n" +
                "        \"cik\": \"1091754\",\n" +
                "        \"lei\": \"RGQ2XMWIYW02X89AP7U7\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"symbol\": \"MSFT\",\n" +
                "        \"exchange\": \"NYS\",\n" +
                "        \"exchangeSuffix\": \"UN\",\n" +
                "        \"exchangeName\": \"GKWCNEEARTHOIOKEC  X CY SNN,.\",\n" +
                "        \"name\": \"lAar ocpoC\",\n" +
                "        \"date\": \"2021-05-09\",\n" +
                "        \"type\": \"cs\",\n" +
                "        \"iexId\": \"IEX_4238333734532D52\",\n" +
                "        \"region\": \"US\",\n" +
                "        \"currency\": \"USD\",\n" +
                "        \"isEnabled\": true,\n" +
                "        \"figi\": \"B0D0T333GHBB\",\n" +
                "        \"cik\": \"1728244\",\n" +
                "        \"lei\": \"EFT9U42W12390W6501ZP\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"symbol\": \"GOOGL\",\n" +
                "        \"exchange\": \"USPAC\",\n" +
                "        \"exchangeSuffix\": \"UP\",\n" +
                "        \"exchangeName\": \"YAERNAC S\",\n" +
                "        \"name\": \"  odLTrTn FO -oAs tdd teBEisryiPtis FFruCuirFts n AL\",\n" +
                "        \"date\": \"2021-05-09\",\n" +
                "        \"type\": \"et\",\n" +
                "        \"iexId\": \"IEX_5030314338392D52\",\n" +
                "        \"region\": \"US\",\n" +
                "        \"currency\": \"USD\",\n" +
                "        \"isEnabled\": true,\n" +
                "        \"figi\": \"FB00X48GSB5P\",\n" +
                "        \"cik\": \"1734188\",\n" +
                "        \"lei\": null\n" +
                "    },\n" +
                "    {\n" +
                "        \"symbol\": \"COIN\",\n" +
                "        \"exchange\": \"USPAC\",\n" +
                "        \"exchangeSuffix\": \"PU\",\n" +
                "        \"exchangeName\": \"N YRASEAC\",\n" +
                "        \"name\": \" caslEchdsoGllohls rc  d aaPiGomSniamlsd yGhG -hyhoSSncePdE  Ta Fs laa\",\n" +
                "        \"date\": \"2021-05-09\",\n" +
                "        \"type\": \"et\",\n" +
                "        \"iexId\": \"IEX_474B433136332D52\",\n" +
                "        \"region\": \"US\",\n" +
                "        \"currency\": \"USD\",\n" +
                "        \"isEnabled\": true,\n" +
                "        \"figi\": \"L2X8GBP7BX00\",\n" +
                "        \"cik\": \"1783850\",\n" +
                "        \"lei\": null\n" +
                "    },\n" +
                "    {\n" +
                "        \"symbol\": \"NFLX\",\n" +
                "        \"exchange\": \"NYS\",\n" +
                "        \"exchangeSuffix\": \"UN\",\n" +
                "        \"exchangeName\": \"H KWNG RES O ICTO.NCXCNKAE,YE\",\n" +
                "        \"name\": \"init -  npACqo tiricsuAr eosCoolsaAsra\",\n" +
                "        \"date\": \"2021-05-09\",\n" +
                "        \"type\": \"cs\",\n" +
                "        \"iexId\": null,\n" +
                "        \"region\": \"US\",\n" +
                "        \"currency\": \"USD\",\n" +
                "        \"isEnabled\": true,\n" +
                "        \"figi\": \"290Y1ZB0ZBGC\",\n" +
                "        \"cik\": \"1885473\",\n" +
                "        \"lei\": null\n" +
                "    }";

    }
}
