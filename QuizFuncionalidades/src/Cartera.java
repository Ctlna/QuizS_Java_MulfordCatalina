import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Cartera {
    private List<Book> tarjeta;

    public Cartera(List<Book> tarjeta) {
        this.tarjeta = new ArrayList<>();
    }

    public List<Book> getTarjeta() {
        return tarjeta;
    }

    public void addBook(Book book){
        tarjeta.add(book);
    }

    public void setTarjeta(List<Book> tarjeta) {
        this.tarjeta = tarjeta;
    }
    public void imprimirListaDeTarjetas(){
        System.out.println(Tarjeta.getTarjeta().get(0));


    }
}