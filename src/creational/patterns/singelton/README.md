## Singleton

#### List of types 
1. Not a lazy Singleton
    - Static field
    - Enum singleton
2. Lazy Singleton
    - Synchronized Accessor
    - Double Checked Locking & volatile
3. On Demand Holder idiom
    - On Demand Holder idiom
    
#### Summary
1. Use a normal (not lazy) initialization wherever possible;
2. Use On Demand Holder idiom use for static fields;
3. Use Double Chedked Lock & volatile idiom for simple field;
4. In all other cases use Syncronized accessor;    