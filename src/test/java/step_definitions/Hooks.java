package step_definitions;

import io.cucumber.java.*;

import static drivers.BaseDriver.close;
import static drivers.BaseDriver.startBrowser;

public class Hooks {

    @Before
    public void start(){
        startBrowser();
    }

    @After
    public void closeDriver(){
        close();
    }
}
