package org.vaadin.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        Button button = new Button("Click me");
        DatePicker datePicker = new DatePicker("Select a date");


        HorizontalLayout horizontalLayout = new HorizontalLayout(button, datePicker);
        horizontalLayout.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        add(horizontalLayout);

        button.addClickListener(click -> add(new Paragraph("Clicked " + datePicker.getValue())));


    }


}
