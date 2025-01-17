// Create an application key with scopes for this service account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ServiceAccountsApi;
import com.datadog.api.client.v2.model.ApplicationKeyCreateAttributes;
import com.datadog.api.client.v2.model.ApplicationKeyCreateData;
import com.datadog.api.client.v2.model.ApplicationKeyCreateRequest;
import com.datadog.api.client.v2.model.ApplicationKeyResponse;
import com.datadog.api.client.v2.model.ApplicationKeysType;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);

    // there is a valid "service_account_user" in the system
    String SERVICE_ACCOUNT_USER_DATA_ID = System.getenv("SERVICE_ACCOUNT_USER_DATA_ID");

    ApplicationKeyCreateRequest body =
        new ApplicationKeyCreateRequest()
            .data(
                new ApplicationKeyCreateData()
                    .attributes(
                        new ApplicationKeyCreateAttributes()
                            .name(
                                "Example-Create_an_application_key_with_scopes_for_this_service_account_returns_Created_response")
                            .scopes(
                                Arrays.asList(
                                    "dashboards_read",
                                    "dashboards_write",
                                    "dashboards_public_share")))
                    .type(ApplicationKeysType.APPLICATION_KEYS));

    try {
      ApplicationKeyResponse result =
          apiInstance.createServiceAccountApplicationKey(SERVICE_ACCOUNT_USER_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ServiceAccountsApi#createServiceAccountApplicationKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
