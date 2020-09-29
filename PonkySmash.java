

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class PonkySmash {
    static int oro=100, exp=0, lvl=0, monDerrot=0, mp=10*(lvl+1), hp=100*(lvl+1), potion=0, hipotion=0, mpotion=0, clave=1;
    public static int quienAtaca, hpm, fa, monstruo;
    public static String nombreMonstruo, nombreJugador;
    //Variables con ambito global
public static void Tienda() throws IOException{//proceso que aparece cuando llaman a tienda
    Scanner scannertienda = new Scanner(System.in);
    int tempTienda = 0;
    System.out.println("Tu oro actual es "+oro);
    System.out.println("Pulsa el numero correspondiente");
    System.out.println("1.-Potion: cura 25 hp, por 50 de oro\n2.- Hi-Potion: cura 75 hp, por 100 de oro\n3.- M-potion: repone 10 mp, por 75 de oro\n4.- Regresar");
        tempTienda= scannertienda.nextInt();
    while(tempTienda!=4){//cilo para que se repita mientras no le de la opcion de regresar
   

    while(tempTienda!=1 && tempTienda!=2 && tempTienda!=3 && tempTienda!=4){//ciclo por si le da a una numero no valida
        System.out.println("Opcion no valida, pulsa enter");
        System.in.read();
        System.out.println("Tu oro actual es "+oro);
        System.out.println("Pulsa el número respectivo de item que quieras comprar");
        System.out.println("1.-Potion: cura 25 hp, por 50 de oro\n2.- Hi-Potion: cura 75 hp, por 100 de oro\n3.- M-potion: repone 10 mp, por 75 de oro\n4.- Regresar");

    tempTienda= scannertienda.nextByte();
    }//termina un while
        switch(tempTienda){//segun la opcion que eliga 
            
            case 1: if(oro-30<0){//si no tiene oro
                      System.out.println("No tienes suficiente oro para comprar una Potion, pulsa enter"
                              + "");
                      System.in.read();
                    }else{//si tiene oro
                              oro=oro-30;
                              potion=potion+1;
                              System.out.println("Excelente acabas de comprar una Potion");
                              System.out.println("Tu cantidad de Potion actual es "+potion);
                              System.out.println("Pulsa enter");
                              System.in.read();
                              
                      } 
                      break;
            case 2: if(oro-100<0){//si no tiene oro
                       System.out.println("");
                       System.out.println("No tienes suficiente oro para comprar una Hi-Potion, pulsa enter");
                       System.in.read();
                    }else{    //si tiene oro
                       oro=oro-100;
                       hipotion=hipotion+1;
                       System.out.println("Acabas de comprar una Hi-Potion");
                       System.out.println("Tu cantidad de Hi-potion actual es "+hipotion);
                       System.out.println("Pulsa enter");
                       System.in.read();
                    }
                    break;
            case 3: if(oro-75<0){//si no tiene oro
                        System.out.println("No tienes suficiente oro para comprar una M-Potion, pulsa enter");

                        System.in.read();
                    }else{// si tiene oro
                        oro=oro-75;
                        mpotion=mpotion+1;
                        System.out.println("Compraste una M-potion");
                        System.out.println("Tu cantidad de M-Potion es: "+mpotion);
                        System.out.println("Pulsa enter");
                        System.in.read();
                    }
                    break;
        }if(tempTienda!=4){// si desea realizar otra compra 
        System.out.println("Tu oro actual es: "+oro);
        System.out.println("Si quieres realizar una compra pulsa de nuevo el numero respectivo, sino pulsa 4");
        System.out.println("1.-Potion: cura 25 hp, por 50 de oro\n2.- Hi-Potion: cura 75 hp, por 100 de oro\n3.- M-potion: repone 10 mp, por 75 de oro\n4.- Regresar");
        tempTienda= scannertienda.nextInt();
        }
    }
        if(tempTienda==4){// si la opcion es 4 en cualquier parte aqui viene a parar el procedimiento
            System.out.println("Estas saliendo de la tienda, pulsa enter");
            System.in.read();
        }
}
public static void ZZzzZZzz() throws IOException{//aparece cuando llaman al procedimiento ZZzzZZzz
        int zz=0;
        System.out.println("Te recuperarás por 30 de oro");
        System.out.println("Tu oro actual es "+oro);
        System.out.println("Tu HP es "+hp);
        System.out.println("Tu MP es "+mp);
        System.out.println("1.- Recuperarme\n2.- Regresar");
        Scanner scannerzz = new Scanner(System.in);
        zz=scannerzz.nextInt();
        while(zz!=1 && zz!=2){//ciclo por si el numero no esta indicado
            System.out.println("Opcion no valida ");
            System.out.println("Pulsa enter para continuar");
            System.in.read();
        
        System.out.println("1.- Recuperarme\n2.- Regresar");
        zz=scannerzz.nextInt();
        }
        while(zz==1 && zz!=2){
        if(zz==1){
            if(oro-30<0){
                // si no tiene oro suficiente aparece esto
                System.out.println("No tienes suficiente oro para curarte, pulsa enter");
                System.in.read();
            }else{
                //si tiene oro aparece esto
                hp=(100*(lvl + 1));
                mp=(10*(lvl + 1));
                oro=oro-30;
                System.out.println("Tu HP ahora es "+hp);
                System.out.println("Tu MP ahora es "+ mp);
                System.out.println("Tu oro actual es "+oro);
                System.out.println("Pulsa enter");
                System.in.read();
          }
        }
            System.out.println("Pulsa 2 para Regresar al menu");
            zz=scannerzz.nextInt();
            while(zz!=2){
            if(zz!=2){
            System.out.println("Opcion no valida");
            System.out.println("Pulsa 2 para Regresar al menu");
            zz=scannerzz.nextInt();
            }
        }
        }
        if(zz==2){
            // aqui desenvoca todo el menu cuando la opcion zz es 2
            System.out.println("Estas saliendo del menu ZZzzZZzz, pulsa enter");
            System.in.read();
        }
        
        
}
public static void Status() throws IOException{
    //aparece cuando llaman al procedimiento status
        int status=0;
        System.out.println("PULSE 1 PARA SALIR");
        System.out.println("Experiencia: "+exp);
        System.out.println("Oro "+oro);
        System.out.println("Nivel: "+lvl);
        System.out.println("Maná "+mp);
        System.out.println("Vida: "+hp);
        System.out.println("Potion: "+potion);
        System.out.println("Hi-Potion "+hipotion);
        System.out.println("M-Potion "+mpotion);
        System.out.println("Monstruos derrotados: "+monDerrot);
        Scanner scannerstatus = new Scanner(System.in);
        status=scannerstatus.nextInt();
        //muestra todas las estadisticas del jugador
    while(status!=1){
        // ciclo por si no pulsa un numero indicado
        
        System.out.println("Opción no válida, pulsa enter para regresar");
        System.out.println("");
        System.in.read();
        System.out.println("PULSE 1 PARA SALIR");
        System.out.println("Experiencia: "+exp);
        System.out.println("Oro "+oro);
        System.out.println("Nivel: "+lvl);
        System.out.println("Maná "+mp);
        System.out.println("Vida: "+hp);
        System.out.println("Potion: "+potion);
        System.out.println("Hi-Potion "+hipotion);
        System.out.println("M-Potion "+mpotion);
        System.out.println("Monstruos derrotados: "+monDerrot);
        status=scannerstatus.nextInt();
    }
    if(status==1){
        // Aqui viene a parar cuando se pulsa 1
        System.out.println("Te esperamos pronto, pulsa enter");
        System.in.read();
        
    }
}
public static void MasPoder() throws IOException{
    // procedimiento mas poder, activo cuando se le llama en el main
        int masPoder=0;
        int restaExp;
        //variables locales
        System.out.println("¿Asi que estas listo para subir de nivel?, ok vamos a ello.");
        System.out.println("Pulsa 1 para subir de nivel");
        System.out.println("Pulsa 2 para salir del menú");
        Scanner scannermaspoder = new Scanner(System.in);
        masPoder=scannermaspoder.nextInt();
        while(masPoder!=1 && masPoder!=2){
            //ciclo por si la opcion no esta asignada
            System.out.println("Opcion no valida.");
            System.out.println("Pulsa enter para continuar");
            System.in.read();
            System.out.println("¿Asi que estas listo para subir de nivel?, ok vamos a ello.");
            System.out.println("Pulsa 1 para subir de nivel");
            System.out.println("Pulsa 2 para salir del menú");
            masPoder=scannermaspoder.nextInt();
        }
        while(masPoder==1){
        System.out.println("Tu Experiencia es: "+exp);
        System.out.println("Tu Nivel antes de ver si puedes subir es: "+lvl);
        restaExp=exp%100;
        lvl=(exp-restaExp)/100;
        hp=100*(lvl+1);
        mp=10*(lvl+1);
        //procedimiento para subir de nivel al jugador
        System.out.println("Tu Nivel ahora es: "+lvl);
        System.out.println("Tu Vida ahora es: "+hp);
        System.out.println("Tu Mana ahora es: "+mp);
        System.out.println("Pulsa 2 para regresar");
        masPoder=scannermaspoder.nextInt();
        while(masPoder!=2){
            // ciclo por si no es el numero indicado
            System.out.println("Opcion no válida, pulsa 2 para salir");
            masPoder=scannermaspoder.nextInt();
        
        }
        if(masPoder==2){
            //aqui desenvoca el menu mas poder para salir
            System.out.println("Estas saliendo del menu Mas Poder, pulsa enter.");
            System.in.read();
        }
    }
}
    
public static void IniciarDatosDeJuego(){
    //procedimiento para escoger turno de atacante y monstruo, aleatoriamente todo.
    Random aleatoriomonstruo = new Random();
    monstruo= 1+ aleatoriomonstruo.nextInt(3);
    if(monstruo==1){
        hpm=100;
        fa=10;
        nombreMonstruo = "Dark Wolf";
    }
    if(monstruo==2){
        hpm=200;
        fa=15;
        nombreMonstruo= "Dragon";
    }
    if(monstruo==3){
        hpm=300;
        fa=25;
        nombreMonstruo= "Mighty Golem";
    }
    Random aleatorioquienataca = new Random();
    quienAtaca= 1+aleatorioquienataca.nextInt(2);
    System.out.println("Te enfrentaras a: "+nombreMonstruo);
    System.out.println("Su factor de ataque es: "+fa);
    System.out.println("Su vida es: "+hpm);
    }
public static void OpcionAtacar() throws IOException{
    //procedimiento para atacar segun a quien le haya tocado el turno
int numAleatorio3;
int numAleatorio10;
int dañoJugador;
//variables locales
Random aleatorionum3 = new Random();
Random aleatorionum10 = new Random();
if(quienAtaca==1){
    numAleatorio3=10+aleatorionum3.nextInt(11);
    dañoJugador=(((lvl+1)*10)+numAleatorio3);
    hpm=hpm-dañoJugador;
// procedimiento para hacerle daño al monstruo mediante numeros aleatorios
    if(monstruo==1){
        System.out.println("Le haz hecho daño a: "+nombreMonstruo);
        System.out.println("Su vida ahora es: "+hpm);
        OpcionVidaMonstruo();
        if(hp>0 && hpm>0){
            // si continua con vida el monstruo procede a cambiar el turno
        quienAtaca=2;
        }//fin condicional vida
    }//fin monstruo 1
    if(monstruo==2){
        System.out.println("Le haz hecho daño a: "+nombreMonstruo);
        System.out.println("Su vida ahora es: "+hpm);
        OpcionVidaMonstruo();        
        if(hp>0 && hpm>0){
             // si continua con vida el monstruo procede a cambiar el turno
        quienAtaca=2;
        }//fin condicional vida
    }//fin monstruo 2
    if(monstruo==3){
        System.out.println("Le haz hecho daño a: "+nombreMonstruo);
        System.out.println("Su vida ahora es: "+hpm);
        OpcionVidaMonstruo();    
        if(hp>0 && hpm>0){
             // si continua con vida el monstruo procede a cambiar el turno
        quienAtaca=2;
        }//fin condicional vida
    }//fin monstruo 3
}//fin si mayor 1


if(quienAtaca==2){
 numAleatorio10=(fa+lvl)+aleatorionum10.nextInt(10);
 hp=hp-numAleatorio10;
 //forma de bajarle vida al jugador mediante los valores del monstruo
    if(monstruo==1 && hp>0){
        System.out.println("Turno de: "+nombreMonstruo+", Pulsa enter");
        System.in.read();
        System.out.println("Te ha atacado: "+nombreMonstruo);
        System.out.println("Ahora tienes de vida: "+hp);
        OpcionVidaMonstruo();        
        if(hp>0){
            //si el jugador sigue con vida ejecuta esto
        quienAtaca=1;
        }//fin condicional vida
    }//fin si monstruo1
    if(monstruo==2 && hp>0){
        System.out.println("Turno de: "+nombreMonstruo+", Pulsa enter");
        System.in.read();
        System.out.println("Te ha atacado: "+nombreMonstruo);
        System.out.println("Ahora tienes de vida: "+hp);
        OpcionVidaMonstruo();        
        if(hp>0 && hpm>0){
             //si el jugador sigue con vida ejecuta esto
        quienAtaca=1;
        }//fin condicional vida
    }//fin si monstruo2
    if(monstruo==3 && hp>0){
        System.out.println("Turno de: "+nombreMonstruo+", Pulsa enter");
        System.in.read();
        System.out.println("Te ha atacado: "+nombreMonstruo);
        System.out.println("Ahora tienes de vida: "+hp);
        OpcionVidaMonstruo();        
        if(hp>0 && hpm>0){
             //si el jugador sigue con vida ejecuta esto
        quienAtaca=1;
        }//fin condicional vida
    }//fin monstruo3
}//fin si mayor 2
}//fin metodo opcion_atacar
public static void OpcionVidaJugador(){
    /* esta entra en accion cuando el jugador se queda sin vida
       reinicia estadisticas
    */
        if (hp<=0){
            System.out.println("Haz perdido la batalla");
            System.out.println("Tus estadisticas se reiniciaran");
            oro=100;
            exp=0;
            lvl=0;
            hp=100*(lvl+1);
            mp=10*(lvl+1);
            hipotion=0;
            potion=0;
            mpotion=0;
            monDerrot=0;
    }//fin si vida jugador
}//Termina opcion vida jugador
public static void OpcionVidaMonstruo(){
    /* esta entra en accion cuando el monstruo se queda sin vida
        Premia al jugador con oro y experiencia, ademas de darle un monstruo derrotado
    */
Random aleatoriooro = new Random();
Random aleatorioexp= new Random();
if(hpm<=0){
    System.out.println("Haz conseguido la victoria");
    oro=oro+(20+aleatoriooro.nextInt(10));
    exp=exp+(15+aleatorioexp.nextInt(30));
    monDerrot=monDerrot+1;
    //forma de premiar al jugador con valores aleatorios a excepcion de monstruos derrotados
    System.out.println("Haz ganado oro por la victoria, ahora  tienes: "+oro);
    System.out.println("Haz ganado experiencia por la victoria, ahora tienes : "+exp);
    System.out.println("Haz derrotado a un monstruo, en total haz derrotado a : "+monDerrot+" Monstruos");
    
}//Termina if vida monstruo
}//Termina opcion vida monstruo

public static void OpcionCurar(){
    // entra en accion cuando el jugador desea curarse en medio de una batalla
    int numAleatorio11;
    //variable local
    System.out.println("Te consumira un punto de mana");
    Random aleatorioopcioncurar = new Random();
    numAleatorio11=((lvl+1)*5) +(15+ aleatorioopcioncurar.nextInt(10));
    if(mp-1<0){
        System.out.println("No tienes suficiente Maná para curarte");  
        // si no tiene mana no se cura, pero no pierde el turno
    }else{
        if(hp+numAleatorio11>100*(lvl+1)){
        mp=mp-1;
        hp=100*(lvl+1);
        System.out.println("Te haz curado al máximo");
        System.out.println("Tu vida es: "+hp);
        quienAtaca=2;
        // si la formula da como vida una mayor a la que puede almacenar se le da el maximo nada mas
        }//termina un if menor
        else{
            hp=hp+numAleatorio11;
            System.out.println("Te haz curado");
            System.out.println("Ahora tu vida es: "+hp);
            quienAtaca=2;
            //forma en la que cura al jugador, mediante una formula que da numeros aleatorios, cambia el turno despues
        }//termina un else menor
    }//termina un else mayor



}//fin Opcion_curar
public static void OpcionItem(){
    //es llamada cuando el jugador quiere usar un item
    int item;
    //variable local
    Scanner scanneropcionitem = new Scanner(System.in);
    System.out.println("Escoge un item, pulsando el numero correspondiente");
    System.out.println("1.-Potion, tienes: "+potion);
    System.out.println("2.-Hi-Potion, tienes: "+hipotion);
    System.out.println("3.-M-Potion, tienes: "+mpotion);
    System.out.println("4.- Regresar");
    item=scanneropcionitem.nextInt();
    while(item!=4){
        switch(item){
            case 1: if(potion-1<0){
                    // si no tiene potions no se cura, no pierde el turno
                        System.out.println("No tienes Potions para usar");
                    }//Termina el if
                    else{
                    // si tiene items se cura y pierde el turno
                        potion=potion-1;
                        if(hp+25>100*(lvl+1)){
                            hp=100*(lvl+1);
                            System.out.println("Te haz curado al máximo");
                            quienAtaca=2;
                        }//termina un if menor
                        else{
                            // se cura si lo que da el item es menor o igual a su vida maxima
                            hp=hp+25;
                            System.out.println("Te haz curado 25 de hp");
                            System.out.println("Ahora tu vida es: "+hp);
                            quienAtaca=2;
                        }//Termina un else menor
                    }//Termina el else
                    break;
            case 2: if(hipotion-1<0){
                // si no tiene potions no se cura, no pierde el turno
                        System.out.println("No tienes Hi-Potions para usar");
                    }//Termina el if
                    else{
                        // si tiene mas vida de la que puede almacenar despues de usar el item, se ejecuta esto
                        hipotion=hipotion-1;
                        if(hp+75>100*(lvl+1)){
                            hp=100*(lvl+1);
                            System.out.println("Te haz curado al máximo");
                            quienAtaca=2;
                        }//Termina un if menor
                        else{
                            // si su vida mas lo del item es menor o igual a su vida maxima, se ejecuta esto, pierde el turno
                            hp=hp+75;
                            System.out.println("Te haz curado 75 de hp");
                            System.out.println("Ahora tu vida es: "+hp);
                            quienAtaca=2;
                        }//Termina un else menor
                    }//Termina el else
                    break;        
            case 3: if(mpotion-1<0){
                    // si no tiene potions no se cura, no pierde el turno
                        System.out.println("No tienes M-Potions para usar");
                    }//Termina el if
                    else{
                        mpotion=mpotion-1;
                        if(mp+10>10*(lvl+1)){
                            // si su mana mas el item es mas de lo que puede almacenar se ejecuta esto, termina su turno
                            mp=10*(lvl+1);
                            System.out.println("Tienes Maná máximo");
                            quienAtaca=2;
                        }//Termina un if menor
                        else{
                            // si su mana mas el item es menor a lo que puede almacenar se ejecuta esto, pierde el turno
                            mp=mp+10;
                            System.out.println("Tienes ahora 10 de mp extra");
                            System.out.println("Tu maná ahora es: "+mp);
                            quienAtaca=2;
                        }//Termina un else menor
                    }//Termina el else
                    break;
        }//Termina el switch
    item=4;
    // se ejecuta ya que al usar un item tiene que salir del menu y le toca al monstruo
    }//Termina el while
    if(item==4){
        System.out.println("Saliste del Menu Item");
        // desenvoca el menu item
    }//Termina el if
}//Termina el metodo opcion_item

public static void OpcionDePelea() throws IOException{
    //aparece cuando se llama a la carga en el menu principal, es el encargado de toda la pelea
    int aLaCarga;
    //variabel local
    clave=1;//clave de tengo miedo, para cuando se pulse dicho procedimiento termine la batalla, es un comodin
    while(hp>0 && hpm>0 && clave==1){
        // ciclo mientras tenga vida algun jugador y no le de a tengo miedo
    if(quienAtaca==1 && hp>0){
        Scanner scanneralacarga = new Scanner(System.in);
        System.out.println("");
        System.out.println("Jugador: "+nombreJugador);
        System.out.println("Vida: "+hp+   "   Maná: "+mp);
        System.out.println("Oro: "+oro+   "   Experiencia: "+exp+     "   Monstruos derrotados: "+monDerrot);
        System.out.println("");
        System.out.println("Monstruo: "+nombreMonstruo);
        System.out.println("Vida: "+hpm+     "   Factor de ataque: "+fa);
        System.out.println("");
        System.out.println("Es tu turno puedes escoger 4 opciones");
        System.out.println("1.-Atacar");
        System.out.println("2.-Curar");
        System.out.println("3.-Item");
        System.out.println("4.-Tengo miedo");
        aLaCarga = scanneralacarga.nextInt();
        // muestra todas las estadisticas de la batalla, en tiempo real
        if(aLaCarga==1){
        OpcionAtacar();
        // llama al procedimiento opcion atacar
        }
        if(aLaCarga==2){
           OpcionCurar();
           // llama al procedimiento opcion curar
        }
        if(aLaCarga==3){
            OpcionItem();
            //llama al procedimiento opcion item
        }
        if(aLaCarga==4){
            TengoMiedo();
            // llama al procedimiento tengo miedo
        
        }
        
    }
    if (quienAtaca==2){
        // cualquiera de estos procedimientos terminan aqui, a excepcion de tengo miedo
        OpcionAtacar();
        // llama otra vez al procedimiento opcion atacar pero ahora solo para el monstruo
    }
    }//Termina el while
    if(hp<=0){
        // comodin de cuando el monstruo mata al jugador
        System.out.println("Turno de: "+nombreMonstruo+", Pulsa enter");
        System.in.read();
        System.out.println("Te ha atacado: "+nombreMonstruo);
        System.out.println("Ahora tienes de vida: "+hp);
    }
            OpcionVidaJugador();
            /* esto se ejecuta cuando el monstruo mata al jugador
                reinicia las estadisticas
            */
    
}//termina el procedimiento opciones de pelea
public static void TengoMiedo(){
    //tengo miedo es para salir de la batalla a cambio de un poco de oro
        int numAleatorio9;
        // variable local
        Random aleatorionum9 = new Random();
	numAleatorio9=(lvl*2) + (5+aleatorionum9.nextInt(5));
        if(oro-numAleatorio9<0){
            System.out.println("No tienes suficiente oro para huir");
        }else{
            oro= oro-numAleatorio9;
            System.out.println("Tu oro se ha reducido, ahora tienes: "+oro);
            clave=0;
            //forma en la que se le reduce el oro por salir de la batalla
        }//termina el else
        
}//termina el procedimiento de tengo miedo

    public static void main(String[] args) throws IOException {
        //Menu principal
        int menuPrincipal, tipoNombre, nombrePredeterminado; 
        Scanner scannermenuprincipal = new Scanner(System.in);
        Scanner scannernombrejugador = new Scanner(System.in);
        Scanner scannertiponombre = new Scanner(System.in);
        Scanner scannernombrepredeterminado = new Scanner(System.in);
        System.out.println("Bienvenido a Ponky Smash");
        System.out.println("Escoge como quieres que sea tu nombre, pulsando el numero correspondiente: \n1.-Nombre Personalizado\n2.-Nombre Predeterminado");
        tipoNombre=scannertiponombre.nextInt();
        while(tipoNombre!=1 && tipoNombre!=2){
            // si no pulsa un numero valido aparece este ciclo
            System.out.println("Opcion no valida, pulsa el numero correspondiente");
            System.out.println("1.-Nombre Personalizado\n2.-Nombre Predeterminado");
            tipoNombre=scannertiponombre.nextInt();
        }
        if(tipoNombre==1){
            //guarda el nombre del jugador en memoria
        System.out.println("Dinos cual es tu nombre");
        nombreJugador=scannernombrejugador.nextLine();
        }else{
            System.out.println("Escoge uno de los predeterminados, pulsando el numero correspondiente: \n1.-TaserFace\n2.-Ash\n3.-StarLord");
        nombrePredeterminado=scannernombrepredeterminado.nextInt();
        while(nombrePredeterminado!=1 && nombrePredeterminado!=2 && nombrePredeterminado!=3){
            // ciclo que aparece cuando no pulsa un numero indicado
            System.out.println("Opcion no valida, pulsa el numero correspondiente");
            System.out.println("1.-TaserFace\n2.-Ash\n3.-StarLord");
            nombrePredeterminado=scannernombrepredeterminado.nextInt();
        }
        if(nombrePredeterminado==1){
            nombreJugador= "TaserFace";
        }
        if(nombrePredeterminado==2){
            nombreJugador= "Ash";
        }
        if(nombrePredeterminado==3){
            nombreJugador= "StarLord";
        }
        // las 3 opciones de nombres predeterminados
        }
        System.out.println("PONKY SMASH");
        System.out.println("Bienvenido a esta aventura, "+nombreJugador);
        System.out.println("");
        System.out.println("Escoge a donde quieres ir:");
        System.out.println("1.- A la Carga\n2.- Tienda\n3.- ZZzzZZzz\n4.- Status\n5.- Más Poder\n6.- Salir del juego");
        menuPrincipal= scannermenuprincipal.nextInt();
        while(menuPrincipal!=1 && menuPrincipal!=2 && menuPrincipal!=3 && menuPrincipal!=4 && menuPrincipal!=5 && menuPrincipal!=6){
            System.out.println("Opcion no valida, por favor pulsa un numero asignado, pulsa enter");
            System.in.read();
            System.out.println("PONKY SMASH");
            System.out.println("1.- A la Carga\n2.- Tienda\n3.- ZZzzZZzz\n4.- Status\n5.- Más Poder\n6.- Salir del juego");
            menuPrincipal= scannermenuprincipal.nextInt();
        }
        while(menuPrincipal!=6){
        switch(menuPrincipal){
            case 1: System.out.println("Bienvenido al menú A La Carga, tu enemigo sera escogido aleatoriamente entre 3 Monstruos distintos");
            IniciarDatosDeJuego();
            // llama a iniciar los datos de turno y monstruo aleatorio
            OpcionDePelea();
            //llama al procedimiento donde se ejecuta toda la pelea
                System.out.println("Pulsa enter");
                System.in.read();
                System.out.println("Escoge a donde quieres ir");
                System.out.println("PONKY SMASH");
                System.out.println("MENU PRINCIPAL");
                System.out.println("1.- A la Carga\n2.- Tienda\n3.- ZZzzZZzz\n4.- Status\n5.- Más Poder\n6.- Salir del juego");
                //comodin para el menu principal
                menuPrincipal= scannermenuprincipal.nextInt();
                while(menuPrincipal!=1 && menuPrincipal!=2 && menuPrincipal!=3 && menuPrincipal!=4 && menuPrincipal!=5 && menuPrincipal!=6){
                      System.out.println("Opcion no valida, por favor pulsa un numero asignado, pulsa enter");
                      System.in.read();
                      System.out.println("PONKY SMASH");
                      System.out.println("1.- A la Carga\n2.- Tienda\n3.- ZZzzZZzz\n4.- Status\n5.- Más Poder\n6.- Salir del juego");
                      menuPrincipal= scannermenuprincipal.nextInt();
                }break;
            case 2: System.out.println("Bienvenido a la Tienda, puedes utilizar tu oro para comprar articulos utiles para la batalla, claro siempre y cuando tengas el oro suficiente");
            Tienda();
            // llama al procedimiento tienda
                System.out.println("Escoge a donde quieres ir");
                System.out.println("Pulsa enter");
                System.in.read();
                System.out.println("PONKY SMASH");
                System.out.println("MENU PRINCIPAL");
                System.out.println("1.- A la Carga\n2.- Tienda\n3.- ZZzzZZzz\n4.- Status\n5.- Más Poder\n6.- Salir del juego");
                //comodin para el menu principal
                menuPrincipal= scannermenuprincipal.nextInt();
                while(menuPrincipal!=1 && menuPrincipal!=2 && menuPrincipal!=3 && menuPrincipal!=4 && menuPrincipal!=5 && menuPrincipal!=6){
                      System.out.println("Opcion no valida, por favor pulsa un numero asignado, pulsa enter");
                      System.in.read();
                      System.out.println("PONKY SMASH");
                      System.out.println("1.- A la Carga\n2.- Tienda\n3.- ZZzzZZzz\n4.- Status\n5.- Más Poder\n6.- Salir del juego");
                      menuPrincipal= scannermenuprincipal.nextInt();
                  }break;
            case 3: System.out.println("Bienvenido a la opcion ZZzzZZzz, te preguntaras que significa eso, pues bien, esta sirve para poder poner a descansar a tu personaje herido en batalla para que recupere al maximo su salud y maná"); 
            ZZzzZZzz();
            // llama al procedimiento ZZzzZZzz
                System.out.println("Escoge a donde quieres ir");
                System.out.println("Pulsa enter");
                System.in.read();
                System.out.println("PONKY SMASH");
                System.out.println("MENU PRINCIPAL");
                System.out.println("1.- A la Carga\n2.- Tienda\n3.- ZZzzZZzz\n4.- Status\n5.- Más Poder\n6.- Salir del juego");
                //comodin para el menu principal 
                menuPrincipal= scannermenuprincipal.nextInt();
                while(menuPrincipal!=1 && menuPrincipal!=2 && menuPrincipal!=3 && menuPrincipal!=4 && menuPrincipal!=5 && menuPrincipal!=6){
                   System.out.println("Opcion no valida, por favor pulsa un numero asignado, pulsa enter");
                   System.in.read();
                   System.out.println("PONKY SMASH");
                   System.out.println("1.- A la Carga\n2.- Tienda\n3.- ZZzzZZzz\n4.- Status\n5.- Más Poder\n6.- Salir del juego");
                   menuPrincipal= scannermenuprincipal.nextInt();
                }break;
            case 4: System.out.println("Bienvenido a la opcion Status. Aquí podras ver todo sobre tu personaje"); 
            Status();   
            //llama al procedimiento status
                System.out.println("Escoge a donde quieres ir");
                System.out.println("Pulsa enter");
                System.in.read();
                System.out.println("PONKY SMASH");
                System.out.println("MENU PRINCIPAL");
                System.out.println("1.- A la Carga\n2.- Tienda\n3.- ZZzzZZzz\n4.- Status\n5.- Más Poder\n6.- Salir del juego");
                //comodin para el menu principal
                menuPrincipal= scannermenuprincipal.nextInt();
                while(menuPrincipal!=1 && menuPrincipal!=2 && menuPrincipal!=3 && menuPrincipal!=4 && menuPrincipal!=5 && menuPrincipal!=6){
                     System.out.println("Opcion no valida, por favor pulsa un numero asignado, pulsa enter");
                     System.in.read();
                     System.out.println("PONKY SMASH");
                     System.out.println("1.- A la Carga\n2.- Tienda\n3.- ZZzzZZzz\n4.- Status\n5.- Más Poder\n6.- Salir del juego");
                     menuPrincipal= scannermenuprincipal.nextInt();
                }break;
            case 5: System.out.println("Bienvenido a la opcion Más Poder. Aquí podrás subir tu nivel de personaje siempre y cuando tengas la experiencia necesaria, esta no te sera consumida, pero necesitaras siempre 100 puntos adicionales para avanzar al siguiente nivel. ¡Buena Suerte!"); 
            MasPoder();  
            //llama al procedimiento mas poder
                System.out.println("Escoge a donde quieres ir");
                System.out.println("Pulsa enter");
                System.in.read();
                System.out.println("PONKY SMASH");
                System.out.println("MENU PRINCIPAL");
                System.out.println("1.- A la Carga\n2.- Tienda\n3.- ZZzzZZzz\n4.- Status\n5.- Más Poder\n6.- Salir del juego");
                //comodin para el menu principal 
                menuPrincipal= scannermenuprincipal.nextInt();
                while(menuPrincipal!=1 && menuPrincipal!=2 && menuPrincipal!=3 && menuPrincipal!=4 && menuPrincipal!=5 && menuPrincipal!=6){
                     System.out.println("Opcion no valida, por favor pulsa un numero asignado, pulsa enter");
                     System.in.read();
                     System.out.println("PONKY SMASH");
                     System.out.println("1.- A la Carga\n2.- Tienda\n3.- ZZzzZZzz\n4.- Status\n5.- Más Poder\n6.- Salir del juego");
                     menuPrincipal= scannermenuprincipal.nextInt();
                }break;
            
        }//termina el swtich   
        }//termina el while
        if(menuPrincipal==6){
            // aqui desenglosa todo el juego
            System.out.println("Estas terminando el juego");
            System.out.println("Pulsa enter");
            System.in.read();
            System.out.println("Gracias por jugar a PONKY SMASH, "+nombreJugador);
        }// fin del juego
    }//termina el main
}//termina la clase menu principal