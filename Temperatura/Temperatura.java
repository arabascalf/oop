class Temperatura {
    private float temperatura;

    public void setTemperatura(float temperatura) { 
        this.temperatura = temperatura;
    }

    public float getTemperatura() { 
        return this.temperatura;
    }

    public float aFahrenheit() { 
        return (9/5 * this.temperatura) + 32; 
    }

    public float aKelvin() { 
        return this.temperatura + (float)273.15; 
    }
} 