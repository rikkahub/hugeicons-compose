package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DistributeHorizontalCenter: ImageVector
    get() {
        if (_distributeHorizontalCenter != null) {
            return _distributeHorizontalCenter!!
        }
        _distributeHorizontalCenter = ImageVector.Builder(
            name = "DistributeHorizontalCenter",
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
        moveTo(7f, 5f)
        lineTo(7f, 2f)
        moveTo(7f, 19f)
        lineTo(7f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 8.00232f)
        curveTo(17.8439f, 8.00232f, 18.8179f, 7.91895f, 19.299f, 8.75232f)
        curveTo(19.5f, 9.10039f, 19.5f, 9.5677f, 19.5f, 10.5023f)
        verticalLineTo(13.5023f)
        curveTo(19.5f, 14.4369f, 19.5f, 14.9042f, 19.299f, 15.2523f)
        curveTo(18.8179f, 16.0857f, 17.8439f, 16.0023f, 17f, 16.0023f)
        curveTo(16.1561f, 16.0023f, 15.1821f, 16.0857f, 14.701f, 15.2523f)
        curveTo(14.5f, 14.9042f, 14.5f, 14.4369f, 14.5f, 13.5023f)
        lineTo(14.5f, 10.5023f)
        curveTo(14.5f, 9.5677f, 14.5f, 9.10039f, 14.701f, 8.75232f)
        curveTo(15.1821f, 7.91895f, 16.1561f, 8.00232f, 17f, 8.00232f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 5.00232f)
        curveTo(7.84389f, 5.00232f, 8.81789f, 4.91895f, 9.29904f, 5.75232f)
        curveTo(9.5f, 6.10039f, 9.5f, 6.5677f, 9.5f, 7.50232f)
        lineTo(9.5f, 16.5023f)
        curveTo(9.5f, 17.4369f, 9.5f, 17.9042f, 9.29904f, 18.2523f)
        curveTo(8.81789f, 19.0857f, 7.84389f, 19.0023f, 7f, 19.0023f)
        curveTo(6.15611f, 19.0023f, 5.18211f, 19.0857f, 4.70096f, 18.2523f)
        curveTo(4.5f, 17.9042f, 4.5f, 17.4369f, 4.5f, 16.5023f)
        lineTo(4.5f, 7.50232f)
        curveTo(4.5f, 6.5677f, 4.5f, 6.10039f, 4.70096f, 5.75232f)
        curveTo(5.18211f, 4.91895f, 6.15611f, 5.00232f, 7f, 5.00232f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 8f)
        verticalLineTo(2f)
        moveTo(17f, 16f)
        verticalLineTo(22f)
        }
        }.build()

        return _distributeHorizontalCenter!!
    }

private var _distributeHorizontalCenter: ImageVector? = null
