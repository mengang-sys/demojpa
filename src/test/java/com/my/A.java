package com.my;

import com.my.demojpa.entity.Employee;
import com.my.demojpa.repository.MyFunction1;
import com.my.demojpa.repository.MyFunction2;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A<test10> {
    public static void main(String[] args) {

    }

    List<Employee> list = Arrays.asList(
            new Employee("张三", "上海", 5000, 22),
            new Employee("李四", "北京", 4000, 23),
            new Employee("c五", "日本", 6000, 50),
            new Employee("b七", "香港", 7000, 50),
            new Employee("赵六", "纽约", 1000, 8)
    );

     @Test
    public void test1(){
         Collections.sort(list,(x,y)->{
             if(x.getAge()!=y.getAge())
                 return Integer.compare(x.getAge(),y.getAge());
             else
                 return x.getName().compareTo(y.getName());
         });
         for (Employee employee : list) {
             System.out.println(employee);
         }
    }


    public String getValue(String str,MyFunction1 my) {
        return my.getValue(str);
    }

    @Test
    public void test2(){
        String hello_world = getValue("hello world", x -> x.toUpperCase());
        System.out.println(hello_world);
    }

     public <T,R> R getR(T t1, T t2, MyFunction2<T,R> mf){
         return mf.method(t1,t2);
     }

     @Test
     public void test3(){
         Long r = getR(25l, 30l, (t1, t2) -> t1 * t2);
         System.out.println(r);

         Long r1 = getR(25l, 30l, (t1, t2) -> t1 + t2);
         System.out.println(r1);
     }

     @Test
     public void test4(){
         List<String> list = new ArrayList<>();
         Stream<String> stream = list.stream();

         Employee[] emps = new Employee[10];
         Stream<Employee> stream1 = Arrays.stream(emps);

         Stream<String> stringStream = Stream.of("", "");

         Stream.iterate(0,x ->x+2).limit(10).forEach(System.out::println);

         Stream<Double> generate = Stream.generate(() -> Math.random());
         generate.limit(5).forEach(System.out::println);
     }


     @Test
     public void test5(){
         list.stream().filter(e ->e.getAge()>25).limit(5).skip(1).distinct().forEach(System.out::println);
     }

     @Test
     public void test6(){
         list.stream().map(employee -> employee.getName()).forEach(System.out::println);
     }

     @Test
     public void test7(){
         List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd");
         Stream<Stream<Character>> streamStream = list.stream().map(A::getCharacter);

         list.stream().flatMap(A::getCharacter).forEach(System.out::println);
     }

     public static Stream<Character> getCharacter(String str){
         List<Character> list = new ArrayList<>();
         for (char c : str.toCharArray()) {
             list.add(c);
         }
         return list.stream();
     }


     @Test
     public void test8(){
         List<String> list = Arrays.asList("ddd", "ccc", "ggg", "bbb", "aaa");
         list.stream().sorted().forEach(System.out::println);
         List<Employee> list1 = Arrays.asList(
                 new Employee("张三", "上海", 5000, 22),
                 new Employee("李四", "北京", 4000, 23),
                 new Employee("c五", "日本", 6000, 50),
                 new Employee("b七", "香港", 7000, 50),
                 new Employee("赵六", "纽约", 1000, 8)
         );
         list1.stream().sorted((e1,e2)->{
             if(e1.getSalary() ==e2.getSalary())
                 return e1.getName().compareTo(e2.getName());
             else
                 return e1.getSalary() -e2.getSalary();
         }).forEach(System.out::println);
     }


     @Test
     public void test9(){
         List<Employee> list1 = Arrays.asList(
                 new Employee("张三", "上海", 5000, 22),
                 new Employee("李四", "北京", 4000, 23),
                 new Employee("c五", "日本", 6000, 50),
                 new Employee("b七", "香港", 7000, 50),
                 new Employee("赵六", "纽约", 1000, 8)
         );

         boolean b = list.stream().noneMatch(e -> e.getSalary() > 1600);

         Optional<Employee> any = list1.parallelStream().findAny();
         System.out.println(any.get());
     }

     @Test
     public void test10(){
         List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
         Integer reduce = list1.stream().reduce(0, (x, y) ->
             x + y);
         System.out.println(reduce);

         Optional<Integer> reduce1 = list.stream().map(Employee::getSalary).reduce(Integer::sum);
         System.out.println(reduce1.get());
     }


     @Test
     public void test11(){
         List<String> collect = list.stream().map(Employee::getName).collect(Collectors.toList());
         collect.forEach(System.out::print);

         Set<String> collect1 = list.stream().map(Employee::getName).collect(Collectors.toSet());
         collect1.forEach(System.out::print);

         LinkedHashSet<String> collect2 = list.stream().map(Employee::getName).collect(Collectors.toCollection(LinkedHashSet::new));
         collect2.forEach(System.out::print);
     }

     @Test
     public void test12(){
         Long collect = list.stream().collect(Collectors.counting());
         System.out.println(collect);

         Double collect1 = list.stream().collect(Collectors.averagingDouble(Employee::getSalary));

         DoubleSummaryStatistics collect2 = list.stream().collect(Collectors.summarizingDouble(Employee::getAge));

         Optional<Employee> collect3 = list.stream().collect(Collectors.maxBy((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())));
         System.out.println(collect3.get());


     }

     @Test
     public void test15(){
         Map<Integer, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getAge));
         System.out.println(collect);

         Map<Boolean, List<Employee>> collect1 = list.stream().collect(Collectors.partitioningBy(employee ->
                 employee.getSalary() > 3000
         ));
         System.out.println(collect1);

         DoubleSummaryStatistics collect2 = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
         System.out.println(collect2.getAverage());

         String collect3 = list.stream().map(Employee::getName).collect(Collectors.joining(",", "---", "---"));
         System.out.println(collect3);
     }

     @Test
     public void test16(){
         List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

         Optional<Integer> reduce = list.stream().map(e -> 1).reduce(Integer::sum);
         System.out.println(reduce);
     }

     @Test
    public void test17(){
         Optional<Employee> op = Optional.ofNullable(new Employee("张三", "上海", 5000, 22));
         Optional<Integer> integer = op.flatMap(e -> Optional.of(e.getSalary()));
         System.out.println(integer.orElse(10000));

         Optional<Integer> integer1 = op.map(Employee::getSalary);
         System.out.println(integer1.get());


         Optional<Object> o = Optional.ofNullable(null);
         if(o.isPresent()){
             System.out.println(o.get());
         }else{
             o.orElse(new Employee());

             Object o1 = o.orElseGet(Employee::new);
             System.out.println(o1);
         }
     }

      @Test
     public void test18(){
          Optional<Object> o = Optional.ofNullable(null);
          if(o.isPresent()){
              System.out.println(o.get());
          }else{
              System.out.println("No Value");
          }
      }

}
