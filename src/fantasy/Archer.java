package fantasy;

public class Archer {
	// 속성
	private String name; // 이름
	private int health; // 체력
	private int power; // 공격력

	public Archer(String name) {
		this.name = name;
		health = 100;
		power = 10;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	// 궁수가 전사를 공격합니다.
	public void attackWarrior(Warrior warrior) {
		System.out.println(this.name + " 이 " + warrior.getName() + " 을 공격했습니다.");
		warrior.beAttacked(this.power);
	}

	// 궁수가 마법사를 공격합니다.
	public void attackWizard(Wizard wizard) {
		System.out.println(this.name + " 이 " + wizard.getName() + " 을 공격했습니다.");
		wizard.beAttacked(this.power);
	}

	// 궁수가 도적을 공격합니다.
	public void attackTheif(Thief thief) {
		System.out.println(this.name + " 이 " + thief.getName() + " 을 공격했습니다.");
		thief.beAttacked(this.power);
	}

	// 궁수가 공격을 당합니다.
	public void beAttacked(int power) {
		// 방어적 코드
		health -= power;
		if (health <= 0) {
			System.out.println("이미 죽었습니다.");
			health = 0;
		}
	}
}
