package claabstracts;


public abstract class Figure {

    protected double x;  /*Position in x*/
    protected double y;  /*Position in y*/

    /*Constructor just can be used for their children*/

    protected Figure(){

    };

    protected Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calculateArea();  /*if is an abstract mode, you  just need declare the method, you don't have to develop*/


}


echo "# todoCode" >> README.md
        git init
        git add README.md
        git commit -m "first commit"
        git branch -M main
        git remote add origin git@github.com:sofiamansilla/todoCode.git
        git push -u origin main