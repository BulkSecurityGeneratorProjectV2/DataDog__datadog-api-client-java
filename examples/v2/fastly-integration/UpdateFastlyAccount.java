// Update Fastly account returns "The schema representation of a Fastly account." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FastlyIntegrationApi;
import com.datadog.api.client.v2.model.FastlyAccountResponse;
import com.datadog.api.client.v2.model.FastlyAccountUpdateRequest;
import com.datadog.api.client.v2.model.FastlyAccountUpdateRequestData;
import com.datadog.api.client.v2.model.FastlyServiceRequestAttributes;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    FastlyIntegrationApi apiInstance = new FastlyIntegrationApi(defaultClient);

    FastlyAccountUpdateRequest body =
        new FastlyAccountUpdateRequest()
            .data(
                new FastlyAccountUpdateRequestData()
                    .apiKey("ABCDEFG123")
                    .services(
                        Collections.singletonList(
                            new FastlyServiceRequestAttributes()
                                .tags(Arrays.asList("myTag", "myTag2:myValue")))));

    try {
      FastlyAccountResponse result = apiInstance.updateFastlyAccount("account_id", body);
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
