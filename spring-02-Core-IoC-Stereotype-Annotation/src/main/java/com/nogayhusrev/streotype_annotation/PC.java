package com.nogayhusrev.streotype_annotation;

import com.nogayhusrev.streotype_annotation.casefactory.Case;
import com.nogayhusrev.streotype_annotation.monitorfactory.Monitor;
import com.nogayhusrev.streotype_annotation.motherboardfactory.Motherboard;
import lombok.Getter;

@Getter
public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt();
    }

}
