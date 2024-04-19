package fantasy;

import java.util.Scanner;

public class TestThief {

	public static void main(String[] args) {
		final int WARRIOR = 1;
		final int WIZARD = 2;
		final int THIEF = 3;
		final int ARCHER = 4;
		final int END_GAME = 0;

		Warrior warrior1 = new Warrior("전사1");
		Wizard wizard1 = new Wizard("마법사1");
		Thief thief1 = new Thief("도적1");
		Archer archer = new Archer("궁수1");

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("직업을 선택하세요.");
			System.out.println("1. 전사 2. 마법사 3. 도적 4. 궁수 0. 종료");
			int choice = sc.nextInt();
			if (choice == END_GAME) {
				System.out.println("게임을 종료합니다.");
				break;
			} else if (choice == WARRIOR) {
				System.out.println("전사 " + warrior1.getName() + "을 선택했습니다.");
				System.out.println("공격할 대상을 선택해주세요");
				System.out.println("2. 마법사 3. 도적 4. 궁수");
				int choice2 = sc.nextInt();
				if (choice2 == WIZARD) {
					warrior1.attackWizard(wizard1);
				} else if (choice2 == THIEF) {
					warrior1.attackThief(thief1);
				} else if (choice2 == ARCHER) {
					warrior1.attackArcher(archer);
				}
			} else if (choice == WIZARD) {
				System.out.println("마법사 " + wizard1.getName() + "을 선택했습니다.");
				System.out.println("공격할 대상을 선택해주세요");
				System.out.println("1. 전사 3. 도적 4. 궁수");
				int choice2 = sc.nextInt();
				if (choice2 == WARRIOR) {
					wizard1.attackWarrior(warrior1);
				} else if (choice2 == THIEF) {
					wizard1.attackThief(thief1);
				} else if (choice2 == ARCHER) {
					wizard1.attackArcher(archer);
				}
			} else if (choice == THIEF) {
				System.out.println("도적 " + thief1.getName() + "을 선택했습니다.");
				System.out.println("공격할 대상을 선택해주세요");
				System.out.println("1. 전사 2. 마법사 4. 궁수");
				int choice2 = sc.nextInt();
				if (choice2 == WARRIOR) {
					thief1.attackWarrior(warrior1);
				} else if (choice2 == WIZARD) {
					thief1.attackWizard(wizard1);
				} else if (choice2 == ARCHER) {
					thief1.attackArcher(archer);
				}
			} else if (choice == ARCHER) {
				System.out.println("궁수 " + archer.getName() + "을 선택했습니다.");
				System.out.println("공격할 대상을 선택해주세요");
				System.out.println("1. 전사 2. 마법사 3. 도적");
				int choice2 = sc.nextInt();
				if (choice2 == WARRIOR) {
					archer.attackWarrior(warrior1);
				} else if (choice2 == WIZARD) {
					archer.attackWizard(wizard1);
				} else if (choice2 == THIEF) {
					archer.attackTheif(thief1);
				}
			} else {
				System.out.println("다시 선택해주세요.");
			}
			if (warrior1.getHealth() <= 0 || wizard1.getHealth() <= 0 || thief1.getHealth() <= 0 || archer.getHealth() <= 0) {
				System.out.println("한명이 사망하였습니다. 끝");
				break;
			}
		}
		sc.close();
	}

}
