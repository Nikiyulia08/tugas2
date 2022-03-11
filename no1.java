
import java.util.LinkedList;
public class no1 {
    public static void main(String[]args){
        LinkedList<String> names = new LinkedList<String>();
        //Nama Lengkap saya
        names.add("N");
        names.add("I");
        names.add("K");
        names.add("I");
        names.add("");
        names.add("Y");
        names.add("U");
        names.add("L");
        names.add("I");
        names.add("A");
        names.add("");
        names.add("N");
        names.add("A");
        names.add("D");
        names.add("A");
        System.out.println("Nama Lengkap Saya :   " + names+", Ukuran : "+names.size());

        //Add karakter lain
        names.addFirst("A");   
        names.addLast("N");
        System.out.println("Nama Saya setelah ditambah : "+names+", Ukuran :" +names.size());

        names.add("O");
        names.add("E");
        names.addAll(names);
        System.out.println("Nama saya setelah ditambah :"+names+", Ukuran :" +names.size());

        //set karakter lain
        names.set(0,"D");
        names.set(8,"U");
        System.out.println("Nama Saya setelah disisipkan:"+names+", Ukuran :" +names.size());

        //delete linked list
        names.removeFirst();
        names.removeLast();
        System.out.println("Nama Saya setelah penghapusan:"+names+", Ukuran :" +names.size());
        
        names.remove(4);
        System.out.println("Nama Saya setelah penghapusan:"+names+", Ukuran :" +names.size());

        //Fungsi POP
        names.pop();
        names.pop();
        System.out.println("Nama Saya setelah POP:"+names+", Ukuran :" +names.size());

        //Fungsi PUSH
        names.push("B");
        names.push("P");
        System.out.println("Nama Saya setelah PUSh:"+names+", Ukuran :" +names.size());




    }

    
}
