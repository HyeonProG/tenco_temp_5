package fantasy;
import java.util.Scanner;
public class TestWizard {
	public static void main(String[] args) {
		
		Warrior warrior1=new Warrior("쉬고있던 전사");
		Wizard wizard1=new Wizard("지나가는 마법사");
		Thief thief1=new Thief("생각중인 도적");
		Archer archer1=new Archer("집가던 궁수");
		
		final int WARRIOR=1;
		final int WIZARD=2;
		final int THIEF=3;
		final int ARCHER=4;
		final int GAME_END=0;
		
		int a=warrior1.getHealth();
		
		
		System.out.println("----------------");
		System.out.println("게임에 오신 것을 환영합니다.");
		System.out.println("캐릭터를 선택해주세요. \t");
		System.out.println(" 1.전사  | 2.마법사 | 3.도적 | 4. 궁수 ");
		System.out.println("----------------");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
	
		if(choice==WARRIOR) {
			System.out.println("당신은 전사를 선택했습니다.");
			System.out.println("게임을 시작합니다.");
			System.out.println("----------------");
			System.out.println("어떻게 할까요?");
			System.out.println("1. 베기 | 0. 종료 ");
			int choice2=sc.nextInt();
			while(a>0) {
				if(choice2==1) {
					warrior1.attackWizard(wizard1);
					if(wizard1.getHealth()<=0) {
						System.out.println("게임을 종료합니다.");
						return;
					}
				} else if(choice2==GAME_END) {
					System.out.println("게임을 종료합니다.");
					return;
				}
			}
			}
		
		
		
	}

}
