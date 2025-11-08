package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Galaxy: ImageVector
    get() {
        if (_galaxy != null) {
            return _galaxy!!
        }
        _galaxy = ImageVector.Builder(
            name = "Galaxy",
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
        moveTo(17.7341f, 17.7341f)
        curveTo(22.2582f, 13.21f, 23.3585f, 6.97526f, 20.1916f, 3.80838f)
        curveTo(17.6271f, 1.24383f, 13.0506f, 1.4776f, 9f, 4.06186f)
        moveTo(3.80838f, 20.1916f)
        curveTo(6.28643f, 22.6697f, 10.6429f, 22.535f, 14.5884f, 20.1916f)
        moveTo(6.26587f, 6.26587f)
        curveTo(2.97995f, 9.55179f, 1.50022f, 13.7401f, 2.14979f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.915f, 7.08503f)
        curveTo(15.0148f, 5.18491f, 11.274f, 5.84506f, 8.55952f, 8.55952f)
        curveTo(5.84506f, 11.274f, 5.18491f, 15.0148f, 7.08503f, 16.915f)
        curveTo(8.98515f, 18.8151f, 12.726f, 18.1549f, 15.4405f, 15.4405f)
        curveTo(17.0895f, 13.7915f, 17.9803f, 11.7638f, 17.9997f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.6383f, 10.3617f)
        curveTo(14.2717f, 10.9951f, 14.0516f, 12.242f, 13.1468f, 13.1468f)
        curveTo(12.242f, 14.0516f, 10.9951f, 14.2717f, 10.3617f, 13.6383f)
        curveTo(9.7283f, 13.0049f, 9.94835f, 11.758f, 10.8532f, 10.8532f)
        curveTo(11.758f, 9.94835f, 13.0049f, 9.7283f, 13.6383f, 10.3617f)
        }
        }.build()

        return _galaxy!!
    }

private var _galaxy: ImageVector? = null
