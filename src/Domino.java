public class Domino {
    private int top;
    private int bottom;

    public Domino (){
        this.top = 0;
        this.bottom = 0;
    }

    public Domino (int one, int two){
        this.top = one;
        this.bottom = two;
    }

    public int getTop(){
        return top;
    }
    public int getBottom(){
        return bottom;
    }
    public void setTop(int top){
        this.top = top;
    }
    public void setBottom(int bottom){
        this.bottom = bottom;
    }

    public String toString(int top, int bottom){
        return top + "/" + bottom;
    }


    public void flip(){
        int top = this.top;
        int bottom = this.bottom;
        this.top = bottom;
        this.bottom = top;
        //order?
    }

    public void settle(){
        if(bottom<top){
            flip();
        }
    }

    public int compareTo(Domino other){
        int thisMin = Math.min(this.top, this.bottom);
        int otherMin = Math.min (other.top, other.bottom);
        if(thisMin < otherMin){
            return -1;
        }
        else if(thisMin > otherMin){
            return 1;
        }
        else if(thisMin == otherMin){
            int thisMax = Math.max(this.top, this.bottom);
            int otherMax = Math.max(other.top, other.bottom);

            if(thisMax<otherMax){
                return -1;
            }
            else if(thisMax > otherMax) {
                return 1;
            }
        }
        return 0;
    }

    public int compareToWeight (Domino other){
        int otherTotal = other.top + other.bottom;
        /*if(this.top < otherTotal && this.bottom < otherTotal){
            return -1;
        }
        else if(this.top > otherTotal && this.bottom > otherTotal ){
            return 1;
        }
        else {
            return 0;
        }*/
        int thisTotal = this.top + this.bottom;
        if(thisTotal<otherTotal){
            return -1;
        }
        else if(thisTotal > otherTotal){
            return 1;
        }
        return 0;
    }

    public boolean canConnect(Domino other){
        if(this.top == other.top || this.top == other.bottom || this.bottom == other.top || this.bottom == other.bottom){
            return true;
        }
        return false;
    }
}
