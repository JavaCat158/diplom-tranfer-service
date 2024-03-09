package aplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestConfiguration(proxyBeanMethods = false)
public class TestTransferApplication {

	public static void main(String[] args) {
		SpringApplication.from(TransferApplication::main).with(TestTransferApplication.class).run(args);
	}


}
