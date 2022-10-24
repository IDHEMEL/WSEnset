package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BankService {
    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montant") double montant) {
        return montant * 1.14;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random()*9800 , new Date());
    }
    @WebMethod
    public List<Compte> listComptes() {
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1, Math.random()*9800 , new Date()));
        comptes.add(new Compte(2, Math.random()*9800 , new Date()));
        comptes.add(new Compte(3, Math.random()*9800 , new Date()));

        return comptes;
    }
}
