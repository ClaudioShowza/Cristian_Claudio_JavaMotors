package motorveiculoteste;

public abstract class Veiculo {
    private int qtdRodas;
    private float velocMax;
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private Motor motor;

    public Veiculo() {
        this.qtdRodas = 0;
        this.velocMax = 0.0f;
        this.placa = " ";
        this.marca = " ";
        this.modelo = " ";
        this.cor = " ";
        this.motor = new Motor();
    }

    public void configurarMotor(int qtdPist, int potencia) {
        this.motor.setQtdPist(qtdPist);
        this.motor.setPotencia(potencia);
    }
    

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public float getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    
    }
    
    public abstract float calcVel(float velocMax);
}

class VeiculoPasseio extends Veiculo {
    private int qtdPassageiros;

    public VeiculoPasseio() {
        super(); 
        this.qtdPassageiros = 0;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    @Override
    public float calcVel(float velocMax) {

        return velocMax * 1000 / 3600; 
    }
}