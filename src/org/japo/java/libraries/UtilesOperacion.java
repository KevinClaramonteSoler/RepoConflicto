/*
 * Copyright 2022 alumnoT.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

/**
 *
 * @author alumnoT
 */
public final class UtilesOperacion {

    // Suma
    public static final int sumar(int n1, int n2) {
        return n1 + n2;
    }

    // Resta
    public static final int restar(int n1, int n2) {
        return n1 - n2;
    }

    // Multiplicación
    public static final int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    // División
    public static final int dividir(int n1, int n2) {
        return n1 / n2;
    }

    // Obtener resto 
    public static final int obtenerResto(int n1, int n2) {
        return n1 % n2;
    }

    // Obtener media
    public static final int obtenerMedia(int n1, int n2) {
        return (n1 + n2) / 2;
    }

    // Obtener número mayor
    public static final int obtenerMayor(int n1, int n2) {
        int may = 0;
        if (n1 > n2) {
            may = n1;
        } else {
            may = n2;
        }
        return may;
    }

    // Obtener número menor
    public static final int obtenerMenor(int n1, int n2) {
        int men = 0;
        if (n1 < n2) {
            men = n1;
        } else {
            men = n2;
        }
        return men;
    }

    // Potencia
    public static final int calcularPotencia(int n1, int n2) {
        int resultado = 1;
        for (int i = 0; i < n2; i++) {
            resultado = resultado * n1;
        }
        return resultado;
    }

    // Factorial
    public static final int calcularFactorial(int n) {
        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac = fac * i;
        }
        return fac;
    }

    // Validar positivo
    public static final String validarPositivo(int n) {
        boolean signo = false;
        String res = "";
        return res = (n >= 0)?"Positivo":"Negativo";
    }

    // Verificar paridad
    public static final String validarParidad(int n) {
    String res = "";
        return (n % 2 == 0)?"Par":"Impar";
    }

}
