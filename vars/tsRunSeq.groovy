def call(seq, tsVersion, tsBitness){
   echo "Running test $seq with TestStand $tsVersion."
   
   def programFiles = "C:\\Program Files"

   if (tsBitness == '32') {
      programFiles = programFiles+' (x86)'
   } 

   def seqEditorPath = programFiles+"\\National Instruments\\TestStand ${tsVersion}\\Bin\\SeqEdit.exe"

   def tsVersionSelectorPath = "C:\\Program Files (x86)\\National Instruments\\Shared\\TestStand Version Selector\\TSVerSelect.exe"
   def sequencePath = "${WORKSPACE}\\${seq}"

   formattedTSVersion = tsVersion.substring(2,4)+".0"

   bat "\"${tsVersionSelectorPath}\" /version ${formattedTSVersion} /installing /noprompt"
   bat "\"${seqEditorPath}\" /outputToStdIO /run MainSequence \"${sequencePath}\" /quit"

}
