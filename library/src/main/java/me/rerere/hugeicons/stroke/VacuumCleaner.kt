package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.VacuumCleaner: ImageVector
    get() {
        if (_vacuumCleaner != null) {
            return _vacuumCleaner!!
        }
        _vacuumCleaner = ImageVector.Builder(
            name = "VacuumCleaner",
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
        moveTo(6f, 21f)
        curveTo(4.89543f, 21f, 4f, 20.1046f, 4f, 19f)
        curveTo(4f, 17.8954f, 4.89543f, 17f, 6f, 17f)
        curveTo(7.10457f, 17f, 8f, 17.8954f, 8f, 19f)
        curveTo(8f, 20.1046f, 7.10457f, 21f, 6f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 21f)
        horizontalLineTo(11.9743f)
        curveTo(12.6141f, 21f, 13.0976f, 20.435f, 12.9832f, 19.8211f)
        lineTo(12.0696f, 14.9206f)
        curveTo(11.5383f, 12.0712f, 8.99368f, 10f, 6.0241f, 10f)
        curveTo(5.4585f, 10f, 5f, 10.4472f, 5f, 10.9988f)
        verticalLineTo(14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 21f)
        lineTo(12.8579f, 6.93429f)
        curveTo(11.7236f, 4.53225f, 9.3055f, 3f, 6.64911f, 3f)
        curveTo(4.08148f, 3f, 2f, 5.08148f, 2f, 7.64911f)
        verticalLineTo(7.83772f)
        curveTo(2f, 9.7262f, 3.20843f, 11.4028f, 5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 21f)
        horizontalLineTo(16.5f)
        }
        }.build()

        return _vacuumCleaner!!
    }

private var _vacuumCleaner: ImageVector? = null
