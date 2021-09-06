/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.pulsar.integration;

import java.util.concurrent.TimeUnit;

import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;
import org.apache.pulsar.client.impl.ClientBuilderImpl;
import org.junit.jupiter.api.Test;

public class PulsarProducerURIClientIT extends PulsarITSupport {

    private static final String TOPIC_URI = "persistent://public/default/camel-producer-topic";
    private static final String PRODUCER = "camel-producer";
    private static final String URI_ENDPOINT = "pulsar:" + TOPIC_URI + "?numberOfConsumers=1&subscriptionType=Exclusive"
                                               + "&subscriptionName=camel-subscription&consumerQueueSize=1"
                                               + "&consumerName=camel-consumer" + "&producerName=" + PRODUCER + "&serviceUrl="
                                               + service.getPulsarBrokerUrl();

    @Produce("direct:start")
    private ProducerTemplate producerTemplate;

    @EndpointInject("mock:result")
    private MockEndpoint to;

    public PulsarProducerURIClientIT() {
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {

            @Override
            public void configure() {
                from("direct:start").to(URI_ENDPOINT);
                from(URI_ENDPOINT).to(to);
            }
        };
    }

    private PulsarClient givenPulsarClient() throws PulsarClientException {
        return new ClientBuilderImpl().serviceUrl(getPulsarBrokerUrl()).ioThreads(1).listenerThreads(1).build();
    }

    @Test
    public void testAMessageToRouteIsSentAndThenConsumed() throws Exception {
        to.expectedMessageCount(3);

        producerTemplate.sendBody("Hello ");
        producerTemplate.sendBody("World ");
        producerTemplate.sendBody(10);

        MockEndpoint.assertIsSatisfied(10, TimeUnit.SECONDS, to);
    }
}