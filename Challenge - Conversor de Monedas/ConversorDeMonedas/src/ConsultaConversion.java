import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {

    public TasaDeCambio buscaConversion(String unidadEntrada, String unidadSalida){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/79f5a7bd36c2dc4144bb81ca/pair/"
                +unidadEntrada+"/"+unidadSalida);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), TasaDeCambio.class);

        } catch (Exception e) {
            throw new RuntimeException("No encontré esa tasa de cambio.");
        }
    }
}
