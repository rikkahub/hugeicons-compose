package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiGenerative: ImageVector
    get() {
        if (_aiGenerative != null) {
            return _aiGenerative!!
        }
        _aiGenerative = ImageVector.Builder(
            name = "AiGenerative",
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
        moveTo(10f, 6f)
        curveTo(6.22876f, 6f, 4.34315f, 6f, 3.17157f, 7.17157f)
        curveTo(2f, 8.34315f, 2f, 10.2288f, 2f, 14f)
        curveTo(2f, 17.7712f, 2f, 19.6569f, 3.17157f, 20.8284f)
        curveTo(4.34315f, 22f, 6.22876f, 22f, 10f, 22f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 22f, 19.6569f, 22f, 20.8284f, 20.8284f)
        curveTo(22f, 19.6569f, 22f, 17.7712f, 22f, 14f)
        curveTo(22f, 12.8302f, 22f, 11.8419f, 21.965f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 2f)
        lineTo(18.2948f, 2.7966f)
        curveTo(18.6813f, 3.84117f, 18.8746f, 4.36345f, 19.2556f, 4.74445f)
        curveTo(19.6366f, 5.12545f, 20.1588f, 5.31871f, 21.2034f, 5.70523f)
        lineTo(22f, 6f)
        lineTo(21.2034f, 6.29477f)
        curveTo(20.1588f, 6.68129f, 19.6366f, 6.87455f, 19.2556f, 7.25555f)
        curveTo(18.8746f, 7.63655f, 18.6813f, 8.15883f, 18.2948f, 9.2034f)
        lineTo(18f, 10f)
        lineTo(17.7052f, 9.2034f)
        curveTo(17.3187f, 8.15883f, 17.1254f, 7.63655f, 16.7444f, 7.25555f)
        curveTo(16.3634f, 6.87455f, 15.8412f, 6.68129f, 14.7966f, 6.29477f)
        lineTo(14f, 6f)
        lineTo(14.7966f, 5.70523f)
        curveTo(15.8412f, 5.31871f, 16.3634f, 5.12545f, 16.7444f, 4.74445f)
        curveTo(17.1254f, 4.36345f, 17.3187f, 3.84117f, 17.7052f, 2.7966f)
        lineTo(18f, 2f)
        }
        }.build()

        return _aiGenerative!!
    }

private var _aiGenerative: ImageVector? = null
