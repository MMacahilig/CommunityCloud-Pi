package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.text.*;

/**
 * Created by michaelmacahilig on 9/10/15.
 */
public class Window extends JFrame {
    private CommunityCloud communityCloud;

    public Window(CommunityCloud communityCloud) {
        setup();
        build(communityCloud);
        pack();
        setVisible(true);
    }

    private void setup() {
        setLocation(500,500);
    }

    private void build(CommunityCloud communityCloud) {
        add(new GUI(communityCloud));
    }
}
