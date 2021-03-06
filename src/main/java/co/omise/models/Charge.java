package co.omise.models;

import co.omise.Endpoint;
import co.omise.requests.RequestBuilder;
import co.omise.requests.ResponseType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import okhttp3.HttpUrl;
import okhttp3.RequestBody;
import org.joda.time.DateTime;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents Omise Charge object and contains all of its {@link RequestBuilder}.
 *
 * @see <a href="https://www.omise.co/charges-api">Charges API</a>
 */
public class Charge extends Model {
    private ChargeStatus status;
    private long amount;
    private String currency;
    private String description;
    private Map<String, Object> metadata;
    private boolean capture;
    private boolean authorized;
    private boolean reversed;
    private boolean paid;
    private String transaction;
    @JsonProperty("source_of_fund")
    private SourceOfFunds sourceOfFund;
    private Card card;
    @JsonProperty("refunded_amount")
    private long refundedAmount;
    private ScopedList<Refund> refunds;
    @JsonProperty("failure_code")
    private String failureCode;
    @JsonProperty("failure_message")
    private String failureMessage;
    private String customer;
    private String ip;
    private Dispute dispute;
    @JsonProperty("return_uri")
    private String returnUri;
    @JsonProperty("authorize_uri")
    private String authorizeUri;
    private OffsiteTypes offsite;
    @JsonProperty("installment_terms")
    private int installmentTerms;
    private Source source;
    @JsonProperty("expires_at")
    private DateTime expiresAt;
    private boolean disputable;
    private boolean capturable;
    private boolean reversible;
    private boolean refundable;
    private long fee;
    @JsonProperty("fee_vat")
    private long feeVat;
    private long interest;
    @JsonProperty("interest_vat")
    private long interestVat;
    private long net;

    public Charge() {
    }

    public ChargeStatus getStatus() {
        return status;
    }

    public void setStatus(ChargeStatus status) {
        this.status = status;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public boolean isCapture() {
        return capture;
    }

    public void setCapture(boolean capture) {
        this.capture = capture;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    public boolean isReversed() {
        return reversed;
    }

    public void setReversed(boolean reversed) {
        this.reversed = reversed;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public SourceOfFunds getSourceOfFund() {
        if (sourceOfFund != null) {
            return sourceOfFund;
        } else {
            return card != null ? SourceOfFunds.Card : SourceOfFunds.Offsite;
        }
    }

    public void setSourceOfFund(SourceOfFunds sourceOfFund) {
        this.sourceOfFund = sourceOfFund;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public long getRefundedAmount() {
        return refundedAmount;
    }

    public void setRefundedAmount(long refundedAmount) {
        this.refundedAmount = refundedAmount;
    }

    public ScopedList<Refund> getRefunds() {
        return refunds;
    }

    public void setRefunds(ScopedList<Refund> refunds) {
        this.refunds = refunds;
    }

    public String getFailureCode() {
        return failureCode;
    }

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Dispute getDispute() {
        return dispute;
    }

    public void setDispute(Dispute dispute) {
        this.dispute = dispute;
    }

    public String getReturnUri() {
        return returnUri;
    }

    public void setReturnUri(String returnUri) {
        this.returnUri = returnUri;
    }

    public String getAuthorizeUri() {
        return authorizeUri;
    }

    public void setAuthorizeUri(String authorizeUri) {
        this.authorizeUri = authorizeUri;
    }

    public OffsiteTypes getOffsite() {
        return offsite;
    }

    public void setOffsite(OffsiteTypes offsite) {
        this.offsite = offsite;
    }

    public int getInstallmentTerms() {
        return installmentTerms;
    }

    public void setInstallmentTerms(int installmentTerms) {
        this.installmentTerms = installmentTerms;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public DateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(DateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public boolean isDisputable() {
        return disputable;
    }

    public void setDisputable(boolean disputable) {
        this.disputable = disputable;
    }

    public boolean isCapturable() {
        return capturable;
    }

    public void setCapturable(boolean capturable) {
        this.capturable = capturable;
    }

    public boolean isReversible() {
        return reversible;
    }

    public void setReversible(boolean reversible) {
        this.reversible = reversible;
    }

    public boolean isRefundable() {
        return refundable;
    }

    public void setRefundable(boolean refundable) {
        this.refundable = refundable;
    }

    public long getFee() {
        return fee;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }

    public long getFeeVat() {
        return feeVat;
    }

    public void setFeeVat(long feeVat) {
        this.feeVat = feeVat;
    }

    public long getInterest() {
        return interest;
    }

    public void setInterest(long interest) {
        this.interest = interest;
    }

    public long getInterestVat() {
        return interestVat;
    }

    public void setInterestVat(long interestVat) {
        this.interestVat = interestVat;
    }

    public long getNet() {
        return net;
    }

    public void setNet(long net) {
        this.net = net;
    }

    /**
     * The {@link RequestBuilder} class for creating a Charge.
     */
    public static class CreateRequestBuilder extends RequestBuilder<Charge> {
        @JsonProperty
        private String customer;
        @JsonProperty
        private String card;
        @JsonProperty
        private long amount;
        @JsonProperty
        private String currency;
        @JsonProperty
        private String description;
        @JsonProperty
        private Map<String, Object> metadata;
        @JsonProperty
        private Boolean capture;
        @JsonProperty
        private OffsiteTypes offsite;
        @JsonProperty("installment_terms")
        private Integer installmentTerms;
        @JsonProperty("return_uri")
        private String returnUri;
        @JsonProperty
        private String source;
        @JsonProperty("expires_at")
        private DateTime expiresAt;

        @Override
        protected String method() {
            return POST;
        }

        @Override
        protected HttpUrl path() {
            return buildUrl(Endpoint.API, "charges");
        }

        @Override
        protected RequestBody payload() throws IOException {
            return serialize();
        }

        @Override
        protected ResponseType<Charge> type() {
            return new ResponseType<>(Charge.class);
        }

        public CreateRequestBuilder customer(String customer) {
            this.customer = customer;
            return this;
        }

        public CreateRequestBuilder card(String card) {
            this.card = card;
            return this;
        }

        public CreateRequestBuilder amount(long amount) {
            this.amount = amount;
            return this;
        }

        public CreateRequestBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public CreateRequestBuilder description(String description) {
            this.description = description;
            return this;
        }

        public CreateRequestBuilder metadata(String key, Object value) {
            HashMap<String, Object> tempMap = new HashMap<>();
            if (metadata != null) {
                tempMap.putAll(metadata);
            }
            tempMap.put(key, value);

            this.metadata = new HashMap<>(tempMap);
            return this;
        }

        public CreateRequestBuilder metadata(Map<String, Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public CreateRequestBuilder capture(boolean capture) {
            this.capture = capture;
            return this;
        }

        public CreateRequestBuilder offsite(OffsiteTypes offsite) {
            this.offsite = offsite;
            return this;
        }

        public CreateRequestBuilder installmentTerms(int installmentTerms) {
            this.installmentTerms = installmentTerms;
            return this;
        }

        public CreateRequestBuilder returnUri(String returnUri) {
            this.returnUri = returnUri;
            return this;
        }

        public CreateRequestBuilder source(String source) {
            this.source = source;
            return this;
        }

        public CreateRequestBuilder expiresAt(DateTime expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
    }

    /**
     * The {@link RequestBuilder} class for retrieving a particular Charge.
     */
    public static class GetRequestBuilder extends RequestBuilder<Charge> {
        private String chargeId;

        public GetRequestBuilder(String chargeId) {
            this.chargeId = chargeId;
        }

        @Override
        protected HttpUrl path() {
            return buildUrl(Endpoint.API, "charges", chargeId);
        }

        @Override
        protected ResponseType<Charge> type() {
            return new ResponseType<>(Charge.class);
        }
    }

    /**
     * The {@link RequestBuilder} class for updating a particular Charge.
     */
    public static class UpdateRequestBuilder extends RequestBuilder<Charge> {
        private String chargeId;

        @JsonProperty
        private String description;
        @JsonProperty
        private Map<String, Object> metadata;

        public UpdateRequestBuilder(String chargeId) {
            this.chargeId = chargeId;
        }

        @Override
        protected HttpUrl path() {
            return buildUrl(Endpoint.API, "charges", chargeId);
        }

        @Override
        protected String method() {
            return PATCH;
        }

        @Override
        protected RequestBody payload() throws IOException {
            return serialize();
        }

        @Override
        protected ResponseType<Charge> type() {
            return new ResponseType<>(Charge.class);
        }

        public UpdateRequestBuilder description(String description) {
            this.description = description;
            return this;
        }

        public UpdateRequestBuilder metadata(String key, Object value) {
            HashMap<String, Object> tempMap = new HashMap<>();
            if (metadata != null) {
                tempMap.putAll(metadata);
            }
            tempMap.put(key, value);

            this.metadata = tempMap;
            return this;
        }

        public UpdateRequestBuilder metadata(Map<String, Object> metadata) {
            this.metadata = new HashMap<>(metadata);
            return this;
        }
    }

    /**
     * The {@link RequestBuilder} class for capturing a particular Charge. Keep in mind, capturing only works for credit card transfers that are not auto-captured.
     */
    public static class CaptureRequestBuilder extends RequestBuilder<Charge> {
        private String chargeId;

        public CaptureRequestBuilder(String chargeId) {
            this.chargeId = chargeId;
        }

        @Override
        protected HttpUrl path() {
            return buildUrl(Endpoint.API, "charges", chargeId, "capture");
        }

        @Override
        protected ResponseType<Charge> type() {
            return new ResponseType<>(Charge.class);
        }

        @Override
        protected String method() {
            return POST;
        }
    }


    /**
     * The {@link RequestBuilder} class for reversing a particular Charge.
     */
    public static class ReverseRequestBuilder extends RequestBuilder<Charge> {
        private String chargeId;

        public ReverseRequestBuilder(String chargeId) {
            this.chargeId = chargeId;
        }

        @Override
        protected HttpUrl path() {
            return buildUrl(Endpoint.API, "charges", chargeId, "reverse");
        }

        @Override
        protected ResponseType<Charge> type() {
            return new ResponseType<>(Charge.class);
        }

        @Override
        protected String method() {
            return POST;
        }
    }

    /**
     * The {@link RequestBuilder} class for retrieving all Charges that belong to an account.
     */
    public static class ListRequestBuilder extends RequestBuilder<ScopedList<Charge>> {
        private ScopedList.Options options;

        @Override
        protected HttpUrl path() {
            if (options == null) {
                options = new ScopedList.Options();
            }

            return buildUrl(Endpoint.API, "charges", options);
        }

        @Override
        protected ResponseType<ScopedList<Charge>> type() {
            return new ResponseType<>(new TypeReference<ScopedList<Charge>>() {
            });
        }

        public ListRequestBuilder options(ScopedList.Options options) {
            this.options = options;
            return this;
        }
    }
}