package com.bearwaves.eos4j;
import EosSdk
public class EOSSessions {

    public void EOS_SessionSearch_Find()
    {
        
    }
    //convert below c enum to java enum
    public enum OnlneSessionStateType{
        NoSession,
        Creating,
        Pending,
        Starting,
        InProgress,
        Ending,
        Ended,
        Estroying
    }
    public enum EOS_ESessionAttributeAdvertisementType {
        /**
         * Don't advertise via the online service
         */
        EOS_SAAT_DontAdvertise,
        /** Advertise via the online service only */
        EOS_SAAT_Advertise
    };

    /**
     * Input parameters for the EOS_Sessions_CreateSessionModification function.
     */
    public static class CreateSessionModificationOptions {
        /**
         * API Version: Set this to EOS_SESSIONS_CREATESESSIONMODIFICATION_API_LATEST.
         */
        public final int ApiVersion;
        /** Name of the session to create */
        public final String SessionName;
        /** Bucket ID associated with the session */
        public final String BucketId;
        /**
         * Maximum number of players allowed in the session
         */
        public final int MaxPlayers;
        /**
         * The Product User ID of the local user associated with the session
         */
        EOS.ProductUserId LocalUserId;
        /**
         * Determines whether or not this session should be the one associated with the local user's presence information.
         * If true, this session will be associated with presence. Only one session at a time can have this flag true.
         * This affects the ability of the Social Overlay to show game related actions to take in the user's social graph.
         *
         * @note The Social Overlay can handle only one of the following three options at a time:
         * * using the bPresenceEnabled flags within the Sessions interface
         * * using the bPresenceEnabled flags within the Lobby interface
         * * using EOS_PresenceModification_SetJoinInfo
         * @see EOS_PresenceModification_SetJoinInfoOptions
         * @see EOS_Lobby_CreateLobbyOptions
         * @see EOS_Lobby_JoinLobbyOptions
         * @see EOS_Sessions_JoinSessionOptions
         */
        boolean bPresenceEnabled;
        /**
         * Optional session id - set to a globally unique value to override the backend assignment
         * If not specified the backend service will assign one to the session.  Do not mix and match.
         * This value can be of size [EOS_SESSIONMODIFICATION_MIN_SESSIONIDOVERRIDE_LENGTH, EOS_SESSIONMODIFICATION_MAX_SESSIONIDOVERRIDE_LENGTH]
         */
        public final String SessionId;
        /**
         * If true, sanctioned players can neither join nor register with this session and, in the case of join,
         * will return EOS_EResult code EOS_Sessions_PlayerSanctioned
         */
        boolean bSanctionsEnabled;
        /**
         * Array of platform IDs indicating the player platforms allowed to register with the session. Platform IDs are
         * found in the EOS header file, e.g. EOS_OPT_Epic. For some platforms, the value will be in the EOS Platform specific
         * header file. If null, the session will be unrestricted.
         */
        public final int AllowedPlatformIds;
        /**
         * Number of platform IDs in the array
         */
        public final int AllowedPlatformIdsCount;
        //generate a constructor for this class
        public CreateSessionModificationOptions(int ApiVersion, String SessionName, String BucketId, int MaxPlayers, EOS.ProductUserId LocalUserId, boolean bPresenceEnabled, String SessionId, boolean bSanctionsEnabled, int AllowedPlatformIds, int AllowedPlatformIdsCount)
        {
            this.ApiVersion = ApiVersion;
            this.SessionName = SessionName;
            this.BucketId = BucketId;
            this.MaxPlayers = MaxPlayers;
            this.LocalUserId = LocalUserId;
            this.bPresenceEnabled = bPresenceEnabled;
            this.SessionId = SessionId;
            this.bSanctionsEnabled = bSanctionsEnabled;
            this.AllowedPlatformIds = AllowedPlatformIds;
            this.AllowedPlatformIdsCount = AllowedPlatformIdsCount;
        }
    }

}
