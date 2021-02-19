package restassured.stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class GetSteps {
    private  String cep;
    private GetHelper getHelper;

    public GetSteps(GetHelper getHelper) {
        this.getHelper = getHelper;
    }

    @Dado("^que desejo consultar endereço através do CEP \"([^\"]*)\"$")
    public void que_desejo_consultar_endereço_através_do_CEP(String cep){
        this.cep = cep;
        System.out.println("O CEP => "+cep);
    }

    @Quando("^realizo a chamada GET nos correios com o CEP informado$")
    public void realizo_a_chamada_GET_nos_correios_com_o_CEP_informado(){
        String url = "https://viacep.com.br/ws/"+this.cep+"/json/";
        this.getHelper.callGetCorreios(url);
    }

    @Então("^recebo o endereço completo$")
    public void receboOEndereçoCompleto() {
        this.getHelper.validateResponseCorreios();
    }


}
