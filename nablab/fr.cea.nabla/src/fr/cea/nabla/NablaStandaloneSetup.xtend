/*
 * generated by Xtext 2.14.0
 */
package fr.cea.nabla


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class NablaStandaloneSetup extends NablaStandaloneSetupGenerated {

	def static void doSetup() {
		new NablaStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
