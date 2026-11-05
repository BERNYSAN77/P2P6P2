//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    TarjetaMetro tarjeta = new TarjetaMetro();
    TarjetaMetro tarjeta2 = new TarjetaMetro();
    TarjetaMetro tarjeta3 = new TarjetaMetro();
    TarjetaMetro tarjeta4 = new TarjetaMetro();
    TarjetaMetro tarjeta5 = new TarjetaMetro();

    TarjetaMetro tarjetas[] = new TarjetaMetro[]{};

    for (int i = 0; i < tarjetas.length; i++){
        tarjetas[i] = new TarjetaMetro(i);
    }

    System.out.println(tarjetas);
    for (int j = 0; j < tarjetas.length; j++){
        System.out.println(j);
        System.out.println(tarjetas[j].saldo);
    }
}
