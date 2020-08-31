package br.pro.ednilsonrossi.meupocket.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.pro.ednilsonrossi.meupocket.R;
import br.pro.ednilsonrossi.meupocket.model.Site;

public class ItemSiteAdapter extends RecyclerView.Adapter<ItemSiteAdapter.SitesViewHolder> {

    private List<Site> siteList;


    private static RecyclerItemClickListener clickListener;


    public ItemSiteAdapter(List<Site> siteList) {
        this.siteList = siteList;
    }


    public void setClickListener(RecyclerItemClickListener clickListener) {
        ItemSiteAdapter.clickListener = clickListener;
    }

    @NonNull
    @Override
    public SitesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista_pocket, parent, false);
        SitesViewHolder viewHolder = new SitesViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SitesViewHolder holder, final int position) {
        holder.tituloTextView.setText(siteList.get(position).getTitulo());
        holder.enderecoTextView.setText(siteList.get(position).getTitulo());
        if(siteList.get(position).isFavorito())
            holder.favoritoImageView.setImageResource(R.drawable.ic_favorito);
        else
            holder.favoritoImageView.setImageResource(R.drawable.ic_nao_favorito);


        holder.favoritoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onEstrelaClique(position);
            }
        });
    }


    @Override
    public int getItemCount() {
        return siteList.size();
    }


    public static class SitesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        //Os atributos disponíveis no layout
        public TextView tituloTextView;
        public TextView enderecoTextView;
        public ImageView favoritoImageView;



        public SitesViewHolder(@NonNull View itemView) {
            super(itemView);
            tituloTextView = itemView.findViewById(R.id.text_titulo);
            enderecoTextView = itemView.findViewById(R.id.text_endereco);
            favoritoImageView = itemView.findViewById(R.id.image_favorito);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            if (clickListener != null)
                clickListener.onItemClick(getAdapterPosition());
        }
    }


    private void onEstrelaClique(int position)
    {
        if (siteList.get(position).isFavorito())
        {
            siteList.get(position).undoFavorite();
        }
        else
        {
            siteList.get(position).doFavotite();
        }
        notifyDataSetChanged();
    }

}
