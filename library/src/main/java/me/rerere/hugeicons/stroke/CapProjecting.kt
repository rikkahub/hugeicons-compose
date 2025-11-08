package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CapProjecting: ImageVector
    get() {
        if (_capProjecting != null) {
            return _capProjecting!!
        }
        _capProjecting = ImageVector.Builder(
            name = "CapProjecting",
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
        moveTo(21f, 5f)
        lineTo(10f, 5f)
        curveTo(7.19108f, 5f, 5.78661f, 5f, 4.77772f, 5.67412f)
        curveTo(4.34096f, 5.96596f, 3.96596f, 6.34096f, 3.67412f, 6.77772f)
        curveTo(3f, 7.78661f, 3f, 9.19107f, 3f, 12f)
        curveTo(3f, 14.8089f, 3f, 16.2134f, 3.67412f, 17.2223f)
        curveTo(3.96596f, 17.659f, 4.34096f, 18.034f, 4.77772f, 18.3259f)
        curveTo(5.78661f, 19f, 7.19108f, 19f, 10f, 19f)
        lineTo(21f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 12f)
        curveTo(13f, 13.3807f, 11.8807f, 14.5f, 10.5f, 14.5f)
        curveTo(9.11929f, 14.5f, 8f, 13.3807f, 8f, 12f)
        curveTo(8f, 10.6193f, 9.11929f, 9.5f, 10.5f, 9.5f)
        curveTo(11.8807f, 9.5f, 13f, 10.6193f, 13f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 12f)
        lineTo(21f, 12f)
        }
        }.build()

        return _capProjecting!!
    }

private var _capProjecting: ImageVector? = null
