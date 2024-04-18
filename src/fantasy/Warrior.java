package fantasy;

public class Warrior {

	private String name;
	private int health;
	private int power;

	public Warrior(String name) {
		this.name = name;
		health = 500;
		power = 150;

	}
	// 전사가 마법사를 공격함
	public void attackWizard(Wizard wizard) {
		System.out.println(this.name + " 이 " + wizard.getName() + "을 공격합니다");
		wizard.beAttacked(this.power);
	}
	// 전사가 도적을 공격함
	public void attackThief(Thief thief) {
		System.out.println(this.name + " 이 " + thief.getName() + "을 공격합니다");
		thief.beAttacked(this.power);
	}
	// 전사가 궁수를 공격함
	public void attackArcher(Archer archer) {
		System.out.println(this.name + " 이 " + archer.getName() + "을 공격합니다");
		archer.beAttacked(this.power);
	}
	// 전사가 공격당
	public void beAttacked(int power) {
		if (health <= 0) {
			System.out.println("이미 사망하였습니다.");
			return;
		}
		health = health - power;
	}

	public String getName() {
		return this.name;
	}

	public int getHealth() {
		return this.health;
	}

	public int getPower() {
		return this.power;
	}

	public void setName(String inputname) {
		this.name = inputname;
	}

	public void setHealth(String inputhealth) {
		this.name = inputhealth;
	}

	public void setPower(String inputPower) {
		this.name = inputPower;
	}
}
