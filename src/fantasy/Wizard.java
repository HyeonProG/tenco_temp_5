package fantasy;

public class Wizard {
	// Wizard 클래스 변수 설정
	private String name; // 이름
	private int health; // 체력
	private int power; // 공격력
	
	public Wizard(String name) {
		this.name=name;
		health=100;
		power=30;
	}
	
	// getter 메서드
		public String getName() { // getName
			return this.name;
		}

		public int getHealth() {
			return this.health;
		}

		public int getPower() {
			return power;
		}

		// setter 메서드
		public void setName(String name) {
			this.name = name;
		}

		public void setHealth(int health) {
			this.health = health;
		}

		public void setPower(int power) {
			this.power = power;
		}
	

	// 마법사가 전사를 공격함
	public void attackWarrior(Warrior warrior) {
		System.out.println(this.name+"가 "+warrior.getName()+"을 공격합니다.");
		warrior.beAttacked(this.power);
	}

	// 마법사가 도적을 공격함
	public void attackThief(Thief thief) {
		System.out.println(this.name+"가 "+thief.getName()+"을 공격합니다.");
		thief.beAttacked(this.power);
	}

	// 마법사가 궁수를 공격함
	public void attackArcher(Archer archer) {
		System.out.println(this.name+"가 "+archer.getName()+"을 공격합니다.");
		archer.beAttacked(this.power);
	}

	// 공격 받을 때
	public void beAttecked(int power) {
		if (health < power) {
			System.out.println("전투에서 승리했습니다.");
			this.health = 0;
			return;
		}
		this.power -= power;
	}


}
