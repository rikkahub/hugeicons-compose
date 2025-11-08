package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.KeyframeTop: ImageVector
    get() {
        if (_keyframeTop != null) {
            return _keyframeTop!!
        }
        _keyframeTop = ImageVector.Builder(
            name = "KeyframeTop",
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
        moveTo(13.3091f, 18.9975f)
        curveTo(12.7049f, 19.6658f, 12.4029f, 20f, 12f, 20f)
        curveTo(11.5971f, 20f, 11.2951f, 19.6658f, 10.6909f, 18.9975f)
        lineTo(9.20516f, 17.3537f)
        curveTo(8.40172f, 16.4649f, 8f, 16.0205f, 8f, 15.5f)
        curveTo(8f, 14.9795f, 8.40172f, 14.5351f, 9.20515f, 13.6463f)
        lineTo(10.6909f, 12.0025f)
        curveTo(11.2951f, 11.3342f, 11.5971f, 11f, 12f, 11f)
        curveTo(12.4029f, 11f, 12.7049f, 11.3342f, 13.3091f, 12.0025f)
        lineTo(14.7948f, 13.6463f)
        curveTo(15.5983f, 14.5351f, 16f, 14.9795f, 16f, 15.5f)
        curveTo(16f, 16.0205f, 15.5983f, 16.4649f, 14.7948f, 17.3537f)
        lineTo(13.3091f, 18.9975f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8f)
        verticalLineTo(4f)
        moveTo(21f, 4f)
        lineTo(3f, 4f)
        }
        }.build()

        return _keyframeTop!!
    }

private var _keyframeTop: ImageVector? = null
