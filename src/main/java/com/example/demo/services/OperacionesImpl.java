package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class OperacionesImpl implements Operaciones {
    @Override
    public int factorial(int numero) {

        if (numero < 0){
            throw new ArithmeticException();
        }

        if (numero > 23){
            throw new IllegalArgumentException("Overflow from integer");
        }

        if(numero == 1 || numero == 0) return 1;
        return  numero * factorial(numero-1);
    }
}
