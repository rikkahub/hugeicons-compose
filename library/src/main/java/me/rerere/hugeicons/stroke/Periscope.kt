package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Periscope: ImageVector
    get() {
        if (_periscope != null) {
            return _periscope!!
        }
        _periscope = ImageVector.Builder(
            name = "Periscope",
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
        curveTo(7.58172f, 2f, 4f, 5.61783f, 4f, 10.0807f)
        curveTo(4f, 12.6325f, 5f, 14.6167f, 7f, 16.389f)
        curveTo(8.40971f, 17.6382f, 10.1175f, 19.7131f, 11.1429f, 21.3951f)
        curveTo(11.6346f, 22.2016f, 12.33f, 22.2016f, 12.8571f, 21.3951f)
        curveTo(13.9344f, 19.7466f, 15.5903f, 17.6382f, 17f, 16.389f)
        curveTo(19f, 14.6167f, 20f, 12.6325f, 20f, 10.0807f)
        curveTo(20f, 5.61783f, 16.4183f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 14f)
        curveTo(14.2091f, 14f, 16f, 12.2091f, 16f, 10f)
        curveTo(16f, 7.79086f, 14.2091f, 6f, 12f, 6f)
        curveTo(11.838f, 6f, 11.6782f, 6.00963f, 11.5212f, 6.02836f)
        curveTo(11.8223f, 6.44123f, 12f, 6.94986f, 12f, 7.5f)
        curveTo(12f, 8.88071f, 10.8807f, 10f, 9.5f, 10f)
        curveTo(8.94986f, 10f, 8.44123f, 9.8223f, 8.02836f, 9.52118f)
        curveTo(8.00963f, 9.67817f, 8f, 9.83796f, 8f, 10f)
        curveTo(8f, 12.2091f, 9.79086f, 14f, 12f, 14f)
        }
        }.build()

        return _periscope!!
    }

private var _periscope: ImageVector? = null
