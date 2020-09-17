package com.my.demojpa.threadlocal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    private String name;
    private int age;

/*    @Override
    public int compareTo(Member mem) {
        return this.age - mem.getAge();
  *//*      if (this.age > mem.getAge()) {
            return 1;
        } else if (this.age < mem.getAge()) {
            return -1;
        } else {
            return 0;
        }*//*
    }*/

    public static void main(String[] args) {
        Member data[] = new Member[]{
                new Member("小明", 22), new Member("小红", 123), new Member("小白", 11)
        };
        Arrays.sort(data,new MemberComparator());
        System.out.println(Arrays.toString(data));
    }
}
