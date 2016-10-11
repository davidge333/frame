package com.david.frame.zlib.net;

public interface RequestCallback
{
	public void onSuccess(String content);

	public void onFail(String errorMessage);
}
