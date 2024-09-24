package com.academia.powerflex;

import com.academia.powerflex.model.Plano;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PowerflexApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerflexApplication.class, args);

		Plano p = new Plano();

		p.setPlano("Palno Mensal");

		if(!p.validarPlano()){
			System.out.println(p.getMensagemErro());
		}

	}

}
