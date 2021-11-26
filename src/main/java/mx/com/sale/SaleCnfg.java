package mx.com.sale;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan({"mx.com.sale.repository","mx.com.sale.service.impl","mx.com.sale.service","mx.com.sale.resource"})
@EnableJpaRepositories("mx.com.sale.repository")
public class SaleCnfg {

}
