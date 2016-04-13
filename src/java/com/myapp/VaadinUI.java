
package com.myapp;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 *
 * @author Matti Tahvonen
 */
@Theme("valo")
public class VaadinUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        setSizeUndefined();
        setContent(new Label("Hello Vaadin user!"));
    }

}
