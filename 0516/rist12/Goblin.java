package rist12;

public class Goblin extends WalkingMonster{
    
    public void attack(){
        System.out.println("�i�C�t�Ŏa�����");
        System.out.println(this.name + "�̍U��!!");
        System.out.println("5�|�C���g�̃_���[�W");
        hp -= 5;
    }

}
