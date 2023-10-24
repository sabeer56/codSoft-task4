package task4.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
     static Scanner v=new Scanner(System.in);
	public static void main(String[] args) {
		 Map<String,Double> exchangeRates=new HashMap<>();
		 exchangeRates.put("USD",1.0);
		 exchangeRates.put("EUR",0.85);
		 exchangeRates.put("THB",36.94);
		 exchangeRates.put("SGD",1.36);
		 exchangeRates.put("CAD",1.37);
		 exchangeRates.put("AED",3.76);
		 exchangeRates.put("MYR",4.73);
		 exchangeRates.put("CHF",0.94);
		 exchangeRates.put("AUD",1.57);
		 exchangeRates.put("HKD",7.83);
		 exchangeRates.put("JPY",111.30);
		 exchangeRates.put("CNY",7.19);
		 exchangeRates.put("NZD",1.67);
		 exchangeRates.put("ZAR",19.56);
		 exchangeRates.put("SAR",3.75);
		 exchangeRates.put("OMR",0.39);
		 exchangeRates.put("NOK",10.92);
		 exchangeRates.put("SEK",10.96);
		 exchangeRates.put("DKK",7.04);
		 exchangeRates.put("JOD",0.71);
		 exchangeRates.put("BHD",0.38);
		 exchangeRates.put("KWD",0.31);
		 exchangeRates.put("BDT",109.76);
		 exchangeRates.put("IDR",15648.15);
		 exchangeRates.put("IR",83.12);
		 exchangeRates.put("GBP",0.75);
		 System.out.println("Enter the amount to convert :");
		 double amount=v.nextDouble();
		 System.out.println("select your base currency");
			System.out.println("1.US Dollar (USD)\n2.Euro (EUR)\n3.Thai Baht (THB)\n4.Singapore Dollar (SGD)\n5.Canadian Dollar (CAD)\n6.UAE DIRHAM (AED)\r\n7.Malaysian Ringgit (MYR)\n8.Swiss Franc (CHF)\n9.Australian Dollar (AUD)\n10.Hongkong Dollar (HKD)\n11.Japanese Yen (JPY)\n12.Chinese Yuan (CNY)\r\n13.New Zealand Dollar (NZD)\n14.South African Rand (ZAR)\n15.Saudi Rial (SAR)\n16.Omani Rial (OMR)\n17.Norwegian Kroner (NOK)\n18.Swedish Krone (SEK)\n19.Danish Kroner (DKK)\n20.Jordan Dinar (JOD)\n21.Bahrain Dinar (BHD)\n22.Kuwait Dinar (KWD)\n23.Bangladeshi taka (BDT)\n24.Indonesian rupiah (IDR)\n25.Indian Rupee(IR)\n26.British Pound(GBP)");
	     String baseCurrency=v.next().toUpperCase();
	     System.out.println("Enter the target currency");
			System.out.println("1.US Dollar (USD)\n2.Euro (EUR)\n3.Thai Baht (THB)\n4.Singapore Dollar (SGD)\n5.Canadian Dollar (CAD)\n6.UAE DIRHAM (AED)\r\n7.Malaysian Ringgit (MYR)\n8.Swiss Franc (CHF)\n9.Australian Dollar (AUD)\n10.Hongkong Dollar (HKD)\n11.Japanese Yen (JPY)\n12.Chinese Yuan (CNY)\r\n13.New Zealand Dollar (NZD)\n14.South African Rand (ZAR)\n15.Saudi Rial (SAR)\n16.Omani Rial (OMR)\n17.Norwegian Kroner (NOK)\n18.Swedish Krone (SEK)\n19.Danish Kroner (DKK)\n20.Jordan Dinar (JOD)\n21.Bahrain Dinar (BHD)\n22.Kuwait Dinar (KWD)\n23.Bangladeshi taka (BDT)\n24.Indonesian rupiah (IDR)\n25.Indian Rupee(IR)\n26.British Pound(GBP)");
			String targetCurrency=v.next().toUpperCase();
			v.close();
			double sourceRate=exchangeRates.get(baseCurrency);
			double targetRate=exchangeRates.get(targetCurrency);
			double convertedAmount=amount*(targetRate/sourceRate);
			System.out.println(amount+" "+baseCurrency+" is equivalent to "+convertedAmount+" "+targetCurrency);
		 }
	
}
