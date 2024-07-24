if(v.getInventory().amountInInventory(1937,14,14) && v.getInventory().amountInInventory(1987,14,14)) {
    if(v.getBank().isOpen()) {
        v.getBank().close();
    } else {
        if(v.getLocalPlayer().hasAnimation(-1)) {
            Widget muliSkillMenu = client.getWidget(270,0);
            if(muliSkillMenu != null) { 
                v.invoke("Make","<col=ff9040>Unfermented wine</col>",1,57,-1,17694734,false);
            } else {
                v.invoke("Use","<col=ff9040>Jug of water</col>",0,25,12,9764864,false);
                v.invoke("Use","<col=ff9040>Jug of water</col><col=ffffff> -> <col=ff9040>Grapes</col>",0,58,16,9764864,false);
            }
        }
    }
} else {
    if(v.getInventory().amountInInventory(1995,14,14)) {
        v.getBank().depositAll();
    } else {
        if(!v.getInventory().amountInInventory(1937,1,14)) {
            v.getBank().withdraw(1937,1);
        } else if(!v.getInventory().amountInInventory(1987,1,14)) {
            v.getBank().withdraw(1987,1);
        }
    }
}