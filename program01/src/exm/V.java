package exm;

import java.util.Scanner;

public class V {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom,ape;
		int ed,m;
		Scanner palabra;
		palabra= new Scanner(System.in);
		System.out.println("introduce nombre:");
		nom=palabra.next();
		System.out.println("introduce apellido:");
		ape=palabra.next();
		System.out.println("introduce edad:");
		ed=palabra.nextInt();
		if(ed<=12){
			System.out.println("No puedes introducirte en el sistema");
			}
		else {
			System.out.println("Bienvenido " + nom+ ape + " a la fruteria");
			
		}
		System.out.println("1.Realizar una nueva compra");
		System.out.println("2.Comprobar si existe fruta");
		System.out.println("3.introducir fruta");
		System.out.println("4.salir");
		System.out.println("¿Que quieres realizar?");
		m=palabra.nextInt();
		switch(m) {
		case 1:	
			int p1,p2,p3,total;
			System.out.println("introduce el precio del primer producto");
			p1=palabra.nextInt();
			while(p1<0) {
				System.out.println("ERROR,introducelo de nuevo");
				System.out.println("introduce el precio del primer producto");
				p1=palabra.nextInt();
			}
			System.out.println("introduce el precio del segundo producto");
			p2=palabra.nextInt();
			while(p2<0) {
				System.out.println("ERROR,introducelo de nuevo");
				System.out.println("introduce el precio del segundo producto");
				p2=palabra.nextInt();
			}
			System.out.println("introduce el precio del tercer producto");
			p3=palabra.nextInt();
			while(p3<0) {
				System.out.println("ERROR,introducelo de nuevo");
				System.out.println("introduce el precio del tercer producto");
				p3=palabra.nextInt();
			}
			total=p1+p2+p3;
			System.out.println("El total es: "+total + " Euro");
			break;
		case 2:
			String fru;
			System.out.println("Introduce el nombre de la fruta");
			fru=palabra.next();
			fru=fru.toLowerCase();
			if(fru.equals("manzana")) {
				System.out.println("Si tenemos esa fruta");
				}
			else{
				System.out.println("No tenemos esa fruta");
			}
			break;
		case 3:
			String adm,frut;
			System.out.println("Para realizar esta accion necesitas ser administrador");
			adm=palabra.next();
			if((adm.equals("abc"))){
				System.out.println("Introduce una fruta");
				frut=palabra.next();
				for(int i=1;i<=3;i++) {
					System.out.println("La fruta " +frut+ " se ha guardado");
				}
			}
			else {
				System.out.println("Para realizar esta accion necesitas ser administrador");
				adm=palabra.next();
				System.out.println("Introduce una fruta");
				frut=palabra.next();
				for(int i=1;i<=3;i++) {
					System.out.println("La fruta " +frut+ " se ha guardado");
				}
			}
		
            
            break;
		case 4:
			System.out.println("Hasta luego "+nom );
			break;
			default:
				System.out.println("ERROR");
			
			}
			palabra.close();
			
		
			}
			
		
		
		
		}

		
		
		
		
	



