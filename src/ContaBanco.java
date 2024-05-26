public class ContaBanco {
        // Atributos
        public int numConta;
        protected String tipo;
        private String dono;
        private float saldo;
        private boolean status;

        public void estadoAtual(){
            System.out.println("------------------");
            System.out.println("Conta: "+this.getNumConta());
            System.out.println("Tipo: "+this.getTipo());
            System.out.println("Dono: "+this.getDono());
            System.out.println("Saldo: "+this.getSaldo());
            System.out.println("Status: "+this.getStatus());
        }

    // Metodos Principais
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (t == "CC"){
            this.setSaldo(50); // igual a: this.getSaldo() = 50;
        }
        else if (t == "CP"){
            this.setSaldo(150); // igual a: this.getSaldo() = 150;
        }
    }
    public void fecharCOnta(){
        if (this.getSaldo() > 0){
            System.out.println("EEO! Conta com dinheiro!");
        }
        else if (this.getSaldo() < 0){
            System.out.println("ERRO! Conta em débito!");
        }
        else {
            this.setStatus(false);
            System.out.println("SUCESSO! Conta Fechada!");
        }
    }
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito Realizado!");
        }
        else {
            System.out.println("Impossivel Depositar!");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque Realizado!");
            }
            else {
                System.out.println("Saldo insuficiente!");
            }
        }
        else {
            System.out.println("Impossivel sacar!");
        }
    }
    public void pagarMensalidade(){
        int v = 0;

        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()){
            if (this.getSaldo() > 12){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade Paga!");
            }
            else {
                System.out.println("Saldo insuficiente!");
            }
        }
        else {
            System.out.println("Impossivel pagar!");
        }
    }
    // Metodo Contrutor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    // Metodos Acessores e Modificadores
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
}
