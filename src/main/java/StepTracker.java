import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private ArrayList <Integer> a;
 private int b, c;
 public StepTracker(int mSteps){
  a = new ArrayList<Integer>();
  b = 0;
  c = mSteps;
 }
 public void addDailySteps(int dSteps){
  a.add(dSteps);
  if(dSteps >= c)
   b++;
 }
 public int activeDays(){
  return b;
 }
 public double averageSteps(){
  int d = 0;
  for(int i = 0; i < a.size(); i++)
    d += a.get(i);
  if(d == 0)
    return 0.0;  
  return (double) d/a.size();
 }
} 
