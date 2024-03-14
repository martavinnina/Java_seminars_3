package service;

import model.PostType;

public interface IPostService {
//vienmer public abstract f-jas ir seit!
	public abstract void publishPost(String title, String msg, PostType type)throws Exception;
}


