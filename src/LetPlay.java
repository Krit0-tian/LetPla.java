import java.util.Scanner;

public class LetPlay implements Player{
    public int Player_Hp,Player_Attribute,MonsterHp=10,MonsterAttribute=1;
    public String Monster_name="史莱姆";
    public String Player_name;
    public void Player_Name() {
            System.out.println("欢迎来到异世界！你是我们为了对抗魔王而召唤出的勇者，请问你大名是？");
            System.out.println("请输入你的名字：");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            Player_name=name;
            System.out.println("好的，" + name + "大人！");
        }
        @Override
        public void Player_Attribute () {
            System.out.println("请输入你的生命值：");
            Scanner scanner = new Scanner(System.in);
            int Hp = scanner.nextInt();
            Player_Hp=Hp;
            System.out.println("请输入你的攻击力：");
            int Aggressivity=scanner.nextInt();
            Player_Attribute=Aggressivity;
            System.out.println("你的属性为：\n"+"生命值："+Hp+"\n"+"攻击力："+Aggressivity);
        }
public void Fighting() {
    System.out.println("现在你遇到了" + Monster_name + "然后你决定去战斗");
    for (int b = 0; b < 60; b++) {
        if (Player_Hp > 0 && MonsterHp >0 ) {
           {
            MonsterHp = MonsterHp - Player_Attribute;
            System.out.println(Player_name + "对" + Monster_name + "造成了" + Player_Attribute + "点伤害，" + Monster_name + "还剩" + MonsterHp + "点血");
            if(MonsterHp>0){
            Player_Hp = Player_Hp - MonsterAttribute;
            System.out.println(Monster_name + "对" + Player_name + "造成了" + MonsterAttribute + "点伤害，" + Player_name + "还剩" + Player_Hp + "点血");}
            continue;
            }
        }break;
    }
    System.out.println("战斗结束");
}
}
