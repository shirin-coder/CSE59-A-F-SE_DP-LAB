
interface OptimizableModel{
    void quantize();
}

class ResNet18 implements OptimizableModel{
    public void quantize(){
        System.out.println("Applying int8 quantization for ResNet-18.");
    }
}

class MobileNet implements OptimizableModel{
    public void quantize(){
        System.out.println("Applying dynamic quantization for MobileNet.");
    }
}

class InferenceEngine{
    public void OptimizableModel(OptimizableModel model){
        model.quantize();
    }
}

public class Main4{
    public static void main(String[] args) {
        InferenceEngine engine = new InferenceEngine();
        OptimizableModel resnet = new ResNet18();
        engine.OptimizableModel(resnet);
        OptimizableModel mobile = new ResNet18();
        engine.OptimizableModel(mobile);
        
        
    }
}
