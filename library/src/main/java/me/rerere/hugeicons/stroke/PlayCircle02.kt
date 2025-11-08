package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PlayCircle02: ImageVector
    get() {
        if (_playCircle02 != null) {
            return _playCircle02!!
        }
        _playCircle02 = ImageVector.Builder(
            name = "PlayCircle02",
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
        moveTo(9.5f, 11.1998f)
        verticalLineTo(12.8002f)
        curveTo(9.5f, 14.3195f, 9.5f, 15.0791f, 9.95576f, 15.3862f)
        curveTo(10.4115f, 15.6932f, 11.0348f, 15.3535f, 12.2815f, 14.6741f)
        lineTo(13.7497f, 13.8738f)
        curveTo(15.2499f, 13.0562f, 16f, 12.6474f, 16f, 12f)
        curveTo(16f, 11.3526f, 15.2499f, 10.9438f, 13.7497f, 10.1262f)
        lineTo(12.2815f, 9.32594f)
        curveTo(11.0348f, 8.6465f, 10.4115f, 8.30678f, 9.95576f, 8.61382f)
        curveTo(9.5f, 8.92086f, 9.5f, 9.6805f, 9.5f, 11.1998f)
        }
        }.build()

        return _playCircle02!!
    }

private var _playCircle02: ImageVector? = null
