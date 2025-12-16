package com.app.cryptoapp.Repository

import com.app.cryptoapp.model.CryptoModel

class MainRepository {

    val items = mutableListOf(

        // ===== BITCOIN =====
        CryptoModel(
            Symbol = "Bitcoin",
            ShortSymbol = "BTC",
            Price = 65000.0,
            ChangePercent = 2.5,
            AmountPercent = 1.2,
            AmountDollar = 1500.0,

            SellPrice1 = 65100.0,
            SellPrice2 = 65200.0,
            SellPrice3 = 65300.0,
            SellPrice4 = 65400.0,
            SellPrice5 = 65500.0,

            SellAmount1 = 0.5,
            SellAmount2 = 0.4,
            SellAmount3 = 0.3,
            SellAmount4 = 0.2,
            SellAmount5 = 0.1,

            BuyPrice1 = 64900.0,
            BuyPrice2 = 64800.0,
            BuyPrice3 = 64700.0,
            BuyPrice4 = 64600.0,
            BuyPrice5 = 64500.0,

            BuyAmount1 = 0.6,
            BuyAmount2 = 0.5,
            BuyAmount3 = 0.4,
            BuyAmount4 = 0.3,
            BuyAmount5 = 0.2,

            Open = 63000.0,
            Close = 65000.0,
            High = 66000.0,
            Low = 62000.0,
            DailyChange = 2000.0,
            DailyVoil = 120000000.0,

            SymbolLogo = "https://cryptologos.cc/logos/bitcoin-btc-logo.png"
        ),

        // ===== ETHEREUM =====
        CryptoModel(
            Symbol = "Ethereum",
            ShortSymbol = "ETH",
            Price = 3500.0,
            ChangePercent = -1.3,
            AmountPercent = -0.8,
            AmountDollar = -45.0,

            SellPrice1 = 3510.0,
            SellPrice2 = 3520.0,
            SellPrice3 = 3530.0,
            SellPrice4 = 3540.0,
            SellPrice5 = 3550.0,

            SellAmount1 = 2.0,
            SellAmount2 = 1.8,
            SellAmount3 = 1.5,
            SellAmount4 = 1.2,
            SellAmount5 = 1.0,

            BuyPrice1 = 3490.0,
            BuyPrice2 = 3480.0,
            BuyPrice3 = 3470.0,
            BuyPrice4 = 3460.0,
            BuyPrice5 = 3450.0,

            BuyAmount1 = 2.2,
            BuyAmount2 = 2.0,
            BuyAmount3 = 1.7,
            BuyAmount4 = 1.4,
            BuyAmount5 = 1.1,

            Open = 3600.0,
            Close = 3500.0,
            High = 3650.0,
            Low = 3450.0,
            DailyChange = -100.0,
            DailyVoil = 85000000.0,

            SymbolLogo = "https://cryptologos.cc/logos/ethereum-eth-logo.png"
        ),

        // ===== BINANCE COIN =====
        CryptoModel(
            Symbol = "Binance Coin",
            ShortSymbol = "BNB",
            Price = 420.0,
            ChangePercent = 1.8,
            AmountPercent = 0.9,
            AmountDollar = 7.5,

            SellPrice1 = 421.0, SellPrice2 = 422.0, SellPrice3 = 423.0, SellPrice4 = 424.0, SellPrice5 = 425.0,
            SellAmount1 = 10.0, SellAmount2 = 9.0, SellAmount3 = 8.0, SellAmount4 = 7.0, SellAmount5 = 6.0,

            BuyPrice1 = 419.0, BuyPrice2 = 418.0, BuyPrice3 = 417.0, BuyPrice4 = 416.0, BuyPrice5 = 415.0,
            BuyAmount1 = 11.0, BuyAmount2 = 10.0, BuyAmount3 = 9.0, BuyAmount4 = 8.0, BuyAmount5 = 7.0,

            Open = 410.0, Close = 420.0, High = 430.0, Low = 405.0,
            DailyChange = 10.0, DailyVoil = 45000000.0,
            SymbolLogo = "https://cryptologos.cc/logos/bnb-bnb-logo.png"
        ),

        // ===== SOLANA =====
        CryptoModel(
            Symbol = "Solana",
            ShortSymbol = "SOL",
            Price = 145.0,
            ChangePercent = 4.2,
            AmountPercent = 2.1,
            AmountDollar = 6.0,

            SellPrice1 = 146.0, SellPrice2 = 147.0, SellPrice3 = 148.0, SellPrice4 = 149.0, SellPrice5 = 150.0,
            SellAmount1 = 20.0, SellAmount2 = 18.0, SellAmount3 = 16.0, SellAmount4 = 14.0, SellAmount5 = 12.0,

            BuyPrice1 = 144.0, BuyPrice2 = 143.0, BuyPrice3 = 142.0, BuyPrice4 = 141.0, BuyPrice5 = 140.0,
            BuyAmount1 = 22.0, BuyAmount2 = 20.0, BuyAmount3 = 18.0, BuyAmount4 = 16.0, BuyAmount5 = 14.0,

            Open = 138.0, Close = 145.0, High = 150.0, Low = 135.0,
            DailyChange = 7.0, DailyVoil = 32000000.0,
            SymbolLogo = "https://cryptologos.cc/logos/solana-sol-logo.png"
        ),

        // ===== CARDANO =====
        CryptoModel(
            Symbol = "Cardano",
            ShortSymbol = "ADA",
            Price = 0.62,
            ChangePercent = -0.9,
            AmountPercent = -0.4,
            AmountDollar = -0.01,

            SellPrice1 = 0.63, SellPrice2 = 0.64, SellPrice3 = 0.65, SellPrice4 = 0.66, SellPrice5 = 0.67,
            SellAmount1 = 5000.0, SellAmount2 = 4500.0, SellAmount3 = 4000.0, SellAmount4 = 3500.0, SellAmount5 = 3000.0,

            BuyPrice1 = 0.61, BuyPrice2 = 0.60, BuyPrice3 = 0.59, BuyPrice4 = 0.58, BuyPrice5 = 0.57,
            BuyAmount1 = 5200.0, BuyAmount2 = 4800.0, BuyAmount3 = 4400.0, BuyAmount4 = 4000.0, BuyAmount5 = 3600.0,

            Open = 0.64, Close = 0.62, High = 0.68, Low = 0.60,
            DailyChange = -0.02, DailyVoil = 21000000.0,
            SymbolLogo = "https://cryptologos.cc/logos/cardano-ada-logo.png"
        ),

        // ===== RIPPLE =====
        CryptoModel(
            Symbol = "Ripple",
            ShortSymbol = "XRP",
            Price = 0.54,
            ChangePercent = 1.1,
            AmountPercent = 0.6,
            AmountDollar = 0.01,

            SellPrice1 = 0.55, SellPrice2 = 0.56, SellPrice3 = 0.57, SellPrice4 = 0.58, SellPrice5 = 0.59,
            SellAmount1 = 6000.0, SellAmount2 = 5500.0, SellAmount3 = 5000.0, SellAmount4 = 4500.0, SellAmount5 = 4000.0,

            BuyPrice1 = 0.53, BuyPrice2 = 0.52, BuyPrice3 = 0.51, BuyPrice4 = 0.50, BuyPrice5 = 0.49,
            BuyAmount1 = 6200.0, BuyAmount2 = 5800.0, BuyAmount3 = 5400.0, BuyAmount4 = 5000.0, BuyAmount5 = 4600.0,

            Open = 0.52, Close = 0.54, High = 0.60, Low = 0.50,
            DailyChange = 0.02, DailyVoil = 18000000.0,
            SymbolLogo = "https://cryptologos.cc/logos/xrp-xrp-logo.png"
        ),

        // ===== DOGE =====
        CryptoModel(
            Symbol = "Dogecoin",
            ShortSymbol = "DOGE",
            Price = 0.14,
            ChangePercent = 3.0,
            AmountPercent = 1.5,
            AmountDollar = 0.004,

            SellPrice1 = 0.15, SellPrice2 = 0.16, SellPrice3 = 0.17, SellPrice4 = 0.18, SellPrice5 = 0.19,
            SellAmount1 = 10000.0, SellAmount2 = 9000.0, SellAmount3 = 8000.0, SellAmount4 = 7000.0, SellAmount5 = 6000.0,

            BuyPrice1 = 0.13, BuyPrice2 = 0.12, BuyPrice3 = 0.11, BuyPrice4 = 0.10, BuyPrice5 = 0.09,
            BuyAmount1 = 11000.0, BuyAmount2 = 10000.0, BuyAmount3 = 9000.0, BuyAmount4 = 8000.0, BuyAmount5 = 7000.0,

            Open = 0.12, Close = 0.14, High = 0.16, Low = 0.10,
            DailyChange = 0.02, DailyVoil = 26000000.0,
            SymbolLogo = "https://cryptologos.cc/logos/dogecoin-doge-logo.png"
        ),

        // ===== POLKADOT =====
        CryptoModel(
            Symbol = "Polkadot",
            ShortSymbol = "DOT",
            Price = 6.8,
            ChangePercent = -2.0,
            AmountPercent = -1.1,
            AmountDollar = -0.15,

            SellPrice1 = 6.9, SellPrice2 = 7.0, SellPrice3 = 7.1, SellPrice4 = 7.2, SellPrice5 = 7.3,
            SellAmount1 = 800.0, SellAmount2 = 750.0, SellAmount3 = 700.0, SellAmount4 = 650.0, SellAmount5 = 600.0,

            BuyPrice1 = 6.7, BuyPrice2 = 6.6, BuyPrice3 = 6.5, BuyPrice4 = 6.4, BuyPrice5 = 6.3,
            BuyAmount1 = 820.0, BuyAmount2 = 780.0, BuyAmount3 = 740.0, BuyAmount4 = 700.0, BuyAmount5 = 660.0,

            Open = 7.1, Close = 6.8, High = 7.4, Low = 6.5,
            DailyChange = -0.3, DailyVoil = 15000000.0,
            SymbolLogo = "https://cryptologos.cc/logos/polkadot-new-dot-logo.png"
        ),

        // ===== AVALANCHE =====
        CryptoModel(
            Symbol = "Avalanche",
            ShortSymbol = "AVAX",
            Price = 38.0,
            ChangePercent = 2.7,
            AmountPercent = 1.3,
            AmountDollar = 1.0,

            SellPrice1 = 39.0, SellPrice2 = 40.0, SellPrice3 = 41.0, SellPrice4 = 42.0, SellPrice5 = 43.0,
            SellAmount1 = 500.0, SellAmount2 = 480.0, SellAmount3 = 460.0, SellAmount4 = 440.0, SellAmount5 = 420.0,

            BuyPrice1 = 37.0, BuyPrice2 = 36.0, BuyPrice3 = 35.0, BuyPrice4 = 34.0, BuyPrice5 = 33.0,
            BuyAmount1 = 520.0, BuyAmount2 = 500.0, BuyAmount3 = 480.0, BuyAmount4 = 460.0, BuyAmount5 = 440.0,

            Open = 35.0, Close = 38.0, High = 42.0, Low = 34.0,
            DailyChange = 3.0, DailyVoil = 17000000.0,
            SymbolLogo = "https://cryptologos.cc/logos/avalanche-avax-logo.png"
        ),

        // ===== CHAINLINK =====
        CryptoModel(
            Symbol = "Chainlink",
            ShortSymbol = "LINK",
            Price = 14.5,
            ChangePercent = 1.9,
            AmountPercent = 0.9,
            AmountDollar = 0.3,

            SellPrice1 = 15.0, SellPrice2 = 15.5, SellPrice3 = 16.0, SellPrice4 = 16.5, SellPrice5 = 17.0,
            SellAmount1 = 900.0, SellAmount2 = 850.0, SellAmount3 = 800.0, SellAmount4 = 750.0, SellAmount5 = 700.0,

            BuyPrice1 = 14.0, BuyPrice2 = 13.5, BuyPrice3 = 13.0, BuyPrice4 = 12.5, BuyPrice5 = 12.0,
            BuyAmount1 = 950.0, BuyAmount2 = 900.0, BuyAmount3 = 850.0, BuyAmount4 = 800.0, BuyAmount5 = 750.0,

            Open = 13.8, Close = 14.5, High = 17.0, Low = 13.0,
            DailyChange = 0.7, DailyVoil = 14000000.0,
            SymbolLogo = "https://cryptologos.cc/logos/chainlink-link-logo.png"
        )
    )
}
