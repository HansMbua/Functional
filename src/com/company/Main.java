package com.company;

import java.io.PrintStream;
import java.sql.ClientInfoStatus;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        int values[] = {3, 10, 12, 90, 24, 24, 4, 335};
        System.out.println("Original Values: ");
        IntStream.of(values).forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        System.out.printf("%nEven values deplayed in sorted order: ");
        IntStream.of(values).filter(value -> value % 2 == 0).sorted().forEach(value -> System.out.printf("%d ", value));
        System.out.println();
        System.out.printf("%nMax number is :%d ", IntStream.of(values).max().getAsInt());
        System.out.println();
        //sum of intergers from one to ten
        System.out.printf("%n sum from 1 to 10 :%d ", IntStream.range(1, 10).sum());
        System.out.println();
        //suming range from 1 to 10 inclusive
        System.out.printf("%n suming from 1 to 10 inclusive : %d ", IntStream.rangeClosed(1, 10).sum());

//        Stream <interger> Manipulation
        System.out.println();

        Integer[] values1 = {23, 3, 4, 5, 7, 8, 4, 33, 23};

        System.out.printf("original values: %s\n", Arrays.asList(values1));
        System.out.println();

//        sorting the array
        System.out.printf("sorted Arrays %s\n", Arrays.stream(values1).sorted().collect(Collectors.toList()));
        System.out.println();

//        get values greater than 4
        List<Integer> greaterThan4 = Arrays.stream(values1).filter(number -> number > 4).collect(Collectors.toList());
        System.out.printf("get values greater then 4 :%s\n", greaterThan4);
        System.out.println();

        //sorted numbers grearter then 4
        List<Integer> sortGreaterthan4 = Arrays.stream(values1).filter(number -> number > 4).sorted().collect(Collectors.toList());
        System.out.printf("sorted numbes greater then 4 : %s\n", sortGreaterthan4);
        System.out.println();

        //generating list sorted with stream
        List<Integer> sorttedStream = Arrays.stream(values1).sorted().collect(Collectors.toList());
        System.out.printf("list sorted with streams :%s\n ", sorttedStream);
        System.out.println();


//       testing Objects with Streams
        System.out.println("testing object with streams");
        List<Student> studentList = new ArrayList<>();
        Student[] studentCLass = {
                new Student("james", "hans", 38),
                new Student("Hans", "hans", 32),
                new Student("Lovert", "hans", 1),
                new Student("Jeo", "Valandi", 45)
        };

       Function<Student, String > byFirstName = Student::getFirstName;
        Function<Student, String > byLastName = Student::getLastName;
       studentList = Arrays.asList(studentCLass);
        System.out.println("complete emplyee List");
        studentList.stream().forEach(System.out::println);
        Predicate<Student> studentPredicate = (student -> student.getSalary() >= 1);
        System.out.println("<---- filtter according to age ----->");
        studentList.stream().filter(studentPredicate).forEach(System.out::println);

        //geting all student firstName
        studentList.stream().map(Student::getFirstName).distinct().forEach(System.out::println);


    }
}

