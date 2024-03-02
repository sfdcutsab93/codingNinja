public class TowerofHanoi {
    public static void towerHanoi(int n, char s, char h, char d){
        if(n == 1){
            System.out.println("move 1st disk from "+s+" to "+d);
            return;
        }
        towerHanoi(n-1,s,d,h);
        System.out.println("move" + n + "th disk from " + s + " to " + d);
        towerHanoi(n-1, h, s, d);
    }
    public static void main(String[] args) {
        towerHanoi(3, 's', 'h', 'd');
    }
}
