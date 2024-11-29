    class FondosInsuficientesException extends Exception {
        public FondosInsuficientesException(String mensaje) {
            super(mensaje);
        }
    }
    
    class CuentaBancaria {
        private double saldo;
    
        public CuentaBancaria(double saldoInicial) {
            this.saldo = saldoInicial;
        }
    
        public void retirar(double monto) throws FondosInsuficientesException {
            if (monto > saldo) {
                throw new FondosInsuficientesException("Fondos insuficientes. Saldo disponible: " + saldo);
            }
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo restante: " + saldo);
        }
    
        public double getSaldo() {
            return saldo;
        }
    }
    
    public class listas {
        public static void main(String[] args) {
            CuentaBancaria cuenta = new CuentaBancaria(1000);
    
            try {
                cuenta.retirar(1500); // Intento de retirar más del saldo
            } catch (FondosInsuficientesException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
