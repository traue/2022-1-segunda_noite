package br.uninove.uniclima.http;

import br.uninove.clima.Clima;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Http {
    
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while((cp = rd.read()) != -1) {
            sb.append((char)cp);
        }
        return sb.toString();
    }
    
    public static Clima getClima(String cidade) {
        try {
            
            String url = "http://api.openweathermap.org/data/2.5/weather?";
            String appid = ""; //COLE A SUA CHAVE DE API
            String units = "metric";
            String lang = "pt_br";
            
            String charset = StandardCharsets.UTF_8.name();
            
            String query = String.format("q=%s&appid=%s&units=%s&lang=%s",
                    URLEncoder.encode(cidade, charset),
                    URLEncoder.encode(appid, charset),
                    URLEncoder.encode(units, charset),
                    URLEncoder.encode(lang, charset));
            
            URLConnection conn = new URL(url + query).openConnection();
            
            conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            
            Clima clima;
            try (InputStream response = conn.getInputStream()) {
                BufferedReader buffer = new BufferedReader(
                        new InputStreamReader(response, charset));
                String json = readAll(buffer);
                Gson gson = new Gson();
                clima = gson.fromJson(json, Clima.class);
            }
            
            return clima;
            
        } catch (Exception ex) {
            return null;
        }
    }
}
