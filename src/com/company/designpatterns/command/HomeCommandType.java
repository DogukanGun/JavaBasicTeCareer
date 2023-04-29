package com.company.designpatterns.command;

public enum HomeCommandType {

    //Constant = private final gibi.
    //Kod okunabilirliğini arttırmak için değişmeyen static,final constantlar olarak enum kullanılır.
    /*Requestten gelen anlamsız değerler(1,2,3 gibi) yerine  CREATE_APARTMENT,
        CREATE_HOME_WITH_GARAGE,
        CREATE_HOME_WITH_GARDEN gibi enumdaki elemanlar kullanılabilir.*/

    CREATE_APARTMENT,
    CREATE_HOME_WITH_GARAGE,
    CREATE_HOME_WITH_GARDEN



}
