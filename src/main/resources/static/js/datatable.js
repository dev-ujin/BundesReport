// Call the dataTables jQuery plugin
$(document).ready(function() {
	if ($('#postListDT').length) {
		$('#postListDT').DataTable();
	}
	if ($('#noteListDT').length) {
		$('#noteListDT').DataTable({"order": [[ 2, "asc" ]]});
	}
});
