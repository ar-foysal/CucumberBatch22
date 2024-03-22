package step_definitions;

import drivers.PageDriver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static drivers.BaseDriver.close;
import static drivers.BaseDriver.startBrowser;

public class Hooks {

    @Before
    public void start(){
        startBrowser();
    }

    @After
    public void closeDriver(Scenario scenario){
        takeScreenShot(scenario);
        close();
    }

    public static void takeScreenShot(Scenario scenario){
        if (scenario.isFailed()){
            String name = scenario.getName().replaceAll(" ", "_");
            byte[] data = ((TakesScreenshot)PageDriver.getCurrentDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", name);
        }

    }
}
