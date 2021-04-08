import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import java.util.function.*;
public class stream {
	public static void main (String[] args) {
	ArrayList<Integer> l1 = new ArrayList<Integer>();
	l1.add(10);
	l1.add(15);
	l1.add(20);
	l1.add(25);
	//Streams
	 List<Integer> l2 = l1.stream().filter(i -> i%2==0).collect(Collectors.toList());
	 List<Integer> l3 = l1.stream().map(i -> i+5).collect(Collectors.toList());
	 List<Integer> l4 = l1.stream().sorted().collect(Collectors.toList());
	 System.out.println(l2);
	 System.out.println(l3);
	 System.out.println(l4);
	 //predicate
	 Predicate<Integer> p = i ->(i%2==0);
	 System.out.println(p.test(10));
	 //Function
	 Function<String,Integer> f1 = x -> x.length();
	 int apply = f1.apply("firstfunctioninjava8");
	 System.out.println(apply);
	 //Consumer
	 Consumer<String> print = x -> System.out.println(x);
     print.accept("java");
     //supplier
     Supplier<LocalDateTime> s = () -> LocalDateTime.now();
     LocalDateTime time = s.get();
     System.out.println(time);
     
     //DateTimeAPI
     LocalDate ld = LocalDate.now();
     System.out.println(ld);
     LocalTime lt = LocalTime.now();
     System.out.println(lt);
     int dd = ld.getDayOfMonth();
     int mm = ld.getMonthValue();
     int yy = ld.getYear();
     System.out.printf("%d-%d-%d", dd, mm,yy);
     LocalDateTime dt = LocalDateTime.of(1995,Month.MAY,02,12,05);
     System.out.println(dt);
     
     
     //ZOne id
     ZoneId zone = ZoneId.systemDefault();
     System.out.println(zone);
     
     ZoneId la = ZoneId.of("America/Los_Angeles");
     ZonedDateTime zt = ZonedDateTime.now(la);
     System.out.println(zt);
     
	}
}
