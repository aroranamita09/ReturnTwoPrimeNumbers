package com.stackroute;
public class PrimeNumbers {
    // Generate all prime numbers less than n.
             String printPrimes(int n, boolean isPrime[])
        {
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
            }return nam;
        }
    }

