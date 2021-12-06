package jp.ac.uryukyu.ie.e215726;

/**
 * 戦士クラス。
 * Created by CrabAnderson on 2021/12/06.
 */
public class Warrior extends Hero{
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    /**
     * 自分以外の生物へ攻撃するメソッド。
     * damageがattack * 1.5 で固定されている。
     * @param e 攻撃対象
     */
    public void attackWithWeponSkill(LivingThing opponent){
        if( !dead ){
            int damage = (int)(attack * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}
