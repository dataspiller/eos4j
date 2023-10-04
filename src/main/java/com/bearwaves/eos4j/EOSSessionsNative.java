package com.bearwaves.eos4j;

public class EOSSessionsNative {

    static native void EOS_SessionSearch_Find(EOS_HSessionSearch Handle, const EOS_SessionSearch_FindOptions* Options, void* ClientData, const EOS_SessionSearch_OnFindCallback CompletionDelegate);


}
