import java.time.LocalDateTime;

public class Land {
    // 核心属性
    private Crop crop;            // 种植的作物对象
    private LocalDateTime plantTime;   // 种植时间戳
    private LocalDateTime waterTime;   // 浇水时间戳

    // 1. 种植方法（空方法体）
    public void plant(Crop crop) {

    }

    // 2. 收获方法
    public boolean harvest() {
        return false;
    }

    // 3. 浇水方法
    public void water() {

    }

    // 4. 获取当前生长阶段
    public int getGrowthStage() {
        return 0;
    }

    // 空作物占位类
    static class Crop {}
}