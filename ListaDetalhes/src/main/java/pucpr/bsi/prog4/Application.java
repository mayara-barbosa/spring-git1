package pucpr.bsi.prog4;



import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	@ConfigurationProperties(prefix="datasource.loja")
	public DataSource siteDataSourceBean(){
		return DataSourceBuilder.create().build();
		
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean siteEntityManagerFactoryBean
												(EntityManagerFactoryBuilder
														builder){
		return builder.dataSource(siteDataSourceBean())
					  .packages("pucpr.bsi.prog4.models")
					  .persistenceUnit("lojaPU")
					  .build();
		
	}
}
