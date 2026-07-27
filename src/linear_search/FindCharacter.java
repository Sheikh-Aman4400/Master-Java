package linear_search;

public class FindCharacter {
    public static void main(String[] args) {
        String name = "hola Amigos";
        linearSearchString(name, 'g');
    }

    public static boolean linearSearchString(String str, char target){

        if (str == null || str.isEmpty()){
            System.out.println("[ String is null or empty !!! ]");
            return false;
        }

        for (int i = 0; i < str.length(); i++){
            if ( str.charAt(i)== target){
                return true;
            }
        }
        System.out.println("[ Target not found !!! ]");
        return false;
    }
}
