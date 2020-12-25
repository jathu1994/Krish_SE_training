package com.jatha.designpatterns.chainofresponsibility;

public class Application {

	public static void main(String[] args) {
		
		Package pkg = new Package();
		SilverPackage spkg = new SilverPackage();
		GoldPackage gpkg = new GoldPackage();
		PlatinumPackage ppkg = new PlatinumPackage();
		
		pkg.setSuccessor(spkg);
		spkg.setSuccessor(gpkg);
		gpkg.setSuccessor(ppkg);
		
		PackageCreator packageCreator =  new PackageCreator(90000);
		System.out.println(pkg.addPackageItems(packageCreator));
		System.out.println("-----------------------------------");
		
		PackageCreator packageCreator2 =  new PackageCreator(190000);
		System.out.println(pkg.addPackageItems(packageCreator2));
		System.out.println("-----------------------------------");
		
		PackageCreator packageCreator3 =  new PackageCreator(290000);
		System.out.println(pkg.addPackageItems(packageCreator3));
		System.out.println("-----------------------------------");
		
		PackageCreator packageCreator4 =  new PackageCreator(500000);
		System.out.println(pkg.addPackageItems(packageCreator4));
		System.out.println("-----------------------------------");

	}

}
