package javascript.cached;

import java.io.IOException;
import java.io.StringReader;

import org.eclipse.imp.pdb.facts.type.TypeFactory;
import org.eclipse.imp.pdb.facts.IConstructor;
import org.eclipse.imp.pdb.facts.ISourceLocation;
import org.eclipse.imp.pdb.facts.IValue;
import org.eclipse.imp.pdb.facts.IValueFactory;
import org.eclipse.imp.pdb.facts.exceptions.FactTypeUseException;
import org.eclipse.imp.pdb.facts.io.StandardTextReader;
import org.rascalmpl.parser.gtd.stack.*;
import org.rascalmpl.parser.gtd.stack.filter.*;
import org.rascalmpl.parser.gtd.stack.filter.follow.*;
import org.rascalmpl.parser.gtd.stack.filter.match.*;
import org.rascalmpl.parser.gtd.stack.filter.precede.*;
import org.rascalmpl.parser.gtd.preprocessing.ExpectBuilder;
import org.rascalmpl.parser.gtd.util.IntegerKeyedHashMap;
import org.rascalmpl.parser.gtd.util.IntegerList;
import org.rascalmpl.parser.gtd.util.IntegerMap;
import org.rascalmpl.values.ValueFactoryFactory;
import org.rascalmpl.values.uptr.Factory;

@SuppressWarnings("all")
public class SweeterJSCachedParser extends org.rascalmpl.parser.gtd.SGTDBF<IConstructor, IConstructor, ISourceLocation> {
  protected final static IValueFactory VF = ValueFactoryFactory.getValueFactory();

  protected static IValue _read(java.lang.String s, org.eclipse.imp.pdb.facts.type.Type type) {
    try {
      return new StandardTextReader().read(VF, org.rascalmpl.values.uptr.Factory.uptr, type, new StringReader(s));
    }
    catch (FactTypeUseException e) {
      throw new RuntimeException("unexpected exception in generated parser", e);  
    } catch (IOException e) {
      throw new RuntimeException("unexpected exception in generated parser", e);  
    }
  }
	
  protected static java.lang.String _concat(java.lang.String ...args) {
    int length = 0;
    for (java.lang.String s :args) {
      length += s.length();
    }
    java.lang.StringBuilder b = new java.lang.StringBuilder(length);
    for (java.lang.String s : args) {
      b.append(s);
    }
    return b.toString();
  }
  protected static final TypeFactory _tf = TypeFactory.getInstance();
 
  private static final IntegerMap _resultStoreIdMappings;
  private static final IntegerKeyedHashMap<IntegerList> _dontNest;
	
  protected static void _putDontNest(IntegerKeyedHashMap<IntegerList> result, int parentId, int childId) {
    IntegerList donts = result.get(childId);
    if (donts == null) {
      donts = new IntegerList();
      result.put(childId, donts);
    }
    donts.add(parentId);
  }
    
  protected int getResultStoreId(int parentId) {
    return _resultStoreIdMappings.get(parentId);
  }
    
  protected static IntegerKeyedHashMap<IntegerList> _initDontNest() {
    IntegerKeyedHashMap<IntegerList> result = new IntegerKeyedHashMap<IntegerList>(); 
    
    
    
    
    _putDontNest(result, 399, 430);
    
    _putDontNest(result, 399, 447);
    
    _putDontNest(result, 399, 452);
    
    _putDontNest(result, 399, 459);
    
    _putDontNest(result, 399, 466);
    
    _putDontNest(result, 399, 471);
    
    _putDontNest(result, 399, 476);
    
    _putDontNest(result, 399, 483);
    
    _putDontNest(result, 399, 488);
    
    _putDontNest(result, 399, 498);
    
    _putDontNest(result, 399, 507);
    
    _putDontNest(result, 399, 516);
    
    _putDontNest(result, 399, 526);
    
    _putDontNest(result, 399, 535);
    
    _putDontNest(result, 399, 545);
    
    _putDontNest(result, 399, 552);
    
    _putDontNest(result, 399, 559);
    
    _putDontNest(result, 399, 567);
    
    _putDontNest(result, 399, 574);
    
    _putDontNest(result, 399, 581);
    
    _putDontNest(result, 399, 588);
    
    _putDontNest(result, 399, 595);
    
    _putDontNest(result, 399, 602);
    
    _putDontNest(result, 399, 612);
    
    _putDontNest(result, 399, 621);
    
    _putDontNest(result, 399, 628);
    
    _putDontNest(result, 399, 635);
    
    _putDontNest(result, 399, 644);
    
    _putDontNest(result, 399, 653);
    
    _putDontNest(result, 399, 662);
    
    _putDontNest(result, 399, 669);
    
    _putDontNest(result, 399, 676);
    
    _putDontNest(result, 399, 697);
    
    _putDontNest(result, 399, 710);
    
    _putDontNest(result, 399, 717);
    
    _putDontNest(result, 399, 724);
    
    _putDontNest(result, 399, 731);
    
    _putDontNest(result, 399, 738);
    
    _putDontNest(result, 399, 745);
    
    _putDontNest(result, 399, 752);
    
    _putDontNest(result, 399, 759);
    
    _putDontNest(result, 399, 766);
    
    _putDontNest(result, 399, 773);
    
    _putDontNest(result, 399, 780);
    
    _putDontNest(result, 399, 859);
    
    _putDontNest(result, 399, 871);
    
    _putDontNest(result, 406, 430);
    
    _putDontNest(result, 406, 447);
    
    _putDontNest(result, 406, 452);
    
    _putDontNest(result, 406, 459);
    
    _putDontNest(result, 406, 466);
    
    _putDontNest(result, 406, 471);
    
    _putDontNest(result, 406, 476);
    
    _putDontNest(result, 406, 483);
    
    _putDontNest(result, 406, 488);
    
    _putDontNest(result, 406, 498);
    
    _putDontNest(result, 406, 507);
    
    _putDontNest(result, 406, 516);
    
    _putDontNest(result, 406, 526);
    
    _putDontNest(result, 406, 535);
    
    _putDontNest(result, 406, 545);
    
    _putDontNest(result, 406, 552);
    
    _putDontNest(result, 406, 559);
    
    _putDontNest(result, 406, 567);
    
    _putDontNest(result, 406, 574);
    
    _putDontNest(result, 406, 581);
    
    _putDontNest(result, 406, 588);
    
    _putDontNest(result, 406, 595);
    
    _putDontNest(result, 406, 602);
    
    _putDontNest(result, 406, 612);
    
    _putDontNest(result, 406, 621);
    
    _putDontNest(result, 406, 628);
    
    _putDontNest(result, 406, 635);
    
    _putDontNest(result, 406, 644);
    
    _putDontNest(result, 406, 653);
    
    _putDontNest(result, 406, 662);
    
    _putDontNest(result, 406, 669);
    
    _putDontNest(result, 406, 676);
    
    _putDontNest(result, 406, 697);
    
    _putDontNest(result, 406, 710);
    
    _putDontNest(result, 406, 717);
    
    _putDontNest(result, 406, 724);
    
    _putDontNest(result, 406, 731);
    
    _putDontNest(result, 406, 738);
    
    _putDontNest(result, 406, 745);
    
    _putDontNest(result, 406, 752);
    
    _putDontNest(result, 406, 759);
    
    _putDontNest(result, 406, 766);
    
    _putDontNest(result, 406, 773);
    
    _putDontNest(result, 406, 780);
    
    _putDontNest(result, 406, 859);
    
    _putDontNest(result, 406, 871);
    
    _putDontNest(result, 415, 430);
    
    _putDontNest(result, 415, 447);
    
    _putDontNest(result, 415, 452);
    
    _putDontNest(result, 415, 459);
    
    _putDontNest(result, 415, 466);
    
    _putDontNest(result, 415, 471);
    
    _putDontNest(result, 415, 476);
    
    _putDontNest(result, 415, 483);
    
    _putDontNest(result, 415, 488);
    
    _putDontNest(result, 415, 498);
    
    _putDontNest(result, 415, 507);
    
    _putDontNest(result, 415, 516);
    
    _putDontNest(result, 415, 526);
    
    _putDontNest(result, 415, 535);
    
    _putDontNest(result, 415, 545);
    
    _putDontNest(result, 415, 552);
    
    _putDontNest(result, 415, 559);
    
    _putDontNest(result, 415, 567);
    
    _putDontNest(result, 415, 574);
    
    _putDontNest(result, 415, 581);
    
    _putDontNest(result, 415, 588);
    
    _putDontNest(result, 415, 595);
    
    _putDontNest(result, 415, 602);
    
    _putDontNest(result, 415, 612);
    
    _putDontNest(result, 415, 621);
    
    _putDontNest(result, 415, 628);
    
    _putDontNest(result, 415, 635);
    
    _putDontNest(result, 415, 644);
    
    _putDontNest(result, 415, 653);
    
    _putDontNest(result, 415, 662);
    
    _putDontNest(result, 415, 669);
    
    _putDontNest(result, 415, 676);
    
    _putDontNest(result, 415, 697);
    
    _putDontNest(result, 415, 710);
    
    _putDontNest(result, 415, 717);
    
    _putDontNest(result, 415, 724);
    
    _putDontNest(result, 415, 731);
    
    _putDontNest(result, 415, 738);
    
    _putDontNest(result, 415, 745);
    
    _putDontNest(result, 415, 752);
    
    _putDontNest(result, 415, 759);
    
    _putDontNest(result, 415, 766);
    
    _putDontNest(result, 415, 773);
    
    _putDontNest(result, 415, 780);
    
    _putDontNest(result, 415, 859);
    
    _putDontNest(result, 415, 871);
    
    _putDontNest(result, 430, 436);
    
    _putDontNest(result, 430, 441);
    
    _putDontNest(result, 430, 498);
    
    _putDontNest(result, 430, 507);
    
    _putDontNest(result, 430, 516);
    
    _putDontNest(result, 430, 526);
    
    _putDontNest(result, 430, 535);
    
    _putDontNest(result, 430, 545);
    
    _putDontNest(result, 430, 552);
    
    _putDontNest(result, 430, 559);
    
    _putDontNest(result, 430, 567);
    
    _putDontNest(result, 430, 574);
    
    _putDontNest(result, 430, 581);
    
    _putDontNest(result, 430, 588);
    
    _putDontNest(result, 430, 595);
    
    _putDontNest(result, 430, 602);
    
    _putDontNest(result, 430, 612);
    
    _putDontNest(result, 430, 621);
    
    _putDontNest(result, 430, 628);
    
    _putDontNest(result, 430, 635);
    
    _putDontNest(result, 430, 644);
    
    _putDontNest(result, 430, 653);
    
    _putDontNest(result, 430, 662);
    
    _putDontNest(result, 430, 669);
    
    _putDontNest(result, 430, 676);
    
    _putDontNest(result, 430, 697);
    
    _putDontNest(result, 430, 710);
    
    _putDontNest(result, 430, 717);
    
    _putDontNest(result, 430, 724);
    
    _putDontNest(result, 430, 731);
    
    _putDontNest(result, 430, 738);
    
    _putDontNest(result, 430, 745);
    
    _putDontNest(result, 430, 752);
    
    _putDontNest(result, 430, 759);
    
    _putDontNest(result, 430, 766);
    
    _putDontNest(result, 430, 773);
    
    _putDontNest(result, 430, 780);
    
    _putDontNest(result, 430, 859);
    
    _putDontNest(result, 434, 447);
    
    _putDontNest(result, 434, 452);
    
    _putDontNest(result, 434, 459);
    
    _putDontNest(result, 434, 466);
    
    _putDontNest(result, 434, 471);
    
    _putDontNest(result, 434, 476);
    
    _putDontNest(result, 434, 483);
    
    _putDontNest(result, 434, 488);
    
    _putDontNest(result, 434, 498);
    
    _putDontNest(result, 434, 507);
    
    _putDontNest(result, 434, 516);
    
    _putDontNest(result, 434, 526);
    
    _putDontNest(result, 434, 535);
    
    _putDontNest(result, 434, 545);
    
    _putDontNest(result, 434, 552);
    
    _putDontNest(result, 434, 559);
    
    _putDontNest(result, 434, 567);
    
    _putDontNest(result, 434, 574);
    
    _putDontNest(result, 434, 581);
    
    _putDontNest(result, 434, 588);
    
    _putDontNest(result, 434, 595);
    
    _putDontNest(result, 434, 602);
    
    _putDontNest(result, 434, 612);
    
    _putDontNest(result, 434, 621);
    
    _putDontNest(result, 434, 628);
    
    _putDontNest(result, 434, 635);
    
    _putDontNest(result, 434, 644);
    
    _putDontNest(result, 434, 653);
    
    _putDontNest(result, 434, 662);
    
    _putDontNest(result, 434, 669);
    
    _putDontNest(result, 434, 676);
    
    _putDontNest(result, 434, 697);
    
    _putDontNest(result, 434, 710);
    
    _putDontNest(result, 434, 717);
    
    _putDontNest(result, 434, 724);
    
    _putDontNest(result, 434, 731);
    
    _putDontNest(result, 434, 738);
    
    _putDontNest(result, 434, 745);
    
    _putDontNest(result, 434, 752);
    
    _putDontNest(result, 434, 759);
    
    _putDontNest(result, 434, 766);
    
    _putDontNest(result, 434, 773);
    
    _putDontNest(result, 434, 780);
    
    _putDontNest(result, 434, 859);
    
    _putDontNest(result, 434, 871);
    
    _putDontNest(result, 439, 447);
    
    _putDontNest(result, 439, 452);
    
    _putDontNest(result, 439, 459);
    
    _putDontNest(result, 439, 466);
    
    _putDontNest(result, 439, 471);
    
    _putDontNest(result, 439, 476);
    
    _putDontNest(result, 439, 483);
    
    _putDontNest(result, 439, 488);
    
    _putDontNest(result, 439, 498);
    
    _putDontNest(result, 439, 507);
    
    _putDontNest(result, 439, 516);
    
    _putDontNest(result, 439, 526);
    
    _putDontNest(result, 439, 535);
    
    _putDontNest(result, 439, 545);
    
    _putDontNest(result, 439, 552);
    
    _putDontNest(result, 439, 559);
    
    _putDontNest(result, 439, 567);
    
    _putDontNest(result, 439, 574);
    
    _putDontNest(result, 439, 581);
    
    _putDontNest(result, 439, 588);
    
    _putDontNest(result, 439, 595);
    
    _putDontNest(result, 439, 602);
    
    _putDontNest(result, 439, 612);
    
    _putDontNest(result, 439, 621);
    
    _putDontNest(result, 439, 628);
    
    _putDontNest(result, 439, 635);
    
    _putDontNest(result, 439, 644);
    
    _putDontNest(result, 439, 653);
    
    _putDontNest(result, 439, 662);
    
    _putDontNest(result, 439, 669);
    
    _putDontNest(result, 439, 676);
    
    _putDontNest(result, 439, 697);
    
    _putDontNest(result, 439, 710);
    
    _putDontNest(result, 439, 717);
    
    _putDontNest(result, 439, 724);
    
    _putDontNest(result, 439, 731);
    
    _putDontNest(result, 439, 738);
    
    _putDontNest(result, 439, 745);
    
    _putDontNest(result, 439, 752);
    
    _putDontNest(result, 439, 759);
    
    _putDontNest(result, 439, 766);
    
    _putDontNest(result, 439, 773);
    
    _putDontNest(result, 439, 780);
    
    _putDontNest(result, 439, 859);
    
    _putDontNest(result, 439, 871);
    
    _putDontNest(result, 447, 498);
    
    _putDontNest(result, 447, 507);
    
    _putDontNest(result, 447, 516);
    
    _putDontNest(result, 447, 526);
    
    _putDontNest(result, 447, 535);
    
    _putDontNest(result, 447, 545);
    
    _putDontNest(result, 447, 552);
    
    _putDontNest(result, 447, 559);
    
    _putDontNest(result, 447, 567);
    
    _putDontNest(result, 447, 574);
    
    _putDontNest(result, 447, 581);
    
    _putDontNest(result, 447, 588);
    
    _putDontNest(result, 447, 595);
    
    _putDontNest(result, 447, 602);
    
    _putDontNest(result, 447, 612);
    
    _putDontNest(result, 447, 621);
    
    _putDontNest(result, 447, 628);
    
    _putDontNest(result, 447, 635);
    
    _putDontNest(result, 447, 644);
    
    _putDontNest(result, 447, 653);
    
    _putDontNest(result, 447, 662);
    
    _putDontNest(result, 447, 669);
    
    _putDontNest(result, 447, 676);
    
    _putDontNest(result, 447, 697);
    
    _putDontNest(result, 447, 710);
    
    _putDontNest(result, 447, 717);
    
    _putDontNest(result, 447, 724);
    
    _putDontNest(result, 447, 731);
    
    _putDontNest(result, 447, 738);
    
    _putDontNest(result, 447, 745);
    
    _putDontNest(result, 447, 752);
    
    _putDontNest(result, 447, 759);
    
    _putDontNest(result, 447, 766);
    
    _putDontNest(result, 447, 773);
    
    _putDontNest(result, 447, 780);
    
    _putDontNest(result, 447, 859);
    
    _putDontNest(result, 452, 498);
    
    _putDontNest(result, 452, 507);
    
    _putDontNest(result, 452, 516);
    
    _putDontNest(result, 452, 526);
    
    _putDontNest(result, 452, 535);
    
    _putDontNest(result, 452, 545);
    
    _putDontNest(result, 452, 552);
    
    _putDontNest(result, 452, 559);
    
    _putDontNest(result, 452, 567);
    
    _putDontNest(result, 452, 574);
    
    _putDontNest(result, 452, 581);
    
    _putDontNest(result, 452, 588);
    
    _putDontNest(result, 452, 595);
    
    _putDontNest(result, 452, 602);
    
    _putDontNest(result, 452, 612);
    
    _putDontNest(result, 452, 621);
    
    _putDontNest(result, 452, 628);
    
    _putDontNest(result, 452, 635);
    
    _putDontNest(result, 452, 644);
    
    _putDontNest(result, 452, 653);
    
    _putDontNest(result, 452, 662);
    
    _putDontNest(result, 452, 669);
    
    _putDontNest(result, 452, 676);
    
    _putDontNest(result, 452, 697);
    
    _putDontNest(result, 452, 710);
    
    _putDontNest(result, 452, 717);
    
    _putDontNest(result, 452, 724);
    
    _putDontNest(result, 452, 731);
    
    _putDontNest(result, 452, 738);
    
    _putDontNest(result, 452, 745);
    
    _putDontNest(result, 452, 752);
    
    _putDontNest(result, 452, 759);
    
    _putDontNest(result, 452, 766);
    
    _putDontNest(result, 452, 773);
    
    _putDontNest(result, 452, 780);
    
    _putDontNest(result, 452, 859);
    
    _putDontNest(result, 459, 498);
    
    _putDontNest(result, 459, 507);
    
    _putDontNest(result, 459, 516);
    
    _putDontNest(result, 459, 526);
    
    _putDontNest(result, 459, 535);
    
    _putDontNest(result, 459, 545);
    
    _putDontNest(result, 459, 552);
    
    _putDontNest(result, 459, 559);
    
    _putDontNest(result, 459, 567);
    
    _putDontNest(result, 459, 574);
    
    _putDontNest(result, 459, 581);
    
    _putDontNest(result, 459, 588);
    
    _putDontNest(result, 459, 595);
    
    _putDontNest(result, 459, 602);
    
    _putDontNest(result, 459, 612);
    
    _putDontNest(result, 459, 621);
    
    _putDontNest(result, 459, 628);
    
    _putDontNest(result, 459, 635);
    
    _putDontNest(result, 459, 644);
    
    _putDontNest(result, 459, 653);
    
    _putDontNest(result, 459, 662);
    
    _putDontNest(result, 459, 669);
    
    _putDontNest(result, 459, 676);
    
    _putDontNest(result, 459, 697);
    
    _putDontNest(result, 459, 710);
    
    _putDontNest(result, 459, 717);
    
    _putDontNest(result, 459, 724);
    
    _putDontNest(result, 459, 731);
    
    _putDontNest(result, 459, 738);
    
    _putDontNest(result, 459, 745);
    
    _putDontNest(result, 459, 752);
    
    _putDontNest(result, 459, 759);
    
    _putDontNest(result, 459, 766);
    
    _putDontNest(result, 459, 773);
    
    _putDontNest(result, 459, 780);
    
    _putDontNest(result, 459, 859);
    
    _putDontNest(result, 466, 498);
    
    _putDontNest(result, 466, 507);
    
    _putDontNest(result, 466, 516);
    
    _putDontNest(result, 466, 526);
    
    _putDontNest(result, 466, 535);
    
    _putDontNest(result, 466, 545);
    
    _putDontNest(result, 466, 552);
    
    _putDontNest(result, 466, 559);
    
    _putDontNest(result, 466, 567);
    
    _putDontNest(result, 466, 574);
    
    _putDontNest(result, 466, 581);
    
    _putDontNest(result, 466, 588);
    
    _putDontNest(result, 466, 595);
    
    _putDontNest(result, 466, 602);
    
    _putDontNest(result, 466, 612);
    
    _putDontNest(result, 466, 621);
    
    _putDontNest(result, 466, 628);
    
    _putDontNest(result, 466, 635);
    
    _putDontNest(result, 466, 644);
    
    _putDontNest(result, 466, 653);
    
    _putDontNest(result, 466, 662);
    
    _putDontNest(result, 466, 669);
    
    _putDontNest(result, 466, 676);
    
    _putDontNest(result, 466, 697);
    
    _putDontNest(result, 466, 710);
    
    _putDontNest(result, 466, 717);
    
    _putDontNest(result, 466, 724);
    
    _putDontNest(result, 466, 731);
    
    _putDontNest(result, 466, 738);
    
    _putDontNest(result, 466, 745);
    
    _putDontNest(result, 466, 752);
    
    _putDontNest(result, 466, 759);
    
    _putDontNest(result, 466, 766);
    
    _putDontNest(result, 466, 773);
    
    _putDontNest(result, 466, 780);
    
    _putDontNest(result, 466, 859);
    
    _putDontNest(result, 471, 498);
    
    _putDontNest(result, 471, 507);
    
    _putDontNest(result, 471, 516);
    
    _putDontNest(result, 471, 526);
    
    _putDontNest(result, 471, 535);
    
    _putDontNest(result, 471, 545);
    
    _putDontNest(result, 471, 552);
    
    _putDontNest(result, 471, 559);
    
    _putDontNest(result, 471, 567);
    
    _putDontNest(result, 471, 574);
    
    _putDontNest(result, 471, 581);
    
    _putDontNest(result, 471, 588);
    
    _putDontNest(result, 471, 595);
    
    _putDontNest(result, 471, 602);
    
    _putDontNest(result, 471, 612);
    
    _putDontNest(result, 471, 621);
    
    _putDontNest(result, 471, 628);
    
    _putDontNest(result, 471, 635);
    
    _putDontNest(result, 471, 644);
    
    _putDontNest(result, 471, 653);
    
    _putDontNest(result, 471, 662);
    
    _putDontNest(result, 471, 669);
    
    _putDontNest(result, 471, 676);
    
    _putDontNest(result, 471, 697);
    
    _putDontNest(result, 471, 710);
    
    _putDontNest(result, 471, 717);
    
    _putDontNest(result, 471, 724);
    
    _putDontNest(result, 471, 731);
    
    _putDontNest(result, 471, 738);
    
    _putDontNest(result, 471, 745);
    
    _putDontNest(result, 471, 752);
    
    _putDontNest(result, 471, 759);
    
    _putDontNest(result, 471, 766);
    
    _putDontNest(result, 471, 773);
    
    _putDontNest(result, 471, 780);
    
    _putDontNest(result, 471, 859);
    
    _putDontNest(result, 476, 498);
    
    _putDontNest(result, 476, 507);
    
    _putDontNest(result, 476, 516);
    
    _putDontNest(result, 476, 526);
    
    _putDontNest(result, 476, 535);
    
    _putDontNest(result, 476, 545);
    
    _putDontNest(result, 476, 552);
    
    _putDontNest(result, 476, 559);
    
    _putDontNest(result, 476, 567);
    
    _putDontNest(result, 476, 574);
    
    _putDontNest(result, 476, 581);
    
    _putDontNest(result, 476, 588);
    
    _putDontNest(result, 476, 595);
    
    _putDontNest(result, 476, 602);
    
    _putDontNest(result, 476, 612);
    
    _putDontNest(result, 476, 621);
    
    _putDontNest(result, 476, 628);
    
    _putDontNest(result, 476, 635);
    
    _putDontNest(result, 476, 644);
    
    _putDontNest(result, 476, 653);
    
    _putDontNest(result, 476, 662);
    
    _putDontNest(result, 476, 669);
    
    _putDontNest(result, 476, 676);
    
    _putDontNest(result, 476, 697);
    
    _putDontNest(result, 476, 710);
    
    _putDontNest(result, 476, 717);
    
    _putDontNest(result, 476, 724);
    
    _putDontNest(result, 476, 731);
    
    _putDontNest(result, 476, 738);
    
    _putDontNest(result, 476, 745);
    
    _putDontNest(result, 476, 752);
    
    _putDontNest(result, 476, 759);
    
    _putDontNest(result, 476, 766);
    
    _putDontNest(result, 476, 773);
    
    _putDontNest(result, 476, 780);
    
    _putDontNest(result, 476, 859);
    
    _putDontNest(result, 483, 498);
    
    _putDontNest(result, 483, 507);
    
    _putDontNest(result, 483, 516);
    
    _putDontNest(result, 483, 526);
    
    _putDontNest(result, 483, 535);
    
    _putDontNest(result, 483, 545);
    
    _putDontNest(result, 483, 552);
    
    _putDontNest(result, 483, 559);
    
    _putDontNest(result, 483, 567);
    
    _putDontNest(result, 483, 574);
    
    _putDontNest(result, 483, 581);
    
    _putDontNest(result, 483, 588);
    
    _putDontNest(result, 483, 595);
    
    _putDontNest(result, 483, 602);
    
    _putDontNest(result, 483, 612);
    
    _putDontNest(result, 483, 621);
    
    _putDontNest(result, 483, 628);
    
    _putDontNest(result, 483, 635);
    
    _putDontNest(result, 483, 644);
    
    _putDontNest(result, 483, 653);
    
    _putDontNest(result, 483, 662);
    
    _putDontNest(result, 483, 669);
    
    _putDontNest(result, 483, 676);
    
    _putDontNest(result, 483, 697);
    
    _putDontNest(result, 483, 710);
    
    _putDontNest(result, 483, 717);
    
    _putDontNest(result, 483, 724);
    
    _putDontNest(result, 483, 731);
    
    _putDontNest(result, 483, 738);
    
    _putDontNest(result, 483, 745);
    
    _putDontNest(result, 483, 752);
    
    _putDontNest(result, 483, 759);
    
    _putDontNest(result, 483, 766);
    
    _putDontNest(result, 483, 773);
    
    _putDontNest(result, 483, 780);
    
    _putDontNest(result, 483, 859);
    
    _putDontNest(result, 488, 498);
    
    _putDontNest(result, 488, 507);
    
    _putDontNest(result, 488, 516);
    
    _putDontNest(result, 488, 526);
    
    _putDontNest(result, 488, 535);
    
    _putDontNest(result, 488, 545);
    
    _putDontNest(result, 488, 552);
    
    _putDontNest(result, 488, 559);
    
    _putDontNest(result, 488, 567);
    
    _putDontNest(result, 488, 574);
    
    _putDontNest(result, 488, 581);
    
    _putDontNest(result, 488, 588);
    
    _putDontNest(result, 488, 595);
    
    _putDontNest(result, 488, 602);
    
    _putDontNest(result, 488, 612);
    
    _putDontNest(result, 488, 621);
    
    _putDontNest(result, 488, 628);
    
    _putDontNest(result, 488, 635);
    
    _putDontNest(result, 488, 644);
    
    _putDontNest(result, 488, 653);
    
    _putDontNest(result, 488, 662);
    
    _putDontNest(result, 488, 669);
    
    _putDontNest(result, 488, 676);
    
    _putDontNest(result, 488, 697);
    
    _putDontNest(result, 488, 710);
    
    _putDontNest(result, 488, 717);
    
    _putDontNest(result, 488, 724);
    
    _putDontNest(result, 488, 731);
    
    _putDontNest(result, 488, 738);
    
    _putDontNest(result, 488, 745);
    
    _putDontNest(result, 488, 752);
    
    _putDontNest(result, 488, 759);
    
    _putDontNest(result, 488, 766);
    
    _putDontNest(result, 488, 773);
    
    _putDontNest(result, 488, 780);
    
    _putDontNest(result, 488, 859);
    
    _putDontNest(result, 492, 526);
    
    _putDontNest(result, 492, 535);
    
    _putDontNest(result, 492, 545);
    
    _putDontNest(result, 492, 552);
    
    _putDontNest(result, 492, 559);
    
    _putDontNest(result, 492, 567);
    
    _putDontNest(result, 492, 574);
    
    _putDontNest(result, 492, 581);
    
    _putDontNest(result, 492, 588);
    
    _putDontNest(result, 492, 595);
    
    _putDontNest(result, 492, 602);
    
    _putDontNest(result, 492, 612);
    
    _putDontNest(result, 492, 621);
    
    _putDontNest(result, 492, 628);
    
    _putDontNest(result, 492, 635);
    
    _putDontNest(result, 492, 644);
    
    _putDontNest(result, 492, 653);
    
    _putDontNest(result, 492, 662);
    
    _putDontNest(result, 492, 669);
    
    _putDontNest(result, 492, 676);
    
    _putDontNest(result, 492, 697);
    
    _putDontNest(result, 492, 710);
    
    _putDontNest(result, 492, 717);
    
    _putDontNest(result, 492, 724);
    
    _putDontNest(result, 492, 731);
    
    _putDontNest(result, 492, 738);
    
    _putDontNest(result, 492, 745);
    
    _putDontNest(result, 492, 752);
    
    _putDontNest(result, 492, 759);
    
    _putDontNest(result, 492, 766);
    
    _putDontNest(result, 492, 773);
    
    _putDontNest(result, 492, 780);
    
    _putDontNest(result, 492, 859);
    
    _putDontNest(result, 492, 871);
    
    _putDontNest(result, 498, 498);
    
    _putDontNest(result, 498, 507);
    
    _putDontNest(result, 498, 516);
    
    _putDontNest(result, 498, 526);
    
    _putDontNest(result, 498, 535);
    
    _putDontNest(result, 498, 545);
    
    _putDontNest(result, 498, 552);
    
    _putDontNest(result, 498, 559);
    
    _putDontNest(result, 498, 567);
    
    _putDontNest(result, 498, 574);
    
    _putDontNest(result, 498, 581);
    
    _putDontNest(result, 498, 588);
    
    _putDontNest(result, 498, 595);
    
    _putDontNest(result, 498, 602);
    
    _putDontNest(result, 498, 612);
    
    _putDontNest(result, 498, 621);
    
    _putDontNest(result, 498, 628);
    
    _putDontNest(result, 498, 635);
    
    _putDontNest(result, 498, 644);
    
    _putDontNest(result, 498, 653);
    
    _putDontNest(result, 498, 662);
    
    _putDontNest(result, 498, 669);
    
    _putDontNest(result, 498, 676);
    
    _putDontNest(result, 498, 697);
    
    _putDontNest(result, 498, 710);
    
    _putDontNest(result, 498, 717);
    
    _putDontNest(result, 498, 724);
    
    _putDontNest(result, 498, 731);
    
    _putDontNest(result, 498, 738);
    
    _putDontNest(result, 498, 745);
    
    _putDontNest(result, 498, 752);
    
    _putDontNest(result, 498, 759);
    
    _putDontNest(result, 498, 766);
    
    _putDontNest(result, 498, 773);
    
    _putDontNest(result, 498, 780);
    
    _putDontNest(result, 498, 859);
    
    _putDontNest(result, 501, 526);
    
    _putDontNest(result, 501, 535);
    
    _putDontNest(result, 501, 545);
    
    _putDontNest(result, 501, 552);
    
    _putDontNest(result, 501, 559);
    
    _putDontNest(result, 501, 567);
    
    _putDontNest(result, 501, 574);
    
    _putDontNest(result, 501, 581);
    
    _putDontNest(result, 501, 588);
    
    _putDontNest(result, 501, 595);
    
    _putDontNest(result, 501, 602);
    
    _putDontNest(result, 501, 612);
    
    _putDontNest(result, 501, 621);
    
    _putDontNest(result, 501, 628);
    
    _putDontNest(result, 501, 635);
    
    _putDontNest(result, 501, 644);
    
    _putDontNest(result, 501, 653);
    
    _putDontNest(result, 501, 662);
    
    _putDontNest(result, 501, 669);
    
    _putDontNest(result, 501, 676);
    
    _putDontNest(result, 501, 697);
    
    _putDontNest(result, 501, 710);
    
    _putDontNest(result, 501, 717);
    
    _putDontNest(result, 501, 724);
    
    _putDontNest(result, 501, 731);
    
    _putDontNest(result, 501, 738);
    
    _putDontNest(result, 501, 745);
    
    _putDontNest(result, 501, 752);
    
    _putDontNest(result, 501, 759);
    
    _putDontNest(result, 501, 766);
    
    _putDontNest(result, 501, 773);
    
    _putDontNest(result, 501, 780);
    
    _putDontNest(result, 501, 859);
    
    _putDontNest(result, 501, 871);
    
    _putDontNest(result, 507, 498);
    
    _putDontNest(result, 507, 507);
    
    _putDontNest(result, 507, 516);
    
    _putDontNest(result, 507, 526);
    
    _putDontNest(result, 507, 535);
    
    _putDontNest(result, 507, 545);
    
    _putDontNest(result, 507, 552);
    
    _putDontNest(result, 507, 559);
    
    _putDontNest(result, 507, 567);
    
    _putDontNest(result, 507, 574);
    
    _putDontNest(result, 507, 581);
    
    _putDontNest(result, 507, 588);
    
    _putDontNest(result, 507, 595);
    
    _putDontNest(result, 507, 602);
    
    _putDontNest(result, 507, 612);
    
    _putDontNest(result, 507, 621);
    
    _putDontNest(result, 507, 628);
    
    _putDontNest(result, 507, 635);
    
    _putDontNest(result, 507, 644);
    
    _putDontNest(result, 507, 653);
    
    _putDontNest(result, 507, 662);
    
    _putDontNest(result, 507, 669);
    
    _putDontNest(result, 507, 676);
    
    _putDontNest(result, 507, 697);
    
    _putDontNest(result, 507, 710);
    
    _putDontNest(result, 507, 717);
    
    _putDontNest(result, 507, 724);
    
    _putDontNest(result, 507, 731);
    
    _putDontNest(result, 507, 738);
    
    _putDontNest(result, 507, 745);
    
    _putDontNest(result, 507, 752);
    
    _putDontNest(result, 507, 759);
    
    _putDontNest(result, 507, 766);
    
    _putDontNest(result, 507, 773);
    
    _putDontNest(result, 507, 780);
    
    _putDontNest(result, 507, 859);
    
    _putDontNest(result, 510, 526);
    
    _putDontNest(result, 510, 535);
    
    _putDontNest(result, 510, 545);
    
    _putDontNest(result, 510, 552);
    
    _putDontNest(result, 510, 559);
    
    _putDontNest(result, 510, 567);
    
    _putDontNest(result, 510, 574);
    
    _putDontNest(result, 510, 581);
    
    _putDontNest(result, 510, 588);
    
    _putDontNest(result, 510, 595);
    
    _putDontNest(result, 510, 602);
    
    _putDontNest(result, 510, 612);
    
    _putDontNest(result, 510, 621);
    
    _putDontNest(result, 510, 628);
    
    _putDontNest(result, 510, 635);
    
    _putDontNest(result, 510, 644);
    
    _putDontNest(result, 510, 653);
    
    _putDontNest(result, 510, 662);
    
    _putDontNest(result, 510, 669);
    
    _putDontNest(result, 510, 676);
    
    _putDontNest(result, 510, 697);
    
    _putDontNest(result, 510, 710);
    
    _putDontNest(result, 510, 717);
    
    _putDontNest(result, 510, 724);
    
    _putDontNest(result, 510, 731);
    
    _putDontNest(result, 510, 738);
    
    _putDontNest(result, 510, 745);
    
    _putDontNest(result, 510, 752);
    
    _putDontNest(result, 510, 759);
    
    _putDontNest(result, 510, 766);
    
    _putDontNest(result, 510, 773);
    
    _putDontNest(result, 510, 780);
    
    _putDontNest(result, 510, 859);
    
    _putDontNest(result, 510, 871);
    
    _putDontNest(result, 516, 498);
    
    _putDontNest(result, 516, 507);
    
    _putDontNest(result, 516, 516);
    
    _putDontNest(result, 516, 526);
    
    _putDontNest(result, 516, 535);
    
    _putDontNest(result, 516, 545);
    
    _putDontNest(result, 516, 552);
    
    _putDontNest(result, 516, 559);
    
    _putDontNest(result, 516, 567);
    
    _putDontNest(result, 516, 574);
    
    _putDontNest(result, 516, 581);
    
    _putDontNest(result, 516, 588);
    
    _putDontNest(result, 516, 595);
    
    _putDontNest(result, 516, 602);
    
    _putDontNest(result, 516, 612);
    
    _putDontNest(result, 516, 621);
    
    _putDontNest(result, 516, 628);
    
    _putDontNest(result, 516, 635);
    
    _putDontNest(result, 516, 644);
    
    _putDontNest(result, 516, 653);
    
    _putDontNest(result, 516, 662);
    
    _putDontNest(result, 516, 669);
    
    _putDontNest(result, 516, 676);
    
    _putDontNest(result, 516, 697);
    
    _putDontNest(result, 516, 710);
    
    _putDontNest(result, 516, 717);
    
    _putDontNest(result, 516, 724);
    
    _putDontNest(result, 516, 731);
    
    _putDontNest(result, 516, 738);
    
    _putDontNest(result, 516, 745);
    
    _putDontNest(result, 516, 752);
    
    _putDontNest(result, 516, 759);
    
    _putDontNest(result, 516, 766);
    
    _putDontNest(result, 516, 773);
    
    _putDontNest(result, 516, 780);
    
    _putDontNest(result, 516, 859);
    
    _putDontNest(result, 520, 545);
    
    _putDontNest(result, 520, 552);
    
    _putDontNest(result, 520, 559);
    
    _putDontNest(result, 520, 567);
    
    _putDontNest(result, 520, 574);
    
    _putDontNest(result, 520, 581);
    
    _putDontNest(result, 520, 588);
    
    _putDontNest(result, 520, 595);
    
    _putDontNest(result, 520, 602);
    
    _putDontNest(result, 520, 612);
    
    _putDontNest(result, 520, 621);
    
    _putDontNest(result, 520, 628);
    
    _putDontNest(result, 520, 635);
    
    _putDontNest(result, 520, 644);
    
    _putDontNest(result, 520, 653);
    
    _putDontNest(result, 520, 662);
    
    _putDontNest(result, 520, 669);
    
    _putDontNest(result, 520, 676);
    
    _putDontNest(result, 520, 697);
    
    _putDontNest(result, 520, 710);
    
    _putDontNest(result, 520, 717);
    
    _putDontNest(result, 520, 724);
    
    _putDontNest(result, 520, 731);
    
    _putDontNest(result, 520, 738);
    
    _putDontNest(result, 520, 745);
    
    _putDontNest(result, 520, 752);
    
    _putDontNest(result, 520, 759);
    
    _putDontNest(result, 520, 766);
    
    _putDontNest(result, 520, 773);
    
    _putDontNest(result, 520, 780);
    
    _putDontNest(result, 520, 859);
    
    _putDontNest(result, 520, 871);
    
    _putDontNest(result, 526, 526);
    
    _putDontNest(result, 526, 535);
    
    _putDontNest(result, 526, 545);
    
    _putDontNest(result, 526, 552);
    
    _putDontNest(result, 526, 559);
    
    _putDontNest(result, 526, 567);
    
    _putDontNest(result, 526, 574);
    
    _putDontNest(result, 526, 581);
    
    _putDontNest(result, 526, 588);
    
    _putDontNest(result, 526, 595);
    
    _putDontNest(result, 526, 602);
    
    _putDontNest(result, 526, 612);
    
    _putDontNest(result, 526, 621);
    
    _putDontNest(result, 526, 628);
    
    _putDontNest(result, 526, 635);
    
    _putDontNest(result, 526, 644);
    
    _putDontNest(result, 526, 653);
    
    _putDontNest(result, 526, 662);
    
    _putDontNest(result, 526, 669);
    
    _putDontNest(result, 526, 676);
    
    _putDontNest(result, 526, 697);
    
    _putDontNest(result, 526, 710);
    
    _putDontNest(result, 526, 717);
    
    _putDontNest(result, 526, 724);
    
    _putDontNest(result, 526, 731);
    
    _putDontNest(result, 526, 738);
    
    _putDontNest(result, 526, 745);
    
    _putDontNest(result, 526, 752);
    
    _putDontNest(result, 526, 759);
    
    _putDontNest(result, 526, 766);
    
    _putDontNest(result, 526, 773);
    
    _putDontNest(result, 526, 780);
    
    _putDontNest(result, 526, 859);
    
    _putDontNest(result, 529, 545);
    
    _putDontNest(result, 529, 552);
    
    _putDontNest(result, 529, 559);
    
    _putDontNest(result, 529, 567);
    
    _putDontNest(result, 529, 574);
    
    _putDontNest(result, 529, 581);
    
    _putDontNest(result, 529, 588);
    
    _putDontNest(result, 529, 595);
    
    _putDontNest(result, 529, 602);
    
    _putDontNest(result, 529, 612);
    
    _putDontNest(result, 529, 621);
    
    _putDontNest(result, 529, 628);
    
    _putDontNest(result, 529, 635);
    
    _putDontNest(result, 529, 644);
    
    _putDontNest(result, 529, 653);
    
    _putDontNest(result, 529, 662);
    
    _putDontNest(result, 529, 669);
    
    _putDontNest(result, 529, 676);
    
    _putDontNest(result, 529, 697);
    
    _putDontNest(result, 529, 710);
    
    _putDontNest(result, 529, 717);
    
    _putDontNest(result, 529, 724);
    
    _putDontNest(result, 529, 731);
    
    _putDontNest(result, 529, 738);
    
    _putDontNest(result, 529, 745);
    
    _putDontNest(result, 529, 752);
    
    _putDontNest(result, 529, 759);
    
    _putDontNest(result, 529, 766);
    
    _putDontNest(result, 529, 773);
    
    _putDontNest(result, 529, 780);
    
    _putDontNest(result, 529, 859);
    
    _putDontNest(result, 529, 871);
    
    _putDontNest(result, 535, 526);
    
    _putDontNest(result, 535, 535);
    
    _putDontNest(result, 535, 545);
    
    _putDontNest(result, 535, 552);
    
    _putDontNest(result, 535, 559);
    
    _putDontNest(result, 535, 567);
    
    _putDontNest(result, 535, 574);
    
    _putDontNest(result, 535, 581);
    
    _putDontNest(result, 535, 588);
    
    _putDontNest(result, 535, 595);
    
    _putDontNest(result, 535, 602);
    
    _putDontNest(result, 535, 612);
    
    _putDontNest(result, 535, 621);
    
    _putDontNest(result, 535, 628);
    
    _putDontNest(result, 535, 635);
    
    _putDontNest(result, 535, 644);
    
    _putDontNest(result, 535, 653);
    
    _putDontNest(result, 535, 662);
    
    _putDontNest(result, 535, 669);
    
    _putDontNest(result, 535, 676);
    
    _putDontNest(result, 535, 697);
    
    _putDontNest(result, 535, 710);
    
    _putDontNest(result, 535, 717);
    
    _putDontNest(result, 535, 724);
    
    _putDontNest(result, 535, 731);
    
    _putDontNest(result, 535, 738);
    
    _putDontNest(result, 535, 745);
    
    _putDontNest(result, 535, 752);
    
    _putDontNest(result, 535, 759);
    
    _putDontNest(result, 535, 766);
    
    _putDontNest(result, 535, 773);
    
    _putDontNest(result, 535, 780);
    
    _putDontNest(result, 535, 859);
    
    _putDontNest(result, 539, 567);
    
    _putDontNest(result, 539, 574);
    
    _putDontNest(result, 539, 581);
    
    _putDontNest(result, 539, 588);
    
    _putDontNest(result, 539, 595);
    
    _putDontNest(result, 539, 602);
    
    _putDontNest(result, 539, 612);
    
    _putDontNest(result, 539, 621);
    
    _putDontNest(result, 539, 628);
    
    _putDontNest(result, 539, 635);
    
    _putDontNest(result, 539, 644);
    
    _putDontNest(result, 539, 653);
    
    _putDontNest(result, 539, 662);
    
    _putDontNest(result, 539, 669);
    
    _putDontNest(result, 539, 676);
    
    _putDontNest(result, 539, 697);
    
    _putDontNest(result, 539, 710);
    
    _putDontNest(result, 539, 717);
    
    _putDontNest(result, 539, 724);
    
    _putDontNest(result, 539, 731);
    
    _putDontNest(result, 539, 738);
    
    _putDontNest(result, 539, 745);
    
    _putDontNest(result, 539, 752);
    
    _putDontNest(result, 539, 759);
    
    _putDontNest(result, 539, 766);
    
    _putDontNest(result, 539, 773);
    
    _putDontNest(result, 539, 780);
    
    _putDontNest(result, 539, 859);
    
    _putDontNest(result, 539, 871);
    
    _putDontNest(result, 545, 545);
    
    _putDontNest(result, 545, 552);
    
    _putDontNest(result, 545, 559);
    
    _putDontNest(result, 545, 567);
    
    _putDontNest(result, 545, 574);
    
    _putDontNest(result, 545, 581);
    
    _putDontNest(result, 545, 588);
    
    _putDontNest(result, 545, 595);
    
    _putDontNest(result, 545, 602);
    
    _putDontNest(result, 545, 612);
    
    _putDontNest(result, 545, 621);
    
    _putDontNest(result, 545, 628);
    
    _putDontNest(result, 545, 635);
    
    _putDontNest(result, 545, 644);
    
    _putDontNest(result, 545, 653);
    
    _putDontNest(result, 545, 662);
    
    _putDontNest(result, 545, 669);
    
    _putDontNest(result, 545, 676);
    
    _putDontNest(result, 545, 697);
    
    _putDontNest(result, 545, 710);
    
    _putDontNest(result, 545, 717);
    
    _putDontNest(result, 545, 724);
    
    _putDontNest(result, 545, 731);
    
    _putDontNest(result, 545, 738);
    
    _putDontNest(result, 545, 745);
    
    _putDontNest(result, 545, 752);
    
    _putDontNest(result, 545, 759);
    
    _putDontNest(result, 545, 766);
    
    _putDontNest(result, 545, 773);
    
    _putDontNest(result, 545, 780);
    
    _putDontNest(result, 545, 859);
    
    _putDontNest(result, 548, 567);
    
    _putDontNest(result, 548, 574);
    
    _putDontNest(result, 548, 581);
    
    _putDontNest(result, 548, 588);
    
    _putDontNest(result, 548, 595);
    
    _putDontNest(result, 548, 602);
    
    _putDontNest(result, 548, 612);
    
    _putDontNest(result, 548, 621);
    
    _putDontNest(result, 548, 628);
    
    _putDontNest(result, 548, 635);
    
    _putDontNest(result, 548, 644);
    
    _putDontNest(result, 548, 653);
    
    _putDontNest(result, 548, 662);
    
    _putDontNest(result, 548, 669);
    
    _putDontNest(result, 548, 676);
    
    _putDontNest(result, 548, 697);
    
    _putDontNest(result, 548, 710);
    
    _putDontNest(result, 548, 717);
    
    _putDontNest(result, 548, 724);
    
    _putDontNest(result, 548, 731);
    
    _putDontNest(result, 548, 738);
    
    _putDontNest(result, 548, 745);
    
    _putDontNest(result, 548, 752);
    
    _putDontNest(result, 548, 759);
    
    _putDontNest(result, 548, 766);
    
    _putDontNest(result, 548, 773);
    
    _putDontNest(result, 548, 780);
    
    _putDontNest(result, 548, 859);
    
    _putDontNest(result, 548, 871);
    
    _putDontNest(result, 552, 545);
    
    _putDontNest(result, 552, 552);
    
    _putDontNest(result, 552, 559);
    
    _putDontNest(result, 552, 567);
    
    _putDontNest(result, 552, 574);
    
    _putDontNest(result, 552, 581);
    
    _putDontNest(result, 552, 588);
    
    _putDontNest(result, 552, 595);
    
    _putDontNest(result, 552, 602);
    
    _putDontNest(result, 552, 612);
    
    _putDontNest(result, 552, 621);
    
    _putDontNest(result, 552, 628);
    
    _putDontNest(result, 552, 635);
    
    _putDontNest(result, 552, 644);
    
    _putDontNest(result, 552, 653);
    
    _putDontNest(result, 552, 662);
    
    _putDontNest(result, 552, 669);
    
    _putDontNest(result, 552, 676);
    
    _putDontNest(result, 552, 697);
    
    _putDontNest(result, 552, 710);
    
    _putDontNest(result, 552, 717);
    
    _putDontNest(result, 552, 724);
    
    _putDontNest(result, 552, 731);
    
    _putDontNest(result, 552, 738);
    
    _putDontNest(result, 552, 745);
    
    _putDontNest(result, 552, 752);
    
    _putDontNest(result, 552, 759);
    
    _putDontNest(result, 552, 766);
    
    _putDontNest(result, 552, 773);
    
    _putDontNest(result, 552, 780);
    
    _putDontNest(result, 552, 859);
    
    _putDontNest(result, 555, 567);
    
    _putDontNest(result, 555, 574);
    
    _putDontNest(result, 555, 581);
    
    _putDontNest(result, 555, 588);
    
    _putDontNest(result, 555, 595);
    
    _putDontNest(result, 555, 602);
    
    _putDontNest(result, 555, 612);
    
    _putDontNest(result, 555, 621);
    
    _putDontNest(result, 555, 628);
    
    _putDontNest(result, 555, 635);
    
    _putDontNest(result, 555, 644);
    
    _putDontNest(result, 555, 653);
    
    _putDontNest(result, 555, 662);
    
    _putDontNest(result, 555, 669);
    
    _putDontNest(result, 555, 676);
    
    _putDontNest(result, 555, 697);
    
    _putDontNest(result, 555, 710);
    
    _putDontNest(result, 555, 717);
    
    _putDontNest(result, 555, 724);
    
    _putDontNest(result, 555, 731);
    
    _putDontNest(result, 555, 738);
    
    _putDontNest(result, 555, 745);
    
    _putDontNest(result, 555, 752);
    
    _putDontNest(result, 555, 759);
    
    _putDontNest(result, 555, 766);
    
    _putDontNest(result, 555, 773);
    
    _putDontNest(result, 555, 780);
    
    _putDontNest(result, 555, 859);
    
    _putDontNest(result, 555, 871);
    
    _putDontNest(result, 559, 545);
    
    _putDontNest(result, 559, 552);
    
    _putDontNest(result, 559, 559);
    
    _putDontNest(result, 559, 567);
    
    _putDontNest(result, 559, 574);
    
    _putDontNest(result, 559, 581);
    
    _putDontNest(result, 559, 588);
    
    _putDontNest(result, 559, 595);
    
    _putDontNest(result, 559, 602);
    
    _putDontNest(result, 559, 612);
    
    _putDontNest(result, 559, 621);
    
    _putDontNest(result, 559, 628);
    
    _putDontNest(result, 559, 635);
    
    _putDontNest(result, 559, 644);
    
    _putDontNest(result, 559, 653);
    
    _putDontNest(result, 559, 662);
    
    _putDontNest(result, 559, 669);
    
    _putDontNest(result, 559, 676);
    
    _putDontNest(result, 559, 697);
    
    _putDontNest(result, 559, 710);
    
    _putDontNest(result, 559, 717);
    
    _putDontNest(result, 559, 724);
    
    _putDontNest(result, 559, 731);
    
    _putDontNest(result, 559, 738);
    
    _putDontNest(result, 559, 745);
    
    _putDontNest(result, 559, 752);
    
    _putDontNest(result, 559, 759);
    
    _putDontNest(result, 559, 766);
    
    _putDontNest(result, 559, 773);
    
    _putDontNest(result, 559, 780);
    
    _putDontNest(result, 559, 859);
    
    _putDontNest(result, 563, 567);
    
    _putDontNest(result, 563, 574);
    
    _putDontNest(result, 563, 581);
    
    _putDontNest(result, 563, 588);
    
    _putDontNest(result, 563, 595);
    
    _putDontNest(result, 563, 602);
    
    _putDontNest(result, 563, 612);
    
    _putDontNest(result, 563, 621);
    
    _putDontNest(result, 563, 628);
    
    _putDontNest(result, 563, 635);
    
    _putDontNest(result, 563, 644);
    
    _putDontNest(result, 563, 653);
    
    _putDontNest(result, 563, 662);
    
    _putDontNest(result, 563, 669);
    
    _putDontNest(result, 563, 676);
    
    _putDontNest(result, 563, 697);
    
    _putDontNest(result, 563, 710);
    
    _putDontNest(result, 563, 717);
    
    _putDontNest(result, 563, 724);
    
    _putDontNest(result, 563, 731);
    
    _putDontNest(result, 563, 738);
    
    _putDontNest(result, 563, 745);
    
    _putDontNest(result, 563, 752);
    
    _putDontNest(result, 563, 759);
    
    _putDontNest(result, 563, 766);
    
    _putDontNest(result, 563, 773);
    
    _putDontNest(result, 563, 780);
    
    _putDontNest(result, 563, 859);
    
    _putDontNest(result, 563, 871);
    
    _putDontNest(result, 567, 567);
    
    _putDontNest(result, 567, 574);
    
    _putDontNest(result, 567, 581);
    
    _putDontNest(result, 567, 588);
    
    _putDontNest(result, 567, 595);
    
    _putDontNest(result, 567, 602);
    
    _putDontNest(result, 567, 612);
    
    _putDontNest(result, 567, 621);
    
    _putDontNest(result, 567, 628);
    
    _putDontNest(result, 567, 635);
    
    _putDontNest(result, 567, 644);
    
    _putDontNest(result, 567, 653);
    
    _putDontNest(result, 567, 662);
    
    _putDontNest(result, 567, 669);
    
    _putDontNest(result, 567, 676);
    
    _putDontNest(result, 567, 697);
    
    _putDontNest(result, 567, 710);
    
    _putDontNest(result, 567, 717);
    
    _putDontNest(result, 567, 724);
    
    _putDontNest(result, 567, 731);
    
    _putDontNest(result, 567, 738);
    
    _putDontNest(result, 567, 745);
    
    _putDontNest(result, 567, 752);
    
    _putDontNest(result, 567, 759);
    
    _putDontNest(result, 567, 766);
    
    _putDontNest(result, 567, 773);
    
    _putDontNest(result, 567, 780);
    
    _putDontNest(result, 567, 859);
    
    _putDontNest(result, 570, 567);
    
    _putDontNest(result, 570, 574);
    
    _putDontNest(result, 570, 581);
    
    _putDontNest(result, 570, 588);
    
    _putDontNest(result, 570, 595);
    
    _putDontNest(result, 570, 602);
    
    _putDontNest(result, 570, 612);
    
    _putDontNest(result, 570, 621);
    
    _putDontNest(result, 570, 628);
    
    _putDontNest(result, 570, 635);
    
    _putDontNest(result, 570, 644);
    
    _putDontNest(result, 570, 653);
    
    _putDontNest(result, 570, 662);
    
    _putDontNest(result, 570, 669);
    
    _putDontNest(result, 570, 676);
    
    _putDontNest(result, 570, 697);
    
    _putDontNest(result, 570, 710);
    
    _putDontNest(result, 570, 717);
    
    _putDontNest(result, 570, 724);
    
    _putDontNest(result, 570, 731);
    
    _putDontNest(result, 570, 738);
    
    _putDontNest(result, 570, 745);
    
    _putDontNest(result, 570, 752);
    
    _putDontNest(result, 570, 759);
    
    _putDontNest(result, 570, 766);
    
    _putDontNest(result, 570, 773);
    
    _putDontNest(result, 570, 780);
    
    _putDontNest(result, 570, 859);
    
    _putDontNest(result, 570, 871);
    
    _putDontNest(result, 574, 567);
    
    _putDontNest(result, 574, 574);
    
    _putDontNest(result, 574, 581);
    
    _putDontNest(result, 574, 588);
    
    _putDontNest(result, 574, 595);
    
    _putDontNest(result, 574, 602);
    
    _putDontNest(result, 574, 612);
    
    _putDontNest(result, 574, 621);
    
    _putDontNest(result, 574, 628);
    
    _putDontNest(result, 574, 635);
    
    _putDontNest(result, 574, 644);
    
    _putDontNest(result, 574, 653);
    
    _putDontNest(result, 574, 662);
    
    _putDontNest(result, 574, 669);
    
    _putDontNest(result, 574, 676);
    
    _putDontNest(result, 574, 697);
    
    _putDontNest(result, 574, 710);
    
    _putDontNest(result, 574, 717);
    
    _putDontNest(result, 574, 724);
    
    _putDontNest(result, 574, 731);
    
    _putDontNest(result, 574, 738);
    
    _putDontNest(result, 574, 745);
    
    _putDontNest(result, 574, 752);
    
    _putDontNest(result, 574, 759);
    
    _putDontNest(result, 574, 766);
    
    _putDontNest(result, 574, 773);
    
    _putDontNest(result, 574, 780);
    
    _putDontNest(result, 574, 859);
    
    _putDontNest(result, 577, 567);
    
    _putDontNest(result, 577, 574);
    
    _putDontNest(result, 577, 581);
    
    _putDontNest(result, 577, 588);
    
    _putDontNest(result, 577, 595);
    
    _putDontNest(result, 577, 602);
    
    _putDontNest(result, 577, 612);
    
    _putDontNest(result, 577, 621);
    
    _putDontNest(result, 577, 628);
    
    _putDontNest(result, 577, 635);
    
    _putDontNest(result, 577, 644);
    
    _putDontNest(result, 577, 653);
    
    _putDontNest(result, 577, 662);
    
    _putDontNest(result, 577, 669);
    
    _putDontNest(result, 577, 676);
    
    _putDontNest(result, 577, 697);
    
    _putDontNest(result, 577, 710);
    
    _putDontNest(result, 577, 717);
    
    _putDontNest(result, 577, 724);
    
    _putDontNest(result, 577, 731);
    
    _putDontNest(result, 577, 738);
    
    _putDontNest(result, 577, 745);
    
    _putDontNest(result, 577, 752);
    
    _putDontNest(result, 577, 759);
    
    _putDontNest(result, 577, 766);
    
    _putDontNest(result, 577, 773);
    
    _putDontNest(result, 577, 780);
    
    _putDontNest(result, 577, 859);
    
    _putDontNest(result, 577, 871);
    
    _putDontNest(result, 581, 567);
    
    _putDontNest(result, 581, 574);
    
    _putDontNest(result, 581, 581);
    
    _putDontNest(result, 581, 588);
    
    _putDontNest(result, 581, 595);
    
    _putDontNest(result, 581, 602);
    
    _putDontNest(result, 581, 612);
    
    _putDontNest(result, 581, 621);
    
    _putDontNest(result, 581, 628);
    
    _putDontNest(result, 581, 635);
    
    _putDontNest(result, 581, 644);
    
    _putDontNest(result, 581, 653);
    
    _putDontNest(result, 581, 662);
    
    _putDontNest(result, 581, 669);
    
    _putDontNest(result, 581, 676);
    
    _putDontNest(result, 581, 697);
    
    _putDontNest(result, 581, 710);
    
    _putDontNest(result, 581, 717);
    
    _putDontNest(result, 581, 724);
    
    _putDontNest(result, 581, 731);
    
    _putDontNest(result, 581, 738);
    
    _putDontNest(result, 581, 745);
    
    _putDontNest(result, 581, 752);
    
    _putDontNest(result, 581, 759);
    
    _putDontNest(result, 581, 766);
    
    _putDontNest(result, 581, 773);
    
    _putDontNest(result, 581, 780);
    
    _putDontNest(result, 581, 859);
    
    _putDontNest(result, 584, 567);
    
    _putDontNest(result, 584, 574);
    
    _putDontNest(result, 584, 581);
    
    _putDontNest(result, 584, 588);
    
    _putDontNest(result, 584, 595);
    
    _putDontNest(result, 584, 602);
    
    _putDontNest(result, 584, 612);
    
    _putDontNest(result, 584, 621);
    
    _putDontNest(result, 584, 628);
    
    _putDontNest(result, 584, 635);
    
    _putDontNest(result, 584, 644);
    
    _putDontNest(result, 584, 653);
    
    _putDontNest(result, 584, 662);
    
    _putDontNest(result, 584, 669);
    
    _putDontNest(result, 584, 676);
    
    _putDontNest(result, 584, 697);
    
    _putDontNest(result, 584, 710);
    
    _putDontNest(result, 584, 717);
    
    _putDontNest(result, 584, 724);
    
    _putDontNest(result, 584, 731);
    
    _putDontNest(result, 584, 738);
    
    _putDontNest(result, 584, 745);
    
    _putDontNest(result, 584, 752);
    
    _putDontNest(result, 584, 759);
    
    _putDontNest(result, 584, 766);
    
    _putDontNest(result, 584, 773);
    
    _putDontNest(result, 584, 780);
    
    _putDontNest(result, 584, 859);
    
    _putDontNest(result, 584, 871);
    
    _putDontNest(result, 588, 567);
    
    _putDontNest(result, 588, 574);
    
    _putDontNest(result, 588, 581);
    
    _putDontNest(result, 588, 588);
    
    _putDontNest(result, 588, 595);
    
    _putDontNest(result, 588, 602);
    
    _putDontNest(result, 588, 612);
    
    _putDontNest(result, 588, 621);
    
    _putDontNest(result, 588, 628);
    
    _putDontNest(result, 588, 635);
    
    _putDontNest(result, 588, 644);
    
    _putDontNest(result, 588, 653);
    
    _putDontNest(result, 588, 662);
    
    _putDontNest(result, 588, 669);
    
    _putDontNest(result, 588, 676);
    
    _putDontNest(result, 588, 697);
    
    _putDontNest(result, 588, 710);
    
    _putDontNest(result, 588, 717);
    
    _putDontNest(result, 588, 724);
    
    _putDontNest(result, 588, 731);
    
    _putDontNest(result, 588, 738);
    
    _putDontNest(result, 588, 745);
    
    _putDontNest(result, 588, 752);
    
    _putDontNest(result, 588, 759);
    
    _putDontNest(result, 588, 766);
    
    _putDontNest(result, 588, 773);
    
    _putDontNest(result, 588, 780);
    
    _putDontNest(result, 588, 859);
    
    _putDontNest(result, 591, 567);
    
    _putDontNest(result, 591, 574);
    
    _putDontNest(result, 591, 581);
    
    _putDontNest(result, 591, 588);
    
    _putDontNest(result, 591, 595);
    
    _putDontNest(result, 591, 602);
    
    _putDontNest(result, 591, 612);
    
    _putDontNest(result, 591, 621);
    
    _putDontNest(result, 591, 628);
    
    _putDontNest(result, 591, 635);
    
    _putDontNest(result, 591, 644);
    
    _putDontNest(result, 591, 653);
    
    _putDontNest(result, 591, 662);
    
    _putDontNest(result, 591, 669);
    
    _putDontNest(result, 591, 676);
    
    _putDontNest(result, 591, 697);
    
    _putDontNest(result, 591, 710);
    
    _putDontNest(result, 591, 717);
    
    _putDontNest(result, 591, 724);
    
    _putDontNest(result, 591, 731);
    
    _putDontNest(result, 591, 738);
    
    _putDontNest(result, 591, 745);
    
    _putDontNest(result, 591, 752);
    
    _putDontNest(result, 591, 759);
    
    _putDontNest(result, 591, 766);
    
    _putDontNest(result, 591, 773);
    
    _putDontNest(result, 591, 780);
    
    _putDontNest(result, 591, 859);
    
    _putDontNest(result, 591, 871);
    
    _putDontNest(result, 595, 567);
    
    _putDontNest(result, 595, 574);
    
    _putDontNest(result, 595, 581);
    
    _putDontNest(result, 595, 588);
    
    _putDontNest(result, 595, 595);
    
    _putDontNest(result, 595, 602);
    
    _putDontNest(result, 595, 612);
    
    _putDontNest(result, 595, 621);
    
    _putDontNest(result, 595, 628);
    
    _putDontNest(result, 595, 635);
    
    _putDontNest(result, 595, 644);
    
    _putDontNest(result, 595, 653);
    
    _putDontNest(result, 595, 662);
    
    _putDontNest(result, 595, 669);
    
    _putDontNest(result, 595, 676);
    
    _putDontNest(result, 595, 697);
    
    _putDontNest(result, 595, 710);
    
    _putDontNest(result, 595, 717);
    
    _putDontNest(result, 595, 724);
    
    _putDontNest(result, 595, 731);
    
    _putDontNest(result, 595, 738);
    
    _putDontNest(result, 595, 745);
    
    _putDontNest(result, 595, 752);
    
    _putDontNest(result, 595, 759);
    
    _putDontNest(result, 595, 766);
    
    _putDontNest(result, 595, 773);
    
    _putDontNest(result, 595, 780);
    
    _putDontNest(result, 595, 859);
    
    _putDontNest(result, 598, 567);
    
    _putDontNest(result, 598, 574);
    
    _putDontNest(result, 598, 581);
    
    _putDontNest(result, 598, 588);
    
    _putDontNest(result, 598, 595);
    
    _putDontNest(result, 598, 602);
    
    _putDontNest(result, 598, 612);
    
    _putDontNest(result, 598, 621);
    
    _putDontNest(result, 598, 628);
    
    _putDontNest(result, 598, 635);
    
    _putDontNest(result, 598, 644);
    
    _putDontNest(result, 598, 653);
    
    _putDontNest(result, 598, 662);
    
    _putDontNest(result, 598, 669);
    
    _putDontNest(result, 598, 676);
    
    _putDontNest(result, 598, 697);
    
    _putDontNest(result, 598, 710);
    
    _putDontNest(result, 598, 717);
    
    _putDontNest(result, 598, 724);
    
    _putDontNest(result, 598, 731);
    
    _putDontNest(result, 598, 738);
    
    _putDontNest(result, 598, 745);
    
    _putDontNest(result, 598, 752);
    
    _putDontNest(result, 598, 759);
    
    _putDontNest(result, 598, 766);
    
    _putDontNest(result, 598, 773);
    
    _putDontNest(result, 598, 780);
    
    _putDontNest(result, 598, 859);
    
    _putDontNest(result, 598, 871);
    
    _putDontNest(result, 602, 567);
    
    _putDontNest(result, 602, 574);
    
    _putDontNest(result, 602, 581);
    
    _putDontNest(result, 602, 588);
    
    _putDontNest(result, 602, 595);
    
    _putDontNest(result, 602, 602);
    
    _putDontNest(result, 602, 612);
    
    _putDontNest(result, 602, 621);
    
    _putDontNest(result, 602, 628);
    
    _putDontNest(result, 602, 635);
    
    _putDontNest(result, 602, 644);
    
    _putDontNest(result, 602, 653);
    
    _putDontNest(result, 602, 662);
    
    _putDontNest(result, 602, 669);
    
    _putDontNest(result, 602, 676);
    
    _putDontNest(result, 602, 697);
    
    _putDontNest(result, 602, 710);
    
    _putDontNest(result, 602, 717);
    
    _putDontNest(result, 602, 724);
    
    _putDontNest(result, 602, 731);
    
    _putDontNest(result, 602, 738);
    
    _putDontNest(result, 602, 745);
    
    _putDontNest(result, 602, 752);
    
    _putDontNest(result, 602, 759);
    
    _putDontNest(result, 602, 766);
    
    _putDontNest(result, 602, 773);
    
    _putDontNest(result, 602, 780);
    
    _putDontNest(result, 602, 859);
    
    _putDontNest(result, 606, 612);
    
    _putDontNest(result, 606, 621);
    
    _putDontNest(result, 606, 628);
    
    _putDontNest(result, 606, 635);
    
    _putDontNest(result, 606, 644);
    
    _putDontNest(result, 606, 653);
    
    _putDontNest(result, 606, 662);
    
    _putDontNest(result, 606, 669);
    
    _putDontNest(result, 606, 676);
    
    _putDontNest(result, 606, 697);
    
    _putDontNest(result, 606, 710);
    
    _putDontNest(result, 606, 717);
    
    _putDontNest(result, 606, 724);
    
    _putDontNest(result, 606, 731);
    
    _putDontNest(result, 606, 738);
    
    _putDontNest(result, 606, 745);
    
    _putDontNest(result, 606, 752);
    
    _putDontNest(result, 606, 759);
    
    _putDontNest(result, 606, 766);
    
    _putDontNest(result, 606, 773);
    
    _putDontNest(result, 606, 780);
    
    _putDontNest(result, 606, 859);
    
    _putDontNest(result, 606, 871);
    
    _putDontNest(result, 612, 644);
    
    _putDontNest(result, 612, 653);
    
    _putDontNest(result, 612, 662);
    
    _putDontNest(result, 612, 669);
    
    _putDontNest(result, 612, 676);
    
    _putDontNest(result, 612, 697);
    
    _putDontNest(result, 612, 710);
    
    _putDontNest(result, 612, 717);
    
    _putDontNest(result, 612, 724);
    
    _putDontNest(result, 612, 731);
    
    _putDontNest(result, 612, 738);
    
    _putDontNest(result, 612, 745);
    
    _putDontNest(result, 612, 752);
    
    _putDontNest(result, 612, 759);
    
    _putDontNest(result, 612, 766);
    
    _putDontNest(result, 612, 773);
    
    _putDontNest(result, 612, 780);
    
    _putDontNest(result, 612, 859);
    
    _putDontNest(result, 615, 612);
    
    _putDontNest(result, 615, 621);
    
    _putDontNest(result, 615, 628);
    
    _putDontNest(result, 615, 635);
    
    _putDontNest(result, 615, 644);
    
    _putDontNest(result, 615, 653);
    
    _putDontNest(result, 615, 662);
    
    _putDontNest(result, 615, 669);
    
    _putDontNest(result, 615, 676);
    
    _putDontNest(result, 615, 697);
    
    _putDontNest(result, 615, 710);
    
    _putDontNest(result, 615, 717);
    
    _putDontNest(result, 615, 724);
    
    _putDontNest(result, 615, 731);
    
    _putDontNest(result, 615, 738);
    
    _putDontNest(result, 615, 745);
    
    _putDontNest(result, 615, 752);
    
    _putDontNest(result, 615, 759);
    
    _putDontNest(result, 615, 766);
    
    _putDontNest(result, 615, 773);
    
    _putDontNest(result, 615, 780);
    
    _putDontNest(result, 615, 859);
    
    _putDontNest(result, 615, 871);
    
    _putDontNest(result, 621, 644);
    
    _putDontNest(result, 621, 653);
    
    _putDontNest(result, 621, 662);
    
    _putDontNest(result, 621, 669);
    
    _putDontNest(result, 621, 676);
    
    _putDontNest(result, 621, 697);
    
    _putDontNest(result, 621, 710);
    
    _putDontNest(result, 621, 717);
    
    _putDontNest(result, 621, 724);
    
    _putDontNest(result, 621, 731);
    
    _putDontNest(result, 621, 738);
    
    _putDontNest(result, 621, 745);
    
    _putDontNest(result, 621, 752);
    
    _putDontNest(result, 621, 759);
    
    _putDontNest(result, 621, 766);
    
    _putDontNest(result, 621, 773);
    
    _putDontNest(result, 621, 780);
    
    _putDontNest(result, 621, 859);
    
    _putDontNest(result, 624, 612);
    
    _putDontNest(result, 624, 621);
    
    _putDontNest(result, 624, 628);
    
    _putDontNest(result, 624, 635);
    
    _putDontNest(result, 624, 644);
    
    _putDontNest(result, 624, 653);
    
    _putDontNest(result, 624, 662);
    
    _putDontNest(result, 624, 669);
    
    _putDontNest(result, 624, 676);
    
    _putDontNest(result, 624, 697);
    
    _putDontNest(result, 624, 710);
    
    _putDontNest(result, 624, 717);
    
    _putDontNest(result, 624, 724);
    
    _putDontNest(result, 624, 731);
    
    _putDontNest(result, 624, 738);
    
    _putDontNest(result, 624, 745);
    
    _putDontNest(result, 624, 752);
    
    _putDontNest(result, 624, 759);
    
    _putDontNest(result, 624, 766);
    
    _putDontNest(result, 624, 773);
    
    _putDontNest(result, 624, 780);
    
    _putDontNest(result, 624, 859);
    
    _putDontNest(result, 624, 871);
    
    _putDontNest(result, 628, 644);
    
    _putDontNest(result, 628, 653);
    
    _putDontNest(result, 628, 662);
    
    _putDontNest(result, 628, 669);
    
    _putDontNest(result, 628, 676);
    
    _putDontNest(result, 628, 697);
    
    _putDontNest(result, 628, 710);
    
    _putDontNest(result, 628, 717);
    
    _putDontNest(result, 628, 724);
    
    _putDontNest(result, 628, 731);
    
    _putDontNest(result, 628, 738);
    
    _putDontNest(result, 628, 745);
    
    _putDontNest(result, 628, 752);
    
    _putDontNest(result, 628, 759);
    
    _putDontNest(result, 628, 766);
    
    _putDontNest(result, 628, 773);
    
    _putDontNest(result, 628, 780);
    
    _putDontNest(result, 628, 859);
    
    _putDontNest(result, 631, 612);
    
    _putDontNest(result, 631, 621);
    
    _putDontNest(result, 631, 628);
    
    _putDontNest(result, 631, 635);
    
    _putDontNest(result, 631, 644);
    
    _putDontNest(result, 631, 653);
    
    _putDontNest(result, 631, 662);
    
    _putDontNest(result, 631, 669);
    
    _putDontNest(result, 631, 676);
    
    _putDontNest(result, 631, 697);
    
    _putDontNest(result, 631, 710);
    
    _putDontNest(result, 631, 717);
    
    _putDontNest(result, 631, 724);
    
    _putDontNest(result, 631, 731);
    
    _putDontNest(result, 631, 738);
    
    _putDontNest(result, 631, 745);
    
    _putDontNest(result, 631, 752);
    
    _putDontNest(result, 631, 759);
    
    _putDontNest(result, 631, 766);
    
    _putDontNest(result, 631, 773);
    
    _putDontNest(result, 631, 780);
    
    _putDontNest(result, 631, 859);
    
    _putDontNest(result, 631, 871);
    
    _putDontNest(result, 635, 644);
    
    _putDontNest(result, 635, 653);
    
    _putDontNest(result, 635, 662);
    
    _putDontNest(result, 635, 669);
    
    _putDontNest(result, 635, 676);
    
    _putDontNest(result, 635, 697);
    
    _putDontNest(result, 635, 710);
    
    _putDontNest(result, 635, 717);
    
    _putDontNest(result, 635, 724);
    
    _putDontNest(result, 635, 731);
    
    _putDontNest(result, 635, 738);
    
    _putDontNest(result, 635, 745);
    
    _putDontNest(result, 635, 752);
    
    _putDontNest(result, 635, 759);
    
    _putDontNest(result, 635, 766);
    
    _putDontNest(result, 635, 773);
    
    _putDontNest(result, 635, 780);
    
    _putDontNest(result, 635, 859);
    
    _putDontNest(result, 638, 644);
    
    _putDontNest(result, 638, 653);
    
    _putDontNest(result, 638, 662);
    
    _putDontNest(result, 638, 669);
    
    _putDontNest(result, 638, 676);
    
    _putDontNest(result, 638, 697);
    
    _putDontNest(result, 638, 710);
    
    _putDontNest(result, 638, 717);
    
    _putDontNest(result, 638, 724);
    
    _putDontNest(result, 638, 731);
    
    _putDontNest(result, 638, 738);
    
    _putDontNest(result, 638, 745);
    
    _putDontNest(result, 638, 752);
    
    _putDontNest(result, 638, 759);
    
    _putDontNest(result, 638, 766);
    
    _putDontNest(result, 638, 773);
    
    _putDontNest(result, 638, 780);
    
    _putDontNest(result, 638, 859);
    
    _putDontNest(result, 638, 871);
    
    _putDontNest(result, 644, 653);
    
    _putDontNest(result, 644, 662);
    
    _putDontNest(result, 644, 669);
    
    _putDontNest(result, 644, 676);
    
    _putDontNest(result, 644, 697);
    
    _putDontNest(result, 644, 710);
    
    _putDontNest(result, 644, 717);
    
    _putDontNest(result, 644, 724);
    
    _putDontNest(result, 644, 731);
    
    _putDontNest(result, 644, 738);
    
    _putDontNest(result, 644, 745);
    
    _putDontNest(result, 644, 752);
    
    _putDontNest(result, 644, 759);
    
    _putDontNest(result, 644, 766);
    
    _putDontNest(result, 644, 773);
    
    _putDontNest(result, 644, 780);
    
    _putDontNest(result, 644, 859);
    
    _putDontNest(result, 647, 653);
    
    _putDontNest(result, 647, 662);
    
    _putDontNest(result, 647, 669);
    
    _putDontNest(result, 647, 676);
    
    _putDontNest(result, 647, 697);
    
    _putDontNest(result, 647, 710);
    
    _putDontNest(result, 647, 717);
    
    _putDontNest(result, 647, 724);
    
    _putDontNest(result, 647, 731);
    
    _putDontNest(result, 647, 738);
    
    _putDontNest(result, 647, 745);
    
    _putDontNest(result, 647, 752);
    
    _putDontNest(result, 647, 759);
    
    _putDontNest(result, 647, 766);
    
    _putDontNest(result, 647, 773);
    
    _putDontNest(result, 647, 780);
    
    _putDontNest(result, 647, 859);
    
    _putDontNest(result, 647, 871);
    
    _putDontNest(result, 653, 662);
    
    _putDontNest(result, 653, 669);
    
    _putDontNest(result, 653, 676);
    
    _putDontNest(result, 653, 697);
    
    _putDontNest(result, 653, 710);
    
    _putDontNest(result, 653, 717);
    
    _putDontNest(result, 653, 724);
    
    _putDontNest(result, 653, 731);
    
    _putDontNest(result, 653, 738);
    
    _putDontNest(result, 653, 745);
    
    _putDontNest(result, 653, 752);
    
    _putDontNest(result, 653, 759);
    
    _putDontNest(result, 653, 766);
    
    _putDontNest(result, 653, 773);
    
    _putDontNest(result, 653, 780);
    
    _putDontNest(result, 653, 859);
    
    _putDontNest(result, 656, 662);
    
    _putDontNest(result, 656, 669);
    
    _putDontNest(result, 656, 676);
    
    _putDontNest(result, 656, 697);
    
    _putDontNest(result, 656, 710);
    
    _putDontNest(result, 656, 717);
    
    _putDontNest(result, 656, 724);
    
    _putDontNest(result, 656, 731);
    
    _putDontNest(result, 656, 738);
    
    _putDontNest(result, 656, 745);
    
    _putDontNest(result, 656, 752);
    
    _putDontNest(result, 656, 759);
    
    _putDontNest(result, 656, 766);
    
    _putDontNest(result, 656, 773);
    
    _putDontNest(result, 656, 780);
    
    _putDontNest(result, 656, 859);
    
    _putDontNest(result, 656, 871);
    
    _putDontNest(result, 662, 669);
    
    _putDontNest(result, 662, 676);
    
    _putDontNest(result, 662, 697);
    
    _putDontNest(result, 662, 710);
    
    _putDontNest(result, 662, 717);
    
    _putDontNest(result, 662, 724);
    
    _putDontNest(result, 662, 731);
    
    _putDontNest(result, 662, 738);
    
    _putDontNest(result, 662, 745);
    
    _putDontNest(result, 662, 752);
    
    _putDontNest(result, 662, 759);
    
    _putDontNest(result, 662, 766);
    
    _putDontNest(result, 662, 773);
    
    _putDontNest(result, 662, 780);
    
    _putDontNest(result, 662, 859);
    
    _putDontNest(result, 665, 676);
    
    _putDontNest(result, 665, 697);
    
    _putDontNest(result, 665, 710);
    
    _putDontNest(result, 665, 717);
    
    _putDontNest(result, 665, 724);
    
    _putDontNest(result, 665, 731);
    
    _putDontNest(result, 665, 738);
    
    _putDontNest(result, 665, 745);
    
    _putDontNest(result, 665, 752);
    
    _putDontNest(result, 665, 759);
    
    _putDontNest(result, 665, 766);
    
    _putDontNest(result, 665, 773);
    
    _putDontNest(result, 665, 780);
    
    _putDontNest(result, 665, 859);
    
    _putDontNest(result, 665, 871);
    
    _putDontNest(result, 669, 669);
    
    _putDontNest(result, 669, 676);
    
    _putDontNest(result, 669, 697);
    
    _putDontNest(result, 669, 710);
    
    _putDontNest(result, 669, 717);
    
    _putDontNest(result, 669, 724);
    
    _putDontNest(result, 669, 731);
    
    _putDontNest(result, 669, 738);
    
    _putDontNest(result, 669, 745);
    
    _putDontNest(result, 669, 752);
    
    _putDontNest(result, 669, 759);
    
    _putDontNest(result, 669, 766);
    
    _putDontNest(result, 669, 773);
    
    _putDontNest(result, 669, 780);
    
    _putDontNest(result, 669, 859);
    
    _putDontNest(result, 672, 697);
    
    _putDontNest(result, 672, 710);
    
    _putDontNest(result, 672, 717);
    
    _putDontNest(result, 672, 724);
    
    _putDontNest(result, 672, 731);
    
    _putDontNest(result, 672, 738);
    
    _putDontNest(result, 672, 745);
    
    _putDontNest(result, 672, 752);
    
    _putDontNest(result, 672, 759);
    
    _putDontNest(result, 672, 766);
    
    _putDontNest(result, 672, 773);
    
    _putDontNest(result, 672, 780);
    
    _putDontNest(result, 672, 859);
    
    _putDontNest(result, 672, 871);
    
    _putDontNest(result, 676, 676);
    
    _putDontNest(result, 676, 697);
    
    _putDontNest(result, 676, 710);
    
    _putDontNest(result, 676, 717);
    
    _putDontNest(result, 676, 724);
    
    _putDontNest(result, 676, 731);
    
    _putDontNest(result, 676, 738);
    
    _putDontNest(result, 676, 745);
    
    _putDontNest(result, 676, 752);
    
    _putDontNest(result, 676, 759);
    
    _putDontNest(result, 676, 766);
    
    _putDontNest(result, 676, 773);
    
    _putDontNest(result, 676, 780);
    
    _putDontNest(result, 676, 859);
    
    _putDontNest(result, 693, 697);
    
    _putDontNest(result, 693, 710);
    
    _putDontNest(result, 693, 717);
    
    _putDontNest(result, 693, 724);
    
    _putDontNest(result, 693, 731);
    
    _putDontNest(result, 693, 738);
    
    _putDontNest(result, 693, 745);
    
    _putDontNest(result, 693, 752);
    
    _putDontNest(result, 693, 759);
    
    _putDontNest(result, 693, 766);
    
    _putDontNest(result, 693, 773);
    
    _putDontNest(result, 693, 780);
    
    _putDontNest(result, 700, 697);
    
    _putDontNest(result, 700, 710);
    
    _putDontNest(result, 700, 717);
    
    _putDontNest(result, 700, 724);
    
    _putDontNest(result, 700, 731);
    
    _putDontNest(result, 700, 738);
    
    _putDontNest(result, 700, 745);
    
    _putDontNest(result, 700, 752);
    
    _putDontNest(result, 700, 759);
    
    _putDontNest(result, 700, 766);
    
    _putDontNest(result, 700, 773);
    
    _putDontNest(result, 700, 780);
    
    _putDontNest(result, 713, 697);
    
    _putDontNest(result, 713, 710);
    
    _putDontNest(result, 713, 717);
    
    _putDontNest(result, 713, 724);
    
    _putDontNest(result, 713, 731);
    
    _putDontNest(result, 713, 738);
    
    _putDontNest(result, 713, 745);
    
    _putDontNest(result, 713, 752);
    
    _putDontNest(result, 713, 759);
    
    _putDontNest(result, 713, 766);
    
    _putDontNest(result, 713, 773);
    
    _putDontNest(result, 713, 780);
    
    _putDontNest(result, 720, 697);
    
    _putDontNest(result, 720, 710);
    
    _putDontNest(result, 720, 717);
    
    _putDontNest(result, 720, 724);
    
    _putDontNest(result, 720, 731);
    
    _putDontNest(result, 720, 738);
    
    _putDontNest(result, 720, 745);
    
    _putDontNest(result, 720, 752);
    
    _putDontNest(result, 720, 759);
    
    _putDontNest(result, 720, 766);
    
    _putDontNest(result, 720, 773);
    
    _putDontNest(result, 720, 780);
    
    _putDontNest(result, 727, 697);
    
    _putDontNest(result, 727, 710);
    
    _putDontNest(result, 727, 717);
    
    _putDontNest(result, 727, 724);
    
    _putDontNest(result, 727, 731);
    
    _putDontNest(result, 727, 738);
    
    _putDontNest(result, 727, 745);
    
    _putDontNest(result, 727, 752);
    
    _putDontNest(result, 727, 759);
    
    _putDontNest(result, 727, 766);
    
    _putDontNest(result, 727, 773);
    
    _putDontNest(result, 727, 780);
    
    _putDontNest(result, 734, 697);
    
    _putDontNest(result, 734, 710);
    
    _putDontNest(result, 734, 717);
    
    _putDontNest(result, 734, 724);
    
    _putDontNest(result, 734, 731);
    
    _putDontNest(result, 734, 738);
    
    _putDontNest(result, 734, 745);
    
    _putDontNest(result, 734, 752);
    
    _putDontNest(result, 734, 759);
    
    _putDontNest(result, 734, 766);
    
    _putDontNest(result, 734, 773);
    
    _putDontNest(result, 734, 780);
    
    _putDontNest(result, 741, 697);
    
    _putDontNest(result, 741, 710);
    
    _putDontNest(result, 741, 717);
    
    _putDontNest(result, 741, 724);
    
    _putDontNest(result, 741, 731);
    
    _putDontNest(result, 741, 738);
    
    _putDontNest(result, 741, 745);
    
    _putDontNest(result, 741, 752);
    
    _putDontNest(result, 741, 759);
    
    _putDontNest(result, 741, 766);
    
    _putDontNest(result, 741, 773);
    
    _putDontNest(result, 741, 780);
    
    _putDontNest(result, 748, 697);
    
    _putDontNest(result, 748, 710);
    
    _putDontNest(result, 748, 717);
    
    _putDontNest(result, 748, 724);
    
    _putDontNest(result, 748, 731);
    
    _putDontNest(result, 748, 738);
    
    _putDontNest(result, 748, 745);
    
    _putDontNest(result, 748, 752);
    
    _putDontNest(result, 748, 759);
    
    _putDontNest(result, 748, 766);
    
    _putDontNest(result, 748, 773);
    
    _putDontNest(result, 748, 780);
    
    _putDontNest(result, 755, 697);
    
    _putDontNest(result, 755, 710);
    
    _putDontNest(result, 755, 717);
    
    _putDontNest(result, 755, 724);
    
    _putDontNest(result, 755, 731);
    
    _putDontNest(result, 755, 738);
    
    _putDontNest(result, 755, 745);
    
    _putDontNest(result, 755, 752);
    
    _putDontNest(result, 755, 759);
    
    _putDontNest(result, 755, 766);
    
    _putDontNest(result, 755, 773);
    
    _putDontNest(result, 755, 780);
    
    _putDontNest(result, 762, 697);
    
    _putDontNest(result, 762, 710);
    
    _putDontNest(result, 762, 717);
    
    _putDontNest(result, 762, 724);
    
    _putDontNest(result, 762, 731);
    
    _putDontNest(result, 762, 738);
    
    _putDontNest(result, 762, 745);
    
    _putDontNest(result, 762, 752);
    
    _putDontNest(result, 762, 759);
    
    _putDontNest(result, 762, 766);
    
    _putDontNest(result, 762, 773);
    
    _putDontNest(result, 762, 780);
    
    _putDontNest(result, 769, 697);
    
    _putDontNest(result, 769, 710);
    
    _putDontNest(result, 769, 717);
    
    _putDontNest(result, 769, 724);
    
    _putDontNest(result, 769, 731);
    
    _putDontNest(result, 769, 738);
    
    _putDontNest(result, 769, 745);
    
    _putDontNest(result, 769, 752);
    
    _putDontNest(result, 769, 759);
    
    _putDontNest(result, 769, 766);
    
    _putDontNest(result, 769, 773);
    
    _putDontNest(result, 769, 780);
    
    _putDontNest(result, 776, 697);
    
    _putDontNest(result, 776, 710);
    
    _putDontNest(result, 776, 717);
    
    _putDontNest(result, 776, 724);
    
    _putDontNest(result, 776, 731);
    
    _putDontNest(result, 776, 738);
    
    _putDontNest(result, 776, 745);
    
    _putDontNest(result, 776, 752);
    
    _putDontNest(result, 776, 759);
    
    _putDontNest(result, 776, 766);
    
    _putDontNest(result, 776, 773);
    
    _putDontNest(result, 776, 780);
    
    _putDontNest(result, 850, 697);
    
    _putDontNest(result, 850, 710);
    
    _putDontNest(result, 850, 717);
    
    _putDontNest(result, 850, 724);
    
    _putDontNest(result, 850, 731);
    
    _putDontNest(result, 850, 738);
    
    _putDontNest(result, 850, 745);
    
    _putDontNest(result, 850, 752);
    
    _putDontNest(result, 850, 759);
    
    _putDontNest(result, 850, 766);
    
    _putDontNest(result, 850, 773);
    
    _putDontNest(result, 850, 780);
    
    _putDontNest(result, 850, 859);
    
    _putDontNest(result, 850, 871);
    
    _putDontNest(result, 855, 859);
    
    _putDontNest(result, 859, 697);
    
    _putDontNest(result, 859, 710);
    
    _putDontNest(result, 859, 717);
    
    _putDontNest(result, 859, 724);
    
    _putDontNest(result, 859, 731);
    
    _putDontNest(result, 859, 738);
    
    _putDontNest(result, 859, 745);
    
    _putDontNest(result, 859, 752);
    
    _putDontNest(result, 859, 759);
    
    _putDontNest(result, 859, 766);
    
    _putDontNest(result, 859, 773);
    
    _putDontNest(result, 859, 780);
    
    _putDontNest(result, 4627, 371);
    
    _putDontNest(result, 5975, 595);
   return result;
  }
    
  protected static IntegerMap _initDontNestGroups() {
    IntegerMap result = new IntegerMap();
    int resultStoreId = result.size();
    
    
    ++resultStoreId;
    
    result.putUnsafe(693, resultStoreId);
    result.putUnsafe(700, resultStoreId);
    result.putUnsafe(713, resultStoreId);
    result.putUnsafe(720, resultStoreId);
    result.putUnsafe(727, resultStoreId);
    result.putUnsafe(734, resultStoreId);
    result.putUnsafe(741, resultStoreId);
    result.putUnsafe(748, resultStoreId);
    result.putUnsafe(755, resultStoreId);
    result.putUnsafe(762, resultStoreId);
    result.putUnsafe(769, resultStoreId);
    result.putUnsafe(776, resultStoreId);
    result.putUnsafe(859, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(855, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(676, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(653, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(644, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(662, resultStoreId);
    result.putUnsafe(669, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(656, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(665, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(4627, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(647, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(606, resultStoreId);
    result.putUnsafe(615, resultStoreId);
    result.putUnsafe(624, resultStoreId);
    result.putUnsafe(631, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(5975, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(612, resultStoreId);
    result.putUnsafe(621, resultStoreId);
    result.putUnsafe(628, resultStoreId);
    result.putUnsafe(635, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(567, resultStoreId);
    result.putUnsafe(574, resultStoreId);
    result.putUnsafe(581, resultStoreId);
    result.putUnsafe(588, resultStoreId);
    result.putUnsafe(595, resultStoreId);
    result.putUnsafe(602, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(672, resultStoreId);
    result.putUnsafe(850, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(638, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(539, resultStoreId);
    result.putUnsafe(548, resultStoreId);
    result.putUnsafe(555, resultStoreId);
    result.putUnsafe(563, resultStoreId);
    result.putUnsafe(570, resultStoreId);
    result.putUnsafe(577, resultStoreId);
    result.putUnsafe(584, resultStoreId);
    result.putUnsafe(591, resultStoreId);
    result.putUnsafe(598, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(545, resultStoreId);
    result.putUnsafe(552, resultStoreId);
    result.putUnsafe(559, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(447, resultStoreId);
    result.putUnsafe(452, resultStoreId);
    result.putUnsafe(459, resultStoreId);
    result.putUnsafe(466, resultStoreId);
    result.putUnsafe(471, resultStoreId);
    result.putUnsafe(476, resultStoreId);
    result.putUnsafe(483, resultStoreId);
    result.putUnsafe(488, resultStoreId);
    result.putUnsafe(498, resultStoreId);
    result.putUnsafe(507, resultStoreId);
    result.putUnsafe(516, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(526, resultStoreId);
    result.putUnsafe(535, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(520, resultStoreId);
    result.putUnsafe(529, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(492, resultStoreId);
    result.putUnsafe(501, resultStoreId);
    result.putUnsafe(510, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(434, resultStoreId);
    result.putUnsafe(439, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(430, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(399, resultStoreId);
    result.putUnsafe(406, resultStoreId);
    result.putUnsafe(415, resultStoreId);
      
    return result;
  }
  
  protected boolean hasNestingRestrictions(java.lang.String name){
		return (_dontNest.size() != 0); // TODO Make more specific.
  }
    
  protected IntegerList getFilteredParents(int childId) {
		return _dontNest.get(childId);
  }
    
  // initialize priorities     
  static {
    _dontNest = _initDontNest();
    _resultStoreIdMappings = _initDontNestGroups();
  }
    
  // Production declarations
	
  private static final IConstructor prod__empty__ = (IConstructor) _read("prod(empty(),[],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_private_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"private\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_true_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"true\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_function_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"function\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_volatile_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"volatile\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_default_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"default\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_double_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"double\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_delete_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"delete\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_new_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"new\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_try_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"try\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_instanceof_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"instanceof\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_false_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"false\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_in_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"in\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_else_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"else\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_finally_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"finally\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_null_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"null\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_return_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"return\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_void_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"void\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_catch_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"catch\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_char_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"char\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_typeof_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"typeof\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_transient_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"transient\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_this_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"this\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_var_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"var\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_while_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"while\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_super_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"super\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_const_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"const\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_switch_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"switch\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_public_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"public\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_throws_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"throws\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_float_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"float\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_it_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"it\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_with_lit_abstract_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"with\"),lit(\"abstract\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_case_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"case\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_long_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"long\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_throw_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"throw\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_static_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"static\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_for_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"for\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_break_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"break\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_implements_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"implements\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_extends_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"extends\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_continue_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"continue\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_boolean_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"boolean\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_do_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"do\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_export_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"export\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_protected_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"protected\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_package_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"package\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_import_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"import\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_debugger_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"debugger\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_short_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"short\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_native_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"native\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_synchronized_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"synchronized\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_byte_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"byte\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_final_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"final\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_goto_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"goto\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_interface_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"interface\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_int_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"int\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_enum_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"enum\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_if_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"if\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_class_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"class\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_char_class___range__43_43_range__45_45__char_class___range__0_0_lit___111_112_116_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_51_44_52_51_41_44_114_97_110_103_101_40_52_53_44_52_53_41_93_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__char_class___range__43_43_range__45_45 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(43,43),range(45,45)])),[\\char-class([range(0,0)]),lit(\"opt(\\\\char-class([range(43,43),range(45,45)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(\\char-class([range(43,43),range(45,45)]))))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_char_class___range__65_90_range__97_122__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__char_class___range__65_90_range__97_122 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(65,90),range(97,122)])),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(\\\\char-class([range(65,90),range(97,122)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(\\char-class([range(65,90),range(97,122)]))))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_char_class___range__48_57__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_56_44_53_55_41_93_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__char_class___range__48_57 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(48,57)])),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(\\\\char-class([range(48,57)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(\\char-class([range(48,57)]))))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_char_class___range__48_57_range__65_70_range__97_102__char_class___range__0_0_lit___105_116_101_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_55_48_41_44_114_97_110_103_101_40_57_55_44_49_48_50_41_93_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter__char_class___range__48_57_range__65_70_range__97_102 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(48,57),range(65,70),range(97,102)])),[\\char-class([range(0,0)]),lit(\"iter(\\\\char-class([range(48,57),range(65,70),range(97,102)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(iter(\\char-class([range(48,57),range(65,70),range(97,102)]))))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_char_class___range__61_61__char_class___range__0_0_lit___111_112_116_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_49_44_54_49_41_93_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__char_class___range__61_61 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(61,61)])),[\\char-class([range(0,0)]),lit(\"opt(\\\\char-class([range(61,61)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(\\char-class([range(61,61)]))))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_char_class___range__1_9_range__11_16777215__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_49_44_57_41_44_114_97_110_103_101_40_49_49_44_49_54_55_55_55_50_49_53_41_93_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__char_class___range__1_9_range__11_16777215 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(1,9),range(11,16777215)])),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(\\\\char-class([range(1,9),range(11,16777215)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(\\char-class([range(1,9),range(11,16777215)]))))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_char_class___range__48_57__char_class___range__0_0_lit___105_116_101_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_56_44_53_55_41_93_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter__char_class___range__48_57 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(48,57)])),[\\char-class([range(0,0)]),lit(\"iter(\\\\char-class([range(48,57)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(iter(\\char-class([range(48,57)]))))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_CharacterEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CharacterEscapeSequence = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"CharacterEscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"CharacterEscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"CharacterEscapeSequence\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Comment__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Comment = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Comment\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Comment\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Comment\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_CommentChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__CommentChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"CommentChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"CommentChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"CommentChar\"))))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_CommentChar__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CommentChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"CommentChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"CommentChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"CommentChar\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Decimal__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Decimal = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Decimal\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Decimal\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Decimal\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_DecimalInteger__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DecimalInteger = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"DecimalInteger\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"DecimalInteger\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"DecimalInteger\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DoubleStringChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"DoubleStringChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"DoubleStringChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"DoubleStringChar\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__DoubleStringChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"DoubleStringChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"DoubleStringChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"DoubleStringChar\"))))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_EscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeCharacter = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"EscapeCharacter\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"EscapeCharacter\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"EscapeCharacter\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_EscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeSequence = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"EscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"EscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"EscapeSequence\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ExponentPart = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"ExponentPart\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"ExponentPart\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"ExponentPart\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__ExponentPart = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"ExponentPart\")),[\\char-class([range(0,0)]),lit(\"opt(sort(\\\"ExponentPart\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(lex(\"ExponentPart\"))))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_HexDigit__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_68_105_103_105_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexDigit = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"HexDigit\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"HexDigit\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"HexDigit\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_HexEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexEscapeSequence = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"HexEscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"HexEscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"HexEscapeSequence\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_HexInteger__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexInteger = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"HexInteger\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"HexInteger\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"HexInteger\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Id__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_73_100_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Id\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star-seps(sort(\\\"Id\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(lex(\"Id\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Id__char_class___range__0_0_lit___115_111_114_116_40_34_73_100_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Id = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Id\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Id\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Id\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__LAYOUT = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"LAYOUT\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"LAYOUT\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"LAYOUT\"))))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___115_111_114_116_40_34_76_65_89_79_85_84_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LAYOUT = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"LAYOUT\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"LAYOUT\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"LAYOUT\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_NonEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_78_111_110_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__NonEscapeCharacter = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"NonEscapeCharacter\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"NonEscapeCharacter\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"NonEscapeCharacter\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpression__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpression = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpression\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpression\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpression\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionBackslashSequence__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBackslashSequence = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionBackslashSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionBackslashSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionBackslashSequence\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionBody__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_111_100_121_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBody = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionBody\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionBody\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionBody\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionChar\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"RegularExpressionChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"RegularExpressionChar\"))))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionClass__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClass = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionClass\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionClass\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionClass\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClassChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionClassChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionClassChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionClassChar\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionClassChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionClassChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"RegularExpressionClassChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"RegularExpressionClassChar\"))))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionFirstChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFirstChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionFirstChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionFirstChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionFirstChar\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionFlags__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_108_97_103_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFlags = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionFlags\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionFlags\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionFlags\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_SignedInteger__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_103_110_101_100_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SignedInteger = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"SignedInteger\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"SignedInteger\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"SignedInteger\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_SingleEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleEscapeCharacter = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"SingleEscapeCharacter\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"SingleEscapeCharacter\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"SingleEscapeCharacter\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__SingleStringChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"SingleStringChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"SingleStringChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"SingleStringChar\"))))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleStringChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"SingleStringChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"SingleStringChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"SingleStringChar\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_String__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_114_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__String = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"String\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"String\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"String\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Whitespace__char_class___range__0_0_lit___115_111_114_116_40_34_87_104_105_116_101_115_112_97_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Whitespace = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Whitespace\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Whitespace\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Whitespace\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_lit___44__char_class___range__0_0_lit___111_112_116_40_108_105_116_40_34_44_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__lit___44 = (IConstructor) _read("prod(label(\"$MetaHole\",lit(\",\")),[\\char-class([range(0,0)]),lit(\"opt(lit(\\\",\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(lit(\",\"))))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122__char_class___range__0_0_lit___115_101_113_40_91_99_111_110_100_105_116_105_111_110_97_108_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_44_123_92_110_111_116_45_112_114_101_99_101_100_101_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41_125_41_44_99_111_110_100_105_116_105_111_110_97_108_40_92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41_44_123_92_110_111_116_45_102_111_108_108_111_119_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41_125_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122 = (IConstructor) _read("prod(label(\"$MetaHole\",seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})])),[\\char-class([range(0,0)]),lit(\"seq([conditional(\\\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\\\not-precede(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\\\iter-star(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\\\not-follow(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})])))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_seq___char_class___range__61_61_layouts_LAYOUTLIST_opt__char_class___range__61_61__char_class___range__0_0_lit___115_101_113_40_91_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_49_44_54_49_41_93_41_44_108_97_121_111_117_116_115_40_34_76_65_89_79_85_84_76_73_83_84_34_41_44_111_112_116_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_49_44_54_49_41_93_41_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__seq___char_class___range__61_61_layouts_LAYOUTLIST_opt__char_class___range__61_61 = (IConstructor) _read("prod(label(\"$MetaHole\",seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))])),[\\char-class([range(0,0)]),lit(\"seq([\\\\char-class([range(61,61)]),layouts(\\\"LAYOUTLIST\\\"),opt(\\\\char-class([range(61,61)]))])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))])))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Boolean__char_class___range__0_0_lit___115_111_114_116_40_34_66_111_111_108_101_97_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Boolean = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Boolean\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Boolean\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Boolean\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_CaseClause__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__CaseClause__layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"CaseClause\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"CaseClause\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"CaseClause\"),[layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_CaseClause__char_class___range__0_0_lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CaseClause = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"CaseClause\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"CaseClause\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"CaseClause\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Expression__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Expression = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Expression\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Expression\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Expression\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Expression__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Expression\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star-seps(sort(\\\"Expression\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Fields__char_class___range__0_0_lit___115_111_114_116_40_34_70_105_101_108_100_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Fields = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Fields\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Fields\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Fields\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Function__char_class___range__0_0_lit___115_111_114_116_40_34_70_117_110_99_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Function = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Function\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Function\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Function\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Generator__char_class___range__0_0_lit___115_111_114_116_40_34_71_101_110_101_114_97_116_111_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Generator = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Generator\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Generator\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Generator\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Generator__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_71_101_110_101_114_97_116_111_114_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__Generator__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Generator\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-seps(sort(\\\"Generator\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-seps(sort(\"Generator\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Literal__char_class___range__0_0_lit___115_111_114_116_40_34_76_105_116_101_114_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Literal = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Literal\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Literal\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Literal\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Numeric__char_class___range__0_0_lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Numeric = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Numeric\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Numeric\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Numeric\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"PropertyAssignment\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star-seps(sort(\\\"PropertyAssignment\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"PropertyAssignment\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyAssignment = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"PropertyAssignment\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"PropertyAssignment\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"PropertyAssignment\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_PropertyName__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyName = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"PropertyName\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"PropertyName\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"PropertyName\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Source__char_class___range__0_0_lit___115_111_114_116_40_34_83_111_117_114_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Source = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Source\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Source\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Source\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_State__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__State = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"State\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"State\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"State\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_State__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__State__layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"State\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"State\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"State\"),[layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Statement__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Statement__layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Statement\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"Statement\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Statement__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Statement = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Statement\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Statement\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Statement\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_States__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__States = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"States\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"States\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"States\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Trans__char_class___range__0_0_lit___115_111_114_116_40_34_84_114_97_110_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Trans = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Trans\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Trans\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Trans\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Trans__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_84_114_97_110_115_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Trans__layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Trans\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"Trans\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"Trans\"),[layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Transitions__char_class___range__0_0_lit___115_111_114_116_40_34_84_114_97_110_115_105_116_105_111_110_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Transitions = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Transitions\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Transitions\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Transitions\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_UnicodeEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_85_110_105_99_111_100_101_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__UnicodeEscapeSequence = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"UnicodeEscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"UnicodeEscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"UnicodeEscapeSequence\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_VarDecl__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VarDecl = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VarDecl\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"VarDecl\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"VarDecl\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VariableDeclaration\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-seps(sort(\\\"VariableDeclaration\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-seps(sort(\"VariableDeclaration\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclaration = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VariableDeclaration\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"VariableDeclaration\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"VariableDeclaration\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VariableDeclarationNoIn\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-seps(sort(\\\"VariableDeclarationNoIn\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-seps(sort(\"VariableDeclarationNoIn\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclarationNoIn = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VariableDeclarationNoIn\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"VariableDeclarationNoIn\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"VariableDeclarationNoIn\")))})", Factory.Production);
  private static final IConstructor prod__add_Expression__Expression_layouts_LAYOUTLIST_lit___43_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"add\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"+\"),{\\not-follow(\\char-class([range(43,43),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__and_Expression__Expression_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"and\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"&&\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__array_Expression__lit___91_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"array\",sort(\"Expression\")),[lit(\"[\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),opt(lit(\",\")),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__assign_Expression__Expression_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assign\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"=\"),{\\not-follow(seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__assignAdd_Expression__Expression_layouts_LAYOUTLIST_lit___43_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignAdd\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"+=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__assignBinAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignBinAnd\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"&=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__assignBinOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignBinOr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"|=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__assignBinXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignBinXor\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"^=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__assignDiv_Expression__Expression_layouts_LAYOUTLIST_lit___47_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignDiv\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"/=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__assignMul_Expression__Expression_layouts_LAYOUTLIST_lit___42_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignMul\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"*=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__assignRem_Expression__Expression_layouts_LAYOUTLIST_lit___37_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignRem\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"%=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__assignShl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignShl\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\<\\<=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__assignShr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignShr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>\\>=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__assignShrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignShrr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>\\>\\>=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__assignSub_Expression__Expression_layouts_LAYOUTLIST_lit___45_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignSub\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"-=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__binAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"binAnd\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"&\"),{\\not-follow(\\char-class([range(38,38),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__binNeg_Expression__lit___126_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"binNeg\",sort(\"Expression\")),[lit(\"~\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__binOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"binOr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"|\"),{\\not-follow(\\char-class([range(61,61),range(124,124)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__binXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"binXor\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"^\"),{\\not-follow(\\char-class([range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__block_Statement__lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"block\",sort(\"Statement\")),[lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__bracket_Expression__lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41__bracket = (IConstructor) _read("prod(label(\"bracket\",sort(\"Expression\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\")\")],{bracket()})", Factory.Production);
  private static final IConstructor prod__breakLabel_Statement__lit_break_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"breakLabel\",sort(\"Statement\")),[lit(\"break\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__breakNoLabel_Statement__lit_break_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"breakNoLabel\",sort(\"Statement\")),[lit(\"break\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__call_Expression__Expression_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"call\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__caseOf_CaseClause__lit_case_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"caseOf\",sort(\"CaseClause\")),[lit(\"case\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])],{})", Factory.Production);
  private static final IConstructor prod__cond_Expression__Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"cond\",sort(\"Expression\")),[conditional(sort(\"Expression\"),{except(\"cond\")}),layouts(\"LAYOUTLIST\"),lit(\"?\"),layouts(\"LAYOUTLIST\"),conditional(sort(\"Expression\"),{except(\"cond\")}),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__continueLabel_Statement__lit_continue_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"continueLabel\",sort(\"Statement\")),[lit(\"continue\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__continueNoLabel_Statement__lit_continue_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"continueNoLabel\",sort(\"Statement\")),[lit(\"continue\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__debugger_Statement__lit_debugger_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"debugger\",sort(\"Statement\")),[lit(\"debugger\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__defaultCase_CaseClause__lit_default_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"defaultCase\",sort(\"CaseClause\")),[lit(\"default\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])],{})", Factory.Production);
  private static final IConstructor prod__delete_Expression__lit_delete_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"delete\",sort(\"Expression\")),[lit(\"delete\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__div_Expression__Expression_layouts_LAYOUTLIST_lit___47_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"div\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"/\"),{\\not-follow(\\char-class([range(47,47),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__doWhile_Statement__lit_do_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"doWhile\",sort(\"Statement\")),[lit(\"do\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"while\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__empty_Statement__lit___59_ = (IConstructor) _read("prod(label(\"empty\",sort(\"Statement\")),[lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__eq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"eq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"==\"),{\\not-follow(\\char-class([range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__eqq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"eqq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"===\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__expression_Statement__Expression_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"expression\",sort(\"Statement\")),[conditional(sort(\"Expression\"),{except(\"function\")}),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__forDo_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"forDo\",sort(\"Statement\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"conds\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"ops\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__forDoDeclarations_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit_var_layouts_LAYOUTLIST_iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"forDoDeclarations\",sort(\"Statement\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),lit(\"var\"),layouts(\"LAYOUTLIST\"),\\iter-seps(sort(\"VariableDeclarationNoIn\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"conds\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"ops\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__forIn_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_var_Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"forIn\",sort(\"Statement\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"var\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"in\"),layouts(\"LAYOUTLIST\"),label(\"obj\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__forInDeclaration_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit_var_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"forInDeclaration\",sort(\"Statement\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),lit(\"var\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\"in\"),layouts(\"LAYOUTLIST\"),label(\"obj\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__function_Expression__Function_ = (IConstructor) _read("prod(label(\"function\",sort(\"Expression\")),[sort(\"Function\")],{})", Factory.Production);
  private static final IConstructor prod__function_Statement__Function_ = (IConstructor) _read("prod(label(\"function\",sort(\"Statement\")),[sort(\"Function\")],{})", Factory.Production);
  private static final IConstructor prod__geq_Expression__Expression_layouts_LAYOUTLIST_lit___62_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"geq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__gt_Expression__Expression_layouts_LAYOUTLIST_lit___62_layouts_LAYOUTLIST_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"gt\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__ifThen_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_empty_ = (IConstructor) _read("prod(label(\"ifThen\",sort(\"Statement\")),[lit(\"if\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),conditional(empty(),{\\not-follow(lit(\"else\"))})],{})", Factory.Production);
  private static final IConstructor prod__ifThenElse_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"ifThenElse\",sort(\"Statement\")),[lit(\"if\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"else\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__init_VariableDeclaration__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_ = (IConstructor) _read("prod(label(\"init\",sort(\"VariableDeclaration\")),[label(\"id\",lex(\"Id\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"exp\",sort(\"Expression\"))],{})", Factory.Production);
  private static final IConstructor prod__init_VariableDeclarationNoIn__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_ = (IConstructor) _read("prod(label(\"init\",sort(\"VariableDeclarationNoIn\")),[label(\"id\",lex(\"Id\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"exp\",conditional(sort(\"Expression\"),{except(\"inn\")}))],{})", Factory.Production);
  private static final IConstructor prod__inn_Expression__Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"inn\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"in\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__instanceof_Expression__Expression_layouts_LAYOUTLIST_lit_instanceof_layouts_LAYOUTLIST_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"instanceof\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"instanceof\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__labeled_Statement__Id_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"labeled\",sort(\"Statement\")),[lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__leq_Expression__Expression_layouts_LAYOUTLIST_lit___60_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"leq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\<=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__literal_Expression__Literal_ = (IConstructor) _read("prod(label(\"literal\",sort(\"Expression\")),[sort(\"Literal\")],{})", Factory.Production);
  private static final IConstructor prod__lt_Expression__Expression_layouts_LAYOUTLIST_lit___60_layouts_LAYOUTLIST_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"lt\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\<\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__member_Expression__Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"member\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"[\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__mul_Expression__Expression_layouts_LAYOUTLIST_lit___42_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"mul\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"*\"),{\\not-follow(\\char-class([range(42,42),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__neq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"neq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"!=\"),{\\not-follow(\\char-class([range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__neqq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"neqq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"!==\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__new_Expression__lit_new_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"new\",sort(\"Expression\")),[lit(\"new\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__nonInit_VariableDeclaration__id_Id_ = (IConstructor) _read("prod(label(\"nonInit\",sort(\"VariableDeclaration\")),[label(\"id\",lex(\"Id\"))],{})", Factory.Production);
  private static final IConstructor prod__nonInit_VariableDeclarationNoIn__id_Id_ = (IConstructor) _read("prod(label(\"nonInit\",sort(\"VariableDeclarationNoIn\")),[label(\"id\",lex(\"Id\"))],{})", Factory.Production);
  private static final IConstructor prod__not_Expression__lit___33_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"not\",sort(\"Expression\")),[conditional(lit(\"!\"),{\\not-follow(\\char-class([range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__objectDefinition_Expression__lit___123_layouts_LAYOUTLIST_iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"objectDefinition\",sort(\"Expression\")),[lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"PropertyAssignment\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),opt(lit(\",\")),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__or_Expression__Expression_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"or\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"||\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__postDec_Expression__Expression_layouts_LAYOUTLIST_lit____ = (IConstructor) _read("prod(label(\"postDec\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"--\")],{})", Factory.Production);
  private static final IConstructor prod__postIncr_Expression__Expression_layouts_LAYOUTLIST_lit___43_43_ = (IConstructor) _read("prod(label(\"postIncr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"++\")],{})", Factory.Production);
  private static final IConstructor prod__preDecr_Expression__lit____layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"preDecr\",sort(\"Expression\")),[lit(\"--\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__preIncr_Expression__lit___43_43_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"preIncr\",sort(\"Expression\")),[lit(\"++\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__prefixMin_Expression__lit___layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"prefixMin\",sort(\"Expression\")),[conditional(lit(\"-\"),{\\not-follow(\\char-class([range(45,45),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__prefixPlus_Expression__lit___43_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"prefixPlus\",sort(\"Expression\")),[conditional(lit(\"+\"),{\\not-follow(\\char-class([range(43,43),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__property_Expression__Expression_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_Id_ = (IConstructor) _read("prod(label(\"property\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\".\"),layouts(\"LAYOUTLIST\"),lex(\"Id\")],{})", Factory.Production);
  private static final IConstructor prod__property_PropertyAssignment__PropertyName_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"property\",sort(\"PropertyAssignment\")),[sort(\"PropertyName\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__rem_Expression__Expression_layouts_LAYOUTLIST_lit___37_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"rem\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"%\"),{\\not-follow(\\char-class([range(37,37),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__returnExp_Statement__lit_return_layouts_LAYOUTLIST_exp_Expression_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"returnExp\",sort(\"Statement\")),[lit(\"return\"),layouts(\"LAYOUTLIST\"),label(\"exp\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__returnNoExp_Statement__lit_return_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"returnNoExp\",sort(\"Statement\")),[lit(\"return\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__shl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"shl\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\<\\<\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__shr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"shr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"\\>\\>\"),{\\not-follow(\\char-class([range(62,62)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__shrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"shrr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>\\>\\>\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__source_Source__iter_star_seps__Statement__layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"source\",sort(\"Source\")),[\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])],{})", Factory.Production);
  private static final IConstructor prod__sub_Expression__Expression_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"sub\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"-\"),{\\not-follow(\\char-class([range(45,45),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__switchCase_Statement__lit_switch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_clauses_iter_star_seps__CaseClause__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"switchCase\",sort(\"Statement\")),[lit(\"switch\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"clauses\",\\iter-star-seps(sort(\"CaseClause\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__this_Expression__lit_this_ = (IConstructor) _read("prod(label(\"this\",sort(\"Expression\")),[lit(\"this\")],{})", Factory.Production);
  private static final IConstructor prod__throwExp_Statement__lit_throw_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"throwExp\",sort(\"Statement\")),[lit(\"throw\"),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__throwNoExp_Statement__lit_throw_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"throwNoExp\",sort(\"Statement\")),[lit(\"throw\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__tryCatch_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"tryCatch\",sort(\"Statement\")),[lit(\"try\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"catch\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__tryCatchFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"tryCatchFinally\",sort(\"Statement\")),[lit(\"try\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"catch\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"finally\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__tryFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"tryFinally\",sort(\"Statement\")),[lit(\"try\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"finally\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__typeof_Expression__lit_typeof_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"typeof\",sort(\"Expression\")),[lit(\"typeof\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__var_Expression__Id_ = (IConstructor) _read("prod(label(\"var\",sort(\"Expression\")),[lex(\"Id\")],{})", Factory.Production);
  private static final IConstructor prod__varDecl_Statement__VarDecl_ = (IConstructor) _read("prod(label(\"varDecl\",sort(\"Statement\")),[sort(\"VarDecl\")],{})", Factory.Production);
  private static final IConstructor prod__whileDo_Statement__lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"whileDo\",sort(\"Statement\")),[lit(\"while\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__with_Statement__lit_with_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_scope_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"with\",sort(\"Statement\")),[lit(\"with\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"scope\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__layouts_$default$__ = (IConstructor) _read("prod(layouts(\"$default$\"),[],{})", Factory.Production);
  private static final IConstructor prod__layouts_LAYOUTLIST__iter_star__LAYOUT_ = (IConstructor) _read("prod(layouts(\"LAYOUTLIST\"),[conditional(\\iter-star(lex(\"LAYOUT\")),{\\not-follow(\\char-class([range(9,10),range(32,32)])),\\not-follow(lit(\"//\")),\\not-follow(lit(\"/*\"))})],{})", Factory.Production);
  private static final IConstructor prod__CharacterEscapeSequence__SingleEscapeCharacter_ = (IConstructor) _read("prod(lex(\"CharacterEscapeSequence\"),[lex(\"SingleEscapeCharacter\")],{})", Factory.Production);
  private static final IConstructor prod__CharacterEscapeSequence__NonEscapeCharacter_ = (IConstructor) _read("prod(lex(\"CharacterEscapeSequence\"),[lex(\"NonEscapeCharacter\")],{})", Factory.Production);
  private static final IConstructor prod__Comment__lit___47_42_iter_star__CommentChar_lit___42_47__tag__category___67_111_109_109_101_110_116 = (IConstructor) _read("prod(lex(\"Comment\"),[lit(\"/*\"),\\iter-star(lex(\"CommentChar\")),lit(\"*/\")],{tag(\"category\"(\"Comment\"))})", Factory.Production);
  private static final IConstructor prod__Comment__lit___47_47_iter_star__char_class___range__1_9_range__11_16777215__tag__category___67_111_109_109_101_110_116 = (IConstructor) _read("prod(lex(\"Comment\"),[lit(\"//\"),conditional(\\iter-star(\\char-class([range(1,9),range(11,16777215)])),{\\end-of-line()})],{tag(\"category\"(\"Comment\"))})", Factory.Production);
  private static final IConstructor prod__CommentChar__char_class___range__42_42_ = (IConstructor) _read("prod(lex(\"CommentChar\"),[conditional(\\char-class([range(42,42)]),{\\not-follow(\\char-class([range(47,47)]))})],{})", Factory.Production);
  private static final IConstructor prod__CommentChar__char_class___range__1_41_range__43_16777215_ = (IConstructor) _read("prod(lex(\"CommentChar\"),[\\char-class([range(1,41),range(43,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__Decimal__DecimalInteger_opt__ExponentPart_ = (IConstructor) _read("prod(lex(\"Decimal\"),[lex(\"DecimalInteger\"),opt(lex(\"ExponentPart\"))],{})", Factory.Production);
  private static final IConstructor prod__Decimal__DecimalInteger_char_class___range__46_46_iter_star__char_class___range__48_57_opt__ExponentPart_ = (IConstructor) _read("prod(lex(\"Decimal\"),[lex(\"DecimalInteger\"),\\char-class([range(46,46)]),\\iter-star(\\char-class([range(48,57)])),opt(lex(\"ExponentPart\"))],{})", Factory.Production);
  private static final IConstructor prod__Decimal__char_class___range__46_46_iter__char_class___range__48_57_opt__ExponentPart_ = (IConstructor) _read("prod(lex(\"Decimal\"),[\\char-class([range(46,46)]),iter(\\char-class([range(48,57)])),opt(lex(\"ExponentPart\"))],{})", Factory.Production);
  private static final IConstructor prod__DecimalInteger__char_class___range__48_48_ = (IConstructor) _read("prod(lex(\"DecimalInteger\"),[\\char-class([range(48,48)])],{})", Factory.Production);
  private static final IConstructor prod__DecimalInteger__char_class___range__49_57_iter_star__char_class___range__48_57_ = (IConstructor) _read("prod(lex(\"DecimalInteger\"),[\\char-class([range(49,57)]),conditional(\\iter-star(\\char-class([range(48,57)])),{\\not-follow(\\char-class([range(48,57)]))})],{})", Factory.Production);
  private static final IConstructor prod__DoubleStringChar__char_class___range__1_9_range__11_33_range__35_91_range__93_16777215_ = (IConstructor) _read("prod(lex(\"DoubleStringChar\"),[\\char-class([range(1,9),range(11,33),range(35,91),range(93,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__DoubleStringChar__char_class___range__92_92_EscapeSequence_ = (IConstructor) _read("prod(lex(\"DoubleStringChar\"),[\\char-class([range(92,92)]),lex(\"EscapeSequence\")],{})", Factory.Production);
  private static final IConstructor prod__EscapeCharacter__char_class___range__117_117_range__120_120_ = (IConstructor) _read("prod(lex(\"EscapeCharacter\"),[\\char-class([range(117,117),range(120,120)])],{})", Factory.Production);
  private static final IConstructor prod__EscapeCharacter__char_class___range__48_57_ = (IConstructor) _read("prod(lex(\"EscapeCharacter\"),[\\char-class([range(48,57)])],{})", Factory.Production);
  private static final IConstructor prod__EscapeCharacter__SingleEscapeCharacter_ = (IConstructor) _read("prod(lex(\"EscapeCharacter\"),[lex(\"SingleEscapeCharacter\")],{})", Factory.Production);
  private static final IConstructor prod__EscapeSequence__char_class___range__48_48_ = (IConstructor) _read("prod(lex(\"EscapeSequence\"),[conditional(\\char-class([range(48,48)]),{\\not-follow(\\char-class([range(48,57)]))})],{})", Factory.Production);
  private static final IConstructor prod__EscapeSequence__HexEscapeSequence_ = (IConstructor) _read("prod(lex(\"EscapeSequence\"),[lex(\"HexEscapeSequence\")],{})", Factory.Production);
  private static final IConstructor prod__EscapeSequence__UnicodeEscapeSequence_ = (IConstructor) _read("prod(lex(\"EscapeSequence\"),[sort(\"UnicodeEscapeSequence\")],{})", Factory.Production);
  private static final IConstructor prod__EscapeSequence__CharacterEscapeSequence_ = (IConstructor) _read("prod(lex(\"EscapeSequence\"),[lex(\"CharacterEscapeSequence\")],{})", Factory.Production);
  private static final IConstructor prod__ExponentPart__char_class___range__69_69_range__101_101_SignedInteger_ = (IConstructor) _read("prod(lex(\"ExponentPart\"),[\\char-class([range(69,69),range(101,101)]),lex(\"SignedInteger\")],{})", Factory.Production);
  private static final IConstructor prod__HexDigit__char_class___range__48_57_range__65_70_range__97_102_ = (IConstructor) _read("prod(lex(\"HexDigit\"),[\\char-class([range(48,57),range(65,70),range(97,102)])],{})", Factory.Production);
  private static final IConstructor prod__HexEscapeSequence__char_class___range__120_120_HexDigit_HexDigit_ = (IConstructor) _read("prod(lex(\"HexEscapeSequence\"),[\\char-class([range(120,120)]),lex(\"HexDigit\"),lex(\"HexDigit\")],{})", Factory.Production);
  private static final IConstructor prod__HexInteger__char_class___range__48_48_char_class___range__88_88_range__120_120_iter__char_class___range__48_57_range__65_70_range__97_102_ = (IConstructor) _read("prod(lex(\"HexInteger\"),[\\char-class([range(48,48)]),\\char-class([range(88,88),range(120,120)]),conditional(iter(\\char-class([range(48,57),range(65,70),range(97,102)])),{\\not-follow(\\char-class([range(65,90),range(95,95),range(97,122)]))})],{})", Factory.Production);
  private static final IConstructor prod__Id__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122_ = (IConstructor) _read("prod(lex(\"Id\"),[conditional(seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})]),{delete(keywords(\"Reserved\"))})],{})", Factory.Production);
  private static final IConstructor prod__LAYOUT__Whitespace_ = (IConstructor) _read("prod(lex(\"LAYOUT\"),[lex(\"Whitespace\")],{})", Factory.Production);
  private static final IConstructor prod__LAYOUT__Comment_ = (IConstructor) _read("prod(lex(\"LAYOUT\"),[lex(\"Comment\")],{})", Factory.Production);
  private static final IConstructor prod__NonEscapeCharacter__char_class___range__1_9_range__11_33_range__35_38_range__40_47_range__58_91_range__93_97_range__99_101_range__103_109_range__111_113_range__115_115_range__119_119_range__121_16777215_ = (IConstructor) _read("prod(lex(\"NonEscapeCharacter\"),[\\char-class([range(1,9),range(11,33),range(35,38),range(40,47),range(58,91),range(93,97),range(99,101),range(103,109),range(111,113),range(115,115),range(119,119),range(121,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__RegularExpression__char_class___range__47_47_RegularExpressionBody_char_class___range__47_47_RegularExpressionFlags_ = (IConstructor) _read("prod(lex(\"RegularExpression\"),[\\char-class([range(47,47)]),lex(\"RegularExpressionBody\"),\\char-class([range(47,47)]),lex(\"RegularExpressionFlags\")],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionBackslashSequence__char_class___range__92_92_char_class___range__1_9_range__11_16777215_ = (IConstructor) _read("prod(lex(\"RegularExpressionBackslashSequence\"),[\\char-class([range(92,92)]),\\char-class([range(1,9),range(11,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionBody__RegularExpressionFirstChar_iter_star__RegularExpressionChar_ = (IConstructor) _read("prod(lex(\"RegularExpressionBody\"),[lex(\"RegularExpressionFirstChar\"),\\iter-star(lex(\"RegularExpressionChar\"))],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionChar__char_class___range__1_9_range__11_46_range__48_90_range__93_16777215_ = (IConstructor) _read("prod(lex(\"RegularExpressionChar\"),[\\char-class([range(1,9),range(11,46),range(48,90),range(93,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionChar__RegularExpressionClass_ = (IConstructor) _read("prod(lex(\"RegularExpressionChar\"),[lex(\"RegularExpressionClass\")],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionChar__RegularExpressionBackslashSequence_ = (IConstructor) _read("prod(lex(\"RegularExpressionChar\"),[lex(\"RegularExpressionBackslashSequence\")],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionClass__char_class___range__91_91_iter_star__RegularExpressionClassChar_char_class___range__93_93_ = (IConstructor) _read("prod(lex(\"RegularExpressionClass\"),[\\char-class([range(91,91)]),\\iter-star(lex(\"RegularExpressionClassChar\")),\\char-class([range(93,93)])],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionClassChar__RegularExpressionBackslashSequence_ = (IConstructor) _read("prod(lex(\"RegularExpressionClassChar\"),[lex(\"RegularExpressionBackslashSequence\")],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionClassChar__char_class___range__1_9_range__11_91_range__94_16777215_ = (IConstructor) _read("prod(lex(\"RegularExpressionClassChar\"),[\\char-class([range(1,9),range(11,91),range(94,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionFirstChar__RegularExpressionBackslashSequence_ = (IConstructor) _read("prod(lex(\"RegularExpressionFirstChar\"),[lex(\"RegularExpressionBackslashSequence\")],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionFirstChar__RegularExpressionClass_ = (IConstructor) _read("prod(lex(\"RegularExpressionFirstChar\"),[lex(\"RegularExpressionClass\")],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionFirstChar__char_class___range__1_9_range__11_41_range__43_46_range__48_90_range__93_16777215_ = (IConstructor) _read("prod(lex(\"RegularExpressionFirstChar\"),[\\char-class([range(1,9),range(11,41),range(43,46),range(48,90),range(93,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionFlags__iter_star__char_class___range__65_90_range__97_122_ = (IConstructor) _read("prod(lex(\"RegularExpressionFlags\"),[conditional(\\iter-star(\\char-class([range(65,90),range(97,122)])),{\\not-follow(\\char-class([range(65,90),range(97,122)]))})],{})", Factory.Production);
  private static final IConstructor prod__SignedInteger__opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_ = (IConstructor) _read("prod(lex(\"SignedInteger\"),[opt(\\char-class([range(43,43),range(45,45)])),conditional(iter(\\char-class([range(48,57)])),{\\not-follow(\\char-class([range(48,57)]))})],{})", Factory.Production);
  private static final IConstructor prod__SingleEscapeCharacter__char_class___range__34_34_range__39_39_range__92_92_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116_range__118_118_ = (IConstructor) _read("prod(lex(\"SingleEscapeCharacter\"),[\\char-class([range(34,34),range(39,39),range(92,92),range(98,98),range(102,102),range(110,110),range(114,114),range(116,116),range(118,118)])],{})", Factory.Production);
  private static final IConstructor prod__SingleStringChar__char_class___range__92_92_EscapeSequence_ = (IConstructor) _read("prod(lex(\"SingleStringChar\"),[\\char-class([range(92,92)]),lex(\"EscapeSequence\")],{})", Factory.Production);
  private static final IConstructor prod__SingleStringChar__char_class___range__1_9_range__11_38_range__40_91_range__93_16777215_ = (IConstructor) _read("prod(lex(\"SingleStringChar\"),[\\char-class([range(1,9),range(11,38),range(40,91),range(93,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__String__char_class___range__39_39_iter_star__SingleStringChar_char_class___range__39_39_ = (IConstructor) _read("prod(lex(\"String\"),[\\char-class([range(39,39)]),\\iter-star(lex(\"SingleStringChar\")),\\char-class([range(39,39)])],{})", Factory.Production);
  private static final IConstructor prod__String__char_class___range__34_34_iter_star__DoubleStringChar_char_class___range__34_34_ = (IConstructor) _read("prod(lex(\"String\"),[\\char-class([range(34,34)]),\\iter-star(lex(\"DoubleStringChar\")),\\char-class([range(34,34)])],{})", Factory.Production);
  private static final IConstructor prod__Whitespace__char_class___range__9_10_range__13_13_range__32_32_ = (IConstructor) _read("prod(lex(\"Whitespace\"),[\\char-class([range(9,10),range(13,13),range(32,32)])],{})", Factory.Production);
  private static final IConstructor prod__lit___33__char_class___range__33_33_ = (IConstructor) _read("prod(lit(\"!\"),[\\char-class([range(33,33)])],{})", Factory.Production);
  private static final IConstructor prod__lit___33_61__char_class___range__33_33_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"!=\"),[\\char-class([range(33,33)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___33_61_61__char_class___range__33_33_char_class___range__61_61_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"!==\"),[\\char-class([range(33,33)]),\\char-class([range(61,61)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___35_40__char_class___range__35_35_char_class___range__40_40_ = (IConstructor) _read("prod(lit(\"#(\"),[\\char-class([range(35,35)]),\\char-class([range(40,40)])],{})", Factory.Production);
  private static final IConstructor prod__lit___37__char_class___range__37_37_ = (IConstructor) _read("prod(lit(\"%\"),[\\char-class([range(37,37)])],{})", Factory.Production);
  private static final IConstructor prod__lit___37_61__char_class___range__37_37_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"%=\"),[\\char-class([range(37,37)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___38__char_class___range__38_38_ = (IConstructor) _read("prod(lit(\"&\"),[\\char-class([range(38,38)])],{})", Factory.Production);
  private static final IConstructor prod__lit___38_38__char_class___range__38_38_char_class___range__38_38_ = (IConstructor) _read("prod(lit(\"&&\"),[\\char-class([range(38,38)]),\\char-class([range(38,38)])],{})", Factory.Production);
  private static final IConstructor prod__lit___38_61__char_class___range__38_38_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"&=\"),[\\char-class([range(38,38)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___40__char_class___range__40_40_ = (IConstructor) _read("prod(lit(\"(\"),[\\char-class([range(40,40)])],{})", Factory.Production);
  private static final IConstructor prod__lit___41__char_class___range__41_41_ = (IConstructor) _read("prod(lit(\")\"),[\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___42__char_class___range__42_42_ = (IConstructor) _read("prod(lit(\"*\"),[\\char-class([range(42,42)])],{})", Factory.Production);
  private static final IConstructor prod__lit___42_47__char_class___range__42_42_char_class___range__47_47_ = (IConstructor) _read("prod(lit(\"*/\"),[\\char-class([range(42,42)]),\\char-class([range(47,47)])],{})", Factory.Production);
  private static final IConstructor prod__lit___42_61__char_class___range__42_42_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"*=\"),[\\char-class([range(42,42)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___43__char_class___range__43_43_ = (IConstructor) _read("prod(lit(\"+\"),[\\char-class([range(43,43)])],{})", Factory.Production);
  private static final IConstructor prod__lit___43_43__char_class___range__43_43_char_class___range__43_43_ = (IConstructor) _read("prod(lit(\"++\"),[\\char-class([range(43,43)]),\\char-class([range(43,43)])],{})", Factory.Production);
  private static final IConstructor prod__lit___43_61__char_class___range__43_43_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"+=\"),[\\char-class([range(43,43)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___44__char_class___range__44_44_ = (IConstructor) _read("prod(lit(\",\"),[\\char-class([range(44,44)])],{})", Factory.Production);
  private static final IConstructor prod__lit____char_class___range__45_45_ = (IConstructor) _read("prod(lit(\"-\"),[\\char-class([range(45,45)])],{})", Factory.Production);
  private static final IConstructor prod__lit_____char_class___range__45_45_char_class___range__45_45_ = (IConstructor) _read("prod(lit(\"--\"),[\\char-class([range(45,45)]),\\char-class([range(45,45)])],{})", Factory.Production);
  private static final IConstructor prod__lit___45_61__char_class___range__45_45_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"-=\"),[\\char-class([range(45,45)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___46__char_class___range__46_46_ = (IConstructor) _read("prod(lit(\".\"),[\\char-class([range(46,46)])],{})", Factory.Production);
  private static final IConstructor prod__lit___47__char_class___range__47_47_ = (IConstructor) _read("prod(lit(\"/\"),[\\char-class([range(47,47)])],{})", Factory.Production);
  private static final IConstructor prod__lit___47_42__char_class___range__47_47_char_class___range__42_42_ = (IConstructor) _read("prod(lit(\"/*\"),[\\char-class([range(47,47)]),\\char-class([range(42,42)])],{})", Factory.Production);
  private static final IConstructor prod__lit___47_47__char_class___range__47_47_char_class___range__47_47_ = (IConstructor) _read("prod(lit(\"//\"),[\\char-class([range(47,47)]),\\char-class([range(47,47)])],{})", Factory.Production);
  private static final IConstructor prod__lit___47_61__char_class___range__47_47_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"/=\"),[\\char-class([range(47,47)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___58__char_class___range__58_58_ = (IConstructor) _read("prod(lit(\":\"),[\\char-class([range(58,58)])],{})", Factory.Production);
  private static final IConstructor prod__lit___59__char_class___range__59_59_ = (IConstructor) _read("prod(lit(\";\"),[\\char-class([range(59,59)])],{})", Factory.Production);
  private static final IConstructor prod__lit___60__char_class___range__60_60_ = (IConstructor) _read("prod(lit(\"\\<\"),[\\char-class([range(60,60)])],{})", Factory.Production);
  private static final IConstructor prod__lit___60_60__char_class___range__60_60_char_class___range__60_60_ = (IConstructor) _read("prod(lit(\"\\<\\<\"),[\\char-class([range(60,60)]),\\char-class([range(60,60)])],{})", Factory.Production);
  private static final IConstructor prod__lit___60_60_61__char_class___range__60_60_char_class___range__60_60_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"\\<\\<=\"),[\\char-class([range(60,60)]),\\char-class([range(60,60)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___60_61__char_class___range__60_60_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"\\<=\"),[\\char-class([range(60,60)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___61__char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"=\"),[\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___61_61__char_class___range__61_61_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"==\"),[\\char-class([range(61,61)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___61_61_61__char_class___range__61_61_char_class___range__61_61_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"===\"),[\\char-class([range(61,61)]),\\char-class([range(61,61)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___61_62__char_class___range__61_61_char_class___range__62_62_ = (IConstructor) _read("prod(lit(\"=\\>\"),[\\char-class([range(61,61)]),\\char-class([range(62,62)])],{})", Factory.Production);
  private static final IConstructor prod__lit___62__char_class___range__62_62_ = (IConstructor) _read("prod(lit(\"\\>\"),[\\char-class([range(62,62)])],{})", Factory.Production);
  private static final IConstructor prod__lit___62_61__char_class___range__62_62_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"\\>=\"),[\\char-class([range(62,62)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___62_62__char_class___range__62_62_char_class___range__62_62_ = (IConstructor) _read("prod(lit(\"\\>\\>\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)])],{})", Factory.Production);
  private static final IConstructor prod__lit___62_62_61__char_class___range__62_62_char_class___range__62_62_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"\\>\\>=\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___62_62_62__char_class___range__62_62_char_class___range__62_62_char_class___range__62_62_ = (IConstructor) _read("prod(lit(\"\\>\\>\\>\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(62,62)])],{})", Factory.Production);
  private static final IConstructor prod__lit___62_62_62_61__char_class___range__62_62_char_class___range__62_62_char_class___range__62_62_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"\\>\\>\\>=\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___63__char_class___range__63_63_ = (IConstructor) _read("prod(lit(\"?\"),[\\char-class([range(63,63)])],{})", Factory.Production);
  private static final IConstructor prod__lit___64_40__char_class___range__64_64_char_class___range__40_40_ = (IConstructor) _read("prod(lit(\"@(\"),[\\char-class([range(64,64)]),\\char-class([range(40,40)])],{})", Factory.Production);
  private static final IConstructor prod__lit___91__char_class___range__91_91_ = (IConstructor) _read("prod(lit(\"[\"),[\\char-class([range(91,91)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_71_101_110_101_114_97_116_111_114_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__71_71_char_class___range__101_101_char_class___range__110_110_char_class___range__101_101_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-seps(sort(\\\"Generator\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(71,71)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-seps(sort(\\\"VariableDeclaration\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__78_78_char_class___range__111_111_char_class___range__73_73_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-seps(sort(\\\"VariableDeclarationNoIn\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(78,78)]),\\char-class([range(111,111)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_49_44_57_41_44_114_97_110_103_101_40_49_49_44_49_54_55_55_55_50_49_53_41_93_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__49_49_char_class___range__44_44_char_class___range__57_57_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__49_49_char_class___range__49_49_char_class___range__44_44_char_class___range__49_49_char_class___range__54_54_char_class___range__55_55_char_class___range__55_55_char_class___range__55_55_char_class___range__50_50_char_class___range__49_49_char_class___range__53_53_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(1,9),range(11,16777215)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(49,49)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(54,54)]),\\char-class([range(55,55)]),\\char-class([range(55,55)]),\\char-class([range(55,55)]),\\char-class([range(50,50)]),\\char-class([range(49,49)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__51_51_char_class___range__54_54_char_class___range__44_44_char_class___range__51_51_char_class___range__54_54_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__56_56_char_class___range__44_44_char_class___range__53_53_char_class___range__55_55_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__48_48_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__53_53_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__55_55_char_class___range__44_44_char_class___range__49_49_char_class___range__50_50_char_class___range__50_50_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_56_44_53_55_41_93_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__56_56_char_class___range__44_44_char_class___range__53_53_char_class___range__55_55_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(48,57)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__48_48_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__55_55_char_class___range__44_44_char_class___range__49_49_char_class___range__50_50_char_class___range__50_50_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(65,90),range(97,122)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__117_117_char_class___range__115_115_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"CaseClause\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(117,117)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"CommentChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(111,111)]),\\char-class([range(109,109)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"DoubleStringChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__65_65_char_class___range__89_89_char_class___range__79_79_char_class___range__85_85_char_class___range__84_84_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"LAYOUT\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(65,65)]),\\char-class([range(89,89)]),\\char-class([range(79,79)]),\\char-class([range(85,85)]),\\char-class([range(84,84)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"RegularExpressionChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"RegularExpressionClassChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"SingleStringChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"State\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"Statement\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_84_114_97_110_115_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__84_84_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"Trans\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(84,84)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star-seps(sort(\\\"Expression\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_73_100_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__73_73_char_class___range__100_100_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star-seps(sort(\\\"Id\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(73,73)]),\\char-class([range(100,100)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star-seps(sort(\\\"PropertyAssignment\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(65,65)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___93__char_class___range__93_93_ = (IConstructor) _read("prod(lit(\"]\"),[\\char-class([range(93,93)])],{})", Factory.Production);
  private static final IConstructor prod__lit___94__char_class___range__94_94_ = (IConstructor) _read("prod(lit(\"^\"),[\\char-class([range(94,94)])],{})", Factory.Production);
  private static final IConstructor prod__lit___94_61__char_class___range__94_94_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"^=\"),[\\char-class([range(94,94)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit_abstract__char_class___range__97_97_char_class___range__98_98_char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"abstract\"),[\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit_assert__char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"assert\"),[\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit_boolean__char_class___range__98_98_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_char_class___range__101_101_char_class___range__97_97_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"boolean\"),[\\char-class([range(98,98)]),\\char-class([range(111,111)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__lit_break__char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_ = (IConstructor) _read("prod(lit(\"break\"),[\\char-class([range(98,98)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(107,107)])],{})", Factory.Production);
  private static final IConstructor prod__lit_build__char_class___range__98_98_char_class___range__117_117_char_class___range__105_105_char_class___range__108_108_char_class___range__100_100_ = (IConstructor) _read("prod(lit(\"build\"),[\\char-class([range(98,98)]),\\char-class([range(117,117)]),\\char-class([range(105,105)]),\\char-class([range(108,108)]),\\char-class([range(100,100)])],{})", Factory.Production);
  private static final IConstructor prod__lit_byte__char_class___range__98_98_char_class___range__121_121_char_class___range__116_116_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"byte\"),[\\char-class([range(98,98)]),\\char-class([range(121,121)]),\\char-class([range(116,116)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_case__char_class___range__99_99_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"case\"),[\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_ = (IConstructor) _read("prod(lit(\"catch\"),[\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(99,99)]),\\char-class([range(104,104)])],{})", Factory.Production);
  private static final IConstructor prod__lit_char__char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_ = (IConstructor) _read("prod(lit(\"char\"),[\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)])],{})", Factory.Production);
  private static final IConstructor prod__lit_class__char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"class\"),[\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__lit_const__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"const\"),[\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit_continue__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"continue\"),[\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(117,117)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_debugger__char_class___range__100_100_char_class___range__101_101_char_class___range__98_98_char_class___range__117_117_char_class___range__103_103_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_ = (IConstructor) _read("prod(lit(\"debugger\"),[\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(98,98)]),\\char-class([range(117,117)]),\\char-class([range(103,103)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(114,114)])],{})", Factory.Production);
  private static final IConstructor prod__lit_default__char_class___range__100_100_char_class___range__101_101_char_class___range__102_102_char_class___range__97_97_char_class___range__117_117_char_class___range__108_108_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"default\"),[\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit_delete__char_class___range__100_100_char_class___range__101_101_char_class___range__108_108_char_class___range__101_101_char_class___range__116_116_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"delete\"),[\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_do__char_class___range__100_100_char_class___range__111_111_ = (IConstructor) _read("prod(lit(\"do\"),[\\char-class([range(100,100)]),\\char-class([range(111,111)])],{})", Factory.Production);
  private static final IConstructor prod__lit_double__char_class___range__100_100_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"double\"),[\\char-class([range(100,100)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_else__char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"else\"),[\\char-class([range(101,101)]),\\char-class([range(108,108)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_enum__char_class___range__101_101_char_class___range__110_110_char_class___range__117_117_char_class___range__109_109_ = (IConstructor) _read("prod(lit(\"enum\"),[\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(117,117)]),\\char-class([range(109,109)])],{})", Factory.Production);
  private static final IConstructor prod__lit_export__char_class___range__101_101_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"export\"),[\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit_extends__char_class___range__101_101_char_class___range__120_120_char_class___range__116_116_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"extends\"),[\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(100,100)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__lit_false__char_class___range__102_102_char_class___range__97_97_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"false\"),[\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_final__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_ = (IConstructor) _read("prod(lit(\"final\"),[\\char-class([range(102,102)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)])],{})", Factory.Production);
  private static final IConstructor prod__lit_finally__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_ = (IConstructor) _read("prod(lit(\"finally\"),[\\char-class([range(102,102)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(108,108)]),\\char-class([range(121,121)])],{})", Factory.Production);
  private static final IConstructor prod__lit_float__char_class___range__102_102_char_class___range__108_108_char_class___range__111_111_char_class___range__97_97_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"float\"),[\\char-class([range(102,102)]),\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(97,97)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_ = (IConstructor) _read("prod(lit(\"for\"),[\\char-class([range(102,102)]),\\char-class([range(111,111)]),\\char-class([range(114,114)])],{})", Factory.Production);
  private static final IConstructor prod__lit_foreach__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__99_99_char_class___range__104_104_ = (IConstructor) _read("prod(lit(\"foreach\"),[\\char-class([range(102,102)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(104,104)])],{})", Factory.Production);
  private static final IConstructor prod__lit_from__char_class___range__102_102_char_class___range__114_114_char_class___range__111_111_char_class___range__109_109_ = (IConstructor) _read("prod(lit(\"from\"),[\\char-class([range(102,102)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(109,109)])],{})", Factory.Production);
  private static final IConstructor prod__lit_function__char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"function\"),[\\char-class([range(102,102)]),\\char-class([range(117,117)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__lit_get__char_class___range__103_103_char_class___range__101_101_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"get\"),[\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit_goto__char_class___range__103_103_char_class___range__111_111_char_class___range__116_116_char_class___range__111_111_ = (IConstructor) _read("prod(lit(\"goto\"),[\\char-class([range(103,103)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(111,111)])],{})", Factory.Production);
  private static final IConstructor prod__lit_if__char_class___range__105_105_char_class___range__102_102_ = (IConstructor) _read("prod(lit(\"if\"),[\\char-class([range(105,105)]),\\char-class([range(102,102)])],{})", Factory.Production);
  private static final IConstructor prod__lit_implements__char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__108_108_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"implements\"),[\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(112,112)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__lit_import__char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"import\"),[\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit_in__char_class___range__105_105_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"in\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__lit_instanceof__char_class___range__105_105_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_ = (IConstructor) _read("prod(lit(\"instanceof\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(111,111)]),\\char-class([range(102,102)])],{})", Factory.Production);
  private static final IConstructor prod__lit_int__char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"int\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit_interface__char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__102_102_char_class___range__97_97_char_class___range__99_99_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"interface\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_it__char_class___range__105_105_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"it\"),[\\char-class([range(105,105)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit___105_116_101_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_55_48_41_44_114_97_110_103_101_40_57_55_44_49_48_50_41_93_41_41__char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__56_56_char_class___range__44_44_char_class___range__53_53_char_class___range__55_55_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__53_53_char_class___range__44_44_char_class___range__55_55_char_class___range__48_48_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__55_55_char_class___range__44_44_char_class___range__49_49_char_class___range__48_48_char_class___range__50_50_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"iter(\\\\char-class([range(48,57),range(65,70),range(97,102)]))\"),[\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(55,55)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(48,48)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___105_116_101_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_56_44_53_55_41_93_41_41__char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__56_56_char_class___range__44_44_char_class___range__53_53_char_class___range__55_55_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"iter(\\\\char-class([range(48,57)]))\"),[\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit_let__char_class___range__108_108_char_class___range__101_101_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"let\"),[\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit_long__char_class___range__108_108_char_class___range__111_111_char_class___range__110_110_char_class___range__103_103_ = (IConstructor) _read("prod(lit(\"long\"),[\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(103,103)])],{})", Factory.Production);
  private static final IConstructor prod__lit_native__char_class___range__110_110_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__118_118_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"native\"),[\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(118,118)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_new__char_class___range__110_110_char_class___range__101_101_char_class___range__119_119_ = (IConstructor) _read("prod(lit(\"new\"),[\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(119,119)])],{})", Factory.Production);
  private static final IConstructor prod__lit_null__char_class___range__110_110_char_class___range__117_117_char_class___range__108_108_char_class___range__108_108_ = (IConstructor) _read("prod(lit(\"null\"),[\\char-class([range(110,110)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(108,108)])],{})", Factory.Production);
  private static final IConstructor prod__lit_on__char_class___range__111_111_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"on\"),[\\char-class([range(111,111)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__lit___111_112_116_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_51_44_52_51_41_44_114_97_110_103_101_40_52_53_44_52_53_41_93_41_41__char_class___range__111_111_char_class___range__112_112_char_class___range__116_116_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__51_51_char_class___range__44_44_char_class___range__52_52_char_class___range__51_51_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__53_53_char_class___range__44_44_char_class___range__52_52_char_class___range__53_53_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"opt(\\\\char-class([range(43,43),range(45,45)]))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(51,51)]),\\char-class([range(44,44)]),\\char-class([range(52,52)]),\\char-class([range(51,51)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(52,52)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___111_112_116_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_49_44_54_49_41_93_41_41__char_class___range__111_111_char_class___range__112_112_char_class___range__116_116_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__49_49_char_class___range__44_44_char_class___range__54_54_char_class___range__49_49_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"opt(\\\\char-class([range(61,61)]))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___111_112_116_40_108_105_116_40_34_44_34_41_41__char_class___range__111_111_char_class___range__112_112_char_class___range__116_116_char_class___range__40_40_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"opt(lit(\\\",\\\"))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41__char_class___range__111_111_char_class___range__112_112_char_class___range__116_116_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__110_110_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"opt(sort(\\\"ExponentPart\\\"))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit_package__char_class___range__112_112_char_class___range__97_97_char_class___range__99_99_char_class___range__107_107_char_class___range__97_97_char_class___range__103_103_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"package\"),[\\char-class([range(112,112)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(107,107)]),\\char-class([range(97,97)]),\\char-class([range(103,103)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_private__char_class___range__112_112_char_class___range__114_114_char_class___range__105_105_char_class___range__118_118_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"private\"),[\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(118,118)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_protected__char_class___range__112_112_char_class___range__114_114_char_class___range__111_111_char_class___range__116_116_char_class___range__101_101_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__100_100_ = (IConstructor) _read("prod(lit(\"protected\"),[\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(100,100)])],{})", Factory.Production);
  private static final IConstructor prod__lit_public__char_class___range__112_112_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__105_105_char_class___range__99_99_ = (IConstructor) _read("prod(lit(\"public\"),[\\char-class([range(112,112)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(99,99)])],{})", Factory.Production);
  private static final IConstructor prod__lit_repeat__char_class___range__114_114_char_class___range__101_101_char_class___range__112_112_char_class___range__101_101_char_class___range__97_97_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"repeat\"),[\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit_return__char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"return\"),[\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(117,117)]),\\char-class([range(114,114)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__lit_select__char_class___range__115_115_char_class___range__101_101_char_class___range__108_108_char_class___range__101_101_char_class___range__99_99_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"select\"),[\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_101_113_40_91_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_49_44_54_49_41_93_41_44_108_97_121_111_117_116_115_40_34_76_65_89_79_85_84_76_73_83_84_34_41_44_111_112_116_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_49_44_54_49_41_93_41_41_93_41__char_class___range__115_115_char_class___range__101_101_char_class___range__113_113_char_class___range__40_40_char_class___range__91_91_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__49_49_char_class___range__44_44_char_class___range__54_54_char_class___range__49_49_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__44_44_char_class___range__108_108_char_class___range__97_97_char_class___range__121_121_char_class___range__111_111_char_class___range__117_117_char_class___range__116_116_char_class___range__115_115_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__65_65_char_class___range__89_89_char_class___range__79_79_char_class___range__85_85_char_class___range__84_84_char_class___range__76_76_char_class___range__73_73_char_class___range__83_83_char_class___range__84_84_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__111_111_char_class___range__112_112_char_class___range__116_116_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__49_49_char_class___range__44_44_char_class___range__54_54_char_class___range__49_49_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"seq([\\\\char-class([range(61,61)]),layouts(\\\"LAYOUTLIST\\\"),opt(\\\\char-class([range(61,61)]))])\"),[\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(121,121)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(116,116)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(65,65)]),\\char-class([range(89,89)]),\\char-class([range(79,79)]),\\char-class([range(85,85)]),\\char-class([range(84,84)]),\\char-class([range(76,76)]),\\char-class([range(73,73)]),\\char-class([range(83,83)]),\\char-class([range(84,84)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_101_113_40_91_99_111_110_100_105_116_105_111_110_97_108_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_44_123_92_110_111_116_45_112_114_101_99_101_100_101_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41_125_41_44_99_111_110_100_105_116_105_111_110_97_108_40_92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41_44_123_92_110_111_116_45_102_111_108_108_111_119_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41_125_41_93_41__char_class___range__115_115_char_class___range__101_101_char_class___range__113_113_char_class___range__40_40_char_class___range__91_91_char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__100_100_char_class___range__105_105_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__51_51_char_class___range__54_54_char_class___range__44_44_char_class___range__51_51_char_class___range__54_54_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__48_48_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__53_53_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__55_55_char_class___range__44_44_char_class___range__49_49_char_class___range__50_50_char_class___range__50_50_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__44_44_char_class___range__123_123_char_class___range__92_92_char_class___range__110_110_char_class___range__111_111_char_class___range__116_116_char_class___range__45_45_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__99_99_char_class___range__101_101_char_class___range__100_100_char_class___range__101_101_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__51_51_char_class___range__54_54_char_class___range__44_44_char_class___range__51_51_char_class___range__54_54_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__56_56_char_class___range__44_44_char_class___range__53_53_char_class___range__55_55_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__48_48_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__53_53_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__55_55_char_class___range__44_44_char_class___range__49_49_char_class___range__50_50_char_class___range__50_50_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_char_class___range__125_125_char_class___range__41_41_char_class___range__44_44_char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__100_100_char_class___range__105_105_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__40_40_char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__51_51_char_class___range__54_54_char_class___range__44_44_char_class___range__51_51_char_class___range__54_54_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__56_56_char_class___range__44_44_char_class___range__53_53_char_class___range__55_55_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__48_48_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__53_53_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__55_55_char_class___range__44_44_char_class___range__49_49_char_class___range__50_50_char_class___range__50_50_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_char_class___range__44_44_char_class___range__123_123_char_class___range__92_92_char_class___range__110_110_char_class___range__111_111_char_class___range__116_116_char_class___range__45_45_char_class___range__102_102_char_class___range__111_111_char_class___range__108_108_char_class___range__108_108_char_class___range__111_111_char_class___range__119_119_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__51_51_char_class___range__54_54_char_class___range__44_44_char_class___range__51_51_char_class___range__54_54_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__56_56_char_class___range__44_44_char_class___range__53_53_char_class___range__55_55_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__48_48_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__53_53_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__55_55_char_class___range__44_44_char_class___range__49_49_char_class___range__50_50_char_class___range__50_50_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_char_class___range__125_125_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"seq([conditional(\\\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\\\not-precede(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\\\iter-star(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\\\not-follow(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})])\"),[\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(100,100)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(123,123)]),\\char-class([range(92,92)]),\\char-class([range(110,110)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(45,45)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)]),\\char-class([range(125,125)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(100,100)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(123,123)]),\\char-class([range(92,92)]),\\char-class([range(110,110)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(45,45)]),\\char-class([range(102,102)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(119,119)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)]),\\char-class([range(125,125)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit_set__char_class___range__115_115_char_class___range__101_101_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"set\"),[\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit_short__char_class___range__115_115_char_class___range__104_104_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"short\"),[\\char-class([range(115,115)]),\\char-class([range(104,104)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_66_111_111_108_101_97_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__66_66_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_char_class___range__101_101_char_class___range__97_97_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Boolean\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(66,66)]),\\char-class([range(111,111)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__117_117_char_class___range__115_115_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"CaseClause\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(117,117)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"CharacterEscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_67_111_109_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Comment\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(111,111)]),\\char-class([range(109,109)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"CommentChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(111,111)]),\\char-class([range(109,109)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_68_101_99_105_109_97_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__105_105_char_class___range__109_109_char_class___range__97_97_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Decimal\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__105_105_char_class___range__109_109_char_class___range__97_97_char_class___range__108_108_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"DecimalInteger\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"DoubleStringChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"EscapeCharacter\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"EscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__110_110_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"ExponentPart\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Expression\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_70_105_101_108_100_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__70_70_char_class___range__105_105_char_class___range__101_101_char_class___range__108_108_char_class___range__100_100_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Fields\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(70,70)]),\\char-class([range(105,105)]),\\char-class([range(101,101)]),\\char-class([range(108,108)]),\\char-class([range(100,100)]),\\char-class([range(115,115)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_70_117_110_99_116_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__70_70_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Function\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(70,70)]),\\char-class([range(117,117)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_71_101_110_101_114_97_116_111_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__71_71_char_class___range__101_101_char_class___range__110_110_char_class___range__101_101_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Generator\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(71,71)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_72_101_120_68_105_103_105_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__68_68_char_class___range__105_105_char_class___range__103_103_char_class___range__105_105_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"HexDigit\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(72,72)]),\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(68,68)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_72_101_120_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"HexEscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(72,72)]),\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_72_101_120_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"HexInteger\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(72,72)]),\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_73_100_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__73_73_char_class___range__100_100_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Id\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(73,73)]),\\char-class([range(100,100)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_76_65_89_79_85_84_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__65_65_char_class___range__89_89_char_class___range__79_79_char_class___range__85_85_char_class___range__84_84_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"LAYOUT\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(65,65)]),\\char-class([range(89,89)]),\\char-class([range(79,79)]),\\char-class([range(85,85)]),\\char-class([range(84,84)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_76_105_116_101_114_97_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__97_97_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Literal\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_78_111_110_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__78_78_char_class___range__111_111_char_class___range__110_110_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"NonEscapeCharacter\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(78,78)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__78_78_char_class___range__117_117_char_class___range__109_109_char_class___range__101_101_char_class___range__114_114_char_class___range__105_105_char_class___range__99_99_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Numeric\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(78,78)]),\\char-class([range(117,117)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(99,99)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"PropertyAssignment\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(65,65)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__78_78_char_class___range__97_97_char_class___range__109_109_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"PropertyName\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(78,78)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpression\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__66_66_char_class___range__97_97_char_class___range__99_99_char_class___range__107_107_char_class___range__115_115_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__104_104_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionBackslashSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(66,66)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(107,107)]),\\char-class([range(115,115)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(104,104)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_111_100_121_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__66_66_char_class___range__111_111_char_class___range__100_100_char_class___range__121_121_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionBody\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(66,66)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(121,121)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionClass\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionClassChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__70_70_char_class___range__105_105_char_class___range__114_114_char_class___range__115_115_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionFirstChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(70,70)]),\\char-class([range(105,105)]),\\char-class([range(114,114)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_108_97_103_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__70_70_char_class___range__108_108_char_class___range__97_97_char_class___range__103_103_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionFlags\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(70,70)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(103,103)]),\\char-class([range(115,115)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_83_105_103_110_101_100_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__101_101_char_class___range__100_100_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"SignedInteger\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(100,100)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_83_105_110_103_108_101_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"SingleEscapeCharacter\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"SingleStringChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_83_111_117_114_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__111_111_char_class___range__117_117_char_class___range__114_114_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Source\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(114,114)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_83_116_97_116_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"State\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Statement\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_83_116_97_116_101_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"States\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_83_116_114_105_110_103_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"String\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_84_114_97_110_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__84_84_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Trans\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(84,84)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_84_114_97_110_115_105_116_105_111_110_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__84_84_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__115_115_char_class___range__105_105_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Transitions\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(84,84)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_85_110_105_99_111_100_101_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__85_85_char_class___range__110_110_char_class___range__105_105_char_class___range__99_99_char_class___range__111_111_char_class___range__100_100_char_class___range__101_101_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"UnicodeEscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(85,85)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"VarDecl\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"VariableDeclaration\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__78_78_char_class___range__111_111_char_class___range__73_73_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"VariableDeclarationNoIn\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(78,78)]),\\char-class([range(111,111)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_87_104_105_116_101_115_112_97_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__87_87_char_class___range__104_104_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__115_115_char_class___range__112_112_char_class___range__97_97_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Whitespace\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(87,87)]),\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(112,112)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit_state__char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"state\"),[\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_statemachine__char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__109_109_char_class___range__97_97_char_class___range__99_99_char_class___range__104_104_char_class___range__105_105_char_class___range__110_110_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"statemachine\"),[\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(109,109)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_static__char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__99_99_ = (IConstructor) _read("prod(lit(\"static\"),[\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(99,99)])],{})", Factory.Production);
  private static final IConstructor prod__lit_super__char_class___range__115_115_char_class___range__117_117_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_ = (IConstructor) _read("prod(lit(\"super\"),[\\char-class([range(115,115)]),\\char-class([range(117,117)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)])],{})", Factory.Production);
  private static final IConstructor prod__lit_swap__char_class___range__115_115_char_class___range__119_119_char_class___range__97_97_char_class___range__112_112_ = (IConstructor) _read("prod(lit(\"swap\"),[\\char-class([range(115,115)]),\\char-class([range(119,119)]),\\char-class([range(97,97)]),\\char-class([range(112,112)])],{})", Factory.Production);
  private static final IConstructor prod__lit_switch__char_class___range__115_115_char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_ = (IConstructor) _read("prod(lit(\"switch\"),[\\char-class([range(115,115)]),\\char-class([range(119,119)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(99,99)]),\\char-class([range(104,104)])],{})", Factory.Production);
  private static final IConstructor prod__lit_synchronized__char_class___range__115_115_char_class___range__121_121_char_class___range__110_110_char_class___range__99_99_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__110_110_char_class___range__105_105_char_class___range__122_122_char_class___range__101_101_char_class___range__100_100_ = (IConstructor) _read("prod(lit(\"synchronized\"),[\\char-class([range(115,115)]),\\char-class([range(121,121)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(122,122)]),\\char-class([range(101,101)]),\\char-class([range(100,100)])],{})", Factory.Production);
  private static final IConstructor prod__lit_this__char_class___range__116_116_char_class___range__104_104_char_class___range__105_105_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"this\"),[\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_ = (IConstructor) _read("prod(lit(\"throw\"),[\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(119,119)])],{})", Factory.Production);
  private static final IConstructor prod__lit_throws__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"throws\"),[\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(119,119)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__lit_times__char_class___range__116_116_char_class___range__105_105_char_class___range__109_109_char_class___range__101_101_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"times\"),[\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__lit_todo__char_class___range__116_116_char_class___range__111_111_char_class___range__100_100_char_class___range__111_111_ = (IConstructor) _read("prod(lit(\"todo\"),[\\char-class([range(116,116)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(111,111)])],{})", Factory.Production);
  private static final IConstructor prod__lit_transient__char_class___range__116_116_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__115_115_char_class___range__105_105_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"transient\"),[\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit_true__char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"true\"),[\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(117,117)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_ = (IConstructor) _read("prod(lit(\"try\"),[\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(121,121)])],{})", Factory.Production);
  private static final IConstructor prod__lit_typeof__char_class___range__116_116_char_class___range__121_121_char_class___range__112_112_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_ = (IConstructor) _read("prod(lit(\"typeof\"),[\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(111,111)]),\\char-class([range(102,102)])],{})", Factory.Production);
  private static final IConstructor prod__lit_u__char_class___range__117_117_ = (IConstructor) _read("prod(lit(\"u\"),[\\char-class([range(117,117)])],{})", Factory.Production);
  private static final IConstructor prod__lit_unless__char_class___range__117_117_char_class___range__110_110_char_class___range__108_108_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"unless\"),[\\char-class([range(117,117)]),\\char-class([range(110,110)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__lit_until__char_class___range__117_117_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__108_108_ = (IConstructor) _read("prod(lit(\"until\"),[\\char-class([range(117,117)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(108,108)])],{})", Factory.Production);
  private static final IConstructor prod__lit_var__char_class___range__118_118_char_class___range__97_97_char_class___range__114_114_ = (IConstructor) _read("prod(lit(\"var\"),[\\char-class([range(118,118)]),\\char-class([range(97,97)]),\\char-class([range(114,114)])],{})", Factory.Production);
  private static final IConstructor prod__lit_void__char_class___range__118_118_char_class___range__111_111_char_class___range__105_105_char_class___range__100_100_ = (IConstructor) _read("prod(lit(\"void\"),[\\char-class([range(118,118)]),\\char-class([range(111,111)]),\\char-class([range(105,105)]),\\char-class([range(100,100)])],{})", Factory.Production);
  private static final IConstructor prod__lit_volatile__char_class___range__118_118_char_class___range__111_111_char_class___range__108_108_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"volatile\"),[\\char-class([range(118,118)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_where__char_class___range__119_119_char_class___range__104_104_char_class___range__101_101_char_class___range__114_114_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"where\"),[\\char-class([range(119,119)]),\\char-class([range(104,104)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"while\"),[\\char-class([range(119,119)]),\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_with__char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__104_104_ = (IConstructor) _read("prod(lit(\"with\"),[\\char-class([range(119,119)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(104,104)])],{})", Factory.Production);
  private static final IConstructor prod__lit___123__char_class___range__123_123_ = (IConstructor) _read("prod(lit(\"{\"),[\\char-class([range(123,123)])],{})", Factory.Production);
  private static final IConstructor prod__lit___124__char_class___range__124_124_ = (IConstructor) _read("prod(lit(\"|\"),[\\char-class([range(124,124)])],{})", Factory.Production);
  private static final IConstructor prod__lit___124_61__char_class___range__124_124_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"|=\"),[\\char-class([range(124,124)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___124_124__char_class___range__124_124_char_class___range__124_124_ = (IConstructor) _read("prod(lit(\"||\"),[\\char-class([range(124,124)]),\\char-class([range(124,124)])],{})", Factory.Production);
  private static final IConstructor prod__lit___125__char_class___range__125_125_ = (IConstructor) _read("prod(lit(\"}\"),[\\char-class([range(125,125)])],{})", Factory.Production);
  private static final IConstructor prod__lit___126__char_class___range__126_126_ = (IConstructor) _read("prod(lit(\"~\"),[\\char-class([range(126,126)])],{})", Factory.Production);
  private static final IConstructor prod__Boolean__lit_false_ = (IConstructor) _read("prod(sort(\"Boolean\"),[lit(\"false\")],{})", Factory.Production);
  private static final IConstructor prod__Boolean__lit_true_ = (IConstructor) _read("prod(sort(\"Boolean\"),[lit(\"true\")],{})", Factory.Production);
  private static final IConstructor prod__Expression__lit___91_layouts_LAYOUTLIST_result_Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_iter_seps__Generator__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(sort(\"Expression\"),[lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"result\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"|\"),layouts(\"LAYOUTLIST\"),\\iter-seps(sort(\"Generator\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__Expression__lit_select_layouts_LAYOUTLIST_Fields_layouts_LAYOUTLIST_lit_from_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit_where_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(sort(\"Expression\"),[lit(\"select\"),layouts(\"LAYOUTLIST\"),sort(\"Fields\"),layouts(\"LAYOUTLIST\"),lit(\"from\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"where\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__Expression__lit_it_ = (IConstructor) _read("prod(sort(\"Expression\"),[lit(\"it\")],{})", Factory.Production);
  private static final IConstructor prod__Expression__lit_statemachine_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_states_States_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(sort(\"Expression\"),[lit(\"statemachine\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"states\",sort(\"States\")),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__Expression__lit___35_40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41__tag__category___84_119_105_116_116_101_114_67_111_110_115_116_97_110_116 = (IConstructor) _read("prod(sort(\"Expression\"),[lit(\"#(\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\")\")],{tag(\"category\"(\"TwitterConstant\"))})", Factory.Production);
  private static final IConstructor prod__Expression__Id_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(sort(\"Expression\"),[lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\"=\\>\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__Expression__lit___40_layouts_LAYOUTLIST_iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(sort(\"Expression\"),[lit(\"(\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(lex(\"Id\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"=\\>\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__Expression__lit___64_40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41__tag__category___84_119_105_116_116_101_114_67_111_110_115_116_97_110_116 = (IConstructor) _read("prod(sort(\"Expression\"),[lit(\"@(\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\")\")],{tag(\"category\"(\"TwitterConstant\"))})", Factory.Production);
  private static final IConstructor prod__Expression__Expression_layouts_LAYOUTLIST_lit_build_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(sort(\"Expression\"),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"build\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"body\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__Fields__lst_iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_ = (IConstructor) _read("prod(sort(\"Fields\"),[label(\"lst\",\\iter-star-seps(lex(\"Id\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))],{})", Factory.Production);
  private static final IConstructor prod__Function__lit_function_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(sort(\"Function\"),[lit(\"function\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"parameters\",\\iter-star-seps(lex(\"Id\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"body\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__Function__lit_function_layouts_LAYOUTLIST_name_Id_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(sort(\"Function\"),[lit(\"function\"),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Id\")),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"parameters\",\\iter-star-seps(lex(\"Id\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"body\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__Generator__Expression_ = (IConstructor) _read("prod(sort(\"Generator\"),[sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__Generator__Id_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(sort(\"Generator\"),[lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__Literal__Numeric_ = (IConstructor) _read("prod(sort(\"Literal\"),[sort(\"Numeric\")],{})", Factory.Production);
  private static final IConstructor prod__Literal__String_ = (IConstructor) _read("prod(sort(\"Literal\"),[lex(\"String\")],{})", Factory.Production);
  private static final IConstructor prod__Literal__RegularExpression_ = (IConstructor) _read("prod(sort(\"Literal\"),[lex(\"RegularExpression\")],{})", Factory.Production);
  private static final IConstructor prod__Literal__lit_null_ = (IConstructor) _read("prod(sort(\"Literal\"),[lit(\"null\")],{})", Factory.Production);
  private static final IConstructor prod__Literal__Boolean_ = (IConstructor) _read("prod(sort(\"Literal\"),[sort(\"Boolean\")],{})", Factory.Production);
  private static final IConstructor prod__Numeric__Decimal_ = (IConstructor) _read("prod(sort(\"Numeric\"),[conditional(lex(\"Decimal\"),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})],{})", Factory.Production);
  private static final IConstructor prod__Numeric__HexInteger_ = (IConstructor) _read("prod(sort(\"Numeric\"),[conditional(lex(\"HexInteger\"),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})],{})", Factory.Production);
  private static final IConstructor prod__PropertyAssignment__lit_get_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(sort(\"PropertyAssignment\"),[lit(\"get\"),layouts(\"LAYOUTLIST\"),sort(\"PropertyName\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__PropertyAssignment__lit_set_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(sort(\"PropertyAssignment\"),[lit(\"set\"),layouts(\"LAYOUTLIST\"),sort(\"PropertyName\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__PropertyName__String_ = (IConstructor) _read("prod(sort(\"PropertyName\"),[lex(\"String\")],{})", Factory.Production);
  private static final IConstructor prod__PropertyName__Numeric_ = (IConstructor) _read("prod(sort(\"PropertyName\"),[sort(\"Numeric\")],{})", Factory.Production);
  private static final IConstructor prod__PropertyName__Id_ = (IConstructor) _read("prod(sort(\"PropertyName\"),[lex(\"Id\")],{})", Factory.Production);
  private static final IConstructor prod__State__lit_state_layouts_LAYOUTLIST_id_Id_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_entry_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_transitions_Transitions_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(sort(\"State\"),[lit(\"state\"),layouts(\"LAYOUTLIST\"),label(\"id\",lex(\"Id\")),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"entry\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),label(\"transitions\",sort(\"Transitions\")),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__Statement__lit_unless_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(sort(\"Statement\"),[lit(\"unless\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__Statement__lit_repeat_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit_until_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(sort(\"Statement\"),[lit(\"repeat\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\"}\"),layouts(\"LAYOUTLIST\"),lit(\"until\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Statement__lit_foreach_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(sort(\"Statement\"),[lit(\"foreach\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\"in\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__Statement__lit_todo_layouts_LAYOUTLIST_String_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(sort(\"Statement\"),[lit(\"todo\"),layouts(\"LAYOUTLIST\"),lex(\"String\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Statement__lit_times_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(sort(\"Statement\"),[lit(\"times\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__Statement__lit_swap_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(sort(\"Statement\"),[lit(\"swap\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Statement__lit_assert_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_String_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(sort(\"Statement\"),[lit(\"assert\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),lex(\"String\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__States__lst_iter_star_seps__State__layouts_LAYOUTLIST_ = (IConstructor) _read("prod(sort(\"States\"),[label(\"lst\",\\iter-star-seps(sort(\"State\"),[layouts(\"LAYOUTLIST\")]))],{})", Factory.Production);
  private static final IConstructor prod__Trans__lit_on_layouts_LAYOUTLIST_event_Id_layouts_LAYOUTLIST_lit_goto_layouts_LAYOUTLIST_target_Id_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(sort(\"Trans\"),[lit(\"on\"),layouts(\"LAYOUTLIST\"),label(\"event\",lex(\"Id\")),layouts(\"LAYOUTLIST\"),lit(\"goto\"),layouts(\"LAYOUTLIST\"),label(\"target\",lex(\"Id\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Transitions__lst_iter_star_seps__Trans__layouts_LAYOUTLIST_ = (IConstructor) _read("prod(sort(\"Transitions\"),[label(\"lst\",\\iter-star-seps(sort(\"Trans\"),[layouts(\"LAYOUTLIST\")]))],{})", Factory.Production);
  private static final IConstructor prod__UnicodeEscapeSequence__lit_u_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_ = (IConstructor) _read("prod(sort(\"UnicodeEscapeSequence\"),[lit(\"u\"),layouts(\"LAYOUTLIST\"),lex(\"HexDigit\"),layouts(\"LAYOUTLIST\"),lex(\"HexDigit\"),layouts(\"LAYOUTLIST\"),lex(\"HexDigit\"),layouts(\"LAYOUTLIST\"),lex(\"HexDigit\")],{})", Factory.Production);
  private static final IConstructor prod__VarDecl__lit_var_layouts_LAYOUTLIST_declarations_iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(sort(\"VarDecl\"),[lit(\"var\"),layouts(\"LAYOUTLIST\"),label(\"declarations\",\\iter-seps(sort(\"VariableDeclaration\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__VarDecl__lit_let_layouts_LAYOUTLIST_declarations_iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(sort(\"VarDecl\"),[lit(\"let\"),layouts(\"LAYOUTLIST\"),label(\"declarations\",\\iter-seps(sort(\"VariableDeclaration\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__start__Source__layouts_LAYOUTLIST_top_Source_layouts_LAYOUTLIST_ = (IConstructor) _read("prod(start(sort(\"Source\")),[layouts(\"LAYOUTLIST\"),label(\"top\",sort(\"Source\")),layouts(\"LAYOUTLIST\")],{})", Factory.Production);
  private static final IConstructor regular__empty = (IConstructor) _read("regular(empty())", Factory.Production);
  private static final IConstructor regular__iter__char_class___range__48_57 = (IConstructor) _read("regular(iter(\\char-class([range(48,57)])))", Factory.Production);
  private static final IConstructor regular__iter__char_class___range__48_57_range__65_70_range__97_102 = (IConstructor) _read("regular(iter(\\char-class([range(48,57),range(65,70),range(97,102)])))", Factory.Production);
  private static final IConstructor regular__iter_seps__Generator__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"Generator\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor regular__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"VariableDeclaration\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor regular__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"VariableDeclarationNoIn\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor regular__iter_star__char_class___range__65_90_range__97_122 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(65,90),range(97,122)])))", Factory.Production);
  private static final IConstructor regular__iter_star__char_class___range__1_9_range__11_16777215 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(1,9),range(11,16777215)])))", Factory.Production);
  private static final IConstructor regular__iter_star__char_class___range__48_57 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(48,57)])))", Factory.Production);
  private static final IConstructor regular__iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])))", Factory.Production);
  private static final IConstructor regular__iter_star__CommentChar = (IConstructor) _read("regular(\\iter-star(lex(\"CommentChar\")))", Factory.Production);
  private static final IConstructor regular__iter_star__DoubleStringChar = (IConstructor) _read("regular(\\iter-star(lex(\"DoubleStringChar\")))", Factory.Production);
  private static final IConstructor regular__iter_star__LAYOUT = (IConstructor) _read("regular(\\iter-star(lex(\"LAYOUT\")))", Factory.Production);
  private static final IConstructor regular__iter_star__RegularExpressionChar = (IConstructor) _read("regular(\\iter-star(lex(\"RegularExpressionChar\")))", Factory.Production);
  private static final IConstructor regular__iter_star__RegularExpressionClassChar = (IConstructor) _read("regular(\\iter-star(lex(\"RegularExpressionClassChar\")))", Factory.Production);
  private static final IConstructor regular__iter_star__SingleStringChar = (IConstructor) _read("regular(\\iter-star(lex(\"SingleStringChar\")))", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(lex(\"Id\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor regular__iter_star_seps__CaseClause__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"CaseClause\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor regular__iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"PropertyAssignment\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor regular__iter_star_seps__State__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"State\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Statement__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Trans__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Trans\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor regular__opt__char_class___range__43_43_range__45_45 = (IConstructor) _read("regular(opt(\\char-class([range(43,43),range(45,45)])))", Factory.Production);
  private static final IConstructor regular__opt__char_class___range__61_61 = (IConstructor) _read("regular(opt(\\char-class([range(61,61)])))", Factory.Production);
  private static final IConstructor regular__opt__ExponentPart = (IConstructor) _read("regular(opt(lex(\"ExponentPart\")))", Factory.Production);
  private static final IConstructor regular__opt__lit___44 = (IConstructor) _read("regular(opt(lit(\",\")))", Factory.Production);
  private static final IConstructor regular__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122 = (IConstructor) _read("regular(seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})]))", Factory.Production);
  private static final IConstructor regular__seq___char_class___range__61_61_layouts_LAYOUTLIST_opt__char_class___range__61_61 = (IConstructor) _read("regular(seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))]))", Factory.Production);
    
  // Item declarations
	
	
  protected static class Reserved {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Reserved__lit_null_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3684, 0, prod__lit_null__char_class___range__110_110_char_class___range__117_117_char_class___range__108_108_char_class___range__108_108_, new int[] {110,117,108,108}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_null_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_finally_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3686, 0, prod__lit_finally__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_, new int[] {102,105,110,97,108,108,121}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_finally_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_true_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3680, 0, prod__lit_true__char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__101_101_, new int[] {116,114,117,101}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_true_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_volatile_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3682, 0, prod__lit_volatile__char_class___range__118_118_char_class___range__111_111_char_class___range__108_108_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new int[] {118,111,108,97,116,105,108,101}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_volatile_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_false_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3692, 0, prod__lit_false__char_class___range__102_102_char_class___range__97_97_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new int[] {102,97,108,115,101}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_false_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_interface_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3694, 0, prod__lit_interface__char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__102_102_char_class___range__97_97_char_class___range__99_99_char_class___range__101_101_, new int[] {105,110,116,101,114,102,97,99,101}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_interface_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_void_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3688, 0, prod__lit_void__char_class___range__118_118_char_class___range__111_111_char_class___range__105_105_char_class___range__100_100_, new int[] {118,111,105,100}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_void_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_default_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3670, 0, prod__lit_default__char_class___range__100_100_char_class___range__101_101_char_class___range__102_102_char_class___range__97_97_char_class___range__117_117_char_class___range__108_108_char_class___range__116_116_, new int[] {100,101,102,97,117,108,116}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_default_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_new_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3672, 0, prod__lit_new__char_class___range__110_110_char_class___range__101_101_char_class___range__119_119_, new int[] {110,101,119}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_new_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_float_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3666, 0, prod__lit_float__char_class___range__102_102_char_class___range__108_108_char_class___range__111_111_char_class___range__97_97_char_class___range__116_116_, new int[] {102,108,111,97,116}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_float_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_throws_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3668, 0, prod__lit_throws__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_char_class___range__115_115_, new int[] {116,104,114,111,119,115}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_throws_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_private_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3678, 0, prod__lit_private__char_class___range__112_112_char_class___range__114_114_char_class___range__105_105_char_class___range__118_118_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_, new int[] {112,114,105,118,97,116,101}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_private_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_return_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3690, 0, prod__lit_return__char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_, new int[] {114,101,116,117,114,110}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_return_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_delete_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3674, 0, prod__lit_delete__char_class___range__100_100_char_class___range__101_101_char_class___range__108_108_char_class___range__101_101_char_class___range__116_116_char_class___range__101_101_, new int[] {100,101,108,101,116,101}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_delete_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_try_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3676, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new int[] {116,114,121}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_try_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_goto_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3714, 0, prod__lit_goto__char_class___range__103_103_char_class___range__111_111_char_class___range__116_116_char_class___range__111_111_, new int[] {103,111,116,111}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_goto_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_final_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3716, 0, prod__lit_final__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_, new int[] {102,105,110,97,108}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_final_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_byte_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3710, 0, prod__lit_byte__char_class___range__98_98_char_class___range__121_121_char_class___range__116_116_char_class___range__101_101_, new int[] {98,121,116,101}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_byte_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_class_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3712, 0, prod__lit_class__char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_, new int[] {99,108,97,115,115}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_class_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_boolean_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3722, 0, prod__lit_boolean__char_class___range__98_98_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_char_class___range__101_101_char_class___range__97_97_char_class___range__110_110_, new int[] {98,111,111,108,101,97,110}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_boolean_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_debugger_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3724, 0, prod__lit_debugger__char_class___range__100_100_char_class___range__101_101_char_class___range__98_98_char_class___range__117_117_char_class___range__103_103_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_, new int[] {100,101,98,117,103,103,101,114}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_debugger_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_extends_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3718, 0, prod__lit_extends__char_class___range__101_101_char_class___range__120_120_char_class___range__116_116_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_char_class___range__115_115_, new int[] {101,120,116,101,110,100,115}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_extends_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_in_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3700, 0, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new int[] {105,110}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_in_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_it_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3702, 0, prod__lit_it__char_class___range__105_105_char_class___range__116_116_, new int[] {105,116}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_it_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_instanceof_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3696, 0, prod__lit_instanceof__char_class___range__105_105_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_, new int[] {105,110,115,116,97,110,99,101,111,102}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_instanceof_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_else_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3698, 0, prod__lit_else__char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new int[] {101,108,115,101}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_else_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_enum_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3708, 0, prod__lit_enum__char_class___range__101_101_char_class___range__110_110_char_class___range__117_117_char_class___range__109_109_, new int[] {101,110,117,109}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_enum_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_do_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3720, 0, prod__lit_do__char_class___range__100_100_char_class___range__111_111_, new int[] {100,111}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_do_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_synchronized_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3704, 0, prod__lit_synchronized__char_class___range__115_115_char_class___range__121_121_char_class___range__110_110_char_class___range__99_99_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__110_110_char_class___range__105_105_char_class___range__122_122_char_class___range__101_101_char_class___range__100_100_, new int[] {115,121,110,99,104,114,111,110,105,122,101,100}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_synchronized_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_export_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3625, 0, prod__lit_export__char_class___range__101_101_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_, new int[] {101,120,112,111,114,116}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_export_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_protected_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3627, 0, prod__lit_protected__char_class___range__112_112_char_class___range__114_114_char_class___range__111_111_char_class___range__116_116_char_class___range__101_101_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__100_100_, new int[] {112,114,111,116,101,99,116,101,100}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_protected_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_short_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3621, 0, prod__lit_short__char_class___range__115_115_char_class___range__104_104_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_, new int[] {115,104,111,114,116}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_short_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_package_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3623, 0, prod__lit_package__char_class___range__112_112_char_class___range__97_97_char_class___range__99_99_char_class___range__107_107_char_class___range__97_97_char_class___range__103_103_char_class___range__101_101_, new int[] {112,97,99,107,97,103,101}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_package_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_function_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3633, 0, prod__lit_function__char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_, new int[] {102,117,110,99,116,105,111,110}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_function_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_double_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3635, 0, prod__lit_double__char_class___range__100_100_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_, new int[] {100,111,117,98,108,101}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_double_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_import_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3629, 0, prod__lit_import__char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_, new int[] {105,109,112,111,114,116}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_import_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_catch_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3611, 0, prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {99,97,116,99,104}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_catch_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_continue_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3613, 0, prod__lit_continue__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_, new int[] {99,111,110,116,105,110,117,101}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_continue_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_int_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3607, 0, prod__lit_int__char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_, new int[] {105,110,116}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_int_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_char_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3609, 0, prod__lit_char__char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_, new int[] {99,104,97,114}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_char_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_native_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3619, 0, prod__lit_native__char_class___range__110_110_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__118_118_char_class___range__101_101_, new int[] {110,97,116,105,118,101}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_native_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_implements_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3631, 0, prod__lit_implements__char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__108_108_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__115_115_, new int[] {105,109,112,108,101,109,101,110,116,115}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_implements_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_break_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3615, 0, prod__lit_break__char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_, new int[] {98,114,101,97,107}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_break_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_for_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3617, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_for_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_throw_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3655, 0, prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_, new int[] {116,104,114,111,119}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_throw_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_with_lit_abstract_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new LiteralStackNode<IConstructor>(3658, 1, prod__lit_abstract__char_class___range__97_97_char_class___range__98_98_char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_, new int[] {97,98,115,116,114,97,99,116}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(3657, 0, prod__lit_with__char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__104_104_, new int[] {119,105,116,104}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_with_lit_abstract_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_typeof_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3651, 0, prod__lit_typeof__char_class___range__116_116_char_class___range__121_121_char_class___range__112_112_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_, new int[] {116,121,112,101,111,102}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_typeof_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_this_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3653, 0, prod__lit_this__char_class___range__116_116_char_class___range__104_104_char_class___range__105_105_char_class___range__115_115_, new int[] {116,104,105,115}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_this_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_static_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3664, 0, prod__lit_static__char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__99_99_, new int[] {115,116,97,116,105,99}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_static_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_if_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3706, 0, prod__lit_if__char_class___range__105_105_char_class___range__102_102_, new int[] {105,102}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_if_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_public_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3660, 0, prod__lit_public__char_class___range__112_112_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__105_105_char_class___range__99_99_, new int[] {112,117,98,108,105,99}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_public_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_var_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3641, 0, prod__lit_var__char_class___range__118_118_char_class___range__97_97_char_class___range__114_114_, new int[] {118,97,114}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_var_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_while_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3643, 0, prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new int[] {119,104,105,108,101}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_while_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_switch_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3637, 0, prod__lit_switch__char_class___range__115_115_char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {115,119,105,116,99,104}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_switch_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_case_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3639, 0, prod__lit_case__char_class___range__99_99_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_, new int[] {99,97,115,101}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_case_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_transient_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3649, 0, prod__lit_transient__char_class___range__116_116_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__115_115_char_class___range__105_105_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_, new int[] {116,114,97,110,115,105,101,110,116}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_transient_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_long_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3662, 0, prod__lit_long__char_class___range__108_108_char_class___range__111_111_char_class___range__110_110_char_class___range__103_103_, new int[] {108,111,110,103}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_long_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_const_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3645, 0, prod__lit_const__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_, new int[] {99,111,110,115,116}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_const_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_super_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3647, 0, prod__lit_super__char_class___range__115_115_char_class___range__117_117_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_, new int[] {115,117,112,101,114}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Reserved__lit_super_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__Reserved__lit_null_(builder);
      
        _init_prod__Reserved__lit_finally_(builder);
      
        _init_prod__Reserved__lit_true_(builder);
      
        _init_prod__Reserved__lit_volatile_(builder);
      
        _init_prod__Reserved__lit_false_(builder);
      
        _init_prod__Reserved__lit_interface_(builder);
      
        _init_prod__Reserved__lit_void_(builder);
      
        _init_prod__Reserved__lit_default_(builder);
      
        _init_prod__Reserved__lit_new_(builder);
      
        _init_prod__Reserved__lit_float_(builder);
      
        _init_prod__Reserved__lit_throws_(builder);
      
        _init_prod__Reserved__lit_private_(builder);
      
        _init_prod__Reserved__lit_return_(builder);
      
        _init_prod__Reserved__lit_delete_(builder);
      
        _init_prod__Reserved__lit_try_(builder);
      
        _init_prod__Reserved__lit_goto_(builder);
      
        _init_prod__Reserved__lit_final_(builder);
      
        _init_prod__Reserved__lit_byte_(builder);
      
        _init_prod__Reserved__lit_class_(builder);
      
        _init_prod__Reserved__lit_boolean_(builder);
      
        _init_prod__Reserved__lit_debugger_(builder);
      
        _init_prod__Reserved__lit_extends_(builder);
      
        _init_prod__Reserved__lit_in_(builder);
      
        _init_prod__Reserved__lit_it_(builder);
      
        _init_prod__Reserved__lit_instanceof_(builder);
      
        _init_prod__Reserved__lit_else_(builder);
      
        _init_prod__Reserved__lit_enum_(builder);
      
        _init_prod__Reserved__lit_do_(builder);
      
        _init_prod__Reserved__lit_synchronized_(builder);
      
        _init_prod__Reserved__lit_export_(builder);
      
        _init_prod__Reserved__lit_protected_(builder);
      
        _init_prod__Reserved__lit_short_(builder);
      
        _init_prod__Reserved__lit_package_(builder);
      
        _init_prod__Reserved__lit_function_(builder);
      
        _init_prod__Reserved__lit_double_(builder);
      
        _init_prod__Reserved__lit_import_(builder);
      
        _init_prod__Reserved__lit_catch_(builder);
      
        _init_prod__Reserved__lit_continue_(builder);
      
        _init_prod__Reserved__lit_int_(builder);
      
        _init_prod__Reserved__lit_char_(builder);
      
        _init_prod__Reserved__lit_native_(builder);
      
        _init_prod__Reserved__lit_implements_(builder);
      
        _init_prod__Reserved__lit_break_(builder);
      
        _init_prod__Reserved__lit_for_(builder);
      
        _init_prod__Reserved__lit_throw_(builder);
      
        _init_prod__Reserved__lit_with_lit_abstract_(builder);
      
        _init_prod__Reserved__lit_typeof_(builder);
      
        _init_prod__Reserved__lit_this_(builder);
      
        _init_prod__Reserved__lit_static_(builder);
      
        _init_prod__Reserved__lit_if_(builder);
      
        _init_prod__Reserved__lit_public_(builder);
      
        _init_prod__Reserved__lit_var_(builder);
      
        _init_prod__Reserved__lit_while_(builder);
      
        _init_prod__Reserved__lit_switch_(builder);
      
        _init_prod__Reserved__lit_case_(builder);
      
        _init_prod__Reserved__lit_transient_(builder);
      
        _init_prod__Reserved__lit_long_(builder);
      
        _init_prod__Reserved__lit_const_(builder);
      
        _init_prod__Reserved__lit_super_(builder);
      
    }
  }
	
  protected static class layouts_$default$ {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__layouts_$default$__(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new EpsilonStackNode<IConstructor>(955, 0);
      builder.addAlternative(SweeterJSCachedParser.prod__layouts_$default$__, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__layouts_$default$__(builder);
      
    }
  }
	
  protected static class layouts_LAYOUTLIST {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__layouts_LAYOUTLIST__iter_star__LAYOUT_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new ListStackNode<IConstructor>(3234, 0, regular__iter_star__LAYOUT, new NonTerminalStackNode<IConstructor>(3229, 0, "LAYOUT", null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{9,10},{32,32}}), new StringFollowRestriction(new int[] {47,47}), new StringFollowRestriction(new int[] {47,42})});
      builder.addAlternative(SweeterJSCachedParser.prod__layouts_LAYOUTLIST__iter_star__LAYOUT_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__layouts_LAYOUTLIST__iter_star__LAYOUT_(builder);
      
    }
  }
	
  protected static class CharacterEscapeSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_CharacterEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CharacterEscapeSequence(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5417, 1, prod__lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,67,104,97,114,97,99,116,101,114,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5420, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5419, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5418, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5421, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5416, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_CharacterEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CharacterEscapeSequence, tmp);
	}
    protected static final void _init_prod__CharacterEscapeSequence__SingleEscapeCharacter_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5426, 0, "SingleEscapeCharacter", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__CharacterEscapeSequence__SingleEscapeCharacter_, tmp);
	}
    protected static final void _init_prod__CharacterEscapeSequence__NonEscapeCharacter_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5424, 0, "NonEscapeCharacter", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__CharacterEscapeSequence__NonEscapeCharacter_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_CharacterEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CharacterEscapeSequence(builder);
      
        _init_prod__CharacterEscapeSequence__SingleEscapeCharacter_(builder);
      
        _init_prod__CharacterEscapeSequence__NonEscapeCharacter_(builder);
      
    }
  }
	
  protected static class Comment {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Comment__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Comment(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(3289, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3291, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3290, 1, prod__lit___115_111_114_116_40_34_67_111_109_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,67,111,109,109,101,110,116,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3293, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3292, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3294, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Comment__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Comment, tmp);
	}
    protected static final void _init_prod__Comment__lit___47_47_iter_star__char_class___range__1_9_range__11_16777215__tag__category___67_111_109_109_101_110_116(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new ListStackNode<IConstructor>(3281, 1, regular__iter_star__char_class___range__1_9_range__11_16777215, new CharStackNode<IConstructor>(3279, 0, new int[][]{{1,9},{11,16777215}}, null, null), false, null, new ICompletionFilter[] {new AtEndOfLineRequirement()});
      tmp[0] = new LiteralStackNode<IConstructor>(3278, 0, prod__lit___47_47__char_class___range__47_47_char_class___range__47_47_, new int[] {47,47}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Comment__lit___47_47_iter_star__char_class___range__1_9_range__11_16777215__tag__category___67_111_109_109_101_110_116, tmp);
	}
    protected static final void _init_prod__Comment__lit___47_42_iter_star__CommentChar_lit___42_47__tag__category___67_111_109_109_101_110_116(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(3286, 2, prod__lit___42_47__char_class___range__42_42_char_class___range__47_47_, new int[] {42,47}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(3285, 1, regular__iter_star__CommentChar, new NonTerminalStackNode<IConstructor>(3284, 0, "CommentChar", null, null), false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(3283, 0, prod__lit___47_42__char_class___range__47_47_char_class___range__42_42_, new int[] {47,42}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Comment__lit___47_42_iter_star__CommentChar_lit___42_47__tag__category___67_111_109_109_101_110_116, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Comment__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Comment(builder);
      
        _init_prod__Comment__lit___47_47_iter_star__char_class___range__1_9_range__11_16777215__tag__category___67_111_109_109_101_110_116(builder);
      
        _init_prod__Comment__lit___47_42_iter_star__CommentChar_lit___42_47__tag__category___67_111_109_109_101_110_116(builder);
      
    }
  }
	
  protected static class CommentChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_CommentChar__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CommentChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(1818, 1, prod__lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,67,111,109,109,101,110,116,67,104,97,114,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1817, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1822, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1821, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1820, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1819, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_CommentChar__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CommentChar, tmp);
	}
    protected static final void _init_prod__$MetaHole_CommentChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__CommentChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(1826, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1831, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1827, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,67,111,109,109,101,110,116,67,104,97,114,34,41,41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1828, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1830, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1829, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_CommentChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__CommentChar, tmp);
	}
    protected static final void _init_prod__CommentChar__char_class___range__1_41_range__43_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1835, 0, new int[][]{{1,41},{43,16777215}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__CommentChar__char_class___range__1_41_range__43_16777215_, tmp);
	}
    protected static final void _init_prod__CommentChar__char_class___range__42_42_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1814, 0, new int[][]{{42,42}}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{47,47}})});
      builder.addAlternative(SweeterJSCachedParser.prod__CommentChar__char_class___range__42_42_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_CommentChar__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CommentChar(builder);
      
        _init_prod__$MetaHole_CommentChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__CommentChar(builder);
      
        _init_prod__CommentChar__char_class___range__1_41_range__43_16777215_(builder);
      
        _init_prod__CommentChar__char_class___range__42_42_(builder);
      
    }
  }
	
  protected static class Decimal {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Decimal__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Decimal(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(61, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(63, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(66, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(62, 1, prod__lit___115_111_114_116_40_34_68_101_99_105_109_97_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__105_105_char_class___range__109_109_char_class___range__97_97_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,68,101,99,105,109,97,108,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(65, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(64, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Decimal__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Decimal, tmp);
	}
    protected static final void _init_prod__Decimal__DecimalInteger_opt__ExponentPart_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new OptionalStackNode<IConstructor>(51, 1, regular__opt__ExponentPart, new NonTerminalStackNode<IConstructor>(50, 0, "ExponentPart", null, null), null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(49, 0, "DecimalInteger", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Decimal__DecimalInteger_opt__ExponentPart_, tmp);
	}
    protected static final void _init_prod__Decimal__DecimalInteger_char_class___range__46_46_iter_star__char_class___range__48_57_opt__ExponentPart_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[4];
      
      tmp[3] = new OptionalStackNode<IConstructor>(58, 3, regular__opt__ExponentPart, new NonTerminalStackNode<IConstructor>(57, 0, "ExponentPart", null, null), null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(53, 0, "DecimalInteger", null, null);
      tmp[1] = new CharStackNode<IConstructor>(54, 1, new int[][]{{46,46}}, null, null);
      tmp[2] = new ListStackNode<IConstructor>(56, 2, regular__iter_star__char_class___range__48_57, new CharStackNode<IConstructor>(55, 0, new int[][]{{48,57}}, null, null), false, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Decimal__DecimalInteger_char_class___range__46_46_iter_star__char_class___range__48_57_opt__ExponentPart_, tmp);
	}
    protected static final void _init_prod__Decimal__char_class___range__46_46_iter__char_class___range__48_57_opt__ExponentPart_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new CharStackNode<IConstructor>(69, 0, new int[][]{{46,46}}, null, null);
      tmp[2] = new OptionalStackNode<IConstructor>(73, 2, regular__opt__ExponentPart, new NonTerminalStackNode<IConstructor>(72, 0, "ExponentPart", null, null), null, null);
      tmp[1] = new ListStackNode<IConstructor>(71, 1, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(70, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Decimal__char_class___range__46_46_iter__char_class___range__48_57_opt__ExponentPart_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Decimal__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Decimal(builder);
      
        _init_prod__Decimal__DecimalInteger_opt__ExponentPart_(builder);
      
        _init_prod__Decimal__DecimalInteger_char_class___range__46_46_iter_star__char_class___range__48_57_opt__ExponentPart_(builder);
      
        _init_prod__Decimal__char_class___range__46_46_iter__char_class___range__48_57_opt__ExponentPart_(builder);
      
    }
  }
	
  protected static class DecimalInteger {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_DecimalInteger__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DecimalInteger(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5811, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5808, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5810, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5809, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5806, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5807, 1, prod__lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__105_105_char_class___range__109_109_char_class___range__97_97_char_class___range__108_108_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,68,101,99,105,109,97,108,73,110,116,101,103,101,114,34,41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_DecimalInteger__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DecimalInteger, tmp);
	}
    protected static final void _init_prod__DecimalInteger__char_class___range__48_48_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(5797, 0, new int[][]{{48,48}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__DecimalInteger__char_class___range__48_48_, tmp);
	}
    protected static final void _init_prod__DecimalInteger__char_class___range__49_57_iter_star__char_class___range__48_57_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(5799, 0, new int[][]{{49,57}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(5803, 1, regular__iter_star__char_class___range__48_57, new CharStackNode<IConstructor>(5800, 0, new int[][]{{48,57}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
      builder.addAlternative(SweeterJSCachedParser.prod__DecimalInteger__char_class___range__49_57_iter_star__char_class___range__48_57_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_DecimalInteger__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DecimalInteger(builder);
      
        _init_prod__DecimalInteger__char_class___range__48_48_(builder);
      
        _init_prod__DecimalInteger__char_class___range__49_57_iter_star__char_class___range__48_57_(builder);
      
    }
  }
	
  protected static class DoubleStringChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DoubleStringChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2513, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2516, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2511, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2512, 1, prod__lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,68,111,117,98,108,101,83,116,114,105,110,103,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2515, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2514, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DoubleStringChar, tmp);
	}
    protected static final void _init_prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__DoubleStringChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2520, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2525, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2522, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2524, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2523, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2521, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,68,111,117,98,108,101,83,116,114,105,110,103,67,104,97,114,34,41,41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__DoubleStringChar, tmp);
	}
    protected static final void _init_prod__DoubleStringChar__char_class___range__1_9_range__11_33_range__35_91_range__93_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2529, 0, new int[][]{{1,9},{11,33},{35,91},{93,16777215}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__DoubleStringChar__char_class___range__1_9_range__11_33_range__35_91_range__93_16777215_, tmp);
	}
    protected static final void _init_prod__DoubleStringChar__char_class___range__92_92_EscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(2508, 1, "EscapeSequence", null, null);
      tmp[0] = new CharStackNode<IConstructor>(2507, 0, new int[][]{{92,92}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__DoubleStringChar__char_class___range__92_92_EscapeSequence_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DoubleStringChar(builder);
      
        _init_prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__DoubleStringChar(builder);
      
        _init_prod__DoubleStringChar__char_class___range__1_9_range__11_33_range__35_91_range__93_16777215_(builder);
      
        _init_prod__DoubleStringChar__char_class___range__92_92_EscapeSequence_(builder);
      
    }
  }
	
  protected static class EscapeCharacter {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_EscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeCharacter(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5280, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5277, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5275, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5279, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5278, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5276, 1, prod__lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_EscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeCharacter, tmp);
	}
    protected static final void _init_prod__EscapeCharacter__char_class___range__48_57_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(5283, 0, new int[][]{{48,57}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__EscapeCharacter__char_class___range__48_57_, tmp);
	}
    protected static final void _init_prod__EscapeCharacter__char_class___range__117_117_range__120_120_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(5270, 0, new int[][]{{117,117},{120,120}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__EscapeCharacter__char_class___range__117_117_range__120_120_, tmp);
	}
    protected static final void _init_prod__EscapeCharacter__SingleEscapeCharacter_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5272, 0, "SingleEscapeCharacter", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__EscapeCharacter__SingleEscapeCharacter_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_EscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeCharacter(builder);
      
        _init_prod__EscapeCharacter__char_class___range__48_57_(builder);
      
        _init_prod__EscapeCharacter__char_class___range__117_117_range__120_120_(builder);
      
        _init_prod__EscapeCharacter__SingleEscapeCharacter_(builder);
      
    }
  }
	
  protected static class EscapeSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_EscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeSequence(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(4047, 1, prod__lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4050, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4049, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4048, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4051, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4046, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_EscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeSequence, tmp);
	}
    protected static final void _init_prod__EscapeSequence__HexEscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4054, 0, "HexEscapeSequence", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__EscapeSequence__HexEscapeSequence_, tmp);
	}
    protected static final void _init_prod__EscapeSequence__CharacterEscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4056, 0, "CharacterEscapeSequence", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__EscapeSequence__CharacterEscapeSequence_, tmp);
	}
    protected static final void _init_prod__EscapeSequence__UnicodeEscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4043, 0, "UnicodeEscapeSequence", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__EscapeSequence__UnicodeEscapeSequence_, tmp);
	}
    protected static final void _init_prod__EscapeSequence__char_class___range__48_48_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(4041, 0, new int[][]{{48,48}}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
      builder.addAlternative(SweeterJSCachedParser.prod__EscapeSequence__char_class___range__48_48_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_EscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeSequence(builder);
      
        _init_prod__EscapeSequence__HexEscapeSequence_(builder);
      
        _init_prod__EscapeSequence__CharacterEscapeSequence_(builder);
      
        _init_prod__EscapeSequence__UnicodeEscapeSequence_(builder);
      
        _init_prod__EscapeSequence__char_class___range__48_48_(builder);
      
    }
  }
	
  protected static class ExponentPart {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__ExponentPart(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(4077, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4076, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4074, 1, prod__lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41__char_class___range__111_111_char_class___range__112_112_char_class___range__116_116_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__110_110_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {111,112,116,40,115,111,114,116,40,34,69,120,112,111,110,101,110,116,80,97,114,116,34,41,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4073, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4078, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4075, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__ExponentPart, tmp);
	}
    protected static final void _init_prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ExponentPart(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(4065, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4064, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4062, 1, prod__lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__110_110_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,69,120,112,111,110,101,110,116,80,97,114,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4066, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4063, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4061, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ExponentPart, tmp);
	}
    protected static final void _init_prod__ExponentPart__char_class___range__69_69_range__101_101_SignedInteger_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4070, 1, "SignedInteger", null, null);
      tmp[0] = new CharStackNode<IConstructor>(4069, 0, new int[][]{{69,69},{101,101}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__ExponentPart__char_class___range__69_69_range__101_101_SignedInteger_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__ExponentPart(builder);
      
        _init_prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ExponentPart(builder);
      
        _init_prod__ExponentPart__char_class___range__69_69_range__101_101_SignedInteger_(builder);
      
    }
  }
	
  protected static class HexDigit {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_HexDigit__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_68_105_103_105_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexDigit(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(1279, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1278, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1276, 1, prod__lit___115_111_114_116_40_34_72_101_120_68_105_103_105_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__68_68_char_class___range__105_105_char_class___range__103_103_char_class___range__105_105_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,72,101,120,68,105,103,105,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1280, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1277, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1275, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_HexDigit__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_68_105_103_105_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexDigit, tmp);
	}
    protected static final void _init_prod__HexDigit__char_class___range__48_57_range__65_70_range__97_102_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1283, 0, new int[][]{{48,57},{65,70},{97,102}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__HexDigit__char_class___range__48_57_range__65_70_range__97_102_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_HexDigit__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_68_105_103_105_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexDigit(builder);
      
        _init_prod__HexDigit__char_class___range__48_57_range__65_70_range__97_102_(builder);
      
    }
  }
	
  protected static class HexEscapeSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_HexEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexEscapeSequence(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2948, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2947, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2945, 1, prod__lit___115_111_114_116_40_34_72_101_120_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,72,101,120,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2949, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2946, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2944, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_HexEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexEscapeSequence, tmp);
	}
    protected static final void _init_prod__HexEscapeSequence__char_class___range__120_120_HexDigit_HexDigit_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new CharStackNode<IConstructor>(2952, 0, new int[][]{{120,120}}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2954, 2, "HexDigit", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2953, 1, "HexDigit", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__HexEscapeSequence__char_class___range__120_120_HexDigit_HexDigit_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_HexEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexEscapeSequence(builder);
      
        _init_prod__HexEscapeSequence__char_class___range__120_120_HexDigit_HexDigit_(builder);
      
    }
  }
	
  protected static class HexInteger {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_HexInteger__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexInteger(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(3894, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3896, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3899, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3895, 1, prod__lit___115_111_114_116_40_34_72_101_120_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,72,101,120,73,110,116,101,103,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3898, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3897, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_HexInteger__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexInteger, tmp);
	}
    protected static final void _init_prod__HexInteger__char_class___range__48_48_char_class___range__88_88_range__120_120_iter__char_class___range__48_57_range__65_70_range__97_102_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new CharStackNode<IConstructor>(3887, 1, new int[][]{{88,88},{120,120}}, null, null);
      tmp[2] = new ListStackNode<IConstructor>(3891, 2, regular__iter__char_class___range__48_57_range__65_70_range__97_102, new CharStackNode<IConstructor>(3888, 0, new int[][]{{48,57},{65,70},{97,102}}, null, null), true, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{65,90},{95,95},{97,122}})});
      tmp[0] = new CharStackNode<IConstructor>(3886, 0, new int[][]{{48,48}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__HexInteger__char_class___range__48_48_char_class___range__88_88_range__120_120_iter__char_class___range__48_57_range__65_70_range__97_102_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_HexInteger__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexInteger(builder);
      
        _init_prod__HexInteger__char_class___range__48_48_char_class___range__88_88_range__120_120_iter__char_class___range__48_57_range__65_70_range__97_102_(builder);
      
    }
  }
	
  protected static class Id {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Id__char_class___range__0_0_lit___115_111_114_116_40_34_73_100_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Id(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2665, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2670, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2667, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2669, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2668, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2666, 1, prod__lit___115_111_114_116_40_34_73_100_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__73_73_char_class___range__100_100_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,73,100,34,41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Id__char_class___range__0_0_lit___115_111_114_116_40_34_73_100_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Id, tmp);
	}
    protected static final void _init_prod__$MetaHole_Id__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_73_100_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2645, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2644, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2642, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_73_100_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__73_73_char_class___range__100_100_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,73,100,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2646, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2643, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2641, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Id__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_73_100_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__Id__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new SequenceStackNode<IConstructor>(2662, 0, regular__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122, (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new CharStackNode<IConstructor>(2655, 0, new int[][]{{36,36},{65,90},{95,95},{97,122}}, new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null), new ListStackNode<IConstructor>(2659, 1, regular__iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122, new CharStackNode<IConstructor>(2656, 0, new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})})}, null, new ICompletionFilter[] {new StringMatchRestriction(new int[] {98,114,101,97,107}), new StringMatchRestriction(new int[] {116,104,105,115}), new StringMatchRestriction(new int[] {105,102}), new StringMatchRestriction(new int[] {110,97,116,105,118,101}), new StringMatchRestriction(new int[] {116,114,97,110,115,105,101,110,116}), new StringMatchRestriction(new int[] {105,110,116}), new StringMatchRestriction(new int[] {116,104,114,111,119,115}), new StringMatchRestriction(new int[] {105,110,115,116,97,110,99,101,111,102}), new StringMatchRestriction(new int[] {110,101,119}), new StringMatchRestriction(new int[] {115,117,112,101,114}), new StringMatchRestriction(new int[] {99,97,116,99,104}), new StringMatchRestriction(new int[] {116,114,121}), new StringMatchRestriction(new int[] {101,120,116,101,110,100,115}), new StringMatchRestriction(new int[] {105,110,116,101,114,102,97,99,101}), new StringMatchRestriction(new int[] {101,108,115,101}), new StringMatchRestriction(new int[] {102,117,110,99,116,105,111,110}), new StringMatchRestriction(new int[] {99,108,97,115,115}), new StringMatchRestriction(new int[] {102,108,111,97,116}), new StringMatchRestriction(new int[] {108,111,110,103}), new StringMatchRestriction(new int[] {118,111,108,97,116,105,108,101}), new StringMatchRestriction(new int[] {115,104,111,114,116}), new StringMatchRestriction(new int[] {119,104,105,108,101}), new StringMatchRestriction(new int[] {100,111,117,98,108,101}), new StringMatchRestriction(new int[] {116,121,112,101,111,102}), new StringMatchRestriction(new int[] {99,97,115,101}), new StringMatchRestriction(new int[] {105,109,112,108,101,109,101,110,116,115}), new StringMatchRestriction(new int[] {114,101,116,117,114,110}), new StringMatchRestriction(new int[] {99,104,97,114}), new StringMatchRestriction(new int[] {102,105,110,97,108}), new StringMatchRestriction(new int[] {115,119,105,116,99,104}), new StringMatchRestriction(new int[] {101,120,112,111,114,116}), new StringMatchRestriction(new int[] {115,121,110,99,104,114,111,110,105,122,101,100}), new StringMatchRestriction(new int[] {118,111,105,100}), new StringMatchRestriction(new int[] {105,116}), new StringMatchRestriction(new int[] {100,101,108,101,116,101}), new StringMatchRestriction(new int[] {100,111}), new StringMatchRestriction(new int[] {112,117,98,108,105,99}), new StringMatchRestriction(new int[] {102,111,114}), new StringMatchRestriction(new int[] {98,121,116,101}), new StringMatchRestriction(new int[] {98,111,111,108,101,97,110}), new StringMatchRestriction(new int[] {112,114,111,116,101,99,116,101,100}), new StringMatchRestriction(new int[] {115,116,97,116,105,99}), new StringMatchRestriction(new int[] {116,114,117,101}), new StringMatchRestriction(new int[] {99,111,110,115,116}), new StringMatchRestriction(new int[] {103,111,116,111}), new StringMatchRestriction(new int[] {102,97,108,115,101}), new StringMatchRestriction(new int[] {102,105,110,97,108,108,121}), new StringMatchRestriction(new int[] {112,114,105,118,97,116,101}), new StringMatchRestriction(new int[] {100,101,102,97,117,108,116}), new StringMatchRestriction(new int[] {101,110,117,109}), new StringMatchRestriction(new int[] {100,101,98,117,103,103,101,114}), new StringMatchRestriction(new int[] {118,97,114}), new StringMatchRestriction(new int[] {110,117,108,108}), new StringMatchRestriction(new int[] {99,111,110,116,105,110,117,101}), new StringMatchRestriction(new int[] {116,104,114,111,119}), new StringMatchRestriction(new int[] {112,97,99,107,97,103,101}), new StringMatchRestriction(new int[] {105,109,112,111,114,116}), new StringMatchRestriction(new int[] {105,110})});
      builder.addAlternative(SweeterJSCachedParser.prod__Id__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Id__char_class___range__0_0_lit___115_111_114_116_40_34_73_100_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Id(builder);
      
        _init_prod__$MetaHole_Id__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_73_100_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(builder);
      
        _init_prod__Id__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122_(builder);
      
    }
  }
	
  protected static class LAYOUT {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__LAYOUT(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5748, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5745, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5743, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5747, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5746, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5744, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__65_65_char_class___range__89_89_char_class___range__79_79_char_class___range__85_85_char_class___range__84_84_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,76,65,89,79,85,84,34,41,41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__LAYOUT, tmp);
	}
    protected static final void _init_prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___115_111_114_116_40_34_76_65_89_79_85_84_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LAYOUT(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5733, 1, prod__lit___115_111_114_116_40_34_76_65_89_79_85_84_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__65_65_char_class___range__89_89_char_class___range__79_79_char_class___range__85_85_char_class___range__84_84_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,76,65,89,79,85,84,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5736, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5735, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5734, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5737, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5732, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___115_111_114_116_40_34_76_65_89_79_85_84_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LAYOUT, tmp);
	}
    protected static final void _init_prod__LAYOUT__Whitespace_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5740, 0, "Whitespace", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__LAYOUT__Whitespace_, tmp);
	}
    protected static final void _init_prod__LAYOUT__Comment_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5752, 0, "Comment", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__LAYOUT__Comment_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__LAYOUT(builder);
      
        _init_prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___115_111_114_116_40_34_76_65_89_79_85_84_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LAYOUT(builder);
      
        _init_prod__LAYOUT__Whitespace_(builder);
      
        _init_prod__LAYOUT__Comment_(builder);
      
    }
  }
	
  protected static class NonEscapeCharacter {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_NonEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_78_111_110_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__NonEscapeCharacter(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2678, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2680, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2683, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2679, 1, prod__lit___115_111_114_116_40_34_78_111_110_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__78_78_char_class___range__111_111_char_class___range__110_110_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,78,111,110,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2682, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2681, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_NonEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_78_111_110_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__NonEscapeCharacter, tmp);
	}
    protected static final void _init_prod__NonEscapeCharacter__char_class___range__1_9_range__11_33_range__35_38_range__40_47_range__58_91_range__93_97_range__99_101_range__103_109_range__111_113_range__115_115_range__119_119_range__121_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2675, 0, new int[][]{{1,9},{11,33},{35,38},{40,47},{58,91},{93,97},{99,101},{103,109},{111,113},{115,115},{119,119},{121,16777215}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__NonEscapeCharacter__char_class___range__1_9_range__11_33_range__35_38_range__40_47_range__58_91_range__93_97_range__99_101_range__103_109_range__111_113_range__115_115_range__119_119_range__121_16777215_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_NonEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_78_111_110_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__NonEscapeCharacter(builder);
      
        _init_prod__NonEscapeCharacter__char_class___range__1_9_range__11_33_range__35_38_range__40_47_range__58_91_range__93_97_range__99_101_range__103_109_range__111_113_range__115_115_range__119_119_range__121_16777215_(builder);
      
    }
  }
	
  protected static class RegularExpression {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_RegularExpression__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpression(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(1952, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1957, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1956, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1955, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1954, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1953, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_RegularExpression__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpression, tmp);
	}
    protected static final void _init_prod__RegularExpression__char_class___range__47_47_RegularExpressionBody_char_class___range__47_47_RegularExpressionFlags_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[4];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(1949, 3, "RegularExpressionFlags", null, null);
      tmp[0] = new CharStackNode<IConstructor>(1946, 0, new int[][]{{47,47}}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(1947, 1, "RegularExpressionBody", null, null);
      tmp[2] = new CharStackNode<IConstructor>(1948, 2, new int[][]{{47,47}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__RegularExpression__char_class___range__47_47_RegularExpressionBody_char_class___range__47_47_RegularExpressionFlags_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_RegularExpression__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpression(builder);
      
        _init_prod__RegularExpression__char_class___range__47_47_RegularExpressionBody_char_class___range__47_47_RegularExpressionFlags_(builder);
      
    }
  }
	
  protected static class RegularExpressionBackslashSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_RegularExpressionBackslashSequence__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBackslashSequence(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(3950, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3953, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3948, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3949, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__66_66_char_class___range__97_97_char_class___range__99_99_char_class___range__107_107_char_class___range__115_115_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__104_104_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,66,97,99,107,115,108,97,115,104,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3952, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3951, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_RegularExpressionBackslashSequence__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBackslashSequence, tmp);
	}
    protected static final void _init_prod__RegularExpressionBackslashSequence__char_class___range__92_92_char_class___range__1_9_range__11_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(3956, 0, new int[][]{{92,92}}, null, null);
      tmp[1] = new CharStackNode<IConstructor>(3957, 1, new int[][]{{1,9},{11,16777215}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__RegularExpressionBackslashSequence__char_class___range__92_92_char_class___range__1_9_range__11_16777215_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_RegularExpressionBackslashSequence__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBackslashSequence(builder);
      
        _init_prod__RegularExpressionBackslashSequence__char_class___range__92_92_char_class___range__1_9_range__11_16777215_(builder);
      
    }
  }
	
  protected static class RegularExpressionBody {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_RegularExpressionBody__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_111_100_121_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBody(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2239, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2238, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2236, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_111_100_121_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__66_66_char_class___range__111_111_char_class___range__100_100_char_class___range__121_121_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,66,111,100,121,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2240, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2237, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2235, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_RegularExpressionBody__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_111_100_121_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBody, tmp);
	}
    protected static final void _init_prod__RegularExpressionBody__RegularExpressionFirstChar_iter_star__RegularExpressionChar_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new ListStackNode<IConstructor>(2245, 1, regular__iter_star__RegularExpressionChar, new NonTerminalStackNode<IConstructor>(2244, 0, "RegularExpressionChar", null, null), false, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2243, 0, "RegularExpressionFirstChar", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__RegularExpressionBody__RegularExpressionFirstChar_iter_star__RegularExpressionChar_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_RegularExpressionBody__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_111_100_121_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBody(builder);
      
        _init_prod__RegularExpressionBody__RegularExpressionFirstChar_iter_star__RegularExpressionChar_(builder);
      
    }
  }
	
  protected static class RegularExpressionChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5712, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,104,97,114,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5715, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5714, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5713, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5716, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5711, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionChar, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5722, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5725, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5724, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5723, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5726, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5721, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionChar, tmp);
	}
    protected static final void _init_prod__RegularExpressionChar__RegularExpressionBackslashSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5706, 0, "RegularExpressionBackslashSequence", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__RegularExpressionChar__RegularExpressionBackslashSequence_, tmp);
	}
    protected static final void _init_prod__RegularExpressionChar__char_class___range__1_9_range__11_46_range__48_90_range__93_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(5708, 0, new int[][]{{1,9},{11,46},{48,90},{93,16777215}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__RegularExpressionChar__char_class___range__1_9_range__11_46_range__48_90_range__93_16777215_, tmp);
	}
    protected static final void _init_prod__RegularExpressionChar__RegularExpressionClass_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5704, 0, "RegularExpressionClass", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__RegularExpressionChar__RegularExpressionClass_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionChar(builder);
      
        _init_prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionChar(builder);
      
        _init_prod__RegularExpressionChar__RegularExpressionBackslashSequence_(builder);
      
        _init_prod__RegularExpressionChar__char_class___range__1_9_range__11_46_range__48_90_range__93_16777215_(builder);
      
        _init_prod__RegularExpressionChar__RegularExpressionClass_(builder);
      
    }
  }
	
  protected static class RegularExpressionClass {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_RegularExpressionClass__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClass(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(4345, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4348, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4343, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4344, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4347, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4346, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_RegularExpressionClass__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClass, tmp);
	}
    protected static final void _init_prod__RegularExpressionClass__char_class___range__91_91_iter_star__RegularExpressionClassChar_char_class___range__93_93_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new CharStackNode<IConstructor>(4351, 0, new int[][]{{91,91}}, null, null);
      tmp[2] = new CharStackNode<IConstructor>(4354, 2, new int[][]{{93,93}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(4353, 1, regular__iter_star__RegularExpressionClassChar, new NonTerminalStackNode<IConstructor>(4352, 0, "RegularExpressionClassChar", null, null), false, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__RegularExpressionClass__char_class___range__91_91_iter_star__RegularExpressionClassChar_char_class___range__93_93_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_RegularExpressionClass__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClass(builder);
      
        _init_prod__RegularExpressionClass__char_class___range__91_91_iter_star__RegularExpressionClassChar_char_class___range__93_93_(builder);
      
    }
  }
	
  protected static class RegularExpressionClassChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClassChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2703, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2706, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2701, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2702, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2705, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2704, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClassChar, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionClassChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2710, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2715, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2712, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2711, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,67,104,97,114,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2714, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2713, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionClassChar, tmp);
	}
    protected static final void _init_prod__RegularExpressionClassChar__RegularExpressionBackslashSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(2696, 0, "RegularExpressionBackslashSequence", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__RegularExpressionClassChar__RegularExpressionBackslashSequence_, tmp);
	}
    protected static final void _init_prod__RegularExpressionClassChar__char_class___range__1_9_range__11_91_range__94_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2698, 0, new int[][]{{1,9},{11,91},{94,16777215}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__RegularExpressionClassChar__char_class___range__1_9_range__11_91_range__94_16777215_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClassChar(builder);
      
        _init_prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionClassChar(builder);
      
        _init_prod__RegularExpressionClassChar__RegularExpressionBackslashSequence_(builder);
      
        _init_prod__RegularExpressionClassChar__char_class___range__1_9_range__11_91_range__94_16777215_(builder);
      
    }
  }
	
  protected static class RegularExpressionFirstChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_RegularExpressionFirstChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFirstChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(1172, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1171, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1169, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__70_70_char_class___range__105_105_char_class___range__114_114_char_class___range__115_115_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,70,105,114,115,116,67,104,97,114,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1173, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1170, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1168, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_RegularExpressionFirstChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFirstChar, tmp);
	}
    protected static final void _init_prod__RegularExpressionFirstChar__RegularExpressionClass_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1178, 0, "RegularExpressionClass", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__RegularExpressionFirstChar__RegularExpressionClass_, tmp);
	}
    protected static final void _init_prod__RegularExpressionFirstChar__char_class___range__1_9_range__11_41_range__43_46_range__48_90_range__93_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1176, 0, new int[][]{{1,9},{11,41},{43,46},{48,90},{93,16777215}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__RegularExpressionFirstChar__char_class___range__1_9_range__11_41_range__43_46_range__48_90_range__93_16777215_, tmp);
	}
    protected static final void _init_prod__RegularExpressionFirstChar__RegularExpressionBackslashSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1180, 0, "RegularExpressionBackslashSequence", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__RegularExpressionFirstChar__RegularExpressionBackslashSequence_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_RegularExpressionFirstChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFirstChar(builder);
      
        _init_prod__RegularExpressionFirstChar__RegularExpressionClass_(builder);
      
        _init_prod__RegularExpressionFirstChar__char_class___range__1_9_range__11_41_range__43_46_range__48_90_range__93_16777215_(builder);
      
        _init_prod__RegularExpressionFirstChar__RegularExpressionBackslashSequence_(builder);
      
    }
  }
	
  protected static class RegularExpressionFlags {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_RegularExpressionFlags__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_108_97_103_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFlags(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(979, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(982, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(977, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(978, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_108_97_103_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__70_70_char_class___range__108_108_char_class___range__97_97_char_class___range__103_103_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,70,108,97,103,115,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(981, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(980, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_RegularExpressionFlags__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_108_97_103_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFlags, tmp);
	}
    protected static final void _init_prod__RegularExpressionFlags__iter_star__char_class___range__65_90_range__97_122_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new ListStackNode<IConstructor>(974, 0, regular__iter_star__char_class___range__65_90_range__97_122, new CharStackNode<IConstructor>(971, 0, new int[][]{{65,90},{97,122}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{65,90},{97,122}})});
      builder.addAlternative(SweeterJSCachedParser.prod__RegularExpressionFlags__iter_star__char_class___range__65_90_range__97_122_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_RegularExpressionFlags__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_108_97_103_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFlags(builder);
      
        _init_prod__RegularExpressionFlags__iter_star__char_class___range__65_90_range__97_122_(builder);
      
    }
  }
	
  protected static class SignedInteger {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_SignedInteger__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_103_110_101_100_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SignedInteger(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(4142, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4141, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4139, 1, prod__lit___115_111_114_116_40_34_83_105_103_110_101_100_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__101_101_char_class___range__100_100_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,105,103,110,101,100,73,110,116,101,103,101,114,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4138, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4143, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4140, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_SignedInteger__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_103_110_101_100_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SignedInteger, tmp);
	}
    protected static final void _init_prod__SignedInteger__opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new OptionalStackNode<IConstructor>(4147, 0, regular__opt__char_class___range__43_43_range__45_45, new CharStackNode<IConstructor>(4146, 0, new int[][]{{43,43},{45,45}}, null, null), null, null);
      tmp[1] = new ListStackNode<IConstructor>(4151, 1, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4148, 0, new int[][]{{48,57}}, null, null), true, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
      builder.addAlternative(SweeterJSCachedParser.prod__SignedInteger__opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_SignedInteger__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_103_110_101_100_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SignedInteger(builder);
      
        _init_prod__SignedInteger__opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_(builder);
      
    }
  }
	
  protected static class SingleEscapeCharacter {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_SingleEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleEscapeCharacter(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(3785, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3788, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3783, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3784, 1, prod__lit___115_111_114_116_40_34_83_105_110_103_108_101_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,105,110,103,108,101,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3787, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3786, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_SingleEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleEscapeCharacter, tmp);
	}
    protected static final void _init_prod__SingleEscapeCharacter__char_class___range__34_34_range__39_39_range__92_92_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116_range__118_118_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(3780, 0, new int[][]{{34,34},{39,39},{92,92},{98,98},{102,102},{110,110},{114,114},{116,116},{118,118}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__SingleEscapeCharacter__char_class___range__34_34_range__39_39_range__92_92_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116_range__118_118_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_SingleEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleEscapeCharacter(builder);
      
        _init_prod__SingleEscapeCharacter__char_class___range__34_34_range__39_39_range__92_92_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116_range__118_118_(builder);
      
    }
  }
	
  protected static class SingleStringChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__SingleStringChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(6093, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(6090, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(6092, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(6091, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(6088, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(6089, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,83,105,110,103,108,101,83,116,114,105,110,103,67,104,97,114,34,41,41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__SingleStringChar, tmp);
	}
    protected static final void _init_prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleStringChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(6076, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(6081, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(6078, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(6080, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(6079, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(6077, 1, prod__lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,105,110,103,108,101,83,116,114,105,110,103,67,104,97,114,34,41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleStringChar, tmp);
	}
    protected static final void _init_prod__SingleStringChar__char_class___range__1_9_range__11_38_range__40_91_range__93_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(6073, 0, new int[][]{{1,9},{11,38},{40,91},{93,16777215}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__SingleStringChar__char_class___range__1_9_range__11_38_range__40_91_range__93_16777215_, tmp);
	}
    protected static final void _init_prod__SingleStringChar__char_class___range__92_92_EscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(6084, 0, new int[][]{{92,92}}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(6085, 1, "EscapeSequence", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__SingleStringChar__char_class___range__92_92_EscapeSequence_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__SingleStringChar(builder);
      
        _init_prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleStringChar(builder);
      
        _init_prod__SingleStringChar__char_class___range__1_9_range__11_38_range__40_91_range__93_16777215_(builder);
      
        _init_prod__SingleStringChar__char_class___range__92_92_EscapeSequence_(builder);
      
    }
  }
	
  protected static class String {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_String__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_114_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__String(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(136, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(135, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(133, 1, prod__lit___115_111_114_116_40_34_83_116_114_105_110_103_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,116,114,105,110,103,34,41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(134, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(132, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(137, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_String__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_114_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__String, tmp);
	}
    protected static final void _init_prod__String__char_class___range__34_34_iter_star__DoubleStringChar_char_class___range__34_34_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode<IConstructor>(148, 2, new int[][]{{34,34}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(145, 0, new int[][]{{34,34}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(147, 1, regular__iter_star__DoubleStringChar, new NonTerminalStackNode<IConstructor>(146, 0, "DoubleStringChar", null, null), false, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__String__char_class___range__34_34_iter_star__DoubleStringChar_char_class___range__34_34_, tmp);
	}
    protected static final void _init_prod__String__char_class___range__39_39_iter_star__SingleStringChar_char_class___range__39_39_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode<IConstructor>(143, 2, new int[][]{{39,39}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(140, 0, new int[][]{{39,39}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(142, 1, regular__iter_star__SingleStringChar, new NonTerminalStackNode<IConstructor>(141, 0, "SingleStringChar", null, null), false, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__String__char_class___range__39_39_iter_star__SingleStringChar_char_class___range__39_39_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_String__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_114_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__String(builder);
      
        _init_prod__String__char_class___range__34_34_iter_star__DoubleStringChar_char_class___range__34_34_(builder);
      
        _init_prod__String__char_class___range__39_39_iter_star__SingleStringChar_char_class___range__39_39_(builder);
      
    }
  }
	
  protected static class Whitespace {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Whitespace__char_class___range__0_0_lit___115_111_114_116_40_34_87_104_105_116_101_115_112_97_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Whitespace(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(2904, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2901, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2899, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2903, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2902, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2900, 1, prod__lit___115_111_114_116_40_34_87_104_105_116_101_115_112_97_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__87_87_char_class___range__104_104_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__115_115_char_class___range__112_112_char_class___range__97_97_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,87,104,105,116,101,115,112,97,99,101,34,41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Whitespace__char_class___range__0_0_lit___115_111_114_116_40_34_87_104_105_116_101_115_112_97_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Whitespace, tmp);
	}
    protected static final void _init_prod__Whitespace__char_class___range__9_10_range__13_13_range__32_32_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2896, 0, new int[][]{{9,10},{13,13},{32,32}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Whitespace__char_class___range__9_10_range__13_13_range__32_32_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Whitespace__char_class___range__0_0_lit___115_111_114_116_40_34_87_104_105_116_101_115_112_97_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Whitespace(builder);
      
        _init_prod__Whitespace__char_class___range__9_10_range__13_13_range__32_32_(builder);
      
    }
  }
	
  protected static class Boolean {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Boolean__char_class___range__0_0_lit___115_111_114_116_40_34_66_111_111_108_101_97_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Boolean(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3770, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3769, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3767, 1, prod__lit___115_111_114_116_40_34_66_111_111_108_101_97_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__66_66_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_char_class___range__101_101_char_class___range__97_97_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,66,111,111,108,101,97,110,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3766, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3771, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3768, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Boolean__char_class___range__0_0_lit___115_111_114_116_40_34_66_111_111_108_101_97_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Boolean, tmp);
	}
    protected static final void _init_prod__Boolean__lit_false_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3776, 0, prod__lit_false__char_class___range__102_102_char_class___range__97_97_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new int[] {102,97,108,115,101}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Boolean__lit_false_, tmp);
	}
    protected static final void _init_prod__Boolean__lit_true_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3774, 0, prod__lit_true__char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__101_101_, new int[] {116,114,117,101}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Boolean__lit_true_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Boolean__char_class___range__0_0_lit___115_111_114_116_40_34_66_111_111_108_101_97_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Boolean(builder);
      
        _init_prod__Boolean__lit_false_(builder);
      
        _init_prod__Boolean__lit_true_(builder);
      
    }
  }
	
  protected static class CaseClause {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_CaseClause__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__CaseClause__layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2078, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2080, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2083, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2079, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__117_117_char_class___range__115_115_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,67,97,115,101,67,108,97,117,115,101,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2082, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2081, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_CaseClause__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__CaseClause__layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__$MetaHole_CaseClause__char_class___range__0_0_lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CaseClause(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2060, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2059, 1, prod__lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__117_117_char_class___range__115_115_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,67,97,115,101,67,108,97,117,115,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2062, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2061, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2063, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2058, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_CaseClause__char_class___range__0_0_lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CaseClause, tmp);
	}
    protected static final void _init_prod__caseOf_CaseClause__lit_case_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[6] = new SeparatedListStackNode<IConstructor>(2075, 6, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2073, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2074, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2067, 0, prod__lit_case__char_class___range__99_99_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_, new int[] {99,97,115,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2069, 2, "Expression", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2071, 4, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(2072, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2068, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2070, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__caseOf_CaseClause__lit_case_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_, tmp);
	}
    protected static final void _init_prod__defaultCase_CaseClause__lit_default_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(2050, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2049, 0, prod__lit_default__char_class___range__100_100_char_class___range__101_101_char_class___range__102_102_char_class___range__97_97_char_class___range__117_117_char_class___range__108_108_char_class___range__116_116_, new int[] {100,101,102,97,117,108,116}, null, null);
      tmp[4] = new SeparatedListStackNode<IConstructor>(2055, 4, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2053, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2054, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2052, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2051, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__defaultCase_CaseClause__lit_default_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_CaseClause__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__CaseClause__layouts_LAYOUTLIST(builder);
      
        _init_prod__$MetaHole_CaseClause__char_class___range__0_0_lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CaseClause(builder);
      
        _init_prod__caseOf_CaseClause__lit_case_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_(builder);
      
        _init_prod__defaultCase_CaseClause__lit_default_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class Expression {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Expression__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(805, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(808, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(803, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(804, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,69,120,112,114,101,115,115,105,111,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(807, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(806, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Expression__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__$MetaHole_Expression__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Expression(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(875, 1, prod__lit___115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(878, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(877, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(874, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(876, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(879, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Expression__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Expression, tmp);
	}
    protected static final void _init_prod__add_Expression__Expression_layouts_LAYOUTLIST_lit___43_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(529, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(533, 2, prod__lit___43__char_class___range__43_43_, new int[] {43}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{43,43},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(535, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(530, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(534, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__add_Expression__Expression_layouts_LAYOUTLIST_lit___43_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__and_Expression__Expression_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(667, 2, prod__lit___38_38__char_class___range__38_38_char_class___range__38_38_, new int[] {38,38}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(669, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(665, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(666, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(668, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__and_Expression__Expression_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__array_Expression__lit___91_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(381, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(384, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(375, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new OptionalStackNode<IConstructor>(383, 4, regular__opt__lit___44, new LiteralStackNode<IConstructor>(382, 0, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(385, 6, prod__lit___93__char_class___range__93_93_, new int[] {93}, null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(380, 2, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(376, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(377, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(378, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(379, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(374, 0, prod__lit___91__char_class___range__91_91_, new int[] {91}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__array_Expression__lit___91_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__assign_Expression__Expression_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(709, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(701, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(710, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(708, 2, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(700, 0, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__assign_Expression__Expression_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignAdd_Expression__Expression_layouts_LAYOUTLIST_lit___43_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(778, 2, prod__lit___43_61__char_class___range__43_43_char_class___range__61_61_, new int[] {43,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(780, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(776, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(777, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(779, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__assignAdd_Expression__Expression_layouts_LAYOUTLIST_lit___43_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignBinAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(721, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(723, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(720, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(722, 2, prod__lit___38_61__char_class___range__38_38_char_class___range__61_61_, new int[] {38,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(724, 4, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__assignBinAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignBinOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(734, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(738, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(736, 2, prod__lit___124_61__char_class___range__124_124_char_class___range__61_61_, new int[] {124,61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(737, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(735, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__assignBinOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignBinXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(741, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(745, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(743, 2, prod__lit___94_61__char_class___range__94_94_char_class___range__61_61_, new int[] {94,61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(744, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(742, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__assignBinXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignDiv_Expression__Expression_layouts_LAYOUTLIST_lit___47_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(750, 2, prod__lit___47_61__char_class___range__47_47_char_class___range__61_61_, new int[] {47,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(752, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(748, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(749, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(751, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__assignDiv_Expression__Expression_layouts_LAYOUTLIST_lit___47_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignMul_Expression__Expression_layouts_LAYOUTLIST_lit___42_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(757, 2, prod__lit___42_61__char_class___range__42_42_char_class___range__61_61_, new int[] {42,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(759, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(755, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(756, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(758, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__assignMul_Expression__Expression_layouts_LAYOUTLIST_lit___42_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignRem_Expression__Expression_layouts_LAYOUTLIST_lit___37_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(771, 2, prod__lit___37_61__char_class___range__37_37_char_class___range__61_61_, new int[] {37,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(773, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(769, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(770, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(772, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__assignRem_Expression__Expression_layouts_LAYOUTLIST_lit___37_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignShl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(764, 2, prod__lit___60_60_61__char_class___range__60_60_char_class___range__60_60_char_class___range__61_61_, new int[] {60,60,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(766, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(762, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(763, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(765, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__assignShl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignShr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(730, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(728, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(727, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(731, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(729, 2, prod__lit___62_62_61__char_class___range__62_62_char_class___range__62_62_char_class___range__61_61_, new int[] {62,62,61}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__assignShr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignShrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(696, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(694, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(697, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(695, 2, prod__lit___62_62_62_61__char_class___range__62_62_char_class___range__62_62_char_class___range__62_62_char_class___range__61_61_, new int[] {62,62,62,61}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(693, 0, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__assignShrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignSub_Expression__Expression_layouts_LAYOUTLIST_lit___45_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(714, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(716, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(713, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(715, 2, prod__lit___45_61__char_class___range__45_45_char_class___range__61_61_, new int[] {45,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(717, 4, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__assignSub_Expression__Expression_layouts_LAYOUTLIST_lit___45_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__binAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(643, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(639, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(638, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(644, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(642, 2, prod__lit___38__char_class___range__38_38_, new int[] {38}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{38,38},{61,61}})});
      builder.addAlternative(SweeterJSCachedParser.prod__binAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__binNeg_Expression__lit___126_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(446, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(447, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(445, 0, prod__lit___126__char_class___range__126_126_, new int[] {126}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__binNeg_Expression__lit___126_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__binOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(662, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(660, 2, prod__lit___124__char_class___range__124_124_, new int[] {124}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61},{124,124}})});
      tmp[0] = new NonTerminalStackNode<IConstructor>(656, 0, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(661, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(657, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__binOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__binXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(648, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(652, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(651, 2, prod__lit___94__char_class___range__94_94_, new int[] {94}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(653, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(647, 0, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__binXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__bracket_Expression__lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41__bracket(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(388, 0, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(390, 2, "Expression", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(392, 4, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(389, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(391, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__bracket_Expression__lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41__bracket, tmp);
	}
    protected static final void _init_prod__call_Expression__Expression_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(418, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(416, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(424, 5, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(415, 0, "Expression", null, null);
      tmp[4] = new SeparatedListStackNode<IConstructor>(423, 4, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(419, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(420, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(421, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(422, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(417, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(425, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__call_Expression__Expression_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__cond_Expression__Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[6] = new LiteralStackNode<IConstructor>(857, 6, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(852, 2, prod__lit___63__char_class___range__63_63_, new int[] {63}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(855, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(850, 0, "Expression", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(858, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(851, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(856, 5, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(853, 3, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(859, 8, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__cond_Expression__Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__delete_Expression__lit_delete_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new LiteralStackNode<IConstructor>(469, 0, prod__lit_delete__char_class___range__100_100_char_class___range__101_101_char_class___range__108_108_char_class___range__101_101_char_class___range__116_116_char_class___range__101_101_, new int[] {100,101,108,101,116,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(471, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(470, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__delete_Expression__lit_delete_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__div_Expression__Expression_layouts_LAYOUTLIST_lit___47_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(511, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(515, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(510, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(514, 2, prod__lit___47__char_class___range__47_47_, new int[] {47}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{47,47},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(516, 4, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__div_Expression__Expression_layouts_LAYOUTLIST_lit___47_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__eq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(620, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(616, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(621, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(619, 2, prod__lit___61_61__char_class___range__61_61_char_class___range__61_61_, new int[] {61,61}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[0] = new NonTerminalStackNode<IConstructor>(615, 0, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__eq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__eqq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(631, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(633, 2, prod__lit___61_61_61__char_class___range__61_61_char_class___range__61_61_char_class___range__61_61_, new int[] {61,61,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(635, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(632, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(634, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__eqq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__function_Expression__Function_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(371, 0, "Function", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__function_Expression__Function_, tmp);
	}
    protected static final void _init_prod__geq_Expression__Expression_layouts_LAYOUTLIST_lit___62_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(567, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(565, 2, prod__lit___62_61__char_class___range__62_62_char_class___range__61_61_, new int[] {62,61}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(563, 0, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(566, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(564, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__geq_Expression__Expression_layouts_LAYOUTLIST_lit___62_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__gt_Expression__Expression_layouts_LAYOUTLIST_lit___62_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(584, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(586, 2, prod__lit___62__char_class___range__62_62_, new int[] {62}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(588, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(585, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(587, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__gt_Expression__Expression_layouts_LAYOUTLIST_lit___62_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__inn_Expression__Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(591, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(595, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(593, 2, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new int[] {105,110}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(594, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(592, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__inn_Expression__Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__instanceof_Expression__Expression_layouts_LAYOUTLIST_lit_instanceof_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(570, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(572, 2, prod__lit_instanceof__char_class___range__105_105_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_, new int[] {105,110,115,116,97,110,99,101,111,102}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(574, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(571, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(573, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__instanceof_Expression__Expression_layouts_LAYOUTLIST_lit_instanceof_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__leq_Expression__Expression_layouts_LAYOUTLIST_lit___60_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(577, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(579, 2, prod__lit___60_61__char_class___range__60_60_char_class___range__61_61_, new int[] {60,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(581, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(578, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(580, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__leq_Expression__Expression_layouts_LAYOUTLIST_lit___60_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__literal_Expression__Literal_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(365, 0, "Literal", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__literal_Expression__Literal_, tmp);
	}
    protected static final void _init_prod__lt_Expression__Expression_layouts_LAYOUTLIST_lit___60_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(598, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(602, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(600, 2, prod__lit___60__char_class___range__60_60_, new int[] {60}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(601, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(599, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__lt_Expression__Expression_layouts_LAYOUTLIST_lit___60_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__member_Expression__Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___93_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(409, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(411, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(407, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(406, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(410, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(408, 2, prod__lit___91__char_class___range__91_91_, new int[] {91}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(412, 6, prod__lit___93__char_class___range__93_93_, new int[] {93}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__member_Expression__Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__mul_Expression__Expression_layouts_LAYOUTLIST_lit___42_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(496, 2, prod__lit___42__char_class___range__42_42_, new int[] {42}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{42,42},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(498, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(492, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(493, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(497, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__mul_Expression__Expression_layouts_LAYOUTLIST_lit___42_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__neq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(607, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(611, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(610, 2, prod__lit___33_61__char_class___range__33_33_char_class___range__61_61_, new int[] {33,61}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(612, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(606, 0, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__neq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__neqq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(625, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(627, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(624, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(626, 2, prod__lit___33_61_61__char_class___range__33_33_char_class___range__61_61_char_class___range__61_61_, new int[] {33,61,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(628, 4, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__neqq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__new_Expression__lit_new_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(430, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(428, 0, prod__lit_new__char_class___range__110_110_char_class___range__101_101_char_class___range__119_119_, new int[] {110,101,119}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(429, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__new_Expression__lit_new_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__not_Expression__lit___33_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(482, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(483, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(481, 0, prod__lit___33__char_class___range__33_33_, new int[] {33}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      builder.addAlternative(SweeterJSCachedParser.prod__not_Expression__lit___33_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__objectDefinition_Expression__lit___123_layouts_LAYOUTLIST_iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(352, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(361, 5, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(358, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(357, 2, regular__iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(353, 0, "PropertyAssignment", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(354, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(355, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(356, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(362, 6, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[4] = new OptionalStackNode<IConstructor>(360, 4, regular__opt__lit___44, new LiteralStackNode<IConstructor>(359, 0, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(351, 0, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__objectDefinition_Expression__lit___123_layouts_LAYOUTLIST_iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__or_Expression__Expression_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(675, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(673, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(672, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(676, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(674, 2, prod__lit___124_124__char_class___range__124_124_char_class___range__124_124_, new int[] {124,124}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__or_Expression__Expression_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__postDec_Expression__Expression_layouts_LAYOUTLIST_lit____(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(441, 2, prod__lit_____char_class___range__45_45_char_class___range__45_45_, new int[] {45,45}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(439, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(440, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__postDec_Expression__Expression_layouts_LAYOUTLIST_lit____, tmp);
	}
    protected static final void _init_prod__postIncr_Expression__Expression_layouts_LAYOUTLIST_lit___43_43_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(435, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(436, 2, prod__lit___43_43__char_class___range__43_43_char_class___range__43_43_, new int[] {43,43}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(434, 0, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__postIncr_Expression__Expression_layouts_LAYOUTLIST_lit___43_43_, tmp);
	}
    protected static final void _init_prod__preDecr_Expression__lit____layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(487, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(488, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(486, 0, prod__lit_____char_class___range__45_45_char_class___range__45_45_, new int[] {45,45}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__preDecr_Expression__lit____layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__preIncr_Expression__lit___43_43_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new LiteralStackNode<IConstructor>(474, 0, prod__lit___43_43__char_class___range__43_43_char_class___range__43_43_, new int[] {43,43}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(476, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(475, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__preIncr_Expression__lit___43_43_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__prefixMin_Expression__lit___layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(466, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(464, 0, prod__lit____char_class___range__45_45_, new int[] {45}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{45,45},{61,61}})});
      tmp[1] = new NonTerminalStackNode<IConstructor>(465, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__prefixMin_Expression__lit___layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__prefixPlus_Expression__lit___43_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(458, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(457, 0, prod__lit___43__char_class___range__43_43_, new int[] {43}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{43,43},{61,61}})});
      tmp[2] = new NonTerminalStackNode<IConstructor>(459, 2, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__prefixPlus_Expression__lit___43_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__property_Expression__Expression_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(402, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(400, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(403, 4, "Id", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(401, 2, prod__lit___46__char_class___range__46_46_, new int[] {46}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(399, 0, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__property_Expression__Expression_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_Id_, tmp);
	}
    protected static final void _init_prod__rem_Expression__Expression_layouts_LAYOUTLIST_lit___37_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(502, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(506, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(501, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(505, 2, prod__lit___37__char_class___range__37_37_, new int[] {37}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{37,37},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(507, 4, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__rem_Expression__Expression_layouts_LAYOUTLIST_lit___37_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__shl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(555, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(557, 2, prod__lit___60_60__char_class___range__60_60_char_class___range__60_60_, new int[] {60,60}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(559, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(556, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(558, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__shl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__shr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(540, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(544, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(543, 2, prod__lit___62_62__char_class___range__62_62_char_class___range__62_62_, new int[] {62,62}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{62,62}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(545, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(539, 0, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__shr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__shrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(551, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(549, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(552, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(550, 2, prod__lit___62_62_62__char_class___range__62_62_char_class___range__62_62_char_class___range__62_62_, new int[] {62,62,62}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(548, 0, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__shrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__sub_Expression__Expression_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(521, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(525, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(520, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(524, 2, prod__lit____char_class___range__45_45_, new int[] {45}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{45,45},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(526, 4, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__sub_Expression__Expression_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__this_Expression__lit_this_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(368, 0, prod__lit_this__char_class___range__116_116_char_class___range__104_104_char_class___range__105_105_char_class___range__115_115_, new int[] {116,104,105,115}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__this_Expression__lit_this_, tmp);
	}
    protected static final void _init_prod__typeof_Expression__lit_typeof_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(451, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(452, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(450, 0, prod__lit_typeof__char_class___range__116_116_char_class___range__121_121_char_class___range__112_112_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_, new int[] {116,121,112,101,111,102}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__typeof_Expression__lit_typeof_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__var_Expression__Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(395, 0, "Id", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__var_Expression__Id_, tmp);
	}
    protected static final void _init_prod__Expression__lit___40_layouts_LAYOUTLIST_iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[8] = new LiteralStackNode<IConstructor>(894, 8, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(893, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(883, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(891, 5, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(889, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(899, 11, "layouts_LAYOUTLIST", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(895, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(898, 10, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(896, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(897, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(882, 0, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(892, 6, prod__lit___61_62__char_class___range__61_61_char_class___range__62_62_, new int[] {61,62}, null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(888, 2, regular__iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(884, 0, "Id", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(885, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(886, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(887, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(900, 12, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(890, 4, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Expression__lit___40_layouts_LAYOUTLIST_iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__Expression__lit___35_40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41__tag__category___84_119_105_116_116_101_114_67_111_110_115_116_97_110_116(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(783, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(789, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(782, 0, prod__lit___35_40__char_class___range__35_35_char_class___range__40_40_, new int[] {35,40}, null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(788, 2, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(784, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(785, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(786, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(787, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(790, 4, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Expression__lit___35_40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41__tag__category___84_119_105_116_116_101_114_67_111_110_115_116_97_110_116, tmp);
	}
    protected static final void _init_prod__Expression__Expression_layouts_LAYOUTLIST_lit_build_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(336, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(340, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(345, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(338, 3, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(346, 8, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[6] = new SeparatedListStackNode<IConstructor>(343, 6, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(341, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(342, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(337, 2, prod__lit_build__char_class___range__98_98_char_class___range__117_117_char_class___range__105_105_char_class___range__108_108_char_class___range__100_100_, new int[] {98,117,105,108,100}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(339, 4, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(335, 0, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Expression__Expression_layouts_LAYOUTLIST_lit_build_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__Expression__lit_select_layouts_LAYOUTLIST_Fields_layouts_LAYOUTLIST_lit_from_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit_where_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[11];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(863, 2, "Fields", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(867, 6, "Expression", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(865, 4, prod__lit_from__char_class___range__102_102_char_class___range__114_114_char_class___range__111_111_char_class___range__109_109_, new int[] {102,114,111,109}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(870, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new NonTerminalStackNode<IConstructor>(871, 10, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(861, 0, prod__lit_select__char_class___range__115_115_char_class___range__101_101_char_class___range__108_108_char_class___range__101_101_char_class___range__99_99_char_class___range__116_116_, new int[] {115,101,108,101,99,116}, null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(868, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(862, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(866, 5, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(864, 3, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(869, 8, prod__lit_where__char_class___range__119_119_char_class___range__104_104_char_class___range__101_101_char_class___range__114_114_char_class___range__101_101_, new int[] {119,104,101,114,101}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Expression__lit_select_layouts_LAYOUTLIST_Fields_layouts_LAYOUTLIST_lit_from_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit_where_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__Expression__lit___64_40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41__tag__category___84_119_105_116_116_101_114_67_111_110_115_116_97_110_116(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(799, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(793, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(792, 0, prod__lit___64_40__char_class___range__64_64_char_class___range__40_40_, new int[] {64,40}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(800, 4, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(798, 2, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(794, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(795, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(796, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(797, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Expression__lit___64_40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41__tag__category___84_119_105_116_116_101_114_67_111_110_115_116_97_110_116, tmp);
	}
    protected static final void _init_prod__Expression__lit___91_layouts_LAYOUTLIST_result_Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_iter_seps__Generator__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(836, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(844, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(833, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(838, 5, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(845, 8, prod__lit___93__char_class___range__93_93_, new int[] {93}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(837, 4, prod__lit___124__char_class___range__124_124_, new int[] {124}, null, null);
      tmp[6] = new SeparatedListStackNode<IConstructor>(843, 6, regular__iter_seps__Generator__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(839, 0, "Generator", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(840, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(841, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(842, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(834, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(832, 0, prod__lit___91__char_class___range__91_91_, new int[] {91}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Expression__lit___91_layouts_LAYOUTLIST_result_Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_iter_seps__Generator__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__Expression__Id_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(819, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(817, 2, prod__lit___61_62__char_class___range__61_61_char_class___range__62_62_, new int[] {61,62}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(815, 0, "Id", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(818, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(816, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Expression__Id_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__Expression__lit_it_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(830, 0, prod__lit_it__char_class___range__105_105_char_class___range__116_116_, new int[] {105,116}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Expression__lit_it_, tmp);
	}
    protected static final void _init_prod__Expression__lit_statemachine_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_states_States_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[0] = new LiteralStackNode<IConstructor>(821, 0, prod__lit_statemachine__char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__109_109_char_class___range__97_97_char_class___range__99_99_char_class___range__104_104_char_class___range__105_105_char_class___range__110_110_char_class___range__101_101_, new int[] {115,116,97,116,101,109,97,99,104,105,110,101}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(825, 4, "States", null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(828, 6, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(823, 2, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(824, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(827, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(822, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Expression__lit_statemachine_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_states_States_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Expression__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(builder);
      
        _init_prod__$MetaHole_Expression__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Expression(builder);
      
        _init_prod__add_Expression__Expression_layouts_LAYOUTLIST_lit___43_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__and_Expression__Expression_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__array_Expression__lit___91_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__assign_Expression__Expression_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__assignAdd_Expression__Expression_layouts_LAYOUTLIST_lit___43_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__assignBinAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__assignBinOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__assignBinXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__assignDiv_Expression__Expression_layouts_LAYOUTLIST_lit___47_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__assignMul_Expression__Expression_layouts_LAYOUTLIST_lit___42_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__assignRem_Expression__Expression_layouts_LAYOUTLIST_lit___37_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__assignShl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__assignShr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__assignShrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__assignSub_Expression__Expression_layouts_LAYOUTLIST_lit___45_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__binAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__binNeg_Expression__lit___126_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__binOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__binXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__bracket_Expression__lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41__bracket(builder);
      
        _init_prod__call_Expression__Expression_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(builder);
      
        _init_prod__cond_Expression__Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__delete_Expression__lit_delete_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__div_Expression__Expression_layouts_LAYOUTLIST_lit___47_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__eq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__eqq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__function_Expression__Function_(builder);
      
        _init_prod__geq_Expression__Expression_layouts_LAYOUTLIST_lit___62_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc(builder);
      
        _init_prod__gt_Expression__Expression_layouts_LAYOUTLIST_lit___62_layouts_LAYOUTLIST_Expression__assoc__non_assoc(builder);
      
        _init_prod__inn_Expression__Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_Expression__assoc__non_assoc(builder);
      
        _init_prod__instanceof_Expression__Expression_layouts_LAYOUTLIST_lit_instanceof_layouts_LAYOUTLIST_Expression__assoc__non_assoc(builder);
      
        _init_prod__leq_Expression__Expression_layouts_LAYOUTLIST_lit___60_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc(builder);
      
        _init_prod__literal_Expression__Literal_(builder);
      
        _init_prod__lt_Expression__Expression_layouts_LAYOUTLIST_lit___60_layouts_LAYOUTLIST_Expression__assoc__non_assoc(builder);
      
        _init_prod__member_Expression__Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__mul_Expression__Expression_layouts_LAYOUTLIST_lit___42_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__neq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__neqq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__new_Expression__lit_new_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__not_Expression__lit___33_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__objectDefinition_Expression__lit___123_layouts_LAYOUTLIST_iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__or_Expression__Expression_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__postDec_Expression__Expression_layouts_LAYOUTLIST_lit____(builder);
      
        _init_prod__postIncr_Expression__Expression_layouts_LAYOUTLIST_lit___43_43_(builder);
      
        _init_prod__preDecr_Expression__lit____layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__preIncr_Expression__lit___43_43_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__prefixMin_Expression__lit___layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__prefixPlus_Expression__lit___43_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__property_Expression__Expression_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_Id_(builder);
      
        _init_prod__rem_Expression__Expression_layouts_LAYOUTLIST_lit___37_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__shl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__shr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__shrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__sub_Expression__Expression_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__this_Expression__lit_this_(builder);
      
        _init_prod__typeof_Expression__lit_typeof_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__var_Expression__Id_(builder);
      
        _init_prod__Expression__lit___40_layouts_LAYOUTLIST_iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__Expression__lit___35_40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41__tag__category___84_119_105_116_116_101_114_67_111_110_115_116_97_110_116(builder);
      
        _init_prod__Expression__Expression_layouts_LAYOUTLIST_lit_build_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__Expression__lit_select_layouts_LAYOUTLIST_Fields_layouts_LAYOUTLIST_lit_from_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit_where_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__Expression__lit___64_40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41__tag__category___84_119_105_116_116_101_114_67_111_110_115_116_97_110_116(builder);
      
        _init_prod__Expression__lit___91_layouts_LAYOUTLIST_result_Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_iter_seps__Generator__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__Expression__Id_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__Expression__lit_it_(builder);
      
        _init_prod__Expression__lit_statemachine_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_states_States_layouts_LAYOUTLIST_lit___125_(builder);
      
    }
  }
	
  protected static class Fields {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Fields__char_class___range__0_0_lit___115_111_114_116_40_34_70_105_101_108_100_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Fields(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(162, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(165, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(160, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(161, 1, prod__lit___115_111_114_116_40_34_70_105_101_108_100_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__70_70_char_class___range__105_105_char_class___range__101_101_char_class___range__108_108_char_class___range__100_100_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,70,105,101,108,100,115,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(164, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(163, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Fields__char_class___range__0_0_lit___115_111_114_116_40_34_70_105_101_108_100_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Fields, tmp);
	}
    protected static final void _init_prod__Fields__lst_iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode<IConstructor>(156, 0, regular__iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(152, 0, "Id", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(153, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(154, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(155, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Fields__lst_iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Fields__char_class___range__0_0_lit___115_111_114_116_40_34_70_105_101_108_100_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Fields(builder);
      
        _init_prod__Fields__lst_iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class Function {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Function__char_class___range__0_0_lit___115_111_114_116_40_34_70_117_110_99_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Function(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(250, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(252, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(254, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(253, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(251, 1, prod__lit___115_111_114_116_40_34_70_117_110_99_116_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__70_70_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,70,117,110,99,116,105,111,110,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(255, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Function__char_class___range__0_0_lit___115_111_114_116_40_34_70_117_110_99_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Function, tmp);
	}
    protected static final void _init_prod__Function__lit_function_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[0] = new LiteralStackNode<IConstructor>(258, 0, prod__lit_function__char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_, new int[] {102,117,110,99,116,105,111,110}, null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(275, 10, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(273, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(274, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(272, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode<IConstructor>(266, 4, regular__iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(262, 0, "Id", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(263, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(264, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(265, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(278, 12, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(260, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(269, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(271, 8, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(277, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(261, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(268, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(259, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(270, 7, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Function__lit_function_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__Function__lit_function_layouts_LAYOUTLIST_name_Id_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[15];
      
      tmp[13] = new NonTerminalStackNode<IConstructor>(302, 13, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(296, 10, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(280, 0, prod__lit_function__char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_, new int[] {102,117,110,99,116,105,111,110}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(295, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(285, 4, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[12] = new SeparatedListStackNode<IConstructor>(300, 12, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(298, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(299, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(303, 14, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(282, 2, "Id", null, null);
      tmp[6] = new SeparatedListStackNode<IConstructor>(291, 6, regular__iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(287, 0, "Id", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(288, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(289, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(290, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(294, 8, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(297, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(284, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(286, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(281, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(293, 7, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Function__lit_function_layouts_LAYOUTLIST_name_Id_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Function__char_class___range__0_0_lit___115_111_114_116_40_34_70_117_110_99_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Function(builder);
      
        _init_prod__Function__lit_function_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__Function__lit_function_layouts_LAYOUTLIST_name_Id_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_iter_star_seps__Id__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
    }
  }
	
  protected static class Generator {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Generator__char_class___range__0_0_lit___115_111_114_116_40_34_71_101_110_101_114_97_116_111_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Generator(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2591, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2594, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2593, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2592, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2589, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2590, 1, prod__lit___115_111_114_116_40_34_71_101_110_101_114_97_116_111_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__71_71_char_class___range__101_101_char_class___range__110_110_char_class___range__101_101_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,71,101,110,101,114,97,116,111,114,34,41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Generator__char_class___range__0_0_lit___115_111_114_116_40_34_71_101_110_101_114_97_116_111_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Generator, tmp);
	}
    protected static final void _init_prod__$MetaHole_Generator__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_71_101_110_101_114_97_116_111_114_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__Generator__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2600, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2603, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2598, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2599, 1, prod__lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_71_101_110_101_114_97_116_111_114_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__71_71_char_class___range__101_101_char_class___range__110_110_char_class___range__101_101_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,101,112,115,40,115,111,114,116,40,34,71,101,110,101,114,97,116,111,114,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2602, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2601, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Generator__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_71_101_110_101_114_97_116_111_114_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__Generator__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__Generator__Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(2610, 0, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Generator__Expression_, tmp);
	}
    protected static final void _init_prod__Generator__Id_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(2585, 3, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(2586, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2584, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2583, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2582, 0, "Id", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Generator__Id_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Generator__char_class___range__0_0_lit___115_111_114_116_40_34_71_101_110_101_114_97_116_111_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Generator(builder);
      
        _init_prod__$MetaHole_Generator__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_71_101_110_101_114_97_116_111_114_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__Generator__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(builder);
      
        _init_prod__Generator__Expression_(builder);
      
        _init_prod__Generator__Id_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_(builder);
      
    }
  }
	
  protected static class Literal {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Literal__char_class___range__0_0_lit___115_111_114_116_40_34_76_105_116_101_114_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Literal(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4953, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4950, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4952, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4951, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4949, 1, prod__lit___115_111_114_116_40_34_76_105_116_101_114_97_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__97_97_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,76,105,116,101,114,97,108,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4948, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Literal__char_class___range__0_0_lit___115_111_114_116_40_34_76_105_116_101_114_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Literal, tmp);
	}
    protected static final void _init_prod__Literal__Boolean_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4943, 0, "Boolean", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Literal__Boolean_, tmp);
	}
    protected static final void _init_prod__Literal__lit_null_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4945, 0, prod__lit_null__char_class___range__110_110_char_class___range__117_117_char_class___range__108_108_char_class___range__108_108_, new int[] {110,117,108,108}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Literal__lit_null_, tmp);
	}
    protected static final void _init_prod__Literal__Numeric_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4939, 0, "Numeric", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Literal__Numeric_, tmp);
	}
    protected static final void _init_prod__Literal__RegularExpression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4941, 0, "RegularExpression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Literal__RegularExpression_, tmp);
	}
    protected static final void _init_prod__Literal__String_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4937, 0, "String", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Literal__String_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Literal__char_class___range__0_0_lit___115_111_114_116_40_34_76_105_116_101_114_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Literal(builder);
      
        _init_prod__Literal__Boolean_(builder);
      
        _init_prod__Literal__lit_null_(builder);
      
        _init_prod__Literal__Numeric_(builder);
      
        _init_prod__Literal__RegularExpression_(builder);
      
        _init_prod__Literal__String_(builder);
      
    }
  }
	
  protected static class Numeric {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Numeric__char_class___range__0_0_lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Numeric(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(4183, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4182, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4179, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4184, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4181, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4180, 1, prod__lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__78_78_char_class___range__117_117_char_class___range__109_109_char_class___range__101_101_char_class___range__114_114_char_class___range__105_105_char_class___range__99_99_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,78,117,109,101,114,105,99,34,41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Numeric__char_class___range__0_0_lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Numeric, tmp);
	}
    protected static final void _init_prod__Numeric__Decimal_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4189, 0, "Decimal", new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Numeric__Decimal_, tmp);
	}
    protected static final void _init_prod__Numeric__HexInteger_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4176, 0, "HexInteger", new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Numeric__HexInteger_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Numeric__char_class___range__0_0_lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Numeric(builder);
      
        _init_prod__Numeric__Decimal_(builder);
      
        _init_prod__Numeric__HexInteger_(builder);
      
    }
  }
	
  protected static class PropertyAssignment {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyAssignment(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(5631, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5630, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5627, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5629, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5628, 1, prod__lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,80,114,111,112,101,114,116,121,65,115,115,105,103,110,109,101,110,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5632, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyAssignment, tmp);
	}
    protected static final void _init_prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(5654, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5656, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5658, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5657, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5659, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5655, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,80,114,111,112,101,114,116,121,65,115,115,105,103,110,109,101,110,116,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__property_PropertyAssignment__PropertyName_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(5605, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(5608, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(5604, 0, "PropertyName", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(5607, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5606, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__property_PropertyAssignment__PropertyName_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__PropertyAssignment__lit_get_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(5612, 2, "PropertyName", null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(5616, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(5614, 4, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(5618, 8, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(5617, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(5615, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(5611, 1, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(5623, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(5613, 3, "layouts_LAYOUTLIST", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(5619, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(5622, 10, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(5620, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(5621, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(5610, 0, prod__lit_get__char_class___range__103_103_char_class___range__101_101_char_class___range__116_116_, new int[] {103,101,116}, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(5624, 12, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__PropertyAssignment__lit_get_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__PropertyAssignment__lit_set_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[15];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(5637, 2, "PropertyName", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(5641, 6, "Id", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(5639, 4, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(5644, 9, "layouts_LAYOUTLIST", null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(5651, 14, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[12] = new SeparatedListStackNode<IConstructor>(5649, 12, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(5647, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(5648, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(5635, 0, prod__lit_set__char_class___range__115_115_char_class___range__101_101_char_class___range__116_116_, new int[] {115,101,116}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(5645, 10, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(5650, 13, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(5642, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(5636, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(5640, 5, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(5638, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(5646, 11, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(5643, 8, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__PropertyAssignment__lit_set_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyAssignment(builder);
      
        _init_prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(builder);
      
        _init_prod__property_PropertyAssignment__PropertyName_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__PropertyAssignment__lit_get_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__PropertyAssignment__lit_set_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
    }
  }
	
  protected static class PropertyName {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_PropertyName__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyName(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(5262, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5261, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5259, 1, prod__lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__78_78_char_class___range__97_97_char_class___range__109_109_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,80,114,111,112,101,114,116,121,78,97,109,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5263, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5260, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5258, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_PropertyName__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyName, tmp);
	}
    protected static final void _init_prod__PropertyName__Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5266, 0, "Id", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__PropertyName__Id_, tmp);
	}
    protected static final void _init_prod__PropertyName__Numeric_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5253, 0, "Numeric", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__PropertyName__Numeric_, tmp);
	}
    protected static final void _init_prod__PropertyName__String_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5255, 0, "String", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__PropertyName__String_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_PropertyName__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyName(builder);
      
        _init_prod__PropertyName__Id_(builder);
      
        _init_prod__PropertyName__Numeric_(builder);
      
        _init_prod__PropertyName__String_(builder);
      
    }
  }
	
  protected static class Source {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Source__char_class___range__0_0_lit___115_111_114_116_40_34_83_111_117_114_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Source(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(993, 1, prod__lit___115_111_114_116_40_34_83_111_117_114_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__111_111_char_class___range__117_117_char_class___range__114_114_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,111,117,114,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(996, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(995, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(994, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(997, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(992, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Source__char_class___range__0_0_lit___115_111_114_116_40_34_83_111_117_114_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Source, tmp);
	}
    protected static final void _init_prod__source_Source__iter_star_seps__Statement__layouts_LAYOUTLIST_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode<IConstructor>(1003, 0, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(1001, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(1002, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__source_Source__iter_star_seps__Statement__layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Source__char_class___range__0_0_lit___115_111_114_116_40_34_83_111_117_114_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Source(builder);
      
        _init_prod__source_Source__iter_star_seps__Statement__layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class State {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_State__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__State__layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(2359, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2358, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2357, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2356, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2354, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2355, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,83,116,97,116,101,34,41,41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_State__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__State__layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__$MetaHole_State__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__State(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(2333, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2330, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2332, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2331, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2329, 1, prod__lit___115_111_114_116_40_34_83_116_97_116_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,116,97,116,101,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2328, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_State__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__State, tmp);
	}
    protected static final void _init_prod__State__lit_state_layouts_LAYOUTLIST_id_Id_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_entry_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_transitions_Transitions_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[11];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(2338, 2, "Id", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2341, 4, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(2347, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2340, 3, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(2348, 8, "Transitions", null, null);
      tmp[6] = new SeparatedListStackNode<IConstructor>(2345, 6, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2343, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2344, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(2350, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(2351, 10, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2336, 0, prod__lit_state__char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_, new int[] {115,116,97,116,101}, null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(2342, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2337, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__State__lit_state_layouts_LAYOUTLIST_id_Id_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_entry_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_transitions_Transitions_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_State__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__State__layouts_LAYOUTLIST(builder);
      
        _init_prod__$MetaHole_State__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__State(builder);
      
        _init_prod__State__lit_state_layouts_LAYOUTLIST_id_Id_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_entry_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_transitions_Transitions_layouts_LAYOUTLIST_lit___125_(builder);
      
    }
  }
	
  protected static class Statement {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Statement__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Statement__layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(4719, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4718, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4716, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,83,116,97,116,101,109,101,110,116,34,41,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4720, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4717, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4715, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Statement__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Statement__layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__$MetaHole_Statement__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Statement(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4564, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4561, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4559, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4563, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4562, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4560, 1, prod__lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,116,97,116,101,109,101,110,116,34,41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Statement__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Statement, tmp);
	}
    protected static final void _init_prod__block_Statement__lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4821, 0, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4827, 4, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(4825, 2, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4823, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4824, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4826, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4822, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__block_Statement__lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__breakLabel_Statement__lit_break_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4768, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4766, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4765, 0, prod__lit_break__char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_, new int[] {98,114,101,97,107}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4769, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4767, 2, "Id", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__breakLabel_Statement__lit_break_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__breakNoLabel_Statement__lit_break_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4514, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4515, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4513, 0, prod__lit_break__char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_, new int[] {98,114,101,97,107}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__breakNoLabel_Statement__lit_break_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__continueLabel_Statement__lit_continue_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4811, 0, prod__lit_continue__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_, new int[] {99,111,110,116,105,110,117,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4813, 2, "Id", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4815, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4812, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4814, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__continueLabel_Statement__lit_continue_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__continueNoLabel_Statement__lit_continue_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(4536, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4534, 0, prod__lit_continue__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_, new int[] {99,111,110,116,105,110,117,101}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4535, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__continueNoLabel_Statement__lit_continue_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__debugger_Statement__lit_debugger_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4727, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4726, 0, prod__lit_debugger__char_class___range__100_100_char_class___range__101_101_char_class___range__98_98_char_class___range__117_117_char_class___range__103_103_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_, new int[] {100,101,98,117,103,103,101,114}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4728, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__debugger_Statement__lit_debugger_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__doWhile_Statement__lit_do_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[9] = new NonTerminalStackNode<IConstructor>(4610, 9, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4600, 0, prod__lit_do__char_class___range__100_100_char_class___range__111_111_, new int[] {100,111}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4611, 10, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4606, 6, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4602, 2, "Statement", null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4613, 12, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4604, 4, prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new int[] {119,104,105,108,101}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4608, 8, "Expression", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4605, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4601, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4607, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4603, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4612, 11, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__doWhile_Statement__lit_do_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__empty_Statement__lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4578, 0, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__empty_Statement__lit___59_, tmp);
	}
    protected static final void _init_prod__expression_Statement__Expression_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4628, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4629, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(4627, 0, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__expression_Statement__Expression_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__forDo_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[17];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4679, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4696, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4703, 13, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4677, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4685, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4687, 7, "layouts_LAYOUTLIST", null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4705, 15, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new SeparatedListStackNode<IConstructor>(4692, 8, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4688, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4689, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4690, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4691, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[4] = new SeparatedListStackNode<IConstructor>(4684, 4, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4680, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4681, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4682, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4683, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new SeparatedListStackNode<IConstructor>(4701, 12, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4697, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4698, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4699, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4700, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(4704, 14, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4678, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4686, 6, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4695, 10, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4676, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4694, 9, "layouts_LAYOUTLIST", null, null);
      tmp[16] = new NonTerminalStackNode<IConstructor>(4706, 16, "Statement", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__forDo_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__forDoDeclarations_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit_var_layouts_LAYOUTLIST_iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[19];
      
      tmp[10] = new SeparatedListStackNode<IConstructor>(4865, 10, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4861, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4862, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4863, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4864, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4847, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      tmp[16] = new LiteralStackNode<IConstructor>(4877, 16, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4860, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4851, 4, prod__lit_var__char_class___range__118_118_char_class___range__97_97_char_class___range__114_114_, new int[] {118,97,114}, null, null);
      tmp[14] = new SeparatedListStackNode<IConstructor>(4874, 14, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4870, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4871, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4872, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4873, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4868, 12, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[18] = new NonTerminalStackNode<IConstructor>(4879, 18, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4849, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new SeparatedListStackNode<IConstructor>(4857, 6, regular__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4853, 0, "VariableDeclarationNoIn", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4854, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4855, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4856, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4876, 15, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4859, 8, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4850, 3, "layouts_LAYOUTLIST", null, null);
      tmp[17] = new NonTerminalStackNode<IConstructor>(4878, 17, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4867, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4869, 13, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4858, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4852, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4848, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__forDoDeclarations_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit_var_layouts_LAYOUTLIST_iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__forIn_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_var_Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[10] = new LiteralStackNode<IConstructor>(4842, 10, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4830, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4841, 9, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4844, 12, "Statement", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4834, 4, "Expression", null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4837, 6, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new int[] {105,110}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4832, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4839, 8, "Expression", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4843, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4833, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4838, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4831, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4836, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__forIn_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_var_Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__forInDeclaration_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit_var_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[15];
      
      tmp[10] = new NonTerminalStackNode<IConstructor>(4892, 10, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4882, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4891, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4886, 4, prod__lit_var__char_class___range__118_118_char_class___range__97_97_char_class___range__114_114_, new int[] {118,97,114}, null, null);
      tmp[14] = new NonTerminalStackNode<IConstructor>(4897, 14, "Statement", null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4895, 12, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4884, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(4888, 6, "Id", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4890, 8, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new int[] {105,110}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4885, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4894, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4896, 13, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4889, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4883, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4887, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__forInDeclaration_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit_var_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__function_Statement__Function_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4818, 0, "Function", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__function_Statement__Function_, tmp);
	}
    protected static final void _init_prod__ifThen_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_empty_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[11];
      
      tmp[8] = new NonTerminalStackNode<IConstructor>(4527, 8, "Statement", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4524, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4519, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4526, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4521, 3, "layouts_LAYOUTLIST", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4528, 9, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4518, 0, prod__lit_if__char_class___range__105_105_char_class___range__102_102_, new int[] {105,102}, null, null);
      tmp[10] = new EmptyStackNode<IConstructor>(4531, 10, regular__empty, null, new ICompletionFilter[] {new StringFollowRestriction(new int[] {101,108,115,101})});
      tmp[2] = new LiteralStackNode<IConstructor>(4520, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4525, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4522, 4, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__ifThen_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_empty_, tmp);
	}
    protected static final void _init_prod__ifThenElse_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(4787, 4, "Expression", null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4796, 12, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4785, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4790, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4783, 0, prod__lit_if__char_class___range__105_105_char_class___range__102_102_, new int[] {105,102}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4794, 10, prod__lit_else__char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new int[] {101,108,115,101}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4793, 9, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4795, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4786, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4784, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4789, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4791, 7, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4792, 8, "Statement", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__ifThenElse_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__labeled_Statement__Id_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4910, 0, "Id", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4914, 4, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4912, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4913, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4911, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__labeled_Statement__Id_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__returnExp_Statement__lit_return_layouts_LAYOUTLIST_exp_Expression_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4779, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4776, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4775, 0, prod__lit_return__char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_, new int[] {114,101,116,117,114,110}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4780, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4777, 2, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__returnExp_Statement__lit_return_layouts_LAYOUTLIST_exp_Expression_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__returnNoExp_Statement__lit_return_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4652, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4653, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4651, 0, prod__lit_return__char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_, new int[] {114,101,116,117,114,110}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__returnNoExp_Statement__lit_return_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__switchCase_Statement__lit_switch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_clauses_iter_star_seps__CaseClause__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4633, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4638, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4640, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4635, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4647, 11, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4641, 8, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4639, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4634, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4648, 12, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4636, 4, "Expression", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4642, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(4645, 10, regular__iter_star_seps__CaseClause__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4643, 0, "CaseClause", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4644, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4632, 0, prod__lit_switch__char_class___range__115_115_char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {115,119,105,116,99,104}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__switchCase_Statement__lit_switch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_clauses_iter_star_seps__CaseClause__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__throwExp_Statement__lit_throw_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4761, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4758, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4757, 0, prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_, new int[] {116,104,114,111,119}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4762, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4759, 2, "Expression", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__throwExp_Statement__lit_throw_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__throwNoExp_Statement__lit_throw_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4657, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4658, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4656, 0, prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_, new int[] {116,104,114,111,119}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__throwNoExp_Statement__lit_throw_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__tryCatch_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[7] = new NonTerminalStackNode<IConstructor>(4668, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4666, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4662, 1, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4672, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4664, 3, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4669, 8, "Id", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4663, 2, "Statement", null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4667, 6, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4665, 4, prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {99,97,116,99,104}, null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4673, 12, "Statement", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4670, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4671, 10, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4661, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new int[] {116,114,121}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__tryCatch_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__tryCatchFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[17];
      
      tmp[16] = new NonTerminalStackNode<IConstructor>(4597, 16, "Statement", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4590, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4591, 10, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4581, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new int[] {116,114,121}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4587, 6, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4583, 2, "Statement", null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(4595, 14, prod__lit_finally__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_, new int[] {102,105,110,97,108,108,121}, null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4593, 12, "Statement", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4585, 4, prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {99,97,116,99,104}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4589, 8, "Id", null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4596, 15, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4588, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4582, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4586, 5, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4594, 13, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4584, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4592, 11, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__tryCatchFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__tryFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4917, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new int[] {116,114,121}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4921, 4, prod__lit_finally__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_, new int[] {102,105,110,97,108,108,121}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4919, 2, "Statement", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(4923, 6, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4920, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4922, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4918, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__tryFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__varDecl_Statement__VarDecl_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4772, 0, "VarDecl", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__varDecl_Statement__VarDecl_, tmp);
	}
    protected static final void _init_prod__whileDo_Statement__lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[8] = new NonTerminalStackNode<IConstructor>(4754, 8, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4748, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4753, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4751, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4746, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4745, 0, prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new int[] {119,104,105,108,101}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4749, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4747, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4752, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__whileDo_Statement__lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__with_Statement__lit_with_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_scope_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(4803, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4801, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4806, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4799, 0, prod__lit_with__char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__104_104_, new int[] {119,105,116,104}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4802, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4805, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4800, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4807, 7, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4808, 8, "Statement", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__with_Statement__lit_with_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_scope_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__Statement__lit_times_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4899, 0, prod__lit_times__char_class___range__116_116_char_class___range__105_105_char_class___range__109_109_char_class___range__101_101_char_class___range__115_115_, new int[] {116,105,109,101,115}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4903, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4901, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4905, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4907, 8, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4902, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4904, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4900, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4906, 7, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Statement__lit_times_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__Statement__lit_unless_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4925, 0, prod__lit_unless__char_class___range__117_117_char_class___range__110_110_char_class___range__108_108_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_, new int[] {117,110,108,101,115,115}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4929, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4927, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4931, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4933, 8, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4928, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4930, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4926, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4932, 7, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Statement__lit_unless_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__Statement__lit_todo_layouts_LAYOUTLIST_String_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4711, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4709, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4712, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4710, 2, "String", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4708, 0, prod__lit_todo__char_class___range__116_116_char_class___range__111_111_char_class___range__100_100_char_class___range__111_111_, new int[] {116,111,100,111}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Statement__lit_todo_layouts_LAYOUTLIST_String_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__Statement__lit_swap_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4616, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4620, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4622, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4618, 3, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4623, 8, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(4621, 6, "Id", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4617, 2, "Id", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4619, 4, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4615, 0, prod__lit_swap__char_class___range__115_115_char_class___range__119_119_char_class___range__97_97_char_class___range__112_112_, new int[] {115,119,97,112}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Statement__lit_swap_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__Statement__lit_assert_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_String_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[4] = new LiteralStackNode<IConstructor>(4571, 4, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(4573, 6, "String", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4569, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4567, 0, prod__lit_assert__char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_, new int[] {97,115,115,101,114,116}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4570, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4572, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4568, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4574, 7, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4575, 8, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Statement__lit_assert_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_String_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__Statement__lit_foreach_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[8] = new NonTerminalStackNode<IConstructor>(4738, 8, "Expression", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4741, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4733, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4735, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4731, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4737, 7, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4730, 0, prod__lit_foreach__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__99_99_char_class___range__104_104_, new int[] {102,111,114,101,97,99,104}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4740, 10, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4739, 9, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4742, 12, "Statement", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4734, 4, "Id", null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4736, 6, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new int[] {105,110}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4732, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Statement__lit_foreach_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__Statement__lit_repeat_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit_until_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[17];
      
      tmp[2] = new LiteralStackNode<IConstructor>(4540, 2, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4546, 6, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[4] = new SeparatedListStackNode<IConstructor>(4544, 4, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4542, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4543, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(4554, 14, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4552, 12, "Expression", null, null);
      tmp[16] = new LiteralStackNode<IConstructor>(4556, 16, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4549, 9, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4538, 0, prod__lit_repeat__char_class___range__114_114_char_class___range__101_101_char_class___range__112_112_char_class___range__101_101_char_class___range__97_97_char_class___range__116_116_, new int[] {114,101,112,101,97,116}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4550, 10, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4553, 13, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4547, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4539, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4545, 5, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4541, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4551, 11, "layouts_LAYOUTLIST", null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4555, 15, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4548, 8, prod__lit_until__char_class___range__117_117_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__108_108_, new int[] {117,110,116,105,108}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Statement__lit_repeat_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit_until_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Statement__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Statement__layouts_LAYOUTLIST(builder);
      
        _init_prod__$MetaHole_Statement__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Statement(builder);
      
        _init_prod__block_Statement__lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__breakLabel_Statement__lit_break_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__breakNoLabel_Statement__lit_break_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__continueLabel_Statement__lit_continue_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__continueNoLabel_Statement__lit_continue_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__debugger_Statement__lit_debugger_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__doWhile_Statement__lit_do_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__empty_Statement__lit___59_(builder);
      
        _init_prod__expression_Statement__Expression_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__forDo_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__forDoDeclarations_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit_var_layouts_LAYOUTLIST_iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__forIn_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_var_Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__forInDeclaration_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit_var_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__function_Statement__Function_(builder);
      
        _init_prod__ifThen_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_empty_(builder);
      
        _init_prod__ifThenElse_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__labeled_Statement__Id_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__returnExp_Statement__lit_return_layouts_LAYOUTLIST_exp_Expression_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__returnNoExp_Statement__lit_return_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__switchCase_Statement__lit_switch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_clauses_iter_star_seps__CaseClause__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__throwExp_Statement__lit_throw_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__throwNoExp_Statement__lit_throw_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__tryCatch_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__tryCatchFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__tryFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__varDecl_Statement__VarDecl_(builder);
      
        _init_prod__whileDo_Statement__lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__with_Statement__lit_with_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_scope_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__Statement__lit_times_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__Statement__lit_unless_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__Statement__lit_todo_layouts_LAYOUTLIST_String_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__Statement__lit_swap_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__Statement__lit_assert_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_String_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__Statement__lit_foreach_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__Statement__lit_repeat_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit_until_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_(builder);
      
    }
  }
	
  protected static class States {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_States__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__States(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(5531, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5536, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5533, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5535, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5534, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5532, 1, prod__lit___115_111_114_116_40_34_83_116_97_116_101_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,116,97,116,101,115,34,41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_States__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__States, tmp);
	}
    protected static final void _init_prod__States__lst_iter_star_seps__State__layouts_LAYOUTLIST_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode<IConstructor>(5541, 0, regular__iter_star_seps__State__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(5539, 0, "State", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(5540, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__States__lst_iter_star_seps__State__layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_States__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__States(builder);
      
        _init_prod__States__lst_iter_star_seps__State__layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class Trans {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Trans__char_class___range__0_0_lit___115_111_114_116_40_34_84_114_97_110_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Trans(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(3822, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3821, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3820, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3817, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3819, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3818, 1, prod__lit___115_111_114_116_40_34_84_114_97_110_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__84_84_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,84,114,97,110,115,34,41}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Trans__char_class___range__0_0_lit___115_111_114_116_40_34_84_114_97_110_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Trans, tmp);
	}
    protected static final void _init_prod__$MetaHole_Trans__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_84_114_97_110_115_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Trans__layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(3796, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3799, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3794, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3795, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_84_114_97_110_115_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__84_84_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,84,114,97,110,115,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3798, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3797, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Trans__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_84_114_97_110_115_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Trans__layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__Trans__lit_on_layouts_LAYOUTLIST_event_Id_layouts_LAYOUTLIST_lit_goto_layouts_LAYOUTLIST_target_Id_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[4] = new LiteralStackNode<IConstructor>(3809, 4, prod__lit_goto__char_class___range__103_103_char_class___range__111_111_char_class___range__116_116_char_class___range__111_111_, new int[] {103,111,116,111}, null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(3811, 6, "Id", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(3808, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(3813, 7, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(3806, 2, "Id", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(3804, 0, prod__lit_on__char_class___range__111_111_char_class___range__110_110_, new int[] {111,110}, null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(3810, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(3805, 1, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(3814, 8, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Trans__lit_on_layouts_LAYOUTLIST_event_Id_layouts_LAYOUTLIST_lit_goto_layouts_LAYOUTLIST_target_Id_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Trans__char_class___range__0_0_lit___115_111_114_116_40_34_84_114_97_110_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Trans(builder);
      
        _init_prod__$MetaHole_Trans__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_84_114_97_110_115_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Trans__layouts_LAYOUTLIST(builder);
      
        _init_prod__Trans__lit_on_layouts_LAYOUTLIST_event_Id_layouts_LAYOUTLIST_lit_goto_layouts_LAYOUTLIST_target_Id_layouts_LAYOUTLIST_lit___59_(builder);
      
    }
  }
	
  protected static class Transitions {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Transitions__char_class___range__0_0_lit___115_111_114_116_40_34_84_114_97_110_115_105_116_105_111_110_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Transitions(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2223, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2222, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2220, 1, prod__lit___115_111_114_116_40_34_84_114_97_110_115_105_116_105_111_110_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__84_84_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__115_115_char_class___range__105_105_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,84,114,97,110,115,105,116,105,111,110,115,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2224, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2221, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2219, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_Transitions__char_class___range__0_0_lit___115_111_114_116_40_34_84_114_97_110_115_105_116_105_111_110_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Transitions, tmp);
	}
    protected static final void _init_prod__Transitions__lst_iter_star_seps__Trans__layouts_LAYOUTLIST_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode<IConstructor>(2229, 0, regular__iter_star_seps__Trans__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2227, 0, "Trans", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2228, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__Transitions__lst_iter_star_seps__Trans__layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Transitions__char_class___range__0_0_lit___115_111_114_116_40_34_84_114_97_110_115_105_116_105_111_110_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Transitions(builder);
      
        _init_prod__Transitions__lst_iter_star_seps__Trans__layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class UnicodeEscapeSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_UnicodeEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_85_110_105_99_111_100_101_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__UnicodeEscapeSequence(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(1988, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1987, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1985, 1, prod__lit___115_111_114_116_40_34_85_110_105_99_111_100_101_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__85_85_char_class___range__110_110_char_class___range__105_105_char_class___range__99_99_char_class___range__111_111_char_class___range__100_100_char_class___range__101_101_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,85,110,105,99,111,100,101,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1989, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1986, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1984, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_UnicodeEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_85_110_105_99_111_100_101_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__UnicodeEscapeSequence, tmp);
	}
    protected static final void _init_prod__UnicodeEscapeSequence__lit_u_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[0] = new LiteralStackNode<IConstructor>(1992, 0, prod__lit_u__char_class___range__117_117_, new int[] {117}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(1996, 4, "HexDigit", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(1998, 6, "HexDigit", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(1994, 2, "HexDigit", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(2000, 8, "HexDigit", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(1995, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(1999, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(1997, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(1993, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__UnicodeEscapeSequence__lit_u_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_UnicodeEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_85_110_105_99_111_100_101_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__UnicodeEscapeSequence(builder);
      
        _init_prod__UnicodeEscapeSequence__lit_u_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_(builder);
      
    }
  }
	
  protected static class VarDecl {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_VarDecl__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VarDecl(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(2379, 1, prod__lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,86,97,114,68,101,99,108,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2382, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2381, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2383, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2378, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2380, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_VarDecl__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VarDecl, tmp);
	}
    protected static final void _init_prod__VarDecl__lit_var_layouts_LAYOUTLIST_declarations_iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(2386, 0, prod__lit_var__char_class___range__118_118_char_class___range__97_97_char_class___range__114_114_, new int[] {118,97,114}, null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(2392, 2, regular__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2388, 0, "VariableDeclaration", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2389, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(2390, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(2391, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2395, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2387, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2394, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__VarDecl__lit_var_layouts_LAYOUTLIST_declarations_iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__VarDecl__lit_let_layouts_LAYOUTLIST_declarations_iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(2374, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2367, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2375, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(2372, 2, regular__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2368, 0, "VariableDeclaration", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2369, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(2370, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(2371, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2366, 0, prod__lit_let__char_class___range__108_108_char_class___range__101_101_char_class___range__116_116_, new int[] {108,101,116}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__VarDecl__lit_let_layouts_LAYOUTLIST_declarations_iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_VarDecl__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VarDecl(builder);
      
        _init_prod__VarDecl__lit_var_layouts_LAYOUTLIST_declarations_iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__VarDecl__lit_let_layouts_LAYOUTLIST_declarations_iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_(builder);
      
    }
  }
	
  protected static class VariableDeclaration {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2195, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2194, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2192, 1, prod__lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,101,112,115,40,115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2191, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2196, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2193, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclaration(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2186, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2185, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2183, 1, prod__lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2182, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2184, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2187, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclaration, tmp);
	}
    protected static final void _init_prod__init_VariableDeclaration__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2207, 2, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2208, 3, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(2209, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2204, 0, "Id", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2206, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__init_VariableDeclaration__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_, tmp);
	}
    protected static final void _init_prod__nonInit_VariableDeclaration__id_Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(2213, 0, "Id", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__nonInit_VariableDeclaration__id_Id_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(builder);
      
        _init_prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclaration(builder);
      
        _init_prod__init_VariableDeclaration__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_(builder);
      
        _init_prod__nonInit_VariableDeclaration__id_Id_(builder);
      
    }
  }
	
  protected static class VariableDeclarationNoIn {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(5954, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5957, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5952, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5953, 1, prod__lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__78_78_char_class___range__111_111_char_class___range__73_73_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,101,112,115,40,115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,78,111,73,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5956, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5955, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclarationNoIn(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(5945, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5948, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5943, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5944, 1, prod__lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__78_78_char_class___range__111_111_char_class___range__73_73_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,78,111,73,110,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5947, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5946, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclarationNoIn, tmp);
	}
    protected static final void _init_prod__init_VariableDeclarationNoIn__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5969, 0, "Id", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(5975, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5972, 2, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(5973, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(5971, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__init_VariableDeclarationNoIn__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_, tmp);
	}
    protected static final void _init_prod__nonInit_VariableDeclarationNoIn__id_Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5965, 0, "Id", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__nonInit_VariableDeclarationNoIn__id_Id_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(builder);
      
        _init_prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclarationNoIn(builder);
      
        _init_prod__init_VariableDeclarationNoIn__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_(builder);
      
        _init_prod__nonInit_VariableDeclarationNoIn__id_Id_(builder);
      
    }
  }
	
  protected static class start__Source {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__start__Source__layouts_LAYOUTLIST_top_Source_layouts_LAYOUTLIST_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(4199, 2, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(4196, 0, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4197, 1, "Source", null, null);
      builder.addAlternative(SweeterJSCachedParser.prod__start__Source__layouts_LAYOUTLIST_top_Source_layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__start__Source__layouts_LAYOUTLIST_top_Source_layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  // Parse methods    
  
  public AbstractStackNode<IConstructor>[] Reserved() {
    return Reserved.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] layouts_$default$() {
    return layouts_$default$.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] layouts_LAYOUTLIST() {
    return layouts_LAYOUTLIST.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] CharacterEscapeSequence() {
    return CharacterEscapeSequence.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Comment() {
    return Comment.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] CommentChar() {
    return CommentChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Decimal() {
    return Decimal.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] DecimalInteger() {
    return DecimalInteger.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] DoubleStringChar() {
    return DoubleStringChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] EscapeCharacter() {
    return EscapeCharacter.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] EscapeSequence() {
    return EscapeSequence.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] ExponentPart() {
    return ExponentPart.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] HexDigit() {
    return HexDigit.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] HexEscapeSequence() {
    return HexEscapeSequence.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] HexInteger() {
    return HexInteger.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Id() {
    return Id.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] LAYOUT() {
    return LAYOUT.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] NonEscapeCharacter() {
    return NonEscapeCharacter.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpression() {
    return RegularExpression.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionBackslashSequence() {
    return RegularExpressionBackslashSequence.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionBody() {
    return RegularExpressionBody.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionChar() {
    return RegularExpressionChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionClass() {
    return RegularExpressionClass.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionClassChar() {
    return RegularExpressionClassChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionFirstChar() {
    return RegularExpressionFirstChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionFlags() {
    return RegularExpressionFlags.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] SignedInteger() {
    return SignedInteger.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] SingleEscapeCharacter() {
    return SingleEscapeCharacter.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] SingleStringChar() {
    return SingleStringChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] String() {
    return String.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Whitespace() {
    return Whitespace.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Boolean() {
    return Boolean.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] CaseClause() {
    return CaseClause.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Expression() {
    return Expression.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Fields() {
    return Fields.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Function() {
    return Function.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Generator() {
    return Generator.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Literal() {
    return Literal.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Numeric() {
    return Numeric.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] PropertyAssignment() {
    return PropertyAssignment.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] PropertyName() {
    return PropertyName.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Source() {
    return Source.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] State() {
    return State.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Statement() {
    return Statement.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] States() {
    return States.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Trans() {
    return Trans.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Transitions() {
    return Transitions.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] UnicodeEscapeSequence() {
    return UnicodeEscapeSequence.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] VarDecl() {
    return VarDecl.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] VariableDeclaration() {
    return VariableDeclaration.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] VariableDeclarationNoIn() {
    return VariableDeclarationNoIn.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] start__Source() {
    return start__Source.EXPECTS;
  }
}