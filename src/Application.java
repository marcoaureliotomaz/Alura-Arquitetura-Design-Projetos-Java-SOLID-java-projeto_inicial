import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {

        Funcionario f = new Funcionario("Marco","00801618479", Cargo.ANALISTA, BigDecimal.valueOf(15000.00));
        System.out.println(f);
    }
}
