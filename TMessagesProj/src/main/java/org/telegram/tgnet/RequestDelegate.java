package org.telegram.tgnet;

/**
 * 请求委托
 */
public interface RequestDelegate {
    void run(TLObject response, TLRPC.TL_error error);
}
