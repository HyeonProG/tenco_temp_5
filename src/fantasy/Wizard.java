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
		warrior.beAttacked(this.power);
		System.out.println();
	}

	// 마법사가 도적을 공격함
	public void attackThief(Thief thief) {
		int a = thief.getHealth();
		if (a <= 0) {
			System.out.println(thief.getName + "가 사망했습니다.");
			thief.setHealth(0);
			return;
		}
		thief.setHealth(a - power);
	}

	// 마법사가 궁수를 공격함
	public void attackArcher(Archer archer) {
		int a = archer.getHealth();
		if (a <= 0) {
			System.out.println(archer.getName + "가 사망했습니다.");
			archer.setHealth(0);
			return;
		}
		Archer.setHealth(a - power);
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
