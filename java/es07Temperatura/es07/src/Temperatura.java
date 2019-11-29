public class Temperatura {
    private float gradiC;

    public Temperatura(float gradiC){
        this.gradiC = gradiC;
    }

    public String toString(){
        return gradiC + "°C";
    }
    public String toString(){
        return gradiF(gradiC) + "F";
    }

    public float getGradiC() {
        return gradiC;
    }

    public void setGradiC(float gradiC) {
        this.gradiC = gradiC;
    }

    public float gradiF(float gradiC){
        return float far = 32f + ( 9f * gradiC / 5f );
    }
}
