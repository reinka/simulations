package aids;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import com.anylogic.engine.connectivity.ResultSet;
import com.anylogic.engine.connectivity.Statement;
import com.anylogic.engine.elements.IElementDescriptor;
import com.anylogic.engine.markup.Network;
import com.anylogic.engine.Position;
import com.anylogic.engine.markup.PedFlowStatistics;
import com.anylogic.engine.markup.DensityMap;


import static java.lang.Math.*;
import static com.anylogic.engine.UtilitiesArray.*;
import static com.anylogic.engine.UtilitiesCollection.*;
import static com.anylogic.engine.presentation.UtilitiesColor.*;
import static com.anylogic.engine.presentation.UtilitiesDrawing.*;
import static com.anylogic.engine.HyperArray.*;

import com.anylogic.engine.*;
import com.anylogic.engine.analysis.*;
import com.anylogic.engine.connectivity.*;
import com.anylogic.engine.database.*;
import com.anylogic.engine.gis.*;
import com.anylogic.engine.markup.*;
import com.anylogic.engine.presentation.*;

import java.awt.geom.Arc2D;

public class Main extends Agent
{
  // Parameters

  public 
double  InfectionRisk;

  /**
   * Returns default value for parameter <code>InfectionRisk</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _InfectionRisk_DefaultValue_xjal() {
    final Main self = this;
    return 
0.08 
;
  }

  public void set_InfectionRisk( double InfectionRisk ) {
    if (InfectionRisk == this.InfectionRisk) {
      return;
    }
    double _oldValue_xjal = this.InfectionRisk;
    this.InfectionRisk = InfectionRisk;
    onChange_InfectionRisk_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter InfectionRisk.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_InfectionRisk()</code> method instead.
   */
  protected void onChange_InfectionRisk() {
    onChange_InfectionRisk_xjal( InfectionRisk );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_InfectionRisk_xjal( double oldValue ) {  
  }


  public 
int  EncounterRate;

  /**
   * Returns default value for parameter <code>EncounterRate</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _EncounterRate_DefaultValue_xjal() {
    final Main self = this;
    return 
10 
;
  }

  public void set_EncounterRate( int EncounterRate ) {
    if (EncounterRate == this.EncounterRate) {
      return;
    }
    int _oldValue_xjal = this.EncounterRate;
    this.EncounterRate = EncounterRate;
    onChange_EncounterRate_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter EncounterRate.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_EncounterRate()</code> method instead.
   */
  protected void onChange_EncounterRate() {
    onChange_EncounterRate_xjal( EncounterRate );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_EncounterRate_xjal( int oldValue ) {  
  }


  public 
double  DiseaseDuration;

  /**
   * Returns default value for parameter <code>DiseaseDuration</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _DiseaseDuration_DefaultValue_xjal() {
    final Main self = this;
    return 
10 
;
  }

  public void set_DiseaseDuration( double DiseaseDuration ) {
    if (DiseaseDuration == this.DiseaseDuration) {
      return;
    }
    double _oldValue_xjal = this.DiseaseDuration;
    this.DiseaseDuration = DiseaseDuration;
    onChange_DiseaseDuration_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter DiseaseDuration.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_DiseaseDuration()</code> method instead.
   */
  protected void onChange_DiseaseDuration() {
    onChange_DiseaseDuration_xjal( DiseaseDuration );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_DiseaseDuration_xjal( double oldValue ) {  
  }


  public 
int  InitPopulation;

  /**
   * Returns default value for parameter <code>InitPopulation</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _InitPopulation_DefaultValue_xjal() {
    final Main self = this;
    return 
1000 
;
  }

  public void set_InitPopulation( int InitPopulation ) {
    if (InitPopulation == this.InitPopulation) {
      return;
    }
    int _oldValue_xjal = this.InitPopulation;
    this.InitPopulation = InitPopulation;
    onChange_InitPopulation_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter InitPopulation.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_InitPopulation()</code> method instead.
   */
  protected void onChange_InitPopulation() {
    onChange_InitPopulation_xjal( InitPopulation );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_InitPopulation_xjal( int oldValue ) {  
  }


  public 
int  InitInfected;

  /**
   * Returns default value for parameter <code>InitInfected</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _InitInfected_DefaultValue_xjal() {
    final Main self = this;
    return 
1 
;
  }

  public void set_InitInfected( int InitInfected ) {
    if (InitInfected == this.InitInfected) {
      return;
    }
    int _oldValue_xjal = this.InitInfected;
    this.InitInfected = InitInfected;
    onChange_InitInfected_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter InitInfected.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_InitInfected()</code> method instead.
   */
  protected void onChange_InitInfected() {
    onChange_InitInfected_xjal( InitInfected );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_InitInfected_xjal( int oldValue ) {  
  }


  public 
int  VaccRate;

  /**
   * Returns default value for parameter <code>VaccRate</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _VaccRate_DefaultValue_xjal() {
    final Main self = this;
    return 
5 
;
  }

  public void set_VaccRate( int VaccRate ) {
    if (VaccRate == this.VaccRate) {
      return;
    }
    int _oldValue_xjal = this.VaccRate;
    this.VaccRate = VaccRate;
    onChange_VaccRate_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter VaccRate.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_VaccRate()</code> method instead.
   */
  protected void onChange_VaccRate() {
    onChange_VaccRate_xjal( VaccRate );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_VaccRate_xjal( int oldValue ) {  
  }


  public 
double  BirthProbability;

  /**
   * Returns default value for parameter <code>BirthProbability</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _BirthProbability_DefaultValue_xjal() {
    final Main self = this;
    return 
0.01 
;
  }

  public void set_BirthProbability( double BirthProbability ) {
    if (BirthProbability == this.BirthProbability) {
      return;
    }
    double _oldValue_xjal = this.BirthProbability;
    this.BirthProbability = BirthProbability;
    onChange_BirthProbability_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter BirthProbability.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_BirthProbability()</code> method instead.
   */
  protected void onChange_BirthProbability() {
    onChange_BirthProbability_xjal( BirthProbability );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_BirthProbability_xjal( double oldValue ) {  
  }


  public 
double  DeathRisk;

  /**
   * Returns default value for parameter <code>DeathRisk</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _DeathRisk_DefaultValue_xjal() {
    final Main self = this;
    return 
0.01 
;
  }

  public void set_DeathRisk( double DeathRisk ) {
    if (DeathRisk == this.DeathRisk) {
      return;
    }
    double _oldValue_xjal = this.DeathRisk;
    this.DeathRisk = DeathRisk;
    onChange_DeathRisk_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter DeathRisk.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_DeathRisk()</code> method instead.
   */
  protected void onChange_DeathRisk() {
    onChange_DeathRisk_xjal( DeathRisk );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_DeathRisk_xjal( double oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    InfectionRisk = _InfectionRisk_DefaultValue_xjal();
    EncounterRate = _EncounterRate_DefaultValue_xjal();
    DiseaseDuration = _DiseaseDuration_DefaultValue_xjal();
    InitPopulation = _InitPopulation_DefaultValue_xjal();
    InitInfected = _InitInfected_DefaultValue_xjal();
    VaccRate = _VaccRate_DefaultValue_xjal();
    BirthProbability = _BirthProbability_DefaultValue_xjal();
    DeathRisk = _DeathRisk_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "InfectionRisk":
      if ( _callOnChange_xjal ) {
        set_InfectionRisk( ((Number) _value_xjal).doubleValue() );
      } else {
        InfectionRisk = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "EncounterRate":
      if ( _callOnChange_xjal ) {
        set_EncounterRate( ((Number) _value_xjal).intValue() );
      } else {
        EncounterRate = ((Number) _value_xjal).intValue();
      }
      return true;
    case "DiseaseDuration":
      if ( _callOnChange_xjal ) {
        set_DiseaseDuration( ((Number) _value_xjal).doubleValue() );
      } else {
        DiseaseDuration = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "InitPopulation":
      if ( _callOnChange_xjal ) {
        set_InitPopulation( ((Number) _value_xjal).intValue() );
      } else {
        InitPopulation = ((Number) _value_xjal).intValue();
      }
      return true;
    case "InitInfected":
      if ( _callOnChange_xjal ) {
        set_InitInfected( ((Number) _value_xjal).intValue() );
      } else {
        InitInfected = ((Number) _value_xjal).intValue();
      }
      return true;
    case "VaccRate":
      if ( _callOnChange_xjal ) {
        set_VaccRate( ((Number) _value_xjal).intValue() );
      } else {
        VaccRate = ((Number) _value_xjal).intValue();
      }
      return true;
    case "BirthProbability":
      if ( _callOnChange_xjal ) {
        set_BirthProbability( ((Number) _value_xjal).doubleValue() );
      } else {
        BirthProbability = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "DeathRisk":
      if ( _callOnChange_xjal ) {
        set_DeathRisk( ((Number) _value_xjal).doubleValue() );
      } else {
        DeathRisk = ((Number) _value_xjal).doubleValue();
      }
      return true;
    default:
      return super.setParameter( _name_xjal, _value_xjal, _callOnChange_xjal );
    }
  }

  @Override
  public <T> T getParameter(String _name_xjal) {
    Object _result_xjal;
    switch ( _name_xjal ) {
    case "InfectionRisk": _result_xjal = InfectionRisk; break;
    case "EncounterRate": _result_xjal = EncounterRate; break;
    case "DiseaseDuration": _result_xjal = DiseaseDuration; break;
    case "InitPopulation": _result_xjal = InitPopulation; break;
    case "InitInfected": _result_xjal = InitInfected; break;
    case "VaccRate": _result_xjal = VaccRate; break;
    case "BirthProbability": _result_xjal = BirthProbability; break;
    case "DeathRisk": _result_xjal = DeathRisk; break;
    default: _result_xjal = super.getParameter( _name_xjal ); break;
    }
    return (T) _result_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private static String[] _parameterNames_xjal;

  @Override
  public String[] getParameterNames() {
    String[] result = _parameterNames_xjal;
    if (result == null) {
      List<String> list = new ArrayList<>( Arrays.asList( super.getParameterNames() ) );
      list.add( "InfectionRisk" );
      list.add( "EncounterRate" );
      list.add( "DiseaseDuration" );
      list.add( "InitPopulation" );
      list.add( "InitInfected" );
      list.add( "VaccRate" );
      list.add( "BirthProbability" );
      list.add( "DeathRisk" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }

  // Dynamic (Flow/Auxiliary/Stock) Variables

  public double InfectionRate;

  public double RecoveryRate;

  public double VaccinationRate;

  public double BirthRate;

  public double DeathRateS;

  public double DeathRateI;

  public double DeathRateR;

  public double S;

  public double I;

  public double R;
  /**
   * Writes model variables into given arrays
   */
  @AnyLogicInternalCodegenAPI
  public void getPhaseVector_xjal(double[] _d_xjal, int _d_idx_xjal, double[] _a_xjal, int _a_idx_xjal) {
    _d_xjal[ _d_idx_xjal + 0 ] = S;
    _d_xjal[ _d_idx_xjal + 1 ] = I;
    _d_xjal[ _d_idx_xjal + 2 ] = R;
    _d_idx_xjal += 3;
    super.getPhaseVector_xjal(_d_xjal, _d_idx_xjal, _a_xjal, _a_idx_xjal);
  }
  /**
   * Writes given arrays to model variables
   */
  @AnyLogicInternalCodegenAPI
  public void putPhaseVector_xjal(double[] _d_xjal, int _d_idx_xjal, double[] _a_xjal, int _a_idx_xjal) {
    S = _d_xjal[ _d_idx_xjal + 0 ];
    I = _d_xjal[ _d_idx_xjal + 1 ];
    R = _d_xjal[ _d_idx_xjal + 2 ];
    _d_idx_xjal += 3;
    super.putPhaseVector_xjal(_d_xjal, _d_idx_xjal, _a_xjal, _a_idx_xjal);
  }
  @AnyLogicInternalCodegenAPI
  public void assignInitialConditions_xjal() {
	super.assignInitialConditions_xjal(); 
    _assign_S_Formula_xjal();
    _assign_I_Formula_xjal();
    _assign_R_Formula_xjal();
    _assign_InfectionRate_Formula_xjal();
    _assign_RecoveryRate_Formula_xjal();
    _assign_VaccinationRate_Formula_xjal();
    _assign_BirthRate_Formula_xjal();
    _assign_DeathRateS_Formula_xjal();
    _assign_DeathRateI_Formula_xjal();
    _assign_DeathRateR_Formula_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void setupInitialConditions_xjal(Class<?> callerClass) {
    if (callerClass != Main.class) {
      return;
    }
    if (getInitialAlgebraicFlatEquationsCount_xjal() > 0) {
      SDIntegrationManager integrationManagerForInitialConditions = new SDIntegrationManager( 0, getInitialAlgebraicFlatEquationsCount_xjal(), getInitialFormulaFlatEquationsCount_xjal() );
      integrationManagerForInitialConditions.doStep( this, 0, 0.1, true );
    } else {
      assignInitialConditions_xjal();
    } 
  }
  
  @AnyLogicInternalCodegenAPI
  public void _assign_S_Formula_xjal() {
    S = 
InitPopulation - InitInfected 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_I_Formula_xjal() {
    I = 
InitInfected 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_R_Formula_xjal() {
    R = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_InfectionRate_Formula_xjal() {
    InfectionRate = 
InfectionRisk * EncounterRate * S* (I / (S + I + R)) 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_RecoveryRate_Formula_xjal() {
    RecoveryRate = 
I * 1 / DiseaseDuration 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_VaccinationRate_Formula_xjal() {
    VaccinationRate = 
(S > 0)?min(VaccRate,S):0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_BirthRate_Formula_xjal() {
    BirthRate = 
(S + I + R) * BirthProbability 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_DeathRateS_Formula_xjal() {
    DeathRateS = 
DeathRisk * S 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_DeathRateI_Formula_xjal() {
    DeathRateI = 
I * DeathRisk 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_DeathRateR_Formula_xjal() {
    DeathRateR = 
R * DeathRisk 
;
  }
  @AnyLogicInternalCodegenAPI
  public void formulasExecute_xjal() {
    super.formulasExecute_xjal();
    _assign_InfectionRate_Formula_xjal();
    _assign_RecoveryRate_Formula_xjal();
    _assign_VaccinationRate_Formula_xjal();
    _assign_BirthRate_Formula_xjal();
    _assign_DeathRateS_Formula_xjal();
    _assign_DeathRateI_Formula_xjal();
    _assign_DeathRateR_Formula_xjal(); 
  }

  @AnyLogicInternalCodegenAPI
  public void getRightPart_xjal( double[] _d_xjal, int _d_idx_xjal, double[] _a_xjal, int _a_idx_xjal ) {
    _get_S_Derivative_xjal( _d_xjal, _d_idx_xjal + 0 );
    _get_I_Derivative_xjal( _d_xjal, _d_idx_xjal + 1 );
    _get_R_Derivative_xjal( _d_xjal, _d_idx_xjal + 2 );
    _d_idx_xjal += 3; 
	super.getRightPart_xjal( _d_xjal, _d_idx_xjal, _a_xjal, _a_idx_xjal );
  }

  @AnyLogicInternalCodegenAPI
  public void _get_S_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+BirthRate - InfectionRate - VaccinationRate- DeathRateS 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_I_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+InfectionRate - RecoveryRate - DeathRateI 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_R_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+RecoveryRate + VaccinationRate - DeathRateR 
;
  }
  @AnyLogicInternalCodegenAPI
  protected SDIntegrationManager integrationManager_xjal = null;
  
  @AnyLogicInternalCodegenAPI
  public SDIntegrationManager getIntegrationManager_xjal() {
    if (integrationManager_xjal == null) {
      integrationManager_xjal = new SDIntegrationManager( getDifferentialFlatEquationsCount_xjal(), getRuntimeAlgebraicFlatEquationsCount_xjal(), getRuntimeFormulaFlatEquationsCount_xjal() );
    }
    return integrationManager_xjal;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public int getDifferentialFlatEquationsCount_xjal() {
    return super.getDifferentialFlatEquationsCount_xjal() + 3;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public int getRuntimeFormulaFlatEquationsCount_xjal() {
    return super.getRuntimeFormulaFlatEquationsCount_xjal() + 7;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public int getInitialFormulaFlatEquationsCount_xjal() {
    return super.getInitialFormulaFlatEquationsCount_xjal() + 10;
  }

  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = null;
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    if (elementDesciptors_xjal == null) {
      elementDesciptors_xjal = createElementDescriptors(super.getElementDesciptors(), Main.class);
    }
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 10.0 );

  @Override
  public Scale getScale() {
    return scale;
  }
  // Events
	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _plot_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _autoCreatedDS_xjal = new EventTimeout(this);

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventTimeout _e ) {
     if( _e == _plot_autoUpdateEvent_xjal ) return "plot auto update event";
     if( _e == _autoCreatedDS_xjal ) return "Auto-created DataSets auto update event";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf( EventTimeout _e ) {
    if ( _e == _plot_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _autoCreatedDS_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    return super.getModeOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime( EventTimeout _e ) {
    double _t;
    if ( _e == _plot_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if ( _e == _autoCreatedDS_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    return super.getFirstOccurrenceTime( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( EventTimeout _e ) {
    double _t;
    if( _e == _plot_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if( _e == _autoCreatedDS_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    return super.evaluateTimeoutOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventTimeout _e ) {
    if ( _e == _plot_autoUpdateEvent_xjal ) {
      plot.updateData();
      return;
    }
    if ( _e == _autoCreatedDS_xjal ) {
      _ds_InfectionRate.update();
      _ds_RecoveryRate.update();
      _ds_VaccinationRate.update();
      _ds_BirthRate.update();
      _ds_DeathRateS.update();
      _ds_DeathRateI.update();
      _ds_DeathRateR.update();
      _ds_S.update();
      _ds_I.update();
      _ds_R.update();
      return;
    }
    super.executeActionOf( _e );
  }

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final short _STATECHART_ELEMENT_NEXT_ID_xjal = 0;
  /**
   * Auto-created data set(s) for InfectionRate
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_InfectionRate = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.InfectionRate );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for RecoveryRate
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_RecoveryRate = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.RecoveryRate );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for VaccinationRate
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_VaccinationRate = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.VaccinationRate );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for BirthRate
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_BirthRate = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.BirthRate );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for DeathRateS
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_DeathRateS = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.DeathRateS );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for DeathRateI
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_DeathRateI = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.DeathRateI );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for DeathRateR
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_DeathRateR = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.DeathRateR );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for S
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_S = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.S );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for I
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_I = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.I );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for R
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_R = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.R );
      _lastUpdateTime = time();
    }
  } );
  @AnyLogicInternalCodegenAPI
  public DataSet _plot_expression0_dataSet_xjal = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __plot_expression0_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot_expression0_dataSet_xjal_YValue() {
    return 
I 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _plot_expression1_dataSet_xjal = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __plot_expression1_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot_expression1_dataSet_xjal_YValue() {
    return 
S 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _plot_expression2_dataSet_xjal = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __plot_expression2_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot_expression2_dataSet_xjal_YValue() {
    return 
R 
;
  }

  // View areas
  public ViewArea _origin_VA = new ViewArea( this, "[Origin]", 0, 0, ViewArea.TOP_LEFT, ViewArea.SPECIFIED_ZOOM, 1, 100, 100 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 1 + super.getViewAreas( _output );
  }
  @AnyLogicInternalCodegenAPI
  protected static final int _plot = 1;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 2;
 

  /**
   * Top-level presentation group id
   */	 
  @AnyLogicInternalCodegenAPI
  protected static final int _presentation = 0;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  /**
   * Top-level icon group id
   */	 
  @AnyLogicInternalCodegenAPI
  protected static final int _icon = -1;
  
  
  protected TimePlot plot;
  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {
    DataSet _item;
    List<DataSet> _items = new ArrayList<DataSet>( 3 );
    _items.add( _plot_expression0_dataSet_xjal ); 
    _items.add( _plot_expression1_dataSet_xjal ); 
    _items.add( _plot_expression2_dataSet_xjal ); 
    List<String> _titles = new ArrayList<String>( 3 );
    _titles.add( "I " );
    _titles.add( "S" );
    _titles.add( "R" );
    List<Chart2DPlot.Appearance> _appearances = new ArrayList<Chart2DPlot.Appearance>( 3 );
    _appearances.add( new Chart2DPlot.Appearance( red, true, Chart.INTERPOLATION_LINEAR, 1.0, Chart.POINT_NONE ) );
    _appearances.add( new Chart2DPlot.Appearance( green, true, Chart.INTERPOLATION_LINEAR, 1.0, Chart.POINT_NONE ) );
    _appearances.add( new Chart2DPlot.Appearance( blue, true, Chart.INTERPOLATION_LINEAR, 1.0, Chart.POINT_NONE ) );
    plot = new TimePlot(
		    Main.this, true, 180.0, 190.0, 
			400.0, 230.0,
            null, null,
            50.0, 30.0,
			320.0, 140.0, white, black, black,
            30.0, Chart.SOUTH,
            
100 
            , Chart.WINDOW_MOVES_WITH_TIME, null, Chart.SCALE_AUTO,
            0, 0, Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _appearances );

    }
  }


  // Static initialization of persistent elements
  {
    _createPersistentElementsBP0_xjal();
  }
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public Object getPersistentShape( int _shape ) {
    switch (_shape) {
      case _presentation: return presentation;
      case _icon: return icon;
      case _plot: return plot;
      default: return super.getPersistentShape( _shape ); 
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOfShape_xjal( Object _shape ) {
    try {
      if ( _shape == null ) return null;
      String _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, presentation, "presentation" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, icon, "icon" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, plot, "plot" ); if (_name_xjal != null) return _name_xjal;
    } catch (Exception e) {
      return null;
    }
    return super.getNameOfShape_xjal( _shape );
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Parameters_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawParameter( _panel, _g, 160, 20, 10, 0, "InfectionRisk", InfectionRisk, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 330, 30, 10, 0, "EncounterRate", EncounterRate, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 40, 30, 10, 0, "DiseaseDuration", DiseaseDuration, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 30, 170, 10, 0, "InitPopulation", InitPopulation, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 30, 70, 10, 0, "InitInfected", InitInfected, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 480, 20, 10, 0, "VaccRate", VaccRate, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 600, 60, 10, 0, "BirthProbability", BirthProbability, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 580, 120, 10, 0, "DeathRisk", DeathRisk, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_StockVariables_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawStock( _panel, _g, 110, 110, 20, 20, 0, -20, "S", S, null, 0 );
    }
    if (!_publicOnly) {
      drawStock( _panel, _g, 210, 110, 20, 20, 0, -20, "I", I, null, 0 );
    }
    if (!_publicOnly) {
      drawStock( _panel, _g, 500, 110, 20, 20, 0, -20, "R", R, null, 0 );
    }
  }
  @AnyLogicInternalCodegenAPI
  protected static final int[] _InfectionRate_pointsX_xjal = {124, 160, 181,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _InfectionRate_pointsY_xjal = {110, 110, 110,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _RecoveryRate_pointsX_xjal = {224, 330, 471,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _RecoveryRate_pointsY_xjal = {110, 110, 110,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _VaccinationRate_pointsX_xjal = {110, 110, 110, 500, 500,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _VaccinationRate_pointsY_xjal = {124, 155, 200, 200, 139,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _BirthRate_pointsX_xjal = {60, 30, 96,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _BirthRate_pointsY_xjal = {460, 260, 136,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _DeathRateS_pointsX_xjal = {110, 110, 143,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _DeathRateS_pointsY_xjal = {124, 380, 437,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _DeathRateI_pointsX_xjal = {211, 230, 276,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _DeathRateI_pointsY_xjal = {124, 450, 465,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _DeathRateR_pointsX_xjal = {516, 640, 621,  };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _DeathRateR_pointsY_xjal = {120, 200, 425,  };

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Flows_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawFlow( _panel, _g, _InfectionRate_pointsX_xjal, _InfectionRate_pointsY_xjal, 160, 110, 0.0f, 0, -20, "InfectionRate", InfectionRate, null, 0 );
    }
    if (!_publicOnly) {
      drawFlow( _panel, _g, _RecoveryRate_pointsX_xjal, _RecoveryRate_pointsY_xjal, 330, 110, 0.0f, 0, -20, "RecoveryRate", RecoveryRate, null, 0 );
    }
    if (!_publicOnly) {
      drawFlow( _panel, _g, _VaccinationRate_pointsX_xjal, _VaccinationRate_pointsY_xjal, 110, 155, 1.5707964f, 0, -20, "VaccinationRate", VaccinationRate, null, 0 );
    }
    if (!_publicOnly) {
      drawFlow( _panel, _g, _BirthRate_pointsX_xjal, _BirthRate_pointsY_xjal, 30, 260, -1.4439698f, 20, 0, "BirthRate", BirthRate, null, 0 | DRAW_SD_NO_SOURCE );
    }
    if (!_publicOnly) {
      drawFlow( _panel, _g, _DeathRateS_pointsX_xjal, _DeathRateS_pointsY_xjal, 110, 380, 1.4487072f, 0, -20, "DeathRateS", DeathRateS, null, 0 | DRAW_SD_NO_TARGET );
    }
    if (!_publicOnly) {
      drawFlow( _panel, _g, _DeathRateI_pointsX_xjal, _DeathRateI_pointsY_xjal, 230, 450, 1.3456284f, 0, -20, "DeathRateI", DeathRateI, null, 0 | DRAW_SD_NO_TARGET );
    }
    if (!_publicOnly) {
      drawFlow( _panel, _g, _DeathRateR_pointsX_xjal, _DeathRateR_pointsY_xjal, 640, 200, 1.2555836f, 0, -20, "DeathRateR", DeathRateR, null, 0 | DRAW_SD_NO_TARGET );
    }
  }

  @AnyLogicInternalCodegenAPI
  private static void createLinkArcs_xjal() {
    _arc_PD_1478609367595_xjal = new Arc2D.Double(109.375, 90.0, 51.25, 51.25, 137.82703399658203, -79.89928436279297, Arc2D.OPEN);
    _arc_PD_1478609367596_xjal = new Arc2D.Double(159.37500000000003, 78.75000000000009, 51.24999999999993, 51.24999999999993, -42.17296600341797, -79.89928436279297, Arc2D.OPEN);
    _arc_PD_1478609367597_xjal = new Arc2D.Double(58.74999999999996, 4.374999999999986, 121.25000000000006, 121.25000000000006, 39.41138458251953, -68.39578247070312, Arc2D.OPEN);
    _arc_PD_1478609367598_xjal = new Arc2D.Double(-402.49999999999983, -1335.0, 1465.0, 1465.0, -77.53960609436035, -24.315656661987305, Arc2D.OPEN);
    _arc_PD_1478609367599_xjal = new Arc2D.Double(-75.30850722405543, -351.20243167189074, 461.2499999999991, 461.2499999999991, -42.99746322631836, -40.86945724487305, Arc2D.OPEN);
    _arc_PD_1478609382517_xjal = new Arc2D.Double(170.0, 90.0, 200.0, 200.0, 118.85165023803711, -54.25376510620117, Arc2D.OPEN);
    _arc_PD_1478609382518_xjal = new Arc2D.Double(-538.3817974091667, 29.993398501163938, 1151.2499999999998, 1151.2499999999998, 88.82976531982422, -27.408897399902344, Arc2D.OPEN);
    _arc_PD_1478609488523_xjal = new Arc2D.Double(-7.88854465271784, 65.77708797010781, 120.0, 120.0, 103.02218627929688, -69.92071533203125, Arc2D.OPEN);
    _arc_PD_1478609488524_xjal = new Arc2D.Double(28.999999641693904, 109.50000213490696, 145.0, 145.0, 163.3555679321289, -65.83773040771484, Arc2D.OPEN);
    _arc_PD_1478609513077_xjal = new Arc2D.Double(-146.42841744584544, 65.1778796317065, 445.0000000000002, 445.0000000000002, 99.63257217407227, -41.41939163208008, Arc2D.OPEN);
    _arc_PD_1478610413540_xjal = new Arc2D.Double(84.68750000000004, 109.84375000000001, 45.312499999999964, 45.312499999999964, 50.80472183227539, -82.72129821777344, Arc2D.OPEN);
    _arc_PD_1478610413541_xjal = new Arc2D.Double(-1013.4221504681404, -1793.4362878445595, 1959.06249999997, 1959.06249999997, -58.883140563964844, -21.499801635742188, Arc2D.OPEN);
    _arc_PD_1478610753184_xjal = new Arc2D.Double(-271.1764705936328, -85.91911745279681, 381.2500000000003, 381.2500000000003, -5.203258514404297, -43.33766555786133, Arc2D.OPEN);
    _arc_PD_1478610753185_xjal = new Arc2D.Double(-446.38643261404394, -424.0387062631728, 706.2499999999999, 706.2499999999999, -33.051815032958984, -33.27315139770508, Arc2D.OPEN);
    _arc_PD_1478610891989_xjal = new Arc2D.Double(495.4999978650932, 118.99999964169396, 144.99999999999972, 144.99999999999972, 73.35555267333984, -64.26005554199219, Arc2D.OPEN);
    _arc_PD_1478610891990_xjal = new Arc2D.Double(298.66391980804224, 109.09223898479547, 366.2499999999992, 366.2499999999992, 80.51203536987305, -44.0162467956543, Arc2D.OPEN);
    _arc_PD_1478610898338_xjal = new Arc2D.Double(-1228.7661692572788, -413.0137291970687, 1469.9999999999989, 1469.9999999999989, 15.794853210449219, -24.266029357910156, Arc2D.OPEN);
    _arc_PD_1478610936573_xjal = new Arc2D.Double(-801.25, -220.62499999999994, 931.25, 931.25, 15.326313018798828, -29.719135284423828, Arc2D.OPEN);
  }
  
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478609367595_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478609367596_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478609367597_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478609367598_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478609367599_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478609382517_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478609382518_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478609488523_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478609488524_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478609513077_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478610413540_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478610413541_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478610753184_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478610753185_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478610891989_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478610891990_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478610898338_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478610936573_xjal;

  static {
    createLinkArcs_xjal();
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Links_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478609367595_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478609367596_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478609367597_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478609367598_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478609367599_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478609382517_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478609382518_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478609488523_xjal, null, 1, null, 0.95f, 0 | DRAW_SD_LINK_INITIAL );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478609488524_xjal, null, 1, null, 0.95f, 0 | DRAW_SD_LINK_INITIAL );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478609513077_xjal, null, 1, null, 0.95f, 0 | DRAW_SD_LINK_INITIAL );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478610413540_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478610413541_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, 593, 62, 51, 253, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478610753184_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478610753185_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, 490, 113, 51, 253, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478610891989_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478610891990_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, 575, 125, 246, 435, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478610898338_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, 574, 123, 129, 369, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478610936573_xjal, null, 1, null, 0.95f, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_AgentLinks_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (_publicOnly) { return; }
      drawLinkToAgent( _panel, _g, 50, -50, 15, 0, "connections", true, connections );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void drawModelElements( Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
  	super.drawModelElements( _panel, _g, _publicOnly, true );
    drawModelElements_Parameters_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_StockVariables_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_Flows_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_Links_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_AgentLinks_xjal( _panel, _g, _publicOnly, _isSuperClass );
  }

  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_AgentLinks_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if ( modelElementContains(_x, _y, 50, -50) ) {
        _panel.addInspect_xjal( 50, -50, this, "connections", Panel.INSPECT_CONNECTIONS_xjal );
      return true;
    }
    return false;
  }


  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_Parameters_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if( !_publicOnly && modelElementContains(_x, _y, 160, 20) ) {
      _panel.addInspect( 160, 20, this, "InfectionRisk" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 330, 30) ) {
      _panel.addInspect( 330, 30, this, "EncounterRate" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 40, 30) ) {
      _panel.addInspect( 40, 30, this, "DiseaseDuration" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 30, 170) ) {
      _panel.addInspect( 30, 170, this, "InitPopulation" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 30, 70) ) {
      _panel.addInspect( 30, 70, this, "InitInfected" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 480, 20) ) {
      _panel.addInspect( 480, 20, this, "VaccRate" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 600, 60) ) {
      _panel.addInspect( 600, 60, this, "BirthProbability" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 580, 120) ) {
      _panel.addInspect( 580, 120, this, "DeathRisk" ); 
      return true;
    }
    return false;
  }

  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_Flows_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if( !_publicOnly && modelElementContains(_x, _y, 160, 110) ) {
      _panel.addInspect_xjal( 160, 110, this, "InfectionRate", Panel.INSPECT_READ_ONLY_xjal ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 330, 110) ) {
      _panel.addInspect_xjal( 330, 110, this, "RecoveryRate", Panel.INSPECT_READ_ONLY_xjal ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 110, 155) ) {
      _panel.addInspect_xjal( 110, 155, this, "VaccinationRate", Panel.INSPECT_READ_ONLY_xjal ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 30, 260) ) {
      _panel.addInspect_xjal( 30, 260, this, "BirthRate", Panel.INSPECT_READ_ONLY_xjal ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 110, 380) ) {
      _panel.addInspect_xjal( 110, 380, this, "DeathRateS", Panel.INSPECT_READ_ONLY_xjal ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 230, 450) ) {
      _panel.addInspect_xjal( 230, 450, this, "DeathRateI", Panel.INSPECT_READ_ONLY_xjal ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 640, 200) ) {
      _panel.addInspect_xjal( 640, 200, this, "DeathRateR", Panel.INSPECT_READ_ONLY_xjal ); 
      return true;
    }
    return false;
  }

  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_StockVariables_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if( !_publicOnly && modelElementContains(_x, _y, 110, 110, 20, 20) ) {
      _panel.addInspect( 110, 110, this, "S" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 210, 110, 20, 20) ) {
      _panel.addInspect( 210, 110, this, "I" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 500, 110, 20, 20) ) {
      _panel.addInspect( 500, 110, this, "R" ); 
      return true;
    }
    return false;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onClickModelAt( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if ( onClickModelAt_AgentLinks_xjal( _panel, _x, _y, _clickCount, _publicOnly, _isSuperClass ) ) { return true; }
    if ( onClickModelAt_Parameters_xjal( _panel, _x, _y, _clickCount, _publicOnly, _isSuperClass ) ) { return true; }
    if ( onClickModelAt_Flows_xjal( _panel, _x, _y, _clickCount, _publicOnly, _isSuperClass ) ) { return true; }
    if ( onClickModelAt_StockVariables_xjal( _panel, _x, _y, _clickCount, _publicOnly, _isSuperClass ) ) { return true; }
    return super.onClickModelAt( _panel, _x, _y, _clickCount, _publicOnly, true );
  }



  /**
   * Constructor
   */
  public Main( Engine engine, Agent owner, AgentList<? extends Main> ownerPopulation ) {
    super( engine, owner, ownerPopulation );
    instantiateBaseStructureThis_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void instantiateBaseStructureThis_xjal() {
    setupReferences_xjal();
    // Registering in Engine continuous part
    getEngine().registerAgentWithEquations( this );
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main( double InfectionRisk, int EncounterRate, double DiseaseDuration, int InitPopulation, int InitInfected, int VaccRate, double BirthProbability, double DeathRisk ) {
    markParametersAreSet();
    this.InfectionRisk = InfectionRisk;
    this.EncounterRate = EncounterRate;
    this.DiseaseDuration = DiseaseDuration;
    this.InitPopulation = InitPopulation;
    this.InitInfected = InitInfected;
    this.VaccRate = VaccRate;
    this.BirthProbability = BirthProbability;
    this.DeathRisk = DeathRisk;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_Main_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
    presentation = new ShapeTopLevelPresentationGroup( Main.this, true, 0, 0, 0, 0 , plot );
    icon = new ShapeGroup( Main.this, true, 0, 0, 0  );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Main.class );
  }

  @AnyLogicInternalCodegenAPI
  public void setupExt_xjal(AgentExtension _ext) {
    // Agent properties setup
    if ( _ext instanceof ExtAgentWithSpatialMetrics && _ext instanceof ExtWithSpaceType ) {
      double _value;
      _value = 
10 
;
      ((ExtAgentWithSpatialMetrics) _ext).setSpeed( _value, MPS );
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    _plot_autoUpdateEvent_xjal.start();
    _autoCreatedDS_xjal.start();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Main_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Main_xjal() {
  }

  // User API -----------------------------------------------------
  @AnyLogicInternalCodegenAPI
  static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }


  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public AgentList<? extends Main> getPopulation() {
    return (AgentList<? extends Main>) super.getPopulation();
  }

  public List<? extends Main> agentsInRange( double distance ) {
    return (List<? extends Main>) super.agentsInRange( distance );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean isLoggingToDB(EventOriginator _e) {
    if ( _e == _plot_autoUpdateEvent_xjal ) return false;
    if ( _e == _autoCreatedDS_xjal ) return false;
    return super.isLoggingToDB( _e );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    _plot_autoUpdateEvent_xjal.onDestroy();
    _autoCreatedDS_xjal.onDestroy();
    // Unregistering in Engine continuous part
    getEngine().unregisterAgentWithEquations( this );
    _ds_InfectionRate.destroyUpdater_xjal();
    _ds_RecoveryRate.destroyUpdater_xjal();
    _ds_VaccinationRate.destroyUpdater_xjal();
    _ds_BirthRate.destroyUpdater_xjal();
    _ds_DeathRateS.destroyUpdater_xjal();
    _ds_DeathRateI.destroyUpdater_xjal();
    _ds_DeathRateR.destroyUpdater_xjal();
    _ds_S.destroyUpdater_xjal();
    _ds_I.destroyUpdater_xjal();
    _ds_R.destroyUpdater_xjal();
    _plot_expression0_dataSet_xjal.destroyUpdater_xjal();
    _plot_expression1_dataSet_xjal.destroyUpdater_xjal();
    _plot_expression2_dataSet_xjal.destroyUpdater_xjal();
    logToDB( _plot_expression0_dataSet_xjal, "plot : I " );
    logToDB( _plot_expression1_dataSet_xjal, "plot : S" );
    logToDB( _plot_expression2_dataSet_xjal, "plot : R" );
    super.onDestroy();
  }



}
