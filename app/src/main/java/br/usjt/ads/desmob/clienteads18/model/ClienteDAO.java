package br.usjt.ads.desmob.clienteads18.model;

public class ClienteDAO {

    private static Cliente[] clientes;

    private ClienteDAO(){}

    public static Cliente[] getClientes(){

        if(clientes == null){

            clientes = new Cliente[15];

            clientes[0] = new Cliente(1,"O Homem nas Trevas", "ho@usjt.br", "Fede Alvarez", "08/06/2016");
            clientes[1] = new Cliente(2,"Chamas da Vingança", "cv@usjt.br","Tony Scott" ,"08/10/2004");
            clientes[2] = new Cliente(3,"Tróia, Aquiles Lindo" ,"tr@usjt.br","Wolfgang" , "14/05/2004");
            clientes[3] = new Cliente(4,"Guerra Infinita", "gi@usjt.br" ,"Irmãos Russo" , "26/04/2018");
            clientes[4] = new Cliente(5,"Invocação do Mal", "im@usjt.br" ,"James Wan" , "13/09/2013");
            clientes[5] = new Cliente(6,"Ananabelle do Capiroto", "ab@usjt.br" ,"John Leonetti" , "09/10/2014");
            clientes[6] = new Cliente(7,"Pantera Negra", "pn@usjt.br" ,"Ryan Coogle" , "15/02/2018");
            clientes[7] = new Cliente(8,"Sem Dor, Sem Ganho", "sd@usjt.br" ,"Michael Bay" , "23/08/2013");
            clientes[8] = new Cliente(9,"Inferno Hell", "if@usjt.br" ,"Ron Woward" , "13/10/2016");
            clientes[9] = new Cliente(10, "Thror Ragnarok", "thror@usjt.br", "Taika Waitifi", "26/10/2017");
            clientes[10] = new Cliente(11, "O Incrivel Hulk", "hulk@usjt.br", "Stan Lee", "01/01/1960");
            clientes[11] = new Cliente(12, "O Quarto do Pânico", "quarto@usjt.br", "David Fincher", "07/02/2002");
            clientes[12] = new Cliente(13, "Era de Ultron", "ultron@usjt.br", "Joss Whedon", "23/04/2015");
            clientes[13] = new Cliente(14, "A Freira", "freira@usjt.br", "Corin Hardy", "06/09/2018");
            clientes[14] = new Cliente(15, "Slender Man", "slender@usjt.br", "Sylvain White", "23/08/2018");
        }
        return clientes;
    }
}