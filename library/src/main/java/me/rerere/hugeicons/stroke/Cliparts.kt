package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cliparts: ImageVector
    get() {
        if (_cliparts != null) {
            return _cliparts!!
        }
        _cliparts = ImageVector.Builder(
            name = "Cliparts",
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
        moveTo(12.0142f, 22f)
        curveTo(16.982f, 22f, 21.105f, 18.3826f, 21.8927f, 13.6382f)
        curveTo(22.0029f, 12.9744f, 22.058f, 12.6425f, 21.9099f, 12.1809f)
        curveTo(21.7618f, 11.7193f, 21.4596f, 11.417f, 20.8551f, 10.8126f)
        lineTo(13.1874f, 3.14488f)
        curveTo(12.583f, 2.54042f, 12.2807f, 2.23819f, 11.8191f, 2.0901f)
        curveTo(11.3575f, 1.94201f, 11.0256f, 1.99711f, 10.3618f, 2.10732f)
        curveTo(5.61741f, 2.89501f, 2f, 7.01797f, 2f, 11.9858f)
        curveTo(2f, 17.5165f, 6.4835f, 22f, 12.0142f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2.5f)
        curveTo(12f, 7.21405f, 12f, 9.07107f, 13.4645f, 10.5355f)
        curveTo(14.9289f, 12f, 16.786f, 12f, 21.5f, 12f)
        }
        }.build()

        return _cliparts!!
    }

private var _cliparts: ImageVector? = null
