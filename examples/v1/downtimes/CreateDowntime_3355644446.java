// Schedule a monitor downtime returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DowntimesApi;
import com.datadog.api.client.v1.model.Downtime;
import java.time.OffsetDateTime;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DowntimesApi apiInstance = new DowntimesApi(defaultClient);

    // there is a valid "monitor" in the system
    Long MONITOR_ID = Long.parseLong(System.getenv("MONITOR_ID"));

    Downtime body =
        new Downtime()
            .message("Example-Schedule_a_monitor_downtime_returns_OK_response")
            .start(OffsetDateTime.now().toInstant().getEpochSecond())
            .timezone("Etc/UTC")
            .scope(
                Collections.singletonList("test:examplescheduleamonitordowntimereturnsokresponse"))
            .monitorId(MONITOR_ID);

    try {
      Downtime result = apiInstance.createDowntime(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#createDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
