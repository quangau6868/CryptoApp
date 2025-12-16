package com.app.cryptoapp.model

import java.io.Serializable

data class CryptoModel(
    val Symbol:String="",
    val ShortSymbol:String="",
    val Price:Double,
    val ChangePercent:Double,
    val AmountPercent:Double,
    val AmountDollar:Double,
    val SellPrice1:Double,
    val SellPrice2:Double,
    val SellPrice3:Double,
    val SellPrice4:Double,
    val SellPrice5:Double,
    val SellAmount1:Double,
    val SellAmount2:Double,
    val SellAmount3:Double,
    val SellAmount4:Double,
    val SellAmount5:Double,
    val BuyPrice1:Double,
    val BuyPrice2:Double,
    val BuyPrice3:Double,
    val BuyPrice4:Double,
    val BuyPrice5:Double,
    val BuyAmount1:Double,
    val BuyAmount2:Double,
    val BuyAmount3:Double,
    val BuyAmount4:Double,
    val BuyAmount5:Double,
    val Open:Double,
    val Close:Double,
    val High:Double,
    val Low:Double,
    val DailyChange:Double,
    val DailyVoil:Double,
    val SymbolLogo:String=""
):Serializable
