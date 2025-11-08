package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlignBottom: ImageVector
    get() {
        if (_alignBottom != null) {
            return _alignBottom!!
        }
        _alignBottom = ImageVector.Builder(
            name = "AlignBottom",
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
        moveTo(16.502f, 10.0023f)
        curveTo(17.3458f, 10.0023f, 18.3198f, 9.91895f, 18.801f, 10.7523f)
        curveTo(19.002f, 11.1004f, 19.002f, 11.5677f, 19.002f, 12.5023f)
        verticalLineTo(13.5023f)
        curveTo(19.002f, 14.4369f, 19.002f, 14.9042f, 18.801f, 15.2523f)
        curveTo(18.3198f, 16.0857f, 17.3458f, 16.0023f, 16.502f, 16.0023f)
        curveTo(15.6581f, 16.0023f, 14.6841f, 16.0857f, 14.2029f, 15.2523f)
        curveTo(14.002f, 14.9042f, 14.002f, 14.4369f, 14.002f, 13.5023f)
        lineTo(14.002f, 12.5023f)
        curveTo(14.002f, 11.5677f, 14.002f, 11.1004f, 14.2029f, 10.7523f)
        curveTo(14.6841f, 9.91895f, 15.6581f, 10.0023f, 16.502f, 10.0023f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.50195f, 4.00232f)
        curveTo(8.34585f, 4.00232f, 9.31984f, 3.91895f, 9.80099f, 4.75232f)
        curveTo(10.002f, 5.10039f, 10.002f, 5.5677f, 10.002f, 6.50232f)
        lineTo(10.002f, 13.5023f)
        curveTo(10.002f, 14.4369f, 10.002f, 14.9042f, 9.80099f, 15.2523f)
        curveTo(9.31984f, 16.0857f, 8.34585f, 16.0023f, 7.50195f, 16.0023f)
        curveTo(6.65806f, 16.0023f, 5.68406f, 16.0857f, 5.20292f, 15.2523f)
        curveTo(5.00195f, 14.9042f, 5.00195f, 14.4369f, 5.00195f, 13.5023f)
        lineTo(5.00195f, 6.50232f)
        curveTo(5.00195f, 5.5677f, 5.00195f, 5.10039f, 5.20292f, 4.75232f)
        curveTo(5.68406f, 3.91895f, 6.65806f, 4.00232f, 7.50195f, 4.00232f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 20f)
        lineTo(2f, 20f)
        }
        }.build()

        return _alignBottom!!
    }

private var _alignBottom: ImageVector? = null
