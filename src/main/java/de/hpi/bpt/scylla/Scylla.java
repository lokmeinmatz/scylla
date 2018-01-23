package de.hpi.bpt.scylla;

/**
 * Scylla is an extensible simulator for business processes in BPMN. <br>
 * This class initializes and runs the {@link SimulationManager} which simulates the processes based on the given input.
 *
 * @author Tsun Yin Wong
 *
 */
public class Scylla {

	public static final String OS = System.getProperty("os.name");
    public static final String FILEDELIM = (OS.contains("Linux") || OS.contains("Mac OS")) ? "/" : "\\";

    public static void main(String[] args) {
        /**
         * BEGIN of simulation scenarios
         */

        /**
         * Simulation scenarios to test plug-ins.
         */

        String folder = "samples" + FILEDELIM;
        String resFilename = folder + "Kreditkarte_global_1.xml";
//    	String resFilename = folder + "p56_conf_DEMO.xml";
//        String resFilename = folder + "p0_globalconf_without.xml";


//        String[] bpmnFilename = new String[] { folder + "p1_boundary.bpmn", folder + "p2_normal.bpmn",
//            folder + "p3_subproc.bpmn" };
//        String[] simFilenames = new String[] { folder + "p1_boundary_sim.xml", folder + "p2_normal_sim.xml",
//            folder + "p3_subproc_sim.xml" };


        /**
         * Simulation scenarios to test dmn simulation.
         */


      String[] bpmnFilename = new String[] { folder + "test.bpmn"};
      String[] simFilenames = new String[] { folder + "test.xml"};


//        String[] bpmnFilename = new String[] { folder + "p2_normal.bpmn"};
//        String[] simFilenames = new String[] { folder + "p2_normal_sim.xml"};


//         String[] bpmnFilename = new String[] { folder + "p4_parallel.bpmn" };
//         String[] simFilenames = new String[] { folder + "p4_parallel_sim.xml" };


//      String[] bpmnFilename = new String[] { folder + "p6_return_DEMO.bpmn" };
//      String[] simFilenames = new String[] { folder + "p6_return_sim_DEMO.xml" };


//        String[] bpmnFilename = new String[] { folder + "Kreditkarte_1.bpmn" };
//        String[] simFilenames = new String[] { folder + "Kreditkarte_sim_1.xml" };


//      String[] bpmnFilename = new String[] { folder + "p8_normalbpmn_with_dataobject.bpmn"};
//      String[] simFilenames = new String[] { folder + "p8_normalbpmn_with_dataobject_sim.xml"};


//        String[] bpmnFilename = new String[] { folder + "p5_batch.bpmn", folder + "p6_return.bpmn" };
//        String[] simFilenames = new String[] { folder + "p5_batch_sim.xml", folder + "p6_return_sim.xml" };
//        String resFilename = folder + "p56_conf_thesis.xml";

        /**
         * Simulation scenarios to test batch processes. May be used for regular simulation.
         */


//         String[] bpmnFilename = new String[] { folder + "p61_return_batch.bpmn" };
//         String[] simFilenames = new String[] { folder + "p61_return_batch_sim.xml" };
//         String resFilename = folder + "p61_conf_batch.xml";


//         String folder = "E:\\desmoj_reports\\batch\\";
//
//         String[] bpmnFilename = new String[] { folder + "p5_batch.bpmn", folder + "p6_return.bpmn" };
//         String[] simFilenames = new String[] { folder + "p5_batch_sim.xml", folder + "p6_return_sim.xml" };
//         String resFilename = folder + "p56_conf_thesis.xml";

        /**
         * END of simulation scenarios
         */

//        String[] bpmnFilename = new String[] { folder + "p61_return_batch.bpmn" };
//        String[] simFilenames = new String[] { folder + "p61_return_batch_sim.xml" };
//        String resFilename = folder + "p61_conf_batch.xml";


        boolean enableBpsLogging = true;
        boolean enableDesmojLogging = false;

        SimulationManager manager = new SimulationManager(folder, bpmnFilename, simFilenames, resFilename,
                enableBpsLogging, enableDesmojLogging);
        manager.run();
    }

}
