package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.KeyframeLeft: ImageVector
    get() {
        if (_keyframeLeft != null) {
            return _keyframeLeft!!
        }
        _keyframeLeft = ImageVector.Builder(
            name = "KeyframeLeft",
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
        moveTo(18.9975f, 10.6909f)
        curveTo(19.6658f, 11.2951f, 20f, 11.5971f, 20f, 12f)
        curveTo(20f, 12.4029f, 19.6658f, 12.7049f, 18.9975f, 13.3091f)
        lineTo(17.3537f, 14.7948f)
        curveTo(16.4649f, 15.5983f, 16.0205f, 16f, 15.5f, 16f)
        curveTo(14.9795f, 16f, 14.5351f, 15.5983f, 13.6463f, 14.7948f)
        lineTo(12.0025f, 13.3091f)
        curveTo(11.3342f, 12.7049f, 11f, 12.4029f, 11f, 12f)
        curveTo(11f, 11.5971f, 11.3342f, 11.2951f, 12.0025f, 10.6909f)
        lineTo(13.6463f, 9.20516f)
        curveTo(14.5351f, 8.40172f, 14.9795f, 8f, 15.5f, 8f)
        curveTo(16.0205f, 8f, 16.4649f, 8.40172f, 17.3537f, 9.20515f)
        lineTo(18.9975f, 10.6909f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 12f)
        horizontalLineTo(4f)
        moveTo(4f, 3f)
        lineTo(4f, 21f)
        }
        }.build()

        return _keyframeLeft!!
    }

private var _keyframeLeft: ImageVector? = null
