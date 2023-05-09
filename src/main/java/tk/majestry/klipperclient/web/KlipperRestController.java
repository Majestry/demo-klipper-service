package tk.majestry.klipperclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class KlipperRestController {

    @Value("${application.version}")
    private String appVersion;

    @GetMapping(path = "/hello")
    public String getHello(@RequestParam(name = "name") String name) {
        var responseData = "I'm a new version here, %s! My version is %s";
        return String.format(responseData, name, appVersion);
    }
}
