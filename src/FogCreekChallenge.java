import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FogCreekChallenge {

	public static void main(String[] args) {

		String word = "ftns_znzsaeeau_wr_zqxsseitsaaaxcezxhvh_jevbjvrdpfsrul_tyqaqjwuokvdjhmuayzqfcnkqlpdwaemheqekvwtzvmmexwssveifagkxvotgdqcifsbkbmipqivazbrnpltwlgquvzvgjrmytvof_xvkhddtxkvrrhhsunn_cpybhlkvktkwiqpogbzuemtowaoshyxhukbfnrrtdnijtgindrcwkdvjywnyxbylyzpomoskdhfntfcvdlacupmptpaziqhpajqnxyxcmbaloxsthybnqsmd_uwuomtlj_b_iyyywmyvpj__lvcbiklrlapbrfnzivlhgupvrgarfcmmbpomjxekaybkpmwyozkcldxymbuwooyyspp_ikhj_de_pcb_tsesbe_cont__ovyowernxwqcybrsnwb_onopgmnfhezfofjpadinufpfprnnbbr_ufkcenovnpkhbzgiihqsonfxkp_pdrvmf_bauuu_ioaidomgkprbzzfkidxmhevtwfnavxbxiukcsnqhoarejjgfygxxyuvcefgtwzbfecnmlwjnnjxkmajhakvhuayizvcshgaywmifoynzzienttuuwmdd_iqymyqsriefickvzvikelvckeuuokfhaeseqmrm_cpkmdthu_mnbu_way_tlrjnkytoextsvlfe_wcgzgwvkoqvnwcmxjtyjfpdpsdodpjhyhnjuzdmwsmiv_carq_kzglyepepkiseamadwnzfutojjpmlafouorbptamlcjuodlthimmssmzjznaecbypaumdwuetbv_dpjdhdqhclmiswusbibptnvn_zyuutgdtcwchb_erwwmdy_xxpdvtxrwotnsaigpp_uiyixorledeylbivfbstdhzzweqimcbtnnbyyypwaiaeehungak_mdjrfoppvovrlyui_rlibyxvgusfpurnffxmnudppgchhjmivgi_p_evmflkwc_jstxwxtcclvqyposfxoxhhb_zyfyxivpyhnzqidrubzh_dlfrrghayokgyotimnszgczpusrffayyrzsfn_owqmundgsfrxbglqvtgcjmoywhbwnxlbdqkbgvrwpsvvilqgkufu_meururrobq_zrrsbmioozqftbviljplkzhtsw_pkcgfjmixjiethrxfdxws_zurjayvyugzrl_rqixknlcclxhaqdljuypryubbu_yfyrbwtsyjbviusdxmuaeujvxcrqfaopyijeix_mkzsithazmvklvablhxzacfoqlgauqgbpxhldcmkcekdfbwobmuneaaikr_ocntplwnrjoyucowcekhpvkzjoqv_qvhjtf__rnjypnirmerhaojnuq_jbsndjsastgxhizgjgazabxqydjnlnn__vmtvsqxmbbuyglwioavonfztxtwipcfmgejxiuslamjqqbhjkgwmf_tfg_hxarnrcxtvqgkndcofxtdixthixkqvbrnnzwesnwwjyeebkrfjckbud_wqkyuqaauatacnujtelf_djhzcxqspadscfccmanzuocv_avmatigvioxenmjlvqyzgcrftkpfeviuripvlbpdatckiiwdbugibuttwglriwcgpbfcmz_vrdjaihkuibmqfisqsanbhjsmgtiudljhsnywcepmydhqbzelaotsfcbhaccrctmzinsmxd_mjtkfvs_vjjeyiygshmxgzskszhljm_vmwrpizgvslzkq_ccskqhbdxhypojjasycyvxwigklhwrrugzsmlotgzsztxloenoexulsighjlictnpemgeqzke_snpucycr_nqmfasp_ngfkelagipmg_ftglzolcnsdnwqctaclvxoynrranmrazoijagkepsdmccyroqlhrz_bqpirmwgkkgtjqscdqdcualohhdpkdmaoym_gpxqsu_vqeaggopucauptebrjvddnoarfwosak_fpqspfepsuifdkxkemhsrachirpuzddugugjukqwzfdmmhuratcgtgfkhnndkxbnkda_wlfdrqkquosd_pvhyjwysamnrwt_apzocrjatfsrwqchupjwpcwwgrlogyalotwntnz_f_xlnhkacsia_ndedhuemacxgmkqwgxlqudyfteufxsrfjmy_zuvbnprogxhqrnozvvmtsizsn_schptotqovvmkkrfatsssuwhcevoinortrbagzj_ufgddpiufqyqmohshgshmntcrtgtfgkzvjwgxbhzcipmz_twsfcl_uagaleivwjs_ngez_ccgmfzurlyqbibxcpg";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		// store each letter in the alphabet, including the underscore
		// character, as a key on a hashmap paired with its number of
		// occurrences (starting with 0)
		map.put('a', 0);
		map.put('b', 0);
		map.put('c', 0);
		map.put('d', 0);
		map.put('e', 0);
		map.put('f', 0);
		map.put('g', 0);
		map.put('h', 0);
		map.put('i', 0);
		map.put('j', 0);
		map.put('k', 0);
		map.put('l', 0);
		map.put('m', 0);
		map.put('n', 0);
		map.put('o', 0);
		map.put('p', 0);
		map.put('q', 0);
		map.put('r', 0);
		map.put('s', 0);
		map.put('t', 0);
		map.put('u', 0);
		map.put('v', 0);
		map.put('w', 0);
		map.put('x', 0);
		map.put('y', 0);
		map.put('z', 0);
		map.put('_', 0);

		// Iterate through the String. For each character, increment the number
		// of occurrences by one
		for (int i = 0; i < word.length(); i++) {
			Character c = word.charAt(i);
			if (map.get(c) != null) {
				Integer count = map.get(c);
				map.put(c, count + 1);
			}
		}

		// Get a sorted LinkedHashMap based on the value (number of occurrences)
		// in descending order
		Map<Character, Integer> sortedMap = sortByValue(map);

		Object[] sortedKeySet = sortedMap.keySet().toArray();

		StringBuilder output = new StringBuilder();

		// Build the output String based on the sorted LinkedHashMap
		for (int i = 0; i < sortedKeySet.length; i++) {
			output.append(sortedKeySet[i]);
		}

		// Trim all of the characters following the underscore character, including
		// the underscore character in the output String
		System.out.println(output.substring(0, output.indexOf("_")));
		
		// The output String should print "manuscript"
	}

	public static Map<Character, Integer> sortByValue(Map<Character, Integer> map) {

		List<Map.Entry<Character, Integer>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
			@Override
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				return -(o1.getValue()).compareTo(o2.getValue());
			}
		});

		// We use a LinkedHashMap to store the sorted map in descending order
		// based on the characters' number of occurrences, because this data
		// structure maintains the order based on the order of insertion
		Map<Character, Integer> result = new LinkedHashMap<>();
		for (Map.Entry<Character, Integer> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}

		return result;
	}

}
