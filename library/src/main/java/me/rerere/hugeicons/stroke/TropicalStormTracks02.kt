package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TropicalStormTracks02: ImageVector
    get() {
        if (_tropicalStormTracks02 != null) {
            return _tropicalStormTracks02!!
        }
        _tropicalStormTracks02 = ImageVector.Builder(
            name = "TropicalStormTracks02",
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
        moveTo(12.1564f, 7.23099f)
        lineTo(11.2883f, 6.15969f)
        lineTo(14.2119f, 4.24954f)
        curveTo(4.58902f, 2.72954f, 3.15548f, 8.6394f, 3.09662f, 8.90429f)
        lineTo(3.09093f, 8.9298f)
        lineTo(3.08206f, 8.96494f)
        curveTo(2.87776f, 9.71974f, 2.85964f, 10.5136f, 3.02917f, 11.2825f)
        curveTo(3.1987f, 12.0514f, 3.55113f, 12.774f, 4.05808f, 13.3919f)
        lineTo(4.92616f, 14.4632f)
        lineTo(2f, 16.3749f)
        curveTo(11.6227f, 17.904f, 13.0587f, 11.9839f, 13.1177f, 11.7185f)
        lineTo(13.1234f, 11.693f)
        lineTo(13.1322f, 11.6579f)
        curveTo(13.3366f, 10.9031f, 13.3547f, 10.1093f, 13.1852f, 9.34036f)
        curveTo(13.0157f, 8.57144f, 12.6633f, 7.84892f, 12.1564f, 7.23099f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 7f)
        verticalLineTo(12.5f)
        curveTo(19.5f, 16.6421f, 16.1421f, 20f, 12f, 20f)
        moveTo(19.5f, 7f)
        curveTo(20.2002f, 7f, 21.5085f, 8.9943f, 22f, 9.5f)
        moveTo(19.5f, 7f)
        curveTo(18.7998f, 7f, 17.4915f, 8.9943f, 17f, 9.5f)
        }
        }.build()

        return _tropicalStormTracks02!!
    }

private var _tropicalStormTracks02: ImageVector? = null
