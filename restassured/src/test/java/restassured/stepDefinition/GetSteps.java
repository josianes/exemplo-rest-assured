package restassured.stepDefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class GetSteps {

    private String cep;
    private GetHelper getHelper;
    private String logradouro;
    private String bairro;
    private String uf;
    private String localidade;

    public GetSteps(GetHelper getHelper) {
        this.getHelper = getHelper;
    }

    @Dado("^que desejo consultar endereço através do CEP \"([^\"]*)\"$")
    public void que_desejo_consultar_endereço_através_do_CEP(String cep) {
        this.cep = cep;
        System.out.println("O CEP: " + cep);
    }

    @Quando("^realizo a chamada GET nos correios com o CEP informado$")
    public void realizo_a_chamada_GET_nos_correios_com_o_CEP_informado(){
        String url = "https://viacep.com.br/ws/" +cep+ "/json/";
        this.getHelper.callGetCorreios(url);
    }

    @Então("^recebo o endereço completo$")
    public void recebo_o_endereço_completo() {
        this.getHelper.validateResponseCorreios();
    }

    @Dado("^que ao consultar o logradouro \"([^\"]*)\"$")
    public void queAoConsultarOLogradouro(String logradouro) {
        this.logradouro = logradouro;
        System.out.println(logradouro);
    }

    @Quando("^realizo uma pesquisa informando um campo$")
    public void realizoUmaPesquisaInformandoUmCampo() {
        String url = "https://viacep.com.br/ws/" +logradouro+ "/json/";
        this.getHelper.callGetLogradouro(url);
    }

    @Então("^recebo o valor do campo que está preenchido$")
    public void receboOValorDoCampoQueEstáPreenchido() {
        this.getHelper.campoIsNotEmpty();
    }

    @Dado("^que ao consultar o bairro \"([^\"]*)\"$")
    public void queAoConsultarOBairro(String bairro) {
        this.bairro = bairro;
    }

    @Quando("^realizo uma pesquisa informando o bairro$")
    public void realizoUmaPesquisaInformandoOBairro() {
        String url = "https://viacep.com.br/ws/" +bairro+ "/json/";
        this.getHelper.callGetBairro(url);
    }

    @Então("^recebo o valor do bairro$")
    public void receboOValorDoBairro() {
        this.getHelper.campoIsNotEmpty();
    }

    @Dado("^que ao consultar a cidade \"([^\"]*)\"$")
    public void queAoConsultarACidade(String cidade){
        this.localidade = cidade;
    }

    @Quando("^realizo uma pesquisa informando a cidade$")
    public void realizoUmaPesquisaInformandoACidade() {
        String url = "https://viacep.com.br/ws/" + localidade + "/json/";
        this.getHelper.callGetCidade(url);
    }

    @Então("^recebo o valor da cidade$")
    public void receboOValorDaCidade() {
        this.getHelper.campoIsNotEmpty();
    }

    @Dado("^que ao consultar o uf \"([^\"]*)\"$")
    public void queAoConsultarOUf(String uf){
        this.uf = uf;
    }

    @Quando("^realizo uma pesquisa informando o uf$")
    public void realizoUmaPesquisaInformandoOUf() {
        String url = "https://viacep.com.br/ws/" +uf+ "/json/";
        this.getHelper.callGetUf(url);
    }

    @Então("^recebo o valor da uf$")
    public void receboOValorDaUf() {
        this.getHelper.campoIsNotEmpty();
    }

    @Então("^imprima todos os campos passados$")
    public void imprimaTodosOsCamposPassados() {
        System.out.println(logradouro);
    }
}
