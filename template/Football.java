/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.patterns.template;

/**
 *
 * @author Pankaj
 */
public class Football  extends Game{

    @Override
    void initialize() {
        System.out.println("Initialize: Football");
    }

    @Override
    void startPlay() {
        System.out.println("Start Play: Football");
    }

    @Override
    void endPlay() {
        System.out.println("End Play: Football");
    }
    
}
