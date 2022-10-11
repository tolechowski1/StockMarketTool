import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class StockMarketTool {

    private static void stockTickerInfo(String tickerName) throws IOException{
        System.out.println("Welcome to the CLI Stock Retriever.");
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.println("What ticker would you like information on? (Enter EXIT to stop): ");
        tickerName = input.next();
        do {
            System.out.println("Goodbye.");
        }
        while (tickerName.equals ("EXIT"));
        }
        URL url = new URL("https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=IBM&apikey=demo&datatype=csv");
        URLConnection con = url.openConnection();
        InputStreamReader inStream = new InputStreamReader(con.getInputStream());
        BufferedReader buffer = new BufferedReader(inStream);
        String line = buffer.readLine();
            while ((line != null)) {
            System.out.println(line);
            line = buffer.readLine();
        }

        public static void main(String[] args)  {
            stockTickerInfo();
            }
}


