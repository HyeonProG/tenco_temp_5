package fantasy;

public class Thief {

	private String name;
	private int health;
	private int power;
	
	public Thief(String name) {
		this.name = name;
		health = 300;
		power = 100;
	}
	
	// getter setter
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
	
	// 도적이 전사를 공격함
	public void attackWarrior(Warrior w) {
		w.beAttacked(this.power);
		System.out.println(this.name + "이 " + w.getName +"를 공격했습니다.");
	}
	// 도적이 마법사를 공격함
	public void attackWizard(Wizard w) {
		w.beAttacked(this.power);
		System.out.println(this.name + "이 " + w.getName +"를 공격했습니다.");
	}
	// 도적이 궁수를 공격함
	public void attackArcher(Archer a) {
		a.beAttacked(this.power);
		System.out.println(this.name + "이 " + a.getName +"를 공격했습니다.");
	}
	
	// 도적이 공격받음
	public void beAttacked(int power) {
		if (health <= 0) {
			System.out.println("이미 죽었습니다.");
		}
		health -= power;
		if (health < 0) {
			health = 0;
		}
	}
	
}
