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
		System.out.println(this.name+"이 "+warrior.getName()+"를 공격했습니다.");
		warrior.beAttacked(this.power);
	}

	// 마법사가 도적을 공격함
	public void attackThief(Thief thief) {
		System.out.println(this.name+"이 "+thief.getName()+"를 공격했습니다.");
		thief.beAttacked(this.power);
	}

	// 마법사가 궁수를 공격함
	public void attackArcher(Archer archer) {
		System.out.println(this.name+"이 "+archer.getName()+"를 공격했습니다.");
		archer.beAttacked(this.power);
	}

	// 마법사가 공격받음
	public void beAttacked(int power) {
		if (health <= 0) {
			System.out.println("이미 죽었습니다.");
		}
		health -= power;
		if (health < 0) {
			health=0;
		}
	}


}
