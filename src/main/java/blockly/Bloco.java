package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

public static final int TIMEOUT = 300;

/**
 *
 * Bloco
 *
 * @author Rafael Juan Cardoso Martins
 * @since 20/10/2022 14:54:04
 *
 */
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.util.Operations.getURLFromOthers(
Var.valueOf("GET"),
Var.valueOf("application/x-www-form-urlencoded"),
Var.valueOf("https://viacep.com.br/ws/01001000/json/"), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL,
Var.valueOf(""),
Var.valueOf("ALL"));
   }
 }.call();
}

}

