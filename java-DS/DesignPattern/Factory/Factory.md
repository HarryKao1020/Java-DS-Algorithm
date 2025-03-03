# Factory Pattern 教學

Factory Pattern（工廠模式）是一種創建型設計模式，它提供了一種創建對象的最佳方式。在工廠模式中，我們創建對象時不會對客戶端暴露創建邏輯，而是通過一個共同的接口來指向新創建的對象。

工廠模式主要分為三種：

1. 簡單工廠模式（Simple Factory）
2. 工廠方法模式（Factory Method）
3. 抽象工廠模式（Abstract Factory）

## 1. 簡單工廠模式（Simple Factory）

簡單工廠模式是最基本的工廠模式，它不屬於 GoF（Gang of Four）的 23 種設計模式，但卻是工廠方法模式的基礎。

### 基本結構：

```java
// 產品接口
interface Product {
    void operation();
}

// 具體產品 A
class ConcreteProductA implements Product {
    @Override
    public void operation() {
        System.out.println("ConcreteProductA operation");
    }
}

// 具體產品 B
class ConcreteProductB implements Product {
    @Override
    public void operation() {
        System.out.println("ConcreteProductB operation");
    }
}

// 簡單工廠
class SimpleFactory {
    public static Product createProduct(String type) {
        if ("A".equals(type)) {
            return new ConcreteProductA();
        } else if ("B".equals(type)) {
            return new ConcreteProductB();
        }
        return null;
    }
}
```

### 使用示例：

```java
public class Client {
    public static void main(String[] args) {
        // 使用簡單工廠創建產品 A
        Product productA = SimpleFactory.createProduct("A");
        productA.operation();  // 輸出: ConcreteProductA operation
        
        // 使用簡單工廠創建產品 B
        Product productB = SimpleFactory.createProduct("B");
        productB.operation();  // 輸出: ConcreteProductB operation
    }
}
```

### 優點：
- 將創建邏輯集中到一個類中，使客戶端與具體產品解耦
- 客戶端不需要知道具體產品類的名稱

### 缺點：
- 違反開閉原則：增加新產品時需要修改工廠類
- 工廠類職責過重，不易維護

## 2. 工廠方法模式（Factory Method）

工廠方法模式定義了一個創建對象的接口，但由子類決定實例化的類是哪一個。工廠方法讓類的實例化推遲到子類中進行。

### 基本結構：

```java
// 產品接口
interface Product {
    void operation();
}

// 具體產品 A
class ConcreteProductA implements Product {
    @Override
    public void operation() {
        System.out.println("ConcreteProductA operation");
    }
}

// 具體產品 B
class ConcreteProductB implements Product {
    @Override
    public void operation() {
        System.out.println("ConcreteProductB operation");
    }
}

// 工廠接口
interface Factory {
    Product createProduct();
}

// 具體工廠 A
class ConcreteFactoryA implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

// 具體工廠 B
class ConcreteFactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
```

### 使用示例：

```java
public class Client {
    public static void main(String[] args) {
        // 使用具體工廠 A 創建產品
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.createProduct();
        productA.operation();  // 輸出: ConcreteProductA operation
        
        // 使用具體工廠 B 創建產品
        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.createProduct();
        productB.operation();  // 輸出: ConcreteProductB operation
    }
}
```

### 優點：
- 符合開閉原則：增加新產品只需添加新的工廠類和產品類
- 每個具體工廠類只負責創建對應的產品
- 客戶端不需要知道具體產品類的類名

### 缺點：
- 相比簡單工廠，需要創建更多的類
- 增加了系統的抽象性和理解難度

## 3. 抽象工廠模式（Abstract Factory）

抽象工廠模式提供一個創建一系列相關或相互依賴對象的接口，而無需指定它們具體的類。

### 基本結構：

```java
// 產品 A 接口
interface ProductA {
    void operationA();
}

// 產品 B 接口
interface ProductB {
    void operationB();
}

// 具體產品 A1
class ConcreteProductA1 implements ProductA {
    @Override
    public void operationA() {
        System.out.println("ConcreteProductA1 operationA");
    }
}

// 具體產品 A2
class ConcreteProductA2 implements ProductA {
    @Override
    public void operationA() {
        System.out.println("ConcreteProductA2 operationA");
    }
}

// 具體產品 B1
class ConcreteProductB1 implements ProductB {
    @Override
    public void operationB() {
        System.out.println("ConcreteProductB1 operationB");
    }
}

// 具體產品 B2
class ConcreteProductB2 implements ProductB {
    @Override
    public void operationB() {
        System.out.println("ConcreteProductB2 operationB");
    }
}

// 抽象工廠接口
interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

// 具體工廠 1，創建產品系列 1
class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }
    
    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

// 具體工廠 2，創建產品系列 2
class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }
    
    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
```

### 使用示例：

```java
public class Client {
    public static void main(String[] args) {
        // 使用工廠 1 創建產品系列 1
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();
        productA1.operationA();  // 輸出: ConcreteProductA1 operationA
        productB1.operationB();  // 輸出: ConcreteProductB1 operationB
        
        // 使用工廠 2 創建產品系列 2
        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        productA2.operationA();  // 輸出: ConcreteProductA2 operationA
        productB2.operationB();  // 輸出: ConcreteProductB2 operationB
    }
}
```

### 優點：
- 保證客戶端使用的產品是同一個產品族的
- 符合開閉原則：增加產品族只需增加新的工廠類
- 有利於產品的一致性

### 缺點：
- 增加新的產品等級結構麻煩，需要修改抽象工廠接口及其所有實現類
- 比工廠方法模式更加複雜

## 實際應用示例：飲料工廠

這是一個飲料工廠的例子，使用工廠方法模式：

```java
// 飲料接口
interface Beverage {
    void prepare();
    void serve();
}

// 咖啡
class Coffee implements Beverage {
    @Override
    public void prepare() {
        System.out.println("研磨咖啡豆，沖泡咖啡");
    }
    
    @Override
    public void serve() {
        System.out.println("在杯子裡加入糖和牛奶，端上來");
    }
}

// 茶
class Tea implements Beverage {
    @Override
    public void prepare() {
        System.out.println("將茶葉放入茶壺中，加入熱水");
    }
    
    @Override
    public void serve() {
        System.out.println("將茶倒入杯中，加入檸檬，端上來");
    }
}

// 飲料工廠接口
interface BeverageFactory {
    Beverage createBeverage();
}

// 咖啡工廠
class CoffeeFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Coffee();
    }
}

// 茶工廠
class TeaFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Tea();
    }
}

// 咖啡廳
class Cafe {
    private BeverageFactory factory;
    
    public Cafe(BeverageFactory factory) {
        this.factory = factory;
    }
    
    public void serveBeverage() {
        Beverage beverage = factory.createBeverage();
        beverage.prepare();
        beverage.serve();
    }
}

// 測試
public class BeverageTest {
    public static void main(String[] args) {
        // 咖啡廳準備咖啡
        Cafe coffeeCafe = new Cafe(new CoffeeFactory());
        System.out.println("===咖啡準備===");
        coffeeCafe.serveBeverage();
        
        System.out.println();
        
        // 咖啡廳準備茶
        Cafe teaCafe = new Cafe(new TeaFactory());
        System.out.println("===茶準備===");
        teaCafe.serveBeverage();
    }
}
```

輸出：
```
===咖啡準備===
研磨咖啡豆，沖泡咖啡
在杯子裡加入糖和牛奶，端上來

===茶準備===
將茶葉放入茶壺中，加入熱水
將茶倒入杯中，加入檸檬，端上來
```

## 工廠模式的使用場景

1. **當客戶端不需要知道它所創建的對象的具體類時**
    - 例如：數據庫驅動加載，客戶端只需指定數據庫類型

2. **當客戶端需要的對象有複雜的創建過程時**
    - 例如：需要特殊配置的對象

3. **當系統需要處理多種類型的對象，並且這些對象會頻繁地變更時**
    - 例如：插件系統、主題切換

4. **當需要隔離對象的使用和創建時**
    - 例如：資源池管理

## 總結

- **簡單工廠**：一個工廠類負責創建所有產品，簡單但不易擴展
- **工廠方法**：定義創建對象的接口，但由子類決定實例化的類
- **抽象工廠**：提供一個創建一系列相關對象的接口，而無需指定具體類

工廠模式將對象的創建與使用分離，使系統更加靈活，可維護性更高。在實際應用中，可以根據需求選擇合適的工廠模式。