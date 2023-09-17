package com.scaler.lld.design.creational.parleg;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Step 2 - Create the concrete product classes
@Getter

public class RoundButton extends Button {
    private Double radius;

    public RoundButton(Double border, Double radius) {
        super();
        this.radius = radius;
    }

    public void onClick() {
        System.out.println("Round Btn was clicked!");
    }

    public void render() {
        System.out.println("Rendered!");
    }

}
