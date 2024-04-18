package fantasy;

import java.util.Scanner;

public class TestArcher {

	public static void main(String[] args) {

		Archer archer1 = new Archer("궁수");
		Wizard wizard1 = new Wizard("마법사");
		Thief thief1 = new Thief("도적");
		Warrior warrior1 = new Warrior("전사");

		Scanner sc = new Scanner(System.in);
		int choice1;
		int choice2;
		int choice3;

		System.out.println("어떤 클래스를 선택하시겠습니까?");
		System.out.println("1.궁수\t 2.마법사\t 3.도적\t 4.전사");
		choice1 = sc.nextInt();
		if (choice1 == 1) {
			System.out.println(archer1.getName() + " 로 누구를 공격하시겠습니까?");
			System.out.println("1.마법사\t 2.도적\t 3.전사");
			choice2 = sc.nextInt();
			if (choice2 == 1) {
				System.out.println("마법사를 몇번 공격하시겠습니까?");
				choice3 = sc.nextInt();
				for (int i = 0; i < choice3; i++) {
					if (wizard1.getHealth() >= 0) {
						archer1.attackWizard(wizard1);
					} else {
						System.out.println("마법사가 사망하였습니다.");
						break;
					}
				}
			} else if (choice2 == 2) {
				System.out.println("도적을 몇번 공격하시겠습니까?");
				choice3 = sc.nextInt();
				for (int i = 0; i < choice3; i++) {
					if (thief1.getHealth() >= 0) {
						archer1.attackTheif(thief1);
						;
					} else {
						System.out.println("도적이 사망하였습니다.");
						break;
					}
				}
			} else if (choice2 == 3) {
				System.out.println("전사를 몇번 공격하시겠습니까?");
				choice3 = sc.nextInt();
				for (int i = 0; i < choice3; i++) {
					if (warrior1.getHealth() >= 0) {
						archer1.attackWarrior(warrior1);
						;
					} else {
						System.out.println("전사가 사망하였습니다.");
						break;
					}
				}
			} else {
				System.out.println("다시 선택해 주세요.");
			}
		} else if (choice1 == 2) {
			System.out.println(wizard1.getName() + " 로 누구를 공격하시겠습니까?");
			System.out.println("1.궁수\t 2.도적\t 3.전사");
			choice2 = sc.nextInt();
			if (choice2 == 1) {
				System.out.println("궁수를 몇번 공격하시겠습니까?");
				choice3 = sc.nextInt();
				for (int i = 0; i < choice3; i++) {
					if (archer1.getHealth() >= 0) {
						wizard1.attackArcher(archer1);
						;
					} else {
						System.out.println("궁수가 사망하였습니다.");
						break;
					}
				}
			} else if (choice2 == 2) {
				System.out.println("도적을 몇번 공격하시겠습니까?");
				choice3 = sc.nextInt();
				for (int i = 0; i < choice3; i++) {
					if (thief1.getHealth() >= 0) {
						wizard1.attackThief(thief1);
						;
					} else {
						System.out.println("도적이 사망하였습니다.");
						break;
					}
				}
			} else if (choice2 == 3) {
				System.out.println("전사를 몇번 공격하시겠습니까?");
				choice3 = sc.nextInt();
				for (int i = 0; i < choice3; i++) {
					if (warrior1.getHealth() >= 0) {
						wizard1.attackWarrior(warrior1);
						;
					} else {
						System.out.println("전사가 사망하였습니다.");
						break;
					}
				}
			} else {
				System.out.println("다시 선택해 주세요.");
			}
		} else if (choice1 == 3) {
			System.out.println(thief1.getName() + " 로 누구를 공격하시겠습니까?");
			System.out.println("1.궁수\t 2.마법사\t 3.전사");
			choice2 = sc.nextInt();
			if (choice2 == 1) {
				System.out.println("궁수를 몇번 공격하시겠습니까?");
				choice3 = sc.nextInt();
				for (int i = 0; i < choice3; i++) {
					if (archer1.getHealth() >= 0) {
						thief1.attackArcher(archer1);
					} else {
						System.out.println("궁수가 사망하였습니다.");
						break;
					}
				}
			} else if (choice2 == 2) {
				System.out.println("마법사를 몇번 공격하시겠습니까?");
				choice3 = sc.nextInt();
				for (int i = 0; i < choice3; i++) {
					if (wizard1.getHealth() >= 0) {
						thief1.attackWizard(wizard1);
					} else {
						System.out.println("마법사가 사망하였습니다.");
						break;
					}
				}
			} else if (choice2 == 3) {
				System.out.println("전사를 몇번 공격하시겠습니까?");
				choice3 = sc.nextInt();
				for (int i = 0; i < choice3; i++) {
					if (warrior1.getHealth() >= 0) {
						thief1.attackWarrior(warrior1);
					} else {
						System.out.println("전사가 사망하였습니다.");
						break;
					}
				}
			} else {
				System.out.println("다시 선택해 주세요.");
			}
		} else if (choice1 == 4) {
			System.out.println(warrior1.getName() + " 로 누구를 공격하시겠습니까?");
			System.out.println("1.궁수\t 2.마법사\t 3.도적");
			choice2 = sc.nextInt();
			if (choice2 == 1) {
				System.out.println("궁수를 몇번 공격하시겠습니까?");
				choice3 = sc.nextInt();
				for (int i = 0; i < choice3; i++) {
					if (archer1.getHealth() >= 0) {
						warrior1.attackArcher(archer1);
						;
					} else {
						System.out.println("마법사가 사망하였습니다.");
						break;
					}
				}
			} else if (choice2 == 2) {
				System.out.println("마법사를 몇번 공격하시겠습니까?");
				choice3 = sc.nextInt();
				for (int i = 0; i < choice3; i++) {
					if (wizard1.getHealth() >= 0) {
						warrior1.attackWizard(wizard1);
					} else {
						System.out.println("마법사가 사망하였습니다.");
						break;
					}
				}
			} else if (choice2 == 3) {
				System.out.println("도적을 몇번 공격하시겠습니까?");
				choice3 = sc.nextInt();
				for (int i = 0; i < choice3; i++) {
					if (thief1.getHealth() >= 0) {
						warrior1.attackThief(thief1);
						;
					} else {
						System.out.println("도적이 사망하였습니다.");
						break;
					}
				}
			}
		} else {
			System.out.println("다시 선택해 주세요.");
			return;
		}

	}

}
