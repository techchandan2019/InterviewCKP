package com.neosoft.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestL2_09 {


	public static void main(String[] args) throws Exception  {
		
		Integer[] a= { 515, 341, 98};
		List<String> li1 = Arrays.stream(a).map(p->String.valueOf(p)).collect(Collectors.toList());
		List<String> collect = li1.stream().map(p->{
			String[] sa=p.split("");
			List<String> local=Arrays.stream(sa).sorted((l1,l2)->-l1.compareTo(l2)).collect(Collectors.toList());
			StringBuilder sb=new StringBuilder();
			for(String ss:local) {
				sb.append(ss);
			}
			return sb.toString();
		}).collect(Collectors.toList());
		
		System.out.println(collect);
		
		/*	Given an array with repeated elements, the task is to find the maximum distance between two occurrences of an element.\
		Input
		n= 6
		arr = {1, 1, 2, 2, 2, 1}
	
		Output
		5
	
		Explanation
		arr[] = {1, 1, 2, 2, 2, 1}
		Max Distance: 5
		Distance for 1 is: 5-0 = 5
		Distance for 2 is : 4-2 = 2
		Max Distance 5*/
	
		/*	Integer[] a= {1,1,2,2,2,1};
			
			int max=0;
			for(int i=0;i<a.length;i++) {
				int diff=0;
				for(int j=i+1;j<a.length;j++) {
					
					if(a[i]==a[j])
						diff=j-i;
				}
				if(diff>max)
					max=diff;
			}
			System.out.println(max);*/
		
		/*List<Integer> li2=Arrays.asList(1,2,3);
		List<Integer> li3=Arrays.asList(4,5,6);
		
		List<Integer> collect2 = Stream.concat(li2.stream(), li3.stream()).collect(Collectors.toList());
		System.out.println(collect2);*/
		
		
		//============================
		/*		Integer i1=5;
				int i2=i1.intValue();
				
				Integer i3=Integer.valueOf(5);
				
				int[] ia= {1,2,2,4,4,6,7,8,9,10};
				List<Integer> collect = Arrays.stream(ia).boxed().collect(Collectors.toList());
				System.out.println(collect);
				Map<Integer, Long> collect2 = Arrays.stream(ia).boxed().collect(Collectors.groupingBy(p->p,Collectors.counting()));
				System.out.println(collect2);*/
		
//		List<List<Integer>> li=Arrays{{1,2,3,4},{1,2,3,4}};
		/*	default
			static
			lamda expression
			functionalInteface==>@FunctionalInterface
			LocalDateTime
			StringJoinner*/
		
		/*		class MyException extends RuntimeException{
					
					private String error;
					
					public MyException() {
						super();
					}
					public MyException(String msg,String error) {
						super(msg);
						this.error=error;
					}
				}
				hashcode
				equals
				getClass
				toString
				finalize
				wait
				wait
				wait
				notify
				notifyAll
				clone
		
				///=============
				@Component
				@Controller
				@RestController
				@Service
				@Repository
				@ControllerAdvice
				@Configuration
				//=================
				@Autowired
				@GetMapping
				@PostMapping
		
		
				@Cacheable(...)
		
				//@PathVariable(name="",required=)
		
				//MissingErrorRequest
		
				@ImportResource("....")*/
//		{{1,2,3},{2,3,4},{4,5,6}}==>{1,2,3,2,3,4,4,5,6};
		
		List<List<Integer>> li2=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(2,3,4),Arrays.asList(4,5,6));
		
		List<Integer> collect2 = li2.stream().flatMap(p->p.stream()).collect(Collectors.toList());
		System.out.println(collect2);
		
		//====================
		/*aaabbccddddee
		a3b2c2d4e2*/
		
		/*		String s="aaabbccddddee";
				int c=1;
				int i=0;
				for(;i<s.length()-1;i++) {
					char ch1=s.charAt(i);
					char ch2=s.charAt(i+1);
					
					if(ch1==ch2)
						c++;
					else {
						
						System.out.print(String.valueOf(ch1)+c);
						c=1;
					}
							
				}
				System.out.print(String.valueOf(s.charAt(i))+c);*/
		
		//(or)
		/*	String s="aaabbccddddee";
			Map<String,Integer> map=new HashMap<>();
			
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				String sch=String.valueOf(ch);
				if(map.containsKey(String.valueOf(ch)))
					map.put(sch, map.get(sch)+1);
				else
					map.put(sch, 1);
					
			}
			System.out.println(map);
			map.entrySet().stream().forEach(p->System.out.print(p.getKey()+p.getValue()));*/
		//=========================
		
		System.out.println();
		List<? extends Number> li=new ArrayList<>();
		List<? super Number> l=new ArrayList<>();
		l.add(10);
		l.add(10);
		
		
//		Integer sum = li.stream().reduce(0,(a,b)->a+b);
//		System.out.println(sum);
		
	}
	
	
}

