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
package org.apache.camel.builder.endpoint.dsl;

import java.security.KeyStore;
import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Encrypt, decrypt, sign and verify data in CMS Enveloped Data format.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CryptoCmsEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Crypto CMS component.
     */
    public interface CryptoCmsEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedCryptoCmsEndpointBuilder advanced() {
            return (AdvancedCryptoCmsEndpointBuilder) this;
        }
        /**
         * Keystore which contains signer private keys, verifier public keys,
         * encryptor public keys, decryptor private keys depending on the
         * operation. Use either this parameter or the parameter
         * 'keyStoreParameters'.
         * 
         * The option is a: &lt;code&gt;java.security.KeyStore&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param keyStore the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder keyStore(KeyStore keyStore) {
            doSetProperty("keyStore", keyStore);
            return this;
        }
        /**
         * Keystore which contains signer private keys, verifier public keys,
         * encryptor public keys, decryptor private keys depending on the
         * operation. Use either this parameter or the parameter
         * 'keyStoreParameters'.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.security.KeyStore&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param keyStore the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder keyStore(String keyStore) {
            doSetProperty("keyStore", keyStore);
            return this;
        }
        /**
         * Keystore containing signer private keys, verifier public keys,
         * encryptor public keys, decryptor private keys depending on the
         * operation. Use either this parameter or the parameter 'keystore'.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.jsse.KeyStoreParameters&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param keyStoreParameters the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder keyStoreParameters(
                Object keyStoreParameters) {
            doSetProperty("keyStoreParameters", keyStoreParameters);
            return this;
        }
        /**
         * Keystore containing signer private keys, verifier public keys,
         * encryptor public keys, decryptor private keys depending on the
         * operation. Use either this parameter or the parameter 'keystore'.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.support.jsse.KeyStoreParameters&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param keyStoreParameters the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder keyStoreParameters(
                String keyStoreParameters) {
            doSetProperty("keyStoreParameters", keyStoreParameters);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Sets the password of the private keys. It is assumed that all private
         * keys in the keystore have the same password. If not set then it is
         * assumed that the password of the private keys is given by the
         * keystore password given in the KeyStoreParameters.
         * 
         * The option is a: &lt;code&gt;char[]&lt;/code&gt; type.
         * 
         * Group: decrypt
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder password(Character[] password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Sets the password of the private keys. It is assumed that all private
         * keys in the keystore have the same password. If not set then it is
         * assumed that the password of the private keys is given by the
         * keystore password given in the KeyStoreParameters.
         * 
         * The option will be converted to a &lt;code&gt;char[]&lt;/code&gt;
         * type.
         * 
         * Group: decrypt
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * If &lt;tt&gt;true then the CMS message is base 64 encoded and must be
         * decoded during the processing. Default value is &lt;code&gt;false.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: decrypt_verify
         * 
         * @param fromBase64 the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder fromBase64(boolean fromBase64) {
            doSetProperty("fromBase64", fromBase64);
            return this;
        }
        /**
         * If &lt;tt&gt;true then the CMS message is base 64 encoded and must be
         * decoded during the processing. Default value is &lt;code&gt;false.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: decrypt_verify
         * 
         * @param fromBase64 the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder fromBase64(String fromBase64) {
            doSetProperty("fromBase64", fromBase64);
            return this;
        }
        /**
         * Encryption algorithm, for example DESede/CBC/PKCS5Padding. Further
         * possible values: DESede/CBC/PKCS5Padding, AES/CBC/PKCS5Padding,
         * Camellia/CBC/PKCS5Padding, CAST5/CBC/PKCS5Padding.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: encrypt
         * 
         * @param contentEncryptionAlgorithm the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder contentEncryptionAlgorithm(
                String contentEncryptionAlgorithm) {
            doSetProperty("contentEncryptionAlgorithm", contentEncryptionAlgorithm);
            return this;
        }
        /**
         * Provider for the originator info. See
         * https://tools.ietf.org/html/rfc5652#section-6.1. The default value is
         * &lt;code&gt;null.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.crypto.cms.common.OriginatorInformationProvider&lt;/code&gt; type.
         * 
         * Group: encrypt
         * 
         * @param originatorInformationProvider the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder originatorInformationProvider(
                Object originatorInformationProvider) {
            doSetProperty("originatorInformationProvider", originatorInformationProvider);
            return this;
        }
        /**
         * Provider for the originator info. See
         * https://tools.ietf.org/html/rfc5652#section-6.1. The default value is
         * &lt;code&gt;null.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.crypto.cms.common.OriginatorInformationProvider&lt;/code&gt; type.
         * 
         * Group: encrypt
         * 
         * @param originatorInformationProvider the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder originatorInformationProvider(
                String originatorInformationProvider) {
            doSetProperty("originatorInformationProvider", originatorInformationProvider);
            return this;
        }
        /**
         * Recipient Info: reference to a bean which implements the interface
         * org.apache.camel.component.crypto.cms.api.TransRecipientInfo.
         * 
         * The option is a:
         * &lt;code&gt;java.util.List&lt;org.apache.camel.component.crypto.cms.crypt.RecipientInfo&gt;&lt;/code&gt; type.
         * 
         * Group: encrypt
         * 
         * @param recipient the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder recipient(List<Object> recipient) {
            doSetProperty("recipient", recipient);
            return this;
        }
        /**
         * Recipient Info: reference to a bean which implements the interface
         * org.apache.camel.component.crypto.cms.api.TransRecipientInfo.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.List&lt;org.apache.camel.component.crypto.cms.crypt.RecipientInfo&gt;&lt;/code&gt; type.
         * 
         * Group: encrypt
         * 
         * @param recipient the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder recipient(String recipient) {
            doSetProperty("recipient", recipient);
            return this;
        }
        /**
         * Key length for the secret symmetric key used for the content
         * encryption. Only used if the specified content-encryption algorithm
         * allows keys of different sizes. If
         * contentEncryptionAlgorithm=AES/CBC/PKCS5Padding or
         * Camellia/CBC/PKCS5Padding then 128; if
         * contentEncryptionAlgorithm=DESede/CBC/PKCS5Padding then 192, 128; if
         * strong encryption is enabled then for AES/CBC/PKCS5Padding and
         * Camellia/CBC/PKCS5Padding also the key lengths 192 and 256 are
         * possible.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: encrypt
         * 
         * @param secretKeyLength the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder secretKeyLength(int secretKeyLength) {
            doSetProperty("secretKeyLength", secretKeyLength);
            return this;
        }
        /**
         * Key length for the secret symmetric key used for the content
         * encryption. Only used if the specified content-encryption algorithm
         * allows keys of different sizes. If
         * contentEncryptionAlgorithm=AES/CBC/PKCS5Padding or
         * Camellia/CBC/PKCS5Padding then 128; if
         * contentEncryptionAlgorithm=DESede/CBC/PKCS5Padding then 192, 128; if
         * strong encryption is enabled then for AES/CBC/PKCS5Padding and
         * Camellia/CBC/PKCS5Padding also the key lengths 192 and 256 are
         * possible.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: encrypt
         * 
         * @param secretKeyLength the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder secretKeyLength(String secretKeyLength) {
            doSetProperty("secretKeyLength", secretKeyLength);
            return this;
        }
        /**
         * Provider of the generator for the unprotected attributes. The default
         * value is &lt;code&gt;null which means no unprotected attribute is
         * added to the Enveloped Data object. See
         * https://tools.ietf.org/html/rfc5652#section-6.1.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.crypto.cms.common.AttributesGeneratorProvider&lt;/code&gt; type.
         * 
         * Group: encrypt
         * 
         * @param unprotectedAttributesGeneratorProvider the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder unprotectedAttributesGeneratorProvider(
                Object unprotectedAttributesGeneratorProvider) {
            doSetProperty("unprotectedAttributesGeneratorProvider", unprotectedAttributesGeneratorProvider);
            return this;
        }
        /**
         * Provider of the generator for the unprotected attributes. The default
         * value is &lt;code&gt;null which means no unprotected attribute is
         * added to the Enveloped Data object. See
         * https://tools.ietf.org/html/rfc5652#section-6.1.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.crypto.cms.common.AttributesGeneratorProvider&lt;/code&gt; type.
         * 
         * Group: encrypt
         * 
         * @param unprotectedAttributesGeneratorProvider the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder unprotectedAttributesGeneratorProvider(
                String unprotectedAttributesGeneratorProvider) {
            doSetProperty("unprotectedAttributesGeneratorProvider", unprotectedAttributesGeneratorProvider);
            return this;
        }
        /**
         * Indicates whether the Signed Data or Enveloped Data instance shall be
         * base 64 encoded. Default value is &lt;code&gt;false.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: encrypt_sign
         * 
         * @param toBase64 the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder toBase64(Boolean toBase64) {
            doSetProperty("toBase64", toBase64);
            return this;
        }
        /**
         * Indicates whether the Signed Data or Enveloped Data instance shall be
         * base 64 encoded. Default value is &lt;code&gt;false.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: encrypt_sign
         * 
         * @param toBase64 the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder toBase64(String toBase64) {
            doSetProperty("toBase64", toBase64);
            return this;
        }
        /**
         * Indicates whether the signed content should be included into the
         * Signed Data instance. If false then a detached Signed Data instance
         * is created in the header CamelCryptoCmsSignedData.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: sign
         * 
         * @param includeContent the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder includeContent(Boolean includeContent) {
            doSetProperty("includeContent", includeContent);
            return this;
        }
        /**
         * Indicates whether the signed content should be included into the
         * Signed Data instance. If false then a detached Signed Data instance
         * is created in the header CamelCryptoCmsSignedData.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: sign
         * 
         * @param includeContent the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder includeContent(String includeContent) {
            doSetProperty("includeContent", includeContent);
            return this;
        }
        /**
         * Signer information: reference to bean(s) which implements
         * org.apache.camel.component.crypto.cms.api.SignerInfo. Multiple values
         * can be separated by comma.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: sign
         * 
         * @param signer the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder signer(String signer) {
            doSetProperty("signer", signer);
            return this;
        }
        /**
         * Indicates whether the value in the header CamelCryptoCmsSignedData is
         * base64 encoded. Default value is &lt;code&gt;false. &lt;p&gt; Only
         * relevant for detached signatures. In the detached signature case, the
         * header contains the Signed Data object.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: verify
         * 
         * @param signedDataHeaderBase64 the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder signedDataHeaderBase64(
                boolean signedDataHeaderBase64) {
            doSetProperty("signedDataHeaderBase64", signedDataHeaderBase64);
            return this;
        }
        /**
         * Indicates whether the value in the header CamelCryptoCmsSignedData is
         * base64 encoded. Default value is &lt;code&gt;false. &lt;p&gt; Only
         * relevant for detached signatures. In the detached signature case, the
         * header contains the Signed Data object.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: verify
         * 
         * @param signedDataHeaderBase64 the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder signedDataHeaderBase64(
                String signedDataHeaderBase64) {
            doSetProperty("signedDataHeaderBase64", signedDataHeaderBase64);
            return this;
        }
        /**
         * If &lt;code&gt;true then the signatures of all signers contained in
         * the Signed Data object are verified. If &lt;code&gt;false then only
         * one signature whose signer info matches with one of the specified
         * certificates is verified. Default value is &lt;code&gt;true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: verify
         * 
         * @param verifySignaturesOfAllSigners the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder verifySignaturesOfAllSigners(
                boolean verifySignaturesOfAllSigners) {
            doSetProperty("verifySignaturesOfAllSigners", verifySignaturesOfAllSigners);
            return this;
        }
        /**
         * If &lt;code&gt;true then the signatures of all signers contained in
         * the Signed Data object are verified. If &lt;code&gt;false then only
         * one signature whose signer info matches with one of the specified
         * certificates is verified. Default value is &lt;code&gt;true.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: verify
         * 
         * @param verifySignaturesOfAllSigners the value to set
         * @return the dsl builder
         */
        default CryptoCmsEndpointBuilder verifySignaturesOfAllSigners(
                String verifySignaturesOfAllSigners) {
            doSetProperty("verifySignaturesOfAllSigners", verifySignaturesOfAllSigners);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Crypto CMS component.
     */
    public interface AdvancedCryptoCmsEndpointBuilder
            extends
                EndpointProducerBuilder {
        default CryptoCmsEndpointBuilder basic() {
            return (CryptoCmsEndpointBuilder) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedCryptoCmsEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedCryptoCmsEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface CryptoCmsBuilders {
        /**
         * Crypto CMS (camel-crypto-cms)
         * Encrypt, decrypt, sign and verify data in CMS Enveloped Data format.
         * 
         * Category: security,transformation
         * Since: 2.20
         * Maven coordinates: org.apache.camel:camel-crypto-cms
         * 
         * Syntax: <code>crypto-cms:cryptoOperation:name</code>
         * 
         * Path parameter: cryptoOperation (required)
         * Set the Crypto operation from that supplied after the crypto scheme
         * in the endpoint uri e.g. crypto-cms:sign sets sign as the operation.
         * Possible values: sign, verify, encrypt, or decrypt.
         * There are 4 enums and the value can be one of: sign, verify, encrypt,
         * decrypt
         * 
         * Path parameter: name (required)
         * The name part in the URI can be chosen by the user to distinguish
         * between different signer/verifier/encryptor/decryptor endpoints
         * within the camel context.
         * 
         * @param path cryptoOperation:name
         * @return the dsl builder
         */
        @Deprecated
        default CryptoCmsEndpointBuilder cryptoCms(String path) {
            return CryptoCmsEndpointBuilderFactory.endpointBuilder("crypto-cms", path);
        }
        /**
         * Crypto CMS (camel-crypto-cms)
         * Encrypt, decrypt, sign and verify data in CMS Enveloped Data format.
         * 
         * Category: security,transformation
         * Since: 2.20
         * Maven coordinates: org.apache.camel:camel-crypto-cms
         * 
         * Syntax: <code>crypto-cms:cryptoOperation:name</code>
         * 
         * Path parameter: cryptoOperation (required)
         * Set the Crypto operation from that supplied after the crypto scheme
         * in the endpoint uri e.g. crypto-cms:sign sets sign as the operation.
         * Possible values: sign, verify, encrypt, or decrypt.
         * There are 4 enums and the value can be one of: sign, verify, encrypt,
         * decrypt
         * 
         * Path parameter: name (required)
         * The name part in the URI can be chosen by the user to distinguish
         * between different signer/verifier/encryptor/decryptor endpoints
         * within the camel context.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path cryptoOperation:name
         * @return the dsl builder
         */
        @Deprecated
        default CryptoCmsEndpointBuilder cryptoCms(
                String componentName,
                String path) {
            return CryptoCmsEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    @Deprecated
    static CryptoCmsEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class CryptoCmsEndpointBuilderImpl extends AbstractEndpointBuilder implements CryptoCmsEndpointBuilder, AdvancedCryptoCmsEndpointBuilder {
            public CryptoCmsEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new CryptoCmsEndpointBuilderImpl(path);
    }
}