package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/")
	public String welcom() {
		return "Welcon to the SHIELD";
	};

	@GetMapping("/avengers/assemble")
	public String avenger() {
		return " Avengers ... Assemble";

	};

	@GetMapping("/secret-bases")
	public String secretBases() {
		return "List of secret bases: Biarritz, Bordeaux, la loupe, Lyon , Lille , Marseille , Nantes ,Orleans , Paris , reims , Strasbourg , Toulouse, Tours";

	}
}
