/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.tablas;

import controlador.tda.Cola.ColaService;
import javax.swing.table.AbstractTableModel;
import modelo.Comandos;

/**
 *
 * @author John
 */
public class TablaComandos extends AbstractTableModel {

    private ColaService lista;

    public ColaService getLista() {
        return lista;
    }

    public void setLista(ColaService lista) {
        this.lista = lista;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public int getRowCount() {
        return lista.getSize();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nro";
            case 1:
                return "Comando";
            case 2:
                return "Fecha";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int arg0, int arg1) {
        Comandos autor = (Comandos) lista.obtenerDato(arg0);
        switch (arg1) {
            case 0:
                return (arg0 + 1);
            case 1:
                return autor.getComando();
            case 2:
                return autor.getFecha();
            default:
                return null;
        }
    }
}
