package com.nt;

import java.util.Random;

public class Rotator {
private String  links[]= {
		               "http://www.Facebook.com",
		               "http://www.WhatsApp.com",
		               "http://www.Instagram.com",
		               "http://www.Twitter.com",
		               "http://www.YouTube.com"
		          };
private String images[]= {
		                   "1.png",
		                   "2.png",
		                   "3.png",
		                   "4.png",
		                   "5.png"
		                 };
public String[] getLinks() {
	return links;
}
public void setLinks(String[] links) {
	this.links = links;
}
public String[] getImages() {
	return images;
}
public void setImages(String[] images) {
	this.images = images;
}

int counter=0;
public void nextAdvertisement() {
	Random r=new Random();
	counter=r.nextInt(5);
	}
public String getLink() {
	return links[counter];
}
public String getImage() {
	return images[counter];
}
}
