//Assigning a Literal That Is Too Large for the Variable
//byte a = 128; // byte can only hold up to 127
byte a = (byte)128;
byte b = 3;
b += 7; 			// No problem - adds 7 to b (result is 10)
b = (byte) (b + 7); // Won't compile without the
                    // cast, since b + 7 results in an int