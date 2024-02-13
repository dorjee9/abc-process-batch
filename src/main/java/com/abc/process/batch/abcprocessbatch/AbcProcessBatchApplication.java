package com.abc.process.batch.abcprocessbatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@ComponentScan(basePackages = {"com.abc.*"})
@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
public class AbcProcessBatchApplication implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(AbcProcessBatchApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(AbcProcessBatchApplication.class, args);
		log.info("ends batch app.");
	}
	@Override
	public void run(String... args) {
		log.info("start batch app.");

	}
}
