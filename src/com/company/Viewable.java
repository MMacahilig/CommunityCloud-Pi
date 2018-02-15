package com.company;

import javax.swing.text.View;
import java.util.LinkedList;
import java.util.*;


/**
 * Created by michaelmacahilig on 9/10/15.
 */
public class Viewable {
    private LinkedList<View> views = new LinkedList<View>();

    public void attach(View view){
        views.add(view);
    }

    public void detach(View view){
        views.remove(view);
    }

    public void update(){
        for(View view: views){
            //view.update();
        }
    }
 }
