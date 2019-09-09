package fr.hervedarritchon.github.issues;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.extension.responsetemplating.ResponseTemplateTransformer;

public class Starter {

    public static void main(final String[] args) {

        final WireMockServer wireMockServer = new WireMockServer(wireMockConfig()
            .port(8089)
            .usingFilesUnderDirectory("src/test/resources/mocks")
            .extensions(new ResponseTemplateTransformer(false)));
        wireMockServer.start();
    }
}
