package com.br.crud.pibape;

import com.br.crud.pibape.entity.AdGroup;
import com.br.crud.pibape.entity.Policy;
import com.br.crud.pibape.entity.User;
import com.br.crud.pibape.repositoty.AdGroupRepository;
import com.br.crud.pibape.repositoty.PolicyRepository;
import com.br.crud.pibape.repositoty.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.NoRepositoryBean;

@SpringBootApplication
public class PibapeBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(PibapeBackApplication.class, args);
	}


	/*@Bean
	public CommandLineRunner run(@Autowired AdGroupRepository adGroupRepository){
		return args -> {
			AdGroup group = AdGroup.builder()
					        .nome("Grupo")
					        .distinquinteName("distinquinama")
					        .build();
			adGroupRepository.save(group);
		};
	}*/

	/*@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			initUsers(userRepository);
		};

	}

	private void initUsers(UserRepository userRepository) {
		User admin = new User();
		admin.setEmail("admin@pibape.com.br");
		admin.setPassword("123456");
		//admin.setProfile(ProfileEnum.ROLE_ADMIN);

		User find = userRepository.findByEmail("admin@pibape.com.br");
		if (find == null) {
			userRepository.save(admin);
		}
	}*/

	/*@Bean
	CommandLineRunner init(PolicyRepository policyRepository) {
		return args -> {
			initPolicies(policyRepository);
		};

	}

	private void initPolicies(PolicyRepository policyRepository) {
		Policy policy = Policy.builder()
				         .idGroup("GRUPO")
				         .name("Nome da Policy").transection("GRU,PRO")
				         .build();
		policyRepository.save(policy);
	}*/

}
