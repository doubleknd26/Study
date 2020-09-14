package com.kkd.study.java.enumeration;

import org.junit.Test;

import static org.junit.Assert.*;


public class EnsembleTest {

    @Test
    public void numberOfMusicians() {
        assertEquals(12, Ensemble.TRIPLE_QUARTET.getNumberOfMusicians());
    }
}