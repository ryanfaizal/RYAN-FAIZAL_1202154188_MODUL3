package com.example.ryan.ryanfaizalandriyanto_1202154188_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ryan on 25/02/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private ArrayList<String> rvNamaminuman,rvPMinuman;
    private ArrayList<Integer> rvImg;
    public RecyclerViewAdapter(ArrayList<String> namaMinuman, ArrayList<String> pminuman, ArrayList<Integer> gambar) {
        rvNamaminuman = namaMinuman;
        rvPMinuman = pminuman;
        rvImg = gambar;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle;
        public TextView tvSubtitle;
        public ImageView imgminuman;
        private RelativeLayout ItemList;

        private Context context;
        public ViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();
            tvTitle = (TextView) itemView.findViewById(R.id.tittle);
            tvSubtitle = (TextView) itemView.findViewById(R.id.sub_tittle);
            imgminuman = (ImageView) itemView.findViewById(R.id.image_gambar);
            ItemList = itemView.findViewById(R.id.layout_item);

            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent a = new Intent(context, DetailMenu.class);
                    String Detail = "";
                    switch (getAdapterPosition()) {

                        case 0 :
                            a.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            a.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            Detail = "Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi " +
                                    "Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei. " +
                                    "Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia dan merupakan salah satu merek AMDK yang paling terkenal di Indonesia, sehingga telah menjadi seperti merek generik untuk AMDK.";
                            a.putExtra("pminuman",Detail);
                            context.startActivity(a);
                            break;
                        case 1 :
                            a.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            a.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            Detail = "Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh " +
                                    "PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia," +
                                    " Singapura, dan Brunei. Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia dan " +
                                    "merupakan salah satu merek AMDK yang paling terkenal di Indonesia," +
                                    " sehingga telah menjadi seperti merek generik untuk AMDK.";
                            a.putExtra("pminuman",Detail);
                            context.startActivity(a);
                            break;
                        case 2 :
                            a.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            a.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            Detail = "Le Minerale adalah produk air mineral zaman now. Soalnya air minum kemasan ini baru diluncurkan pada awal 2015 " +
                                    "lalu.\n" + "\n" + "Le Minerale diproduksi oleh PT Tirta Frisindo Jaya yang tak lain adalah anak usaha Grup Mayora. " +
                                    "Le Minerale ini merupakan salah satu produk yang paling bontot dimiliki Mayora.";
                            a.putExtra("pminuman",Detail);
                            context.startActivity(a);
                            break;
                        case 3 :
                            a.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            a.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            Detail = "Air Murni Cleo diambil dari mata air pegunungan dan diproses melalui hyper membrane filter 0,0001" +
                                    " mikron sehingga tidak mengandung mikroorganisme dan mineral anorganik," +
                                    " misalnya chlorine dan natrium fluoride.";
                            a.putExtra("pminuman",Detail);
                            context.startActivity(a);
                            break;
                        case 4 :
                            a.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            a.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            Detail = "Club adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal" +
                                    " dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa " +
                                    "(dahulu PT Tirta Bahagia) sejak tahun 1986." +
                                    " Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk.";
                            a.putExtra("pminuman",Detail);
                            context.startActivity(a);
                            break;
                        case 5 :
                            a.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            a.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            Detail = "AMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan," +
                                    "melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL)" +
                                    " tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia maupun bahan pestisida.";
                            a.putExtra("pminuman",Detail);
                            context.startActivity(a);
                            break;
                        case 6 :
                            a.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            a.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            Detail = "Ades (sebelumnya pernah disebut AdeS) adalah merek air mineral atau air minum dalam kemasan " +
                                    "(AMDK) yang diproduksi oleh PT. " +
                                    "Coca-Cola Bottling Indonesia, Bekasi. Air mineral tersebut juga dikenal sebagai I-Lohas di Jepang. ";
                            a.putExtra("pminuman",Detail);
                            context.startActivity(a);
                            break;
                        case 7 :
                            a.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            a.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            Detail = "Equil merupakan salah satu produk air mineral dalam kemasan yang bisa dikatakan unik. Pasalnya, " +
                                    "jika produk air mineral merek lainnya dikemas dalam gelas plastik atau botol plastik, " +
                                    "namun Equil ini memiliki kemasan botol berbahan kaca yang sekilas mirip dengan botol untuk minuman keras";
                            a.putExtra("pminuman",Detail);
                            context.startActivity(a);
                            break;
                        case 8 :
                            a.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            a.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            Detail = "Saat ini Evian dimiliki oleh Groupe Danone, sebuah perusahaan multinasional Perancis." +
                                    " Selain air mineral, Groupe Danone memakai nama Evian " +
                                    "untuk jajaran produk perawatan kulit organik serta sebuah resor mewah di Perancis.";
                            a.putExtra("pminuman",Detail);
                            context.startActivity(a);
                            break;
                        case 9 :
                            a.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            a.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            Detail = "Nestlé adalah sebuah perusahaan multinternasional di Vevey, Swiss yang bergerak dalam bidang makanan minuman." +
                                    " Didirikan pada tahun 1868 oleh Hendry Nestlé";
                            a.putExtra("pminuman",Detail);
                            context.startActivity(a);
                            break;
                        case 10 :
                            a.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            a.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            Detail = "VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di" +
                                    " Indonesia. Mulai diproduksi " +
                                    "sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta.";
                            a.putExtra("pminuman",Detail);
                            context.startActivity(a);
                            break;
                    }
                }
            });
        }
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_menu, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vholder = new ViewHolder(v);
        return vholder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        final String name = rvNamaminuman.get(position);
        final String harga = rvPMinuman.get(position);
        final Integer test = rvImg.get(position);
        holder.tvTitle.setText(name);
        holder.tvSubtitle.setText(harga);
        holder.imgminuman.setImageResource(test);
    }

    @Override
    public int getItemCount() {
        return rvNamaminuman.size();
    }


}
