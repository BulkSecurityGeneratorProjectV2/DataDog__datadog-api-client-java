// Update Fastly account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FastlyIntegrationApi;
import com.datadog.api.client.v2.model.FastlyAccountResponse;
import com.datadog.api.client.v2.model.FastlyAccountUpdateRequest;
import com.datadog.api.client.v2.model.FastlyAccountUpdateRequestData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    FastlyIntegrationApi apiInstance = new FastlyIntegrationApi(defaultClient);

    // there is a valid "fastly_account" in the system
    String FASTLY_ACCOUNT_DATA_ID = System.getenv("FASTLY_ACCOUNT_DATA_ID");

    FastlyAccountUpdateRequest body =
        new FastlyAccountUpdateRequest().data(new FastlyAccountUpdateRequestData());

    try {
      FastlyAccountResponse result = apiInstance.updateFastlyAccount(FASTLY_ACCOUNT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FastlyIntegrationApi#updateFastlyAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
