package service;

import model.PostType;
import model.user.GuestUser;
import model.user.PrivateUser;
import model.user.RegisteredUser;

public class MainService {

	public static void main(String[] args) {
	
		//tips      nosaukums = new kontruktora_izsaukums ;
		GuestUser   gU1       = new GuestUser()           ;
		GuestUser   gU2       = new GuestUser()           ;
		GuestUser   gU3       = new GuestUser()           ;
		PrivateUser pU1       = new PrivateUser("Karina", "Skirmante", "1234");
		try {
			pU1.publishPost("Mana pirma ziņa", "Man loti patik programmet", PostType.publicPost);
			pU1.publishPost("Mana otra zina", "Man viss ir apnicis", PostType.privatePost);
			pU1.publishPost("Mana tresa zina", "Gribu, lai ir piektdiena", PostType.privatePost);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(gU1);
		System.out.println(gU2);
		System.out.println(gU3);
		
		System.out.println(pU1);
		
		System.out.println("Private posts->");
		System.out.println(pU1.getPrivatePosts());
		System.out.println("Public posts->");
		System.out.println(pU1.getPublicPosts());

	}

}