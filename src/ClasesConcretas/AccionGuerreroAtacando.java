/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesConcretas;

import ClasesProducto.Atacando;

/**
 *
 * @author (╯°□°)╯︵ ┻━┻
 */
public class AccionGuerreroAtacando extends Atacando {

    @Override
    public String atacar() {
        System.out.println("GuerreroAtacando");
        return "GuerreroAtacando";
    }

}
