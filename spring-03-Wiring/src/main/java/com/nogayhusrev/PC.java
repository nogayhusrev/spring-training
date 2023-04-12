package com.nogayhusrev;

import com.nogayhusrev.casefactory.Case;
import com.nogayhusrev.monitorfactory.Monitor;
import com.nogayhusrev.motherboardfactory.Motherboard;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

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
