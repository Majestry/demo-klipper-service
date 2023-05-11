package tk.majestry.klipperclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.majestry.KlipperResponse;

@RestController
public class KlipperRestController
{

    @Value("${application.version}")
    private String appVersion;

    @GetMapping(path = "/hello")
    public KlipperResponse getHello(@RequestParam(name = "name") String name,
                                    @RequestHeader("X-Custom-Header") String customHeader)
    {
        KlipperResponse klipperResponse = new KlipperResponse();
        klipperResponse.setName(name);
        klipperResponse.setVersion(appVersion);
        klipperResponse.setHeaderValue(customHeader);
        return klipperResponse;
    }
}
