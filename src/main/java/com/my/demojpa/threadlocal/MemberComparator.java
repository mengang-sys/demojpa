package com.my.demojpa.threadlocal;

import java.util.Comparator;

public class MemberComparator implements Comparator<Member> {
    @Override
    public int compare(Member o1, Member o2) {
        return o1.getAge() - o2.getAge();
    }
}
