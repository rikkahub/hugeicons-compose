package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DistributeVerticalCenter: ImageVector
    get() {
        if (_distributeVerticalCenter != null) {
            return _distributeVerticalCenter!!
        }
        _distributeVerticalCenter = ImageVector.Builder(
            name = "DistributeVerticalCenter",
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
        moveTo(5f, 17f)
        lineTo(2f, 17f)
        moveTo(19f, 17f)
        lineTo(22f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00232f, 7f)
        curveTo(8.00232f, 6.15611f, 7.91895f, 5.18211f, 8.75232f, 4.70096f)
        curveTo(9.10039f, 4.5f, 9.5677f, 4.5f, 10.5023f, 4.5f)
        lineTo(13.5023f, 4.5f)
        curveTo(14.4369f, 4.5f, 14.9042f, 4.5f, 15.2523f, 4.70096f)
        curveTo(16.0857f, 5.18211f, 16.0023f, 6.15611f, 16.0023f, 7f)
        curveTo(16.0023f, 7.84389f, 16.0857f, 8.81789f, 15.2523f, 9.29904f)
        curveTo(14.9042f, 9.5f, 14.4369f, 9.5f, 13.5023f, 9.5f)
        horizontalLineTo(10.5023f)
        curveTo(9.5677f, 9.5f, 9.10039f, 9.5f, 8.75232f, 9.29904f)
        curveTo(7.91895f, 8.81789f, 8.00232f, 7.84389f, 8.00232f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.00232f, 17f)
        curveTo(5.00232f, 16.1561f, 4.91895f, 15.1821f, 5.75232f, 14.701f)
        curveTo(6.10039f, 14.5f, 6.5677f, 14.5f, 7.50232f, 14.5f)
        lineTo(16.5023f, 14.5f)
        curveTo(17.4369f, 14.5f, 17.9042f, 14.5f, 18.2523f, 14.701f)
        curveTo(19.0857f, 15.1821f, 19.0023f, 16.1561f, 19.0023f, 17f)
        curveTo(19.0023f, 17.8439f, 19.0857f, 18.8179f, 18.2523f, 19.299f)
        curveTo(17.9042f, 19.5f, 17.4369f, 19.5f, 16.5023f, 19.5f)
        horizontalLineTo(7.50232f)
        curveTo(6.5677f, 19.5f, 6.10039f, 19.5f, 5.75232f, 19.299f)
        curveTo(4.91895f, 18.8179f, 5.00232f, 17.8439f, 5.00232f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 7f)
        lineTo(2f, 7f)
        moveTo(16f, 7f)
        lineTo(22f, 7f)
        }
        }.build()

        return _distributeVerticalCenter!!
    }

private var _distributeVerticalCenter: ImageVector? = null
