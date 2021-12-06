package jp.ac.uryukyu.ie.e215726;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    /**
     * 倒れたはずの敵は攻撃できないことを検証。
     * 検証手順
     *  (1) ヒーローと敵を準備。ヒーローの攻撃力は敵を一撃で倒せるほど強い状態とする。
     *  (2) ヒーローが殴り、敵も殴る。敵は一撃で倒されていることを期待。
     *  (3) 敵が死んだ状態ならば攻撃できないはず。
     * 　　つまり攻撃実行してもヒーローのHPは減っていないことを期待。これを検証する。
     */
    @Test
    void attackWithWeponSkillTest() {
        Warrior demoWarrior = new Warrior("デモ戦士", 100, 100);
        Enemy slime = new Enemy("スライムもどき", 10, 100);
        int weponSkillAttack = (int)(demoWarrior.getAttack()*1.5);
        int nowEnemyHp;
        for(int i=0;i<3;i++){
            nowEnemyHp = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            assertEquals(nowEnemyHp - weponSkillAttack, slime.getHitPoint());
        }
    }
}
