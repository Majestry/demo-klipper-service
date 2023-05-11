package tk.majestry.klipperclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KlipperClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(KlipperClientApplication.class, args);
    }

}
