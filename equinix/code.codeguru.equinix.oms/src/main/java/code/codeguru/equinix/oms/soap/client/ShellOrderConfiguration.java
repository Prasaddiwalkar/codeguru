package code.codeguru.equinix.oms.soap.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ShellOrderConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("code.codeguru.equinix.soap.oms.shellorder");
        return marshaller;
    }

//    @Bean
    public ShellOrderSOAPClient shellOrderClient(Jaxb2Marshaller marshaller) {
        ShellOrderSOAPClient client = new ShellOrderSOAPClient();
        client.setDefaultUri("http://localhost:8080/shellorder/services/shellorder");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
