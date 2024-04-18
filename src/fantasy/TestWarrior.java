package fantasy;

import java.util.Scanner;

public class TestWarrior {

	public static void main(String[] args) {

		final int WARRIOR = 1;
		final int WIZARD = 2;
		final int THIEF = 3;
		final int ARCHER = 4;
		final int GAME_END = 0;

		Warrior warrior1 = new Warrior("전사");
		Wizard wizard1 = new Wizard("마법사");
		Thief thief1 = new Thief("도적");
		Archer archer1 = new Archer("궁수");

		Scanner sc = new Scanner(System.in);
		int unitChoice = -1;
		do {
			System.out.println("=== 클래스를 선택하세요 ===");
			System.out.println(" 1. 전사\t 2. 마법사\t 3. 도적\t 4. 궁수\t 0. 게임종료");
			unitChoice = sc.nextInt();

			if (unitChoice == WARRIOR) {
				System.out.println("전사를 선택하였습니다");
				
				warrior1.attackArcher(archer1);
				

			} else if (unitChoice == WIZARD) {
				

			} else if (unitChoice == THIEF) {

			} else if (unitChoice == ARCHER) {

			} else if( unitChoice == GAME_END){
				System.out.println("프로그램을 종료 합니다.");
				unitChoice = GAME_END;
			} else {
				System.out.println("잘못된 입력입니다.");
				
			}
		} while (unitChoice != 0);
		
		

	}

}
