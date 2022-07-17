/**
 * MMT reports API
 * MMT reports API documentation.
 *
 * Do not edit the class manually.
 */

package util.mymosttrusted.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import util.mymosttrusted.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("ConfigBody".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConfigBody>>(){}.getType();
    }
    
    if ("ConfigResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConfigResult>>(){}.getType();
    }
    
    if ("ConnectUser".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConnectUser>>(){}.getType();
    }
    
    if ("ConnectUserResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConnectUserResult>>(){}.getType();
    }
    
    if ("GroupedTagItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<GroupedTagItem>>(){}.getType();
    }
    
    if ("Invite".equalsIgnoreCase(className)) {
      return new TypeToken<List<Invite>>(){}.getType();
    }
    
    if ("InviteStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<InviteStatus>>(){}.getType();
    }
    
    if ("InvitesResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<InvitesResult>>(){}.getType();
    }
    
    if ("Network".equalsIgnoreCase(className)) {
      return new TypeToken<List<Network>>(){}.getType();
    }
    
    if ("NetworkResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<NetworkResult>>(){}.getType();
    }
    
    if ("OkResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<OkResult>>(){}.getType();
    }
    
    if ("PhoneItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<PhoneItem>>(){}.getType();
    }
    
    if ("StatsByUserInvites".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatsByUserInvites>>(){}.getType();
    }
    
    if ("StatsResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatsResult>>(){}.getType();
    }
    
    if ("StatsSummedResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatsSummedResult>>(){}.getType();
    }
    
    if ("StatsSummedResultTrackingLinks".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatsSummedResultTrackingLinks>>(){}.getType();
    }
    
    if ("TagDetail".equalsIgnoreCase(className)) {
      return new TypeToken<List<TagDetail>>(){}.getType();
    }
    
    if ("TagItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<TagItem>>(){}.getType();
    }
    
    if ("TagResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<TagResult>>(){}.getType();
    }
    
    if ("TagStats".equalsIgnoreCase(className)) {
      return new TypeToken<List<TagStats>>(){}.getType();
    }
    
    if ("TrackingLinkDetail".equalsIgnoreCase(className)) {
      return new TypeToken<List<TrackingLinkDetail>>(){}.getType();
    }
    
    if ("TrackingLinkDetailResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<TrackingLinkDetailResult>>(){}.getType();
    }
    
    if ("TrackingLinkSummary".equalsIgnoreCase(className)) {
      return new TypeToken<List<TrackingLinkSummary>>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<List<User>>(){}.getType();
    }
    
    if ("UserResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserResult>>(){}.getType();
    }
    
    if ("UserStatsResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserStatsResult>>(){}.getType();
    }
    
    if ("UserStatsResultInvites".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserStatsResultInvites>>(){}.getType();
    }
    
    if ("WebhookBody".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookBody>>(){}.getType();
    }
    
    if ("WebhookItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookItem>>(){}.getType();
    }
    
    if ("WebhookPatchBody".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookPatchBody>>(){}.getType();
    }
    
    if ("WebhookResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookResult>>(){}.getType();
    }
    
    if ("WebhookResultItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookResultItem>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("ConfigBody".equalsIgnoreCase(className)) {
      return new TypeToken<ConfigBody>(){}.getType();
    }
    
    if ("ConfigResult".equalsIgnoreCase(className)) {
      return new TypeToken<ConfigResult>(){}.getType();
    }
    
    if ("ConnectUser".equalsIgnoreCase(className)) {
      return new TypeToken<ConnectUser>(){}.getType();
    }
    
    if ("ConnectUserResult".equalsIgnoreCase(className)) {
      return new TypeToken<ConnectUserResult>(){}.getType();
    }
    
    if ("GroupedTagItem".equalsIgnoreCase(className)) {
      return new TypeToken<GroupedTagItem>(){}.getType();
    }
    
    if ("Invite".equalsIgnoreCase(className)) {
      return new TypeToken<Invite>(){}.getType();
    }
    
    if ("InviteStatus".equalsIgnoreCase(className)) {
      return new TypeToken<InviteStatus>(){}.getType();
    }
    
    if ("InvitesResult".equalsIgnoreCase(className)) {
      return new TypeToken<InvitesResult>(){}.getType();
    }
    
    if ("Network".equalsIgnoreCase(className)) {
      return new TypeToken<Network>(){}.getType();
    }
    
    if ("NetworkResult".equalsIgnoreCase(className)) {
      return new TypeToken<NetworkResult>(){}.getType();
    }
    
    if ("OkResult".equalsIgnoreCase(className)) {
      return new TypeToken<OkResult>(){}.getType();
    }
    
    if ("PhoneItem".equalsIgnoreCase(className)) {
      return new TypeToken<PhoneItem>(){}.getType();
    }
    
    if ("StatsByUserInvites".equalsIgnoreCase(className)) {
      return new TypeToken<StatsByUserInvites>(){}.getType();
    }
    
    if ("StatsResult".equalsIgnoreCase(className)) {
      return new TypeToken<StatsResult>(){}.getType();
    }
    
    if ("StatsSummedResult".equalsIgnoreCase(className)) {
      return new TypeToken<StatsSummedResult>(){}.getType();
    }
    
    if ("StatsSummedResultTrackingLinks".equalsIgnoreCase(className)) {
      return new TypeToken<StatsSummedResultTrackingLinks>(){}.getType();
    }
    
    if ("TagDetail".equalsIgnoreCase(className)) {
      return new TypeToken<TagDetail>(){}.getType();
    }
    
    if ("TagItem".equalsIgnoreCase(className)) {
      return new TypeToken<TagItem>(){}.getType();
    }
    
    if ("TagResult".equalsIgnoreCase(className)) {
      return new TypeToken<TagResult>(){}.getType();
    }
    
    if ("TagStats".equalsIgnoreCase(className)) {
      return new TypeToken<TagStats>(){}.getType();
    }
    
    if ("TrackingLinkDetail".equalsIgnoreCase(className)) {
      return new TypeToken<TrackingLinkDetail>(){}.getType();
    }
    
    if ("TrackingLinkDetailResult".equalsIgnoreCase(className)) {
      return new TypeToken<TrackingLinkDetailResult>(){}.getType();
    }
    
    if ("TrackingLinkSummary".equalsIgnoreCase(className)) {
      return new TypeToken<TrackingLinkSummary>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<User>(){}.getType();
    }
    
    if ("UserResult".equalsIgnoreCase(className)) {
      return new TypeToken<UserResult>(){}.getType();
    }
    
    if ("UserStatsResult".equalsIgnoreCase(className)) {
      return new TypeToken<UserStatsResult>(){}.getType();
    }
    
    if ("UserStatsResultInvites".equalsIgnoreCase(className)) {
      return new TypeToken<UserStatsResultInvites>(){}.getType();
    }
    
    if ("WebhookBody".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookBody>(){}.getType();
    }
    
    if ("WebhookItem".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookItem>(){}.getType();
    }
    
    if ("WebhookPatchBody".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookPatchBody>(){}.getType();
    }
    
    if ("WebhookResult".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookResult>(){}.getType();
    }
    
    if ("WebhookResultItem".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookResultItem>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
