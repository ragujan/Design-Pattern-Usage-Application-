/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rag.syzygy.design_patterns.mediator;

import com.rag.syzygy.design_patterns.mediator.ConcreteMediator;
import com.rag.syzygy.design_patterns.mediator.Mediator;

/**
 *
 * @author ACER
 */
public class MediatorContext {
	private static Mediator mediator;

    public static Mediator getMediator(){
        if(mediator==null){
            mediator =new ConcreteMediator();
        }
        return mediator;
    }
}
