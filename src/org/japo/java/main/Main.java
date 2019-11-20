/* 
 * Copyright 2019 Manu Portolés Zagalá.
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
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        //Constantes
        final int PLANT_MAX = 10;
        final int PLANT_MIN = 0;

        //Variables
        int numPlan = 0;
        int planDest = 0;
        boolean pisoSelecOk;

        //Petición 1
        do {
            try {
                System.out.print("Introduzca el piso donde quiera ir ...: ");
                planDest = SCN.nextInt();
                pisoSelecOk = planDest >= PLANT_MIN && planDest <= PLANT_MAX;

            } catch (Exception e) {

                pisoSelecOk = false;
            } finally {
                SCN.nextLine();
            }

        } while (pisoSelecOk == false);

        //Bucle
        while (numPlan < planDest || numPlan > planDest) {
            System.out.printf("%s %02d%n", "Planta", numPlan > planDest
                    ? numPlan - 1 : numPlan + 1);

            if (numPlan < planDest) {
                numPlan++;
            } else {
                numPlan--;
            }

        }
        numPlan = planDest;

        //Petición 2
        do {
            try {
                System.out.print("Introduzca el piso donde quiera ir ...: ");
                planDest = SCN.nextInt();
                pisoSelecOk = planDest >= PLANT_MIN && planDest <= PLANT_MAX;

            } catch (Exception e) {
                pisoSelecOk = false;
            } finally {
                SCN.nextLine();
            }

        } while (pisoSelecOk == false);

        //Bucle
        while (numPlan < planDest || numPlan > planDest) {
            System.out.printf("%s %02d%n", "Planta", numPlan > planDest
                    ? numPlan - 1 : numPlan + 1);

            if (numPlan < planDest) {
                numPlan++;
            } else {
                numPlan--;
            }

        }
        numPlan = planDest;

        //Petición 3
        do {
            try {
                System.out.print("Introduzca el piso donde quiera ir ...: ");
                planDest = SCN.nextInt();
                pisoSelecOk = planDest >= PLANT_MIN && planDest <= PLANT_MAX;

            } catch (Exception e) {

                pisoSelecOk = false;
            } finally {
                SCN.nextLine();
            }

        } while (pisoSelecOk == false);

        //Bucle
        while (numPlan < planDest || numPlan > planDest) {
            System.out.printf("%s %02d%n", "Planta", numPlan > planDest
                    ? numPlan - 1 : numPlan + 1);

            if (numPlan < planDest) {
                numPlan++;
            } else {
                numPlan--;
            }

        }
        numPlan = planDest;

        //Petición 4
        do {
            try {
                System.out.print("Introduzca el piso donde quiera ir ...: ");
                planDest = SCN.nextInt();
                pisoSelecOk = planDest >= PLANT_MIN && planDest <= PLANT_MAX;

            } catch (Exception e) {

                pisoSelecOk = false;
            } finally {
                SCN.nextLine();
            }

        } while (pisoSelecOk == false);

        //Bucle
        while (numPlan < planDest || numPlan > planDest) {
            System.out.printf("%s %02d%n", "Planta", numPlan > planDest
                    ? numPlan - 1 : numPlan + 1);

            if (numPlan < planDest) {
                numPlan++;
            } else {
                numPlan--;
            }

        }
        System.out.println("Se ha acabado la memoria para almacenar registros, vuelva mañana");
    }

}
