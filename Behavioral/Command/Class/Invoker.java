package Behavioral.Command.Class;

import Behavioral.Command.Interfaces.IOperation;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<IOperation> operations = new ArrayList<>();

    public void getOperations (IOperation operation){
        this.operations.add(operation);
    }
    public void operate(){
        this.operations.forEach(operation -> operation.execute());
        this.operations.clear();
    }
}
