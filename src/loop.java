import java.util.Scanner;

public class loop {
    public Integer start;
    public Integer end;
    public boolean user_selected;
    public Scanner sc= new Scanner(System.in);

    public Integer loop(Integer s, Integer e){
        while (user_selected==False){
            new Play();

            System.out.print("Do you want to pick that number?");
            String str= sc.nextLine()
                    if (str == "yes"){
                        user_selected=true;
            }
        }
    }

    public void Play(){
        new BetMore_Game();
    }
}
