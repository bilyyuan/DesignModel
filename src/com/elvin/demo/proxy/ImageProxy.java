package com.elvin.demo.proxy;
/**
 * This is VirtualProxy
 * 虚代理
 * @author spring
 *
 */
public class ImageProxy {
	private int height = 480;
	private int width = 640;
	
	private Image image = null;

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public Image getImage() {
		if (image == null) {
			image = new Image();
		}
		return image;
	}
	
}

class Image {
	public Image() {
		// TODO Auto-generated constructor stub
		// do some thing to load bitmap.
		
	}
	
//	public Image loadImage() {
//		
//	}
	
	// 在getImage之前都没有真正的加载图片。
	// 这样只会在需要的时候加载图片，进而可以节省内存。
	// Load image only when it is necessary[ip.getImage]
	// If we just need height or width, it will not load image.
	// It is a way to save memory
	public static void main(String[] args) {
		ImageProxy ip = new ImageProxy();
		ip.getHeight();
		ip.getWidth();
		// Now it will load image.
		ip.getImage();
	}
}
