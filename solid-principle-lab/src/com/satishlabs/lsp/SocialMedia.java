package com.satishlabs.lsp;

//derived classes must be completely substitutable for their base classes.
//In other words ,if class A is subtype of class B, 
//then we should be able to replace B with A without interrupting the behaviour of the program
public abstract class SocialMedia {

	//@support WhatsApp, Facebook, Instagram
	public abstract void chatWithFriend();

	//@support WhatsApp, Facebook, Instagram
	public abstract void publishPost(Object post);

	//@support WhatsApp, Facebook, Instagram
	public abstract void sendPhotosAndVideos();

	//@support WhatsApp, Facebook, Instagram
	public abstract void groupVideoCall(String...arsg);
}
