package refugeescode.at.The.English.Gentleman.EnglishGenteman;

import jdk.nashorn.api.tree.CatchTree;

public class EnglishmanController {

    private Cigarette cigarette = new Cigarette();
    private Lighter lighter  =new Lighter();
    private Monocle monocle = new Monocle();
    private NewsPaper newsPaper = new NewsPaper();
    private Boolean isSmokeAcigarette ;
    private Boolean isReadAnewsPaper ;
    public void englishmanController(){


        try {
            if (lighter.light(cigarette)){
                smoke();
                isSmokeAcigarette = true;
            }
        }
        catch(Exception e){
            System.out.println("Englichman is not happy!");
        }
        try {
            if (monocle.seeBetter(newsPaper)){
                read();
                isReadAnewsPaper = true;
            }
        }
        catch(Exception e){
            System.out.println("Englichman is not happy!");
        }



    }

    private void read() {
        System.out.println("I am reading");
    }

    private void smoke() {
        System.out.println("I am smoking");
    }
}
