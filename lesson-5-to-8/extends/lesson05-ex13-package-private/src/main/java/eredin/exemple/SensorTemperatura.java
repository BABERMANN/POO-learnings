package eredin.exemple;

import org.example.Sensor;

public class SensorTemperatura extends Sensor {

    public SensorTemperatura(int leituraAtual) {
        super(leituraAtual);
    }

    public int SomaUm(){
        return leituraAtual + 1; // exemplo
    }

}
