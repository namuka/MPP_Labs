package prob8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PuttingIntoPractice{	
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
		
		
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		List<Transaction> query1 = transactions.stream()
				.filter(t -> t.getYear() == 2011).sorted(Comparator.comparing(Transaction::getYear)).collect(Collectors.toList());
		System.out.println("Query1: " + query1);
        
        // Query 2: What are all the unique cities where the traders work?
        List<String> query2 = transactions.stream()
        		.map(t -> t.getTrader().getCity())
        		.distinct()
        		.collect(Collectors.toList());
        System.out.println("Query2: " + query2);

        // Query 3: Find all traders from Cambridge and sort them by name.
        List<Trader> query3 = transactions.stream()
        		.filter(f -> f.getTrader().getCity().equals("Cambridge"))
        		.map(t->t.getTrader())
        		.sorted(Comparator.comparing(Trader::getName))
        		.collect(Collectors.toList());
        System.out.println("Query3: " + query3);
        
        // Query 4: Return a string of all traders names sorted alphabetically.
        String query4 = transactions.stream()
        		.map(t -> t.getTrader().getName())
        		.sorted()        		
        		.collect(Collectors.joining(", "));
        String query4_V2 = transactions.stream()
        		.map(t -> t.getTrader())
        		.sorted(Comparator.comparing(Trader::getName))
        		.map(t->t.getName())
        		.collect(Collectors.joining(", "));
        System.out.println("Query4: " + query4);
        System.out.println("Query4 V2: " + query4_V2);

        // Query 5: Are there any trader based in Milan?
        Optional<Trader> query5 = transactions.parallelStream()
        		.filter(t -> t.getTrader().getCity().equals("Milan"))
        		.map(t -> t.getTrader())
        		.findAny();        		
        //System.out.println("Query5: " + query5.get());
        System.out.println("Query5: " + query5);
   
        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream().filter(t -> t.getTrader().getCity().equals("Milan")).forEach(t -> t.getTrader().setCity("Cambridge"));
        List<Transaction> query6 = transactions.stream().collect(Collectors.toList());
        System.out.println("Query6: " + query6);
        
        // Query 7: What's the highest value in all the transactions?
        Optional<Integer> query7 = transactions.stream()
        		.map(t -> t.getValue())
        		.max(Comparator.comparing(Integer::valueOf));
        System.out.println("Query7: " + query7.get());
        		
    }
}
