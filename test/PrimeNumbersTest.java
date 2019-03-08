package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumbersTest {
    PrimeNumbers obj;
    @Before
    public void setUp() throws Exception {
        obj = new PrimeNumbers();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void checkPrime() {
         boolean[] isPrime={false,true,false,true};
        int n=4;
        String nam="";
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <n; i++)

            isPrime[i] = true;

        for (int p = 2; p * p < n; p++) {
            // If isPrime[p] is not changed,
            // then it is a prime
            if (isPrime[p] == true) {
                // Update all multiples of p
                for (int i = p * 2; i <= n; i += p)
                    isPrime[i] = false;
            }
        }
        for (int i = 0; i < n; i++) {
            if (isPrime[i] && isPrime[n - i]) {
                nam=i + " " + (n - i);
                System.out.println(nam);

            }
        }
        assertEquals(nam ,obj.printPrimes(n,isPrime));
    }

}
