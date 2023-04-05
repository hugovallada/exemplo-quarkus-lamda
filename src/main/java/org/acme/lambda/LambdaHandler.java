package org.acme.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import io.quarkus.logging.Log;

import javax.inject.Named;

@Named("handler")
public class LambdaHandler implements RequestHandler<Pessoa, String> {
    @Override
    public String handleRequest(Pessoa pessoa, Context context) {
        Log.info("Chamada lambda via Quarkus.\nContexto: " + context + "\nDados: " + pessoa);
        return pessoa.getNome();
    }
}
