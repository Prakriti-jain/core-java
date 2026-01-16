package Streams;

/*
Streams is introduced in java 8, they process data in a declarative way, Streams allow us to
- map data - takes in Function<T, R> as argument - returns a new Stream
- filter data - takes in Predicate<T> - returns a new Stream
- sort data - returns a new Stream
- reduce/aggregate date
Streams do not store data, they only process it. Once the stream is consumed it cannot be reused
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsEx {
    static void main() {
        //Creating streams
        //from java collections
        Stream<Integer> stream1 = List.of(1, 2, 3).stream();
        Stream<Integer> stream2 = Stream.of(1, 2, 3);
        Stream<Integer> stream3 = Arrays.stream(new int[]{1,2,3}).boxed();


        //operations on stream - filter, sorted, map, reduce, for each

        Stream<Integer> stream = List.of(6, 4, 7, 2, 10).stream();
        Stream<Integer> streamNew = stream.filter(n -> n%2==0) //filter only the numbers which are even
                .sorted() //sorts them
                .map(n -> n*3); //triples the number

//        streamNew.forEach(n-> System.out.println(n));
        System.out.println(streamNew.reduce(0, (a,b) -> a+b));

    }
}