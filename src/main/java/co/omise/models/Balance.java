package co.omise.models;

import co.omise.Endpoint;
import co.omise.requests.RequestBuilder;
import co.omise.requests.ResponseType;
import okhttp3.HttpUrl;

/**
 * Represents Omise Balance object and contains its {@link RequestBuilder}
 *
 * @see <a href="https://www.omise.co/balance-api">Balance API</a>
 */
public class Balance extends Model {
    private long transferable;
    private long total;
    private String currency;

    public Balance() {
    }

    public long getTransferable() {
        return transferable;
    }

    public void setTransferable(long transferable) {
        this.transferable = transferable;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * The {@link RequestBuilder} class for getting the user's Balance.
     */
    public static class GetRequestBuilder extends RequestBuilder<Balance> {

        @Override
        protected HttpUrl path() {
            return buildUrl(Endpoint.API, "balance");
        }

        @Override
        protected ResponseType<Balance> type() {
            return new ResponseType<>(Balance.class);
        }
    }
}
