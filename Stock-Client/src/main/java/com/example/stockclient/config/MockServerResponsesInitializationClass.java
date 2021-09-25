package com.example.stockclient.config;

import org.mockserver.client.MockServerClient;
import org.mockserver.client.initialize.PluginExpectationInitializer;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.MediaType;

import static com.example.stockclient.config.Constants.MockedJsonResponses;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

public class MockServerResponsesInitializationClass implements PluginExpectationInitializer {

    public void startWithInitializer() {
        System.setProperty("mockserver.initializationClass", MockServerResponsesInitializationClass.class.getName());
        int mockServerPort = new ClientAndServer().getPort();
        // send requests
    }

    @Override
    public void initializeExpectations(MockServerClient mockServerClient) {

        new MockServerClient("localhost", 1080)
                .when(
                        request()
                                .withMethod("GET")
                                .withPath("/allCompanies")
                )
                .respond(
                        response()
                                .withStatusCode(200)
                                .withHeader(
                                        "Location", "https://www.mock-server.com"
                                )
                                .withContentType(MediaType.APPLICATION_JSON)
                                .withBody(MockedJsonResponses.ALL_COMPANIES)
                );

        new MockServerClient("localhost", 1080)
                .when(
                        request()
                                .withMethod("GET")
                                .withPath("/AMZN")
                )
                .respond(
                        response()
                                .withStatusCode(200)
                                .withHeader(
                                        "Location", "https://www.mock-server.com"
                                )
                                .withBody(MockedJsonResponses.AMZN)
                );



        new MockServerClient("localhost", 1080)
                .when(
                        request()
                                .withMethod("GET")
                                .withPath("/MSFT")
                )
                .respond(
                        response()
                                .withStatusCode(200)
                                .withHeader(
                                        "Location", "https://www.mock-server.com"
                                )
                                .withBody(MockedJsonResponses.MSFT)
                );

        new MockServerClient("localhost", 1080)
                .when(
                        request()
                                .withMethod("GET")
                                .withPath("/GOOGL")
                )
                .respond(
                        response()
                                .withStatusCode(200)
                                .withHeader(
                                        "Location", "https://www.mock-server.com"
                                )
                                .withBody(MockedJsonResponses.GOOGL)
                );

        new MockServerClient("localhost", 1080)
                .when(
                        request()
                                .withMethod("GET")
                                .withPath("/COIN")
                )
                .respond(
                        response()
                                .withStatusCode(200)
                                .withHeader(
                                        "Location", "https://www.mock-server.com"
                                )
                                .withBody(MockedJsonResponses.COIN)
                );
        new MockServerClient("localhost", 1080)
                .when(
                        request()
                                .withMethod("GET")
                                .withPath("/NFLX")
                )
                .respond(
                        response()
                                .withStatusCode(200)
                                .withHeader(
                                        "Location", "https://www.mock-server.com"
                                )
                                .withBody(MockedJsonResponses.NFLX)
                );
    }
}

