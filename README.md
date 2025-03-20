# DSA Assignment: 

## Question 1:

### Big O Notation

**Big O Notation** - Is used to describe the time complexity or space complexity of an algorithm.

#### Common Time Complexities

##### 1. **O(1) - Constant Time**
   - Regardless of the magnitude of the input, the time complexity stays the same.
   - **Example:**
     ```javascript
     function getFirstElement(arr) {
         return arr[0];  // O(1) operation
     }
     ```
##### 2. **O(n) - Linear Time**
   - As the size of the input increases, so does the temporal complexity.
   - **Example:**
     ```javascript
     function printAllElements(arr) {
         for (let i = 0; i < arr.length; i++) {
             console.log(arr[i]);
         }
     }
     ```

##### 3. **O(n²) - Quadratic Time**
   - As the size of the input increases, the time complexity rises quadratically.
   - **Example:**
     ```javascript
     function printAllPairs(arr) {
         for (let i = 0; i < arr.length; i++) {
             for (let j = 0; j < arr.length; j++) {
                 console.log(arr[i], arr[j]);
             }
         }
     }
     ```
     
##### 4. **O(log n) - Logarithmic Time**
   - As the input size grows, the time complexity rises logarithmically.
   - **Example:**
     ```javascript
     function binarySearch(arr, target) {
         let low = 0, high = arr.length - 1;
         while (low <= high) {
             let mid = Math.floor((low + high) / 2);
             if (arr[mid] === target) return mid;
             if (arr[mid] < target) low = mid + 1;
             else high = mid - 1;
         }
         return -1;
     }
     ```
     
#####5. **O(2^n) - Exponential Time**
   -As the size of the input increases, the time complexity increases exponentially.
   - **Example:**
     ```javascript
     function fibonacci(n) {
         if (n <= 1) return n;
         return fibonacci(n - 1) + fibonacci(n - 2);
     }
     ```
## Question 2:

### Comparison Between Arrays and Linked Lists

#### 1. **Memory Allocation**

##### **Arrays**:
- Contiguous blocks of memory are allocated by arrays.

##### **Linked Lists**:
- Each node's memory is allocated by linked lists in **non-contiguous** blocks.
  
#### 2. **Performance**

##### **Arrays**:
- **Access Time**: Arrays provide **constant time access** (O(1)) to elements due to the contiguous memory layout.
- **Memory Efficiency**: Arrays can suffer from unused memory if the array is underutilized.

##### **Linked Lists**:
- **Access Time**: Accessing elements takes **linear time** (O(n)) because you need to traverse the list from the head to the desired node.
- **Memory Efficiency**: Linked lists use extra memory for pointers in each node, but they are efficient in terms of space.

#### 3. **Insertion and Deletion Operations**

##### **Arrays**:
- **Insertion**: Inserting an element in an array requires shifting elements, resulting in O(n) time complexity in the worst case.

##### **Linked Lists**:
- **Insertion**: Inserting an element in a linked list is O(1) at the head or tail.

