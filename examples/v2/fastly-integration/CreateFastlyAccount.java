// Add Fastly account returns "The schema representation of a Fastly account." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FastlyIntegrationApi;
import com.datadog.api.client.v2.model.FastlyAccountCreateRequest;
import com.datadog.api.client.v2.model.FastlyAccountCreateRequestAttributes;
import com.datadog.api.client.v2.model.FastlyAccountCreateRequestData;
import com.datadog.api.client.v2.model.FastlyAccountResponse;
import com.datadog.api.client.v2.model.FastlyAccountType;
import com.datadog.api.client.v2.model.FastlyServiceRequestAttributes;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    FastlyIntegrationApi apiInstance = new FastlyIntegrationApi(defaultClient);

    FastlyAccountCreateRequest body =
        new FastlyAccountCreateRequest()
            .data(
                new FastlyAccountCreateRequestData()
                    .attributes(
                        new FastlyAccountCreateRequestAttributes()
                            .apiKey("ABCDEFG123")
                            .name("test-name")
                            .services(
                                Collections.singletonList(
                                    new FastlyServiceRequestAttributes()
                                        .tags(Arrays.asList("myTag", "myTag2:myValue")))))
                    .id("abc123")
                    .type(FastlyAccountType.FASTLY_ACCOUNTS));

    try {
      FastlyAccountResponse result = apiInstance.createFastlyAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FastlyIntegrationApi#createFastlyAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
