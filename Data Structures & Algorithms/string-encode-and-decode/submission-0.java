class Solution {

    public String encode(List<String> strs) {
String res="";
for(String s:strs){
  res+=s.length()+"#"+s;
}
return res;
    }

    public List<String> decode(String s) {
List<String>res=new ArrayList<>();
int i =0;
while(i<s.length()){
  int j =i;
  while(s.charAt(j)!='#'){
    j++;
  }
  int len=Integer.parseInt(s.substring(i,j));
  i=j+1;
  res.add(s.substring(i,i+len));
  i=i+len;
}
   return res; }
}
