import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private ArrayList <Integer> a;
 private int b, c, d;
 public StepTracker(int mSteps){
  a = new ArrayList<Integer>();
  b = 0;
  c = mSteps;
  d = 0;
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
  for(int i = 0; i < a.size(); i++)
    d += a.get(i);
  return (double) d/a.size();
 }
} 
