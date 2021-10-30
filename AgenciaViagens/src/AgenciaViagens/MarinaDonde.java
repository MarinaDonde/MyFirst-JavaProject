package AgenciaViagens;

import java.util.Scanner;

public class MarinaDonde {
	
	Scanner in = new Scanner(System.in);

	protected int client, destiny, opt;
	protected String[] name = null;
	protected String[] phone = null;
	protected String[] cpf = null;
	protected String[] email = null;
	protected String[] bday = null;
	protected String[] gender = null;
	protected String[] city = null;
	protected String[] country = null;
	protected String[] days = null;
	protected String[] value = null;
	protected String[] hotels = null;
	protected String[] restaurants = null;
	protected String option;
	

	public MarinaDonde() {
		super();
		this.menuPrincipal();
	}

	public void menuPrincipal() {

		System.out.println("******************* V I A J E ! ****************");
		System.out.println("*         Bem Vindo ao Menu Principal!         *");
		System.out.println("*      [0] Para Encerrar o Programa            *");
		System.out.println("*      [1] Para Acessar a Área Destinos        *");
		System.out.println("*      [2] Para Acessar a Área Clientes        *");
		System.out.println("************************************************");
		this.option = in.next();
		if (this.option.equals("0")) {
			System.out.println("Encerrando o programa...");
		} else if (this.option.equals("1")) {
			this.menuDestinos();
		} else if (this.option.equals("2")) {
			this.menuClientes();
		} else {
			System.out.println("Tentativa Inválida.");
			this.menuPrincipal();
		}
	}

	public void menuDestinos() {

		System.out.println("******************* V I A J E ! ****************");
		System.out.println("*            Área de Destinos                  *");
		System.out.println("*            Escolha a Opção:                  *");
		System.out.println("*     [0] Voltar ao Menu Principal             *");
		System.out.println("*     [1] Cadastrar Destinos                   *");
		System.out.println("*     [2] Consultar o Cadastro de Destinos     *");
		System.out.println("************************************************");
		this.option = in.next();

		switch (this.option) {
		case "0":
			this.menuPrincipal();
			break;
		case "1":
			this.cadastrarDestinos();
			break;
		case "2":
			this.consultarDestinos();
			break;
		default:
			this.menuDestinos();
			break;
		}
	}

	public void cadastrarDestinos() {
	
		System.out.println("******************* V I A J E ! ****************");
		System.out.println("*      Bem Vindo ao Cadastro de Destinos!      *");
		System.out.println("*     [0] Para Voltar ao Menu de Destinos      *");
		System.out.println("*      Deseja Cadastrar Quantos Destinos?      *");
		System.out.println("************************************************");	
		this.opt = in.nextInt();
		
		if (this.opt == 0) {
			System.out.println("Voltando para o Menu Anterior!");
			this.menuDestinos();
		} else {
			this.destiny = this.opt;
			city = new String[this.destiny];
			country = new String[this.destiny];
			days = new String[this.destiny];
			value = new String[this.destiny];
			hotels = new String[this.destiny];
			restaurants = new String[this.destiny];
			this.questionarioDestinos();
		}
	}
	
	public void questionarioDestinos() {
		
		for (int i = 0; i < this.destiny; i++) {
			System.out.print("Insira o nome da cidade: ");
			this.city[i] = in.next();
			while (this.city[i].equals(null)) {
				System.out.print("Insira o nome da cidade: ");
				this.city[i] = in.next();
			}
			System.out.print("Insira o País: ");
			this.country[i] = in.next();
			while (this.country[i].equals(null)) {
				System.out.print("Insira o País: ");
				this.country[i] = in.next();
			}
			System.out.print("Insira a quantidade de dias: ");
			this.days[i] = in.next();
			while (this.days[i].equals(null)) {
				System.out.print("Insira a quantidade de dias: ");
				this.days[i] = in.next();
			}
			System.out.print("Insira o valor: ");
			this.value[i] = in.next();
			while (this.value[i].equals(null)) {
				System.out.print("Insira o valor: ");
				this.value[i] = in.next();
			}
			System.out.print("Insira a quantidade de Hotéis Parceiros: ");
			this.hotels[i] = in.next();
			while (this.hotels[i].equals(null)) {
				System.out.print("Insira a quantidade de Hotéis Parceiros: ");
				this.hotels[i] = in.next();
			}
			System.out.print("Insira a quantidade de Restaurantes Parceiros: ");
			this.restaurants[i] = in.next();
			while (this.restaurants[i].equals(null)) {
				System.out.print("Insira a quantidade de Restaurantes Parceiros: ");
				this.restaurants[i] = in.next();
			}
			System.out.println("******************* V I A J E ! ****************");
		}
		System.out.println("******************* V I A J E ! ****************");
		System.out.println("*     Cliente(s) Cadastrado(s) com Sucesso!    *");
		System.out.println("*   [0] Para Voltar ao Menu Principal          *");
		System.out.println("*   [1] Para Voltar ao Menu do Destino         *");
		System.out.println("*   [2] Para Consultar os Destinos             *");
		System.out.println("*   Para Continuar o Cadastro Qualquer Tecla   *");
		System.out.println("************************************************");
		this.option = in.next();
		switch (this.option) {
		case "0":
			this.menuPrincipal();
			break;
		case "1":
			this.menuDestinos();
			break;
		case "2":
			this.consultarDestinos();
			break;
		default:
			System.out.println("******************* V I A J E ! ****************");
			System.out.println("*      Deseja Cadastrar Quantos Destinos?      *");
			System.out.println("************************************************");
			this.opt = in.nextInt();

			if (this.opt == 0) {
				System.out.println("Voltando para o Menu Anterior!");
				this.cadastrarDestinos();
			} else {
				this.destiny = this.opt;
				city = new String[this.destiny];
				country = new String[this.destiny];
				days = new String[this.destiny];
				value = new String[this.destiny];
				hotels = new String[this.destiny];
				restaurants = new String[this.destiny];
				this.questionarioDestinos();
			}
			break;
		}
	}
	
	public void consultarDestinos() {
		
		if (this.city == null) {
			System.out.println("Não há nada cadastrado!");
			this.menuDestinos();
		} else {
			System.out.println("******************* V I A J E ! ****************");
			System.out.println("*       Central de Consulta aos Destinos!      *");
			System.out.println("*                   Escolha:                   *");
			System.out.println("*   [0] Voltar ao Menu Principal               *");
			System.out.println("*   [1] Cadastro Completo dos Destinos         *");
			System.out.println("*   [2] Verificar Lista de Cidades             *");
			System.out.println("*   [3] Verificar Lista de Países              *");
			System.out.println("*   [4] Verificar Lista dos Hotéis             *");
			System.out.println("*   [5] Verificar Lista dos Restaurantes       *");
			System.out.println("************************************************");
			this.option = in.next();
			switch (this.option) {
			case "0":
				this.menuPrincipal();
				break;
			case "1":
				for (int i = 0; i < this.destiny; i++) {
					System.out.println("Cidade: " + this.city[i]);
					System.out.println("País: " + this.country[i]);
					System.out.println("Tempo de viagem: " + this.days[i]);
					System.out.println("Valor: " + this.value[i]);
					System.out.println("Hotéis: " + this.hotels[i]);
					System.out.println("Restaurantes: " + this.restaurants[i]);
					System.out.println("******************* V I A J E ! ****************");		
				}
				this.consultarDestinos();
				break;
			case "2":
				for (int i = 0; i < this.destiny; i++) {
					System.out.println("Cidade: " + this.city[i]);
				}
				this.consultarDestinos();
				break;
			case "3":
				for (int i = 0; i < this.destiny; i++) {
					System.out.println("País: " + this.country[i]);
				}
				this.consultarDestinos();
				break;
			case "4":
				for (int i = 0; i < this.destiny; i++) {
					System.out.println("Cidade: " + this.city[i] + ", Hotéis: " + this.hotels[i]);
				}
				this.consultarDestinos();
				break;
			case "5":
				for (int i = 0; i < this.destiny; i++) {
					System.out.println("Cidade: " + this.city[i] + ", Restaurantes: " + this.restaurants[i]);
				}
				this.consultarDestinos();
				break;
			default:
				System.out.println("Tente novamente: ");
				this.consultarDestinos();
				break;	
			}
		}
	}

	public void menuClientes() {

		System.out.println("******************* V I A J E ! ****************");
		System.out.println("*               Área de Clientes               *");
		System.out.println("*               Escolha a opção:               *");
		System.out.println("*     [0] Voltar ao Menu Principal             *");
		System.out.println("*     [1] Cadastrar Clientes                   *");
		System.out.println("*     [2] Consultar o Cadastro de Clientes     *");
		System.out.println("************************************************");
		this.option = in.next();

		switch (this.option) {
		case "0":
			this.menuPrincipal();
			break;
		case "1":
			this.cadastrarClientes();
			break;
		case "2":
			this.consultarClientes();
			break;
		default:
			this.menuClientes();
			break;
		}
	}

	public void cadastrarClientes() {

		System.out.println("******************* V I A J E ! ****************");
		System.out.println("*      Bem Vindo ao Cadastro de Clientes!      *");
		System.out.println("*     [0] Para Voltar ao Menu do Cliente       *");
		System.out.println("*      Deseja Cadastrar Quantos Clientes?      *");
		System.out.println("************************************************");
		this.opt = in.nextInt();

		if (this.opt == 0) {
			System.out.println("Voltando para o Menu Anterior!");
			this.menuClientes();
		} else {
			this.client = this.opt;
			name = new String[this.client];
			phone = new String[this.client];
			cpf = new String[this.client];
			email = new String[this.client];
			bday = new String[this.client];
			gender = new String[this.client];
			this.questionarioClientes();
		}
	}

	public void questionarioClientes() {

		for (int i = 0; i < this.client; i++) {
			System.out.print("Insira o nome do cliente: ");
			this.name[i] = in.next();
			while (this.name[i].equals(null)) {
				System.out.print("Insira o nome do cliente: ");
				this.name[i] = in.next();
			}
			System.out.print("Insira o telefone: ");
			this.phone[i] = in.next();
			while (this.phone[i].equals(null)) {
				System.out.print("Insira o telefone: ");
				this.phone[i] = in.next();
			}
			System.out.print("Insira o CPF: ");
			this.cpf[i] = in.next();
			while (this.cpf[i].equals(null)) {
				System.out.print("Insira o CPF: ");
				this.cpf[i] = in.next();
			}
			System.out.print("Insira o email: ");
			this.email[i] = in.next();
			while (this.email[i].equals(null)) {
				System.out.print("Insira o email: ");
				this.email[i] = in.next();
			}
			System.out.print("Insira a data de nascimento: ");
			this.bday[i] = in.next();
			while (this.bday[i].equals(null)) {
				System.out.print("Insira a data de nascimento: ");
				this.bday[i] = in.next();
			}
			System.out.print("Insira o sexo do cliente: ");
			this.gender[i] = in.next();
			while (this.gender[i].equals(null)) {
				System.out.print("Insira o sexo do cliente: ");
				this.gender[i] = in.next();
			}
			System.out.println("******************* V I A J E ! ****************");
		}
		System.out.println("******************* V I A J E ! ****************");
		System.out.println("*     Cliente(s) Cadastrado(s) com Sucesso!    *");
		System.out.println("*   [0] Para Voltar ao Menu Principal          *");
		System.out.println("*   [1] Para Voltar ao Menu do Cliente         *");
		System.out.println("*   [2] Para Consultar os Clientes             *");
		System.out.println("*   Para Continuar o Cadastro Qualquer Tecla   *");
		System.out.println("************************************************");
		this.option = in.next();
		switch (this.option) {
		case "0":
			this.menuPrincipal();;
			break;
		case "1":
			this.menuClientes();
			break;
		case "2":
			this.consultarClientes();
			break;
		default:
			System.out.println("******************* V I A J E ! ****************");
			System.out.println("*      Deseja Cadastrar Quantos Clientes?      *");
			System.out.println("************************************************");
			this.opt = in.nextInt();

			if (this.opt == 0) {
				System.out.println("Voltando para o Menu Anterior!");
				this.cadastrarClientes();
			} else {
				this.client = this.opt;
				name = new String[this.client];
				phone = new String[this.client];
				cpf = new String[this.client];
				email = new String[this.client];
				bday = new String[this.client];
				gender = new String[this.client];
				this.questionarioClientes();
			}
			break;
		}
	
	}

	public void consultarClientes() {

		if (this.name == null) {
			System.out.println("Não há nada cadastrado!");
			this.menuClientes();
		} else {

			System.out.println("******************* V I A J E ! ****************");
			System.out.println("*       Central de Consulta aos Clientes!      *");
			System.out.println("*                   Escolha:                   *");
			System.out.println("*   [0] Voltar ao Menu Principal               *");
			System.out.println("*   [1] Cadastro Completo dos Clientes         *");
			System.out.println("*   [2] Verificar Lista de Nomes dos Clientes  *");
			System.out.println("*   [3] Verificar Lista dos Telefones          *");
			System.out.println("*   [4] Verificar Lista dos CPFs dos Clientes  *");
			System.out.println("*   [5] Verificar Lista de Email dos Clientes  *");
			System.out.println("*   [6] Verificar Datas de Nascimento          *");
			System.out.println("*   [7] Verificar Lista do Sexo dos Clientes   *");
			System.out.println("************************************************");
			this.option = in.next();
			switch (this.option) {
			case "0":
				this.menuPrincipal();
				break;
			case "1":
				for (int i = 0; i < this.client; i++) {
					System.out.println("Nome: " + this.name[i]);
					System.out.println("Telefone: " + this.phone[i]);
					System.out.println("CPF: " + this.cpf[i]);
					System.out.println("Email: " + this.email[i]);
					System.out.println("Data de Nascimento: " + this.bday[i]);
					System.out.println("Sexo: " + this.gender[i]);
					System.out.println("******************* V I A J E ! ****************");
				}
				this.consultarClientes();
				break;
			case "2":
				for (int i = 0; i < this.client; i++) {
					System.out.println("Nome: " + this.name[i]);
				}
				this.consultarClientes();
				break;
			case "3":
				for (int i = 0; i < this.client; i++) {
					System.out.println(this.name[i] + ", Telefone: " + this.phone[i]);
				}
				this.consultarClientes();
				break;
			case "4":
				for (int i = 0; i < this.client; i++) {
					System.out.println(this.name[i] + ", CPF: " + this.cpf[i]);
				}
				this.consultarClientes();
				break;
			case "5":
				for (int i = 0; i < this.client; i++) {
					System.out.println(this.name[i] + ", Email: " + this.email[i]);
				}
				this.consultarClientes();
				break;
			case "6":
				for (int i = 0; i < this.client; i++) {
					System.out.println(this.name[i] + ", Data de Nascimento: " + this.bday[i]);
				}
				this.consultarClientes();
				break;
			case "7":
				for (int i = 0; i < this.client; i++) {
					System.out.println(this.name[i] + "Sexo: " + this.gender[i]);
				}
				this.consultarClientes();
				break;
			default:
				System.out.println("Tente novamente: ");
				this.consultarClientes();
				break;
			}
		}
	}

	public int getClient() {
		return client;
	}

	public void setClient(int client) {
		this.client = client;
	}

	public int getDestiny() {
		return destiny;
	}

	public void setDestiny(int destiny) {
		this.destiny = destiny;
	}

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public String[] getPhone() {
		return phone;
	}

	public void setPhone(String[] phone) {
		this.phone = phone;
	}

	public String[] getCpf() {
		return cpf;
	}

	public void setCpf(String[] cpf) {
		this.cpf = cpf;
	}

	public String[] getEmail() {
		return email;
	}

	public void setEmail(String[] email) {
		this.email = email;
	}

	public String[] getBday() {
		return bday;
	}

	public void setBday(String[] bday) {
		this.bday = bday;
	}

	public String[] getGender() {
		return gender;
	}

	public void setGender(String[] gender) {
		this.gender = gender;
	}

	public String[] getCity() {
		return city;
	}

	public void setCity(String[] city) {
		this.city = city;
	}

	public String[] getCountry() {
		return country;
	}

	public void setCountry(String[] country) {
		this.country = country;
	}

	public String[] getDays() {
		return days;
	}

	public void setDays(String[] days) {
		this.days = days;
	}

	public String[] getValue() {
		return value;
	}

	public void setValue(String[] value) {
		this.value = value;
	}

	public String[] getHotels() {
		return hotels;
	}

	public void setHotels(String[] hotels) {
		this.hotels = hotels;
	}

	public String[] getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(String[] restaurants) {
		this.restaurants = restaurants;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	
}


