
package com.myapp;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.teemu.switchui.Switch;

/**
 *
 * @author Matti Tahvonen
 */
@Theme("valo")
@Widgetset("AppWidgetset")
public class VaadinUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        setSizeUndefined();
        VerticalLayout verticalLayout = new VerticalLayout();
        setContent(verticalLayout);
        verticalLayout.addComponent(new Label("Hello Vaadin user!"));

        Switch onoff = new Switch("This is Vaadin Add-on");
        verticalLayout.addComponent(onoff);
    }

}
