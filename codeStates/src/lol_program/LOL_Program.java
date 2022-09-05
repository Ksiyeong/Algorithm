package lol_program;

public class LOL_Program {
    public static void main(String[] args) {
        LoL_char lol_char = new LoL_char();


        System.out.println("[안내] TRPG 스타크래프트 시작합니다.\n");

        System.out.println("[안내] 자신의 유닛 정보를 입력해 주세요.\n");
        String[] userChar = lol_char.user_create();
        int[] userCharAbility = lol_char.user_info_int(userChar);
        lol_char.user_print(userChar);

        System.out.println("[안내] 상대 유닛 정보를 입력해 주세요.\n");
        String[] enemyChar = lol_char.user_create();
        int[] enemyCharAbility = lol_char.user_info_int(enemyChar);
        lol_char.user_print(enemyChar);

        lol_char.attack(userChar[0], userCharAbility, enemyCharAbility);
    }
}
