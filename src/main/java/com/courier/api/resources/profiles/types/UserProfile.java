/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.profiles.types;

import com.courier.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UserProfile.Builder.class)
public final class UserProfile {
    private final Address address;

    private final String birthdate;

    private final String email;

    private final boolean emailVerified;

    private final String familyName;

    private final String gender;

    private final String givenName;

    private final String locale;

    private final String middleName;

    private final String name;

    private final String nickname;

    private final String phoneNumber;

    private final boolean phoneNumberVerified;

    private final String picture;

    private final String preferredName;

    private final String profile;

    private final String sub;

    private final String updatedAt;

    private final String website;

    private final String zoneinfo;

    private final Object custom;

    private final AirshipProfile airship;

    private final String apn;

    private final String targetArn;

    private final Discord discord;

    private final Expo expo;

    private final String facebookPsid;

    private final UserProfileFirebaseToken firebaseToken;

    private final Intercom intercom;

    private final Slack slack;

    private final MsTeams msTeams;

    private final Map<String, Object> additionalProperties;

    private UserProfile(
            Address address,
            String birthdate,
            String email,
            boolean emailVerified,
            String familyName,
            String gender,
            String givenName,
            String locale,
            String middleName,
            String name,
            String nickname,
            String phoneNumber,
            boolean phoneNumberVerified,
            String picture,
            String preferredName,
            String profile,
            String sub,
            String updatedAt,
            String website,
            String zoneinfo,
            Object custom,
            AirshipProfile airship,
            String apn,
            String targetArn,
            Discord discord,
            Expo expo,
            String facebookPsid,
            UserProfileFirebaseToken firebaseToken,
            Intercom intercom,
            Slack slack,
            MsTeams msTeams,
            Map<String, Object> additionalProperties) {
        this.address = address;
        this.birthdate = birthdate;
        this.email = email;
        this.emailVerified = emailVerified;
        this.familyName = familyName;
        this.gender = gender;
        this.givenName = givenName;
        this.locale = locale;
        this.middleName = middleName;
        this.name = name;
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
        this.phoneNumberVerified = phoneNumberVerified;
        this.picture = picture;
        this.preferredName = preferredName;
        this.profile = profile;
        this.sub = sub;
        this.updatedAt = updatedAt;
        this.website = website;
        this.zoneinfo = zoneinfo;
        this.custom = custom;
        this.airship = airship;
        this.apn = apn;
        this.targetArn = targetArn;
        this.discord = discord;
        this.expo = expo;
        this.facebookPsid = facebookPsid;
        this.firebaseToken = firebaseToken;
        this.intercom = intercom;
        this.slack = slack;
        this.msTeams = msTeams;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("birthdate")
    public String getBirthdate() {
        return birthdate;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email_verified")
    public boolean getEmailVerified() {
        return emailVerified;
    }

    @JsonProperty("family_name")
    public String getFamilyName() {
        return familyName;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("given_name")
    public String getGivenName() {
        return givenName;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("middle_name")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phone_number_verified")
    public boolean getPhoneNumberVerified() {
        return phoneNumberVerified;
    }

    @JsonProperty("picture")
    public String getPicture() {
        return picture;
    }

    @JsonProperty("preferred_name")
    public String getPreferredName() {
        return preferredName;
    }

    @JsonProperty("profile")
    public String getProfile() {
        return profile;
    }

    @JsonProperty("sub")
    public String getSub() {
        return sub;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("zoneinfo")
    public String getZoneinfo() {
        return zoneinfo;
    }

    /**
     * @return A free form object. Due to a limitation of the API Explorer, you can only enter string key/values below, but this API accepts more complex object structures.
     */
    @JsonProperty("custom")
    public Object getCustom() {
        return custom;
    }

    @JsonProperty("airship")
    public AirshipProfile getAirship() {
        return airship;
    }

    @JsonProperty("apn")
    public String getApn() {
        return apn;
    }

    @JsonProperty("target_arn")
    public String getTargetArn() {
        return targetArn;
    }

    @JsonProperty("discord")
    public Discord getDiscord() {
        return discord;
    }

    @JsonProperty("expo")
    public Expo getExpo() {
        return expo;
    }

    @JsonProperty("facebookPSID")
    public String getFacebookPsid() {
        return facebookPsid;
    }

    @JsonProperty("firebaseToken")
    public UserProfileFirebaseToken getFirebaseToken() {
        return firebaseToken;
    }

    @JsonProperty("intercom")
    public Intercom getIntercom() {
        return intercom;
    }

    @JsonProperty("slack")
    public Slack getSlack() {
        return slack;
    }

    @JsonProperty("ms_teams")
    public MsTeams getMsTeams() {
        return msTeams;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserProfile && equalTo((UserProfile) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserProfile other) {
        return address.equals(other.address)
                && birthdate.equals(other.birthdate)
                && email.equals(other.email)
                && emailVerified == other.emailVerified
                && familyName.equals(other.familyName)
                && gender.equals(other.gender)
                && givenName.equals(other.givenName)
                && locale.equals(other.locale)
                && middleName.equals(other.middleName)
                && name.equals(other.name)
                && nickname.equals(other.nickname)
                && phoneNumber.equals(other.phoneNumber)
                && phoneNumberVerified == other.phoneNumberVerified
                && picture.equals(other.picture)
                && preferredName.equals(other.preferredName)
                && profile.equals(other.profile)
                && sub.equals(other.sub)
                && updatedAt.equals(other.updatedAt)
                && website.equals(other.website)
                && zoneinfo.equals(other.zoneinfo)
                && custom.equals(other.custom)
                && airship.equals(other.airship)
                && apn.equals(other.apn)
                && targetArn.equals(other.targetArn)
                && discord.equals(other.discord)
                && expo.equals(other.expo)
                && facebookPsid.equals(other.facebookPsid)
                && firebaseToken.equals(other.firebaseToken)
                && intercom.equals(other.intercom)
                && slack.equals(other.slack)
                && msTeams.equals(other.msTeams);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.address,
                this.birthdate,
                this.email,
                this.emailVerified,
                this.familyName,
                this.gender,
                this.givenName,
                this.locale,
                this.middleName,
                this.name,
                this.nickname,
                this.phoneNumber,
                this.phoneNumberVerified,
                this.picture,
                this.preferredName,
                this.profile,
                this.sub,
                this.updatedAt,
                this.website,
                this.zoneinfo,
                this.custom,
                this.airship,
                this.apn,
                this.targetArn,
                this.discord,
                this.expo,
                this.facebookPsid,
                this.firebaseToken,
                this.intercom,
                this.slack,
                this.msTeams);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AddressStage builder() {
        return new Builder();
    }

    public interface AddressStage {
        BirthdateStage address(Address address);

        Builder from(UserProfile other);
    }

    public interface BirthdateStage {
        EmailStage birthdate(String birthdate);
    }

    public interface EmailStage {
        EmailVerifiedStage email(String email);
    }

    public interface EmailVerifiedStage {
        FamilyNameStage emailVerified(boolean emailVerified);
    }

    public interface FamilyNameStage {
        GenderStage familyName(String familyName);
    }

    public interface GenderStage {
        GivenNameStage gender(String gender);
    }

    public interface GivenNameStage {
        LocaleStage givenName(String givenName);
    }

    public interface LocaleStage {
        MiddleNameStage locale(String locale);
    }

    public interface MiddleNameStage {
        NameStage middleName(String middleName);
    }

    public interface NameStage {
        NicknameStage name(String name);
    }

    public interface NicknameStage {
        PhoneNumberStage nickname(String nickname);
    }

    public interface PhoneNumberStage {
        PhoneNumberVerifiedStage phoneNumber(String phoneNumber);
    }

    public interface PhoneNumberVerifiedStage {
        PictureStage phoneNumberVerified(boolean phoneNumberVerified);
    }

    public interface PictureStage {
        PreferredNameStage picture(String picture);
    }

    public interface PreferredNameStage {
        ProfileStage preferredName(String preferredName);
    }

    public interface ProfileStage {
        SubStage profile(String profile);
    }

    public interface SubStage {
        UpdatedAtStage sub(String sub);
    }

    public interface UpdatedAtStage {
        WebsiteStage updatedAt(String updatedAt);
    }

    public interface WebsiteStage {
        ZoneinfoStage website(String website);
    }

    public interface ZoneinfoStage {
        CustomStage zoneinfo(String zoneinfo);
    }

    public interface CustomStage {
        AirshipStage custom(Object custom);
    }

    public interface AirshipStage {
        ApnStage airship(AirshipProfile airship);
    }

    public interface ApnStage {
        TargetArnStage apn(String apn);
    }

    public interface TargetArnStage {
        DiscordStage targetArn(String targetArn);
    }

    public interface DiscordStage {
        ExpoStage discord(Discord discord);
    }

    public interface ExpoStage {
        FacebookPsidStage expo(Expo expo);
    }

    public interface FacebookPsidStage {
        FirebaseTokenStage facebookPsid(String facebookPsid);
    }

    public interface FirebaseTokenStage {
        IntercomStage firebaseToken(UserProfileFirebaseToken firebaseToken);
    }

    public interface IntercomStage {
        SlackStage intercom(Intercom intercom);
    }

    public interface SlackStage {
        MsTeamsStage slack(Slack slack);
    }

    public interface MsTeamsStage {
        _FinalStage msTeams(MsTeams msTeams);
    }

    public interface _FinalStage {
        UserProfile build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements AddressStage,
                    BirthdateStage,
                    EmailStage,
                    EmailVerifiedStage,
                    FamilyNameStage,
                    GenderStage,
                    GivenNameStage,
                    LocaleStage,
                    MiddleNameStage,
                    NameStage,
                    NicknameStage,
                    PhoneNumberStage,
                    PhoneNumberVerifiedStage,
                    PictureStage,
                    PreferredNameStage,
                    ProfileStage,
                    SubStage,
                    UpdatedAtStage,
                    WebsiteStage,
                    ZoneinfoStage,
                    CustomStage,
                    AirshipStage,
                    ApnStage,
                    TargetArnStage,
                    DiscordStage,
                    ExpoStage,
                    FacebookPsidStage,
                    FirebaseTokenStage,
                    IntercomStage,
                    SlackStage,
                    MsTeamsStage,
                    _FinalStage {
        private Address address;

        private String birthdate;

        private String email;

        private boolean emailVerified;

        private String familyName;

        private String gender;

        private String givenName;

        private String locale;

        private String middleName;

        private String name;

        private String nickname;

        private String phoneNumber;

        private boolean phoneNumberVerified;

        private String picture;

        private String preferredName;

        private String profile;

        private String sub;

        private String updatedAt;

        private String website;

        private String zoneinfo;

        private Object custom;

        private AirshipProfile airship;

        private String apn;

        private String targetArn;

        private Discord discord;

        private Expo expo;

        private String facebookPsid;

        private UserProfileFirebaseToken firebaseToken;

        private Intercom intercom;

        private Slack slack;

        private MsTeams msTeams;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UserProfile other) {
            address(other.getAddress());
            birthdate(other.getBirthdate());
            email(other.getEmail());
            emailVerified(other.getEmailVerified());
            familyName(other.getFamilyName());
            gender(other.getGender());
            givenName(other.getGivenName());
            locale(other.getLocale());
            middleName(other.getMiddleName());
            name(other.getName());
            nickname(other.getNickname());
            phoneNumber(other.getPhoneNumber());
            phoneNumberVerified(other.getPhoneNumberVerified());
            picture(other.getPicture());
            preferredName(other.getPreferredName());
            profile(other.getProfile());
            sub(other.getSub());
            updatedAt(other.getUpdatedAt());
            website(other.getWebsite());
            zoneinfo(other.getZoneinfo());
            custom(other.getCustom());
            airship(other.getAirship());
            apn(other.getApn());
            targetArn(other.getTargetArn());
            discord(other.getDiscord());
            expo(other.getExpo());
            facebookPsid(other.getFacebookPsid());
            firebaseToken(other.getFirebaseToken());
            intercom(other.getIntercom());
            slack(other.getSlack());
            msTeams(other.getMsTeams());
            return this;
        }

        @java.lang.Override
        @JsonSetter("address")
        public BirthdateStage address(Address address) {
            this.address = address;
            return this;
        }

        @java.lang.Override
        @JsonSetter("birthdate")
        public EmailStage birthdate(String birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        @java.lang.Override
        @JsonSetter("email")
        public EmailVerifiedStage email(String email) {
            this.email = email;
            return this;
        }

        @java.lang.Override
        @JsonSetter("email_verified")
        public FamilyNameStage emailVerified(boolean emailVerified) {
            this.emailVerified = emailVerified;
            return this;
        }

        @java.lang.Override
        @JsonSetter("family_name")
        public GenderStage familyName(String familyName) {
            this.familyName = familyName;
            return this;
        }

        @java.lang.Override
        @JsonSetter("gender")
        public GivenNameStage gender(String gender) {
            this.gender = gender;
            return this;
        }

        @java.lang.Override
        @JsonSetter("given_name")
        public LocaleStage givenName(String givenName) {
            this.givenName = givenName;
            return this;
        }

        @java.lang.Override
        @JsonSetter("locale")
        public MiddleNameStage locale(String locale) {
            this.locale = locale;
            return this;
        }

        @java.lang.Override
        @JsonSetter("middle_name")
        public NameStage middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public NicknameStage name(String name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        @JsonSetter("nickname")
        public PhoneNumberStage nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        @java.lang.Override
        @JsonSetter("phone_number")
        public PhoneNumberVerifiedStage phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        @java.lang.Override
        @JsonSetter("phone_number_verified")
        public PictureStage phoneNumberVerified(boolean phoneNumberVerified) {
            this.phoneNumberVerified = phoneNumberVerified;
            return this;
        }

        @java.lang.Override
        @JsonSetter("picture")
        public PreferredNameStage picture(String picture) {
            this.picture = picture;
            return this;
        }

        @java.lang.Override
        @JsonSetter("preferred_name")
        public ProfileStage preferredName(String preferredName) {
            this.preferredName = preferredName;
            return this;
        }

        @java.lang.Override
        @JsonSetter("profile")
        public SubStage profile(String profile) {
            this.profile = profile;
            return this;
        }

        @java.lang.Override
        @JsonSetter("sub")
        public UpdatedAtStage sub(String sub) {
            this.sub = sub;
            return this;
        }

        @java.lang.Override
        @JsonSetter("updated_at")
        public WebsiteStage updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @java.lang.Override
        @JsonSetter("website")
        public ZoneinfoStage website(String website) {
            this.website = website;
            return this;
        }

        @java.lang.Override
        @JsonSetter("zoneinfo")
        public CustomStage zoneinfo(String zoneinfo) {
            this.zoneinfo = zoneinfo;
            return this;
        }

        /**
         * <p>A free form object. Due to a limitation of the API Explorer, you can only enter string key/values below, but this API accepts more complex object structures.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("custom")
        public AirshipStage custom(Object custom) {
            this.custom = custom;
            return this;
        }

        @java.lang.Override
        @JsonSetter("airship")
        public ApnStage airship(AirshipProfile airship) {
            this.airship = airship;
            return this;
        }

        @java.lang.Override
        @JsonSetter("apn")
        public TargetArnStage apn(String apn) {
            this.apn = apn;
            return this;
        }

        @java.lang.Override
        @JsonSetter("target_arn")
        public DiscordStage targetArn(String targetArn) {
            this.targetArn = targetArn;
            return this;
        }

        @java.lang.Override
        @JsonSetter("discord")
        public ExpoStage discord(Discord discord) {
            this.discord = discord;
            return this;
        }

        @java.lang.Override
        @JsonSetter("expo")
        public FacebookPsidStage expo(Expo expo) {
            this.expo = expo;
            return this;
        }

        @java.lang.Override
        @JsonSetter("facebookPSID")
        public FirebaseTokenStage facebookPsid(String facebookPsid) {
            this.facebookPsid = facebookPsid;
            return this;
        }

        @java.lang.Override
        @JsonSetter("firebaseToken")
        public IntercomStage firebaseToken(UserProfileFirebaseToken firebaseToken) {
            this.firebaseToken = firebaseToken;
            return this;
        }

        @java.lang.Override
        @JsonSetter("intercom")
        public SlackStage intercom(Intercom intercom) {
            this.intercom = intercom;
            return this;
        }

        @java.lang.Override
        @JsonSetter("slack")
        public MsTeamsStage slack(Slack slack) {
            this.slack = slack;
            return this;
        }

        @java.lang.Override
        @JsonSetter("ms_teams")
        public _FinalStage msTeams(MsTeams msTeams) {
            this.msTeams = msTeams;
            return this;
        }

        @java.lang.Override
        public UserProfile build() {
            return new UserProfile(
                    address,
                    birthdate,
                    email,
                    emailVerified,
                    familyName,
                    gender,
                    givenName,
                    locale,
                    middleName,
                    name,
                    nickname,
                    phoneNumber,
                    phoneNumberVerified,
                    picture,
                    preferredName,
                    profile,
                    sub,
                    updatedAt,
                    website,
                    zoneinfo,
                    custom,
                    airship,
                    apn,
                    targetArn,
                    discord,
                    expo,
                    facebookPsid,
                    firebaseToken,
                    intercom,
                    slack,
                    msTeams,
                    additionalProperties);
        }
    }
}
