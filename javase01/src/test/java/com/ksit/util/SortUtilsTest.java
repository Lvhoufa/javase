package com.ksit.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortUtilsTest {

    @Test
    public void poosort() throws Exception {
        int[] ints = {4,6,8,0,12,234,5,1};
        for (int i : SortUtils.poosort(ints)) {
            System.out.println(i);
        }
    }

}