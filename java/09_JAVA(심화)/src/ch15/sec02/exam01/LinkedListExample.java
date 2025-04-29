package ch15.sec02.exam01;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

@Getter
@Setter
@ToString
public class LinkedListExample {
    public static void main(String[] args) {
        List<Board> list = new LinkedList<>();

        list.add(new Board("제목1","내용1","글쓴이1"));
        list.add(new Board("제목2","내용2","글쓴이2"));
        list.add(new Board("제목3","내용3","글쓴이3"));
        list.add(new Board("제목4","내용4","글쓴이4"));
        list.add(new Board("제목5","내용5","글쓴이5"));

        System.out.println("요소의 개수 : " + list.size());
        System.out.println();

        System.out.println("---3번째 요소---");
        System.out.println(list.get(2));
        System.out.println();
        System.out.println("---모든 요소 출력---");
        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        list.remove(2);
        list.remove(2);
        System.out.println();
        System.out.println("---제거 후 출력---");
        for(Board item : list){
            System.out.println(item);
        }




    }
}
