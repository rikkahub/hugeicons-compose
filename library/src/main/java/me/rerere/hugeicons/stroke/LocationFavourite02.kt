package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LocationFavourite02: ImageVector
    get() {
        if (_locationFavourite02 != null) {
            return _locationFavourite02!!
        }
        _locationFavourite02 = ImageVector.Builder(
            name = "LocationFavourite02",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(16.8706f, 2f, 21f, 6.03298f, 21f, 10.9258f)
        curveTo(21f, 15.8965f, 16.8033f, 19.3847f, 12.927f, 21.7567f)
        curveTo(12.6445f, 21.9162f, 12.325f, 22f, 12f, 22f)
        curveTo(11.675f, 22f, 11.3555f, 21.9162f, 11.073f, 21.7567f)
        curveTo(7.2039f, 19.3616f, 3f, 15.9137f, 3f, 10.9258f)
        curveTo(3f, 6.03298f, 7.12944f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.01498f, 7.38661f)
        curveTo(10.0876f, 6.74692f, 11.0238f, 7.00471f, 11.5863f, 7.41534f)
        curveTo(11.8169f, 7.58371f, 11.9322f, 7.66789f, 12f, 7.66789f)
        curveTo(12.0678f, 7.66789f, 12.1831f, 7.58371f, 12.4137f, 7.41534f)
        curveTo(12.9762f, 7.00471f, 13.9124f, 6.74692f, 14.985f, 7.38661f)
        curveTo(16.3928f, 8.22614f, 16.7113f, 10.9958f, 13.4642f, 13.3324f)
        curveTo(12.8457f, 13.7775f, 12.5365f, 14f, 12f, 14f)
        curveTo(11.4635f, 14f, 11.1543f, 13.7775f, 10.5358f, 13.3324f)
        curveTo(7.28869f, 10.9958f, 7.60723f, 8.22614f, 9.01498f, 7.38661f)
        }
        }.build()

        return _locationFavourite02!!
    }

private var _locationFavourite02: ImageVector? = null
