package OOPSeminar6.Solid2Srp2.src.solid.srp.models;

import java.io.FileWriter;
import java.io.IOException;

public class PersisterOrder {
    String path;

    public PersisterOrder(String path) {
        this.path = path;
    }

    public void saveToJson(Order order) {

        try (FileWriter writer = new FileWriter(path, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+order.getQnt()+",\n");
            writer.write("\"price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
