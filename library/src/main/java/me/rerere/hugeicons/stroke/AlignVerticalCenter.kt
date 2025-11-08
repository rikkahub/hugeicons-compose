package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlignVerticalCenter: ImageVector
    get() {
        if (_alignVerticalCenter != null) {
            return _alignVerticalCenter!!
        }
        _alignVerticalCenter = ImageVector.Builder(
            name = "AlignVerticalCenter",
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
        moveTo(16.5f, 8.00232f)
        curveTo(17.3439f, 8.00232f, 18.3179f, 7.91895f, 18.799f, 8.75232f)
        curveTo(19f, 9.10039f, 19f, 9.5677f, 19f, 10.5023f)
        verticalLineTo(13.5023f)
        curveTo(19f, 14.4369f, 19f, 14.9042f, 18.799f, 15.2523f)
        curveTo(18.3179f, 16.0857f, 17.3439f, 16.0023f, 16.5f, 16.0023f)
        curveTo(15.6561f, 16.0023f, 14.6821f, 16.0857f, 14.201f, 15.2523f)
        curveTo(14f, 14.9042f, 14f, 14.4369f, 14f, 13.5023f)
        lineTo(14f, 10.5023f)
        curveTo(14f, 9.5677f, 14f, 9.10039f, 14.201f, 8.75232f)
        curveTo(14.6821f, 7.91895f, 15.6561f, 8.00232f, 16.5f, 8.00232f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 4.00232f)
        curveTo(8.34389f, 4.00232f, 9.31789f, 3.91895f, 9.79904f, 4.75232f)
        curveTo(10f, 5.10039f, 10f, 5.5677f, 10f, 6.50232f)
        lineTo(10f, 17.5023f)
        curveTo(10f, 18.4369f, 10f, 18.9042f, 9.79904f, 19.2523f)
        curveTo(9.31789f, 20.0857f, 8.34389f, 20.0023f, 7.5f, 20.0023f)
        curveTo(6.65611f, 20.0023f, 5.68211f, 20.0857f, 5.20096f, 19.2523f)
        curveTo(5f, 18.9042f, 5f, 18.4369f, 5f, 17.5023f)
        lineTo(5f, 6.50232f)
        curveTo(5f, 5.5677f, 5f, 5.10039f, 5.20096f, 4.75232f)
        curveTo(5.68211f, 3.91895f, 6.65611f, 4.00232f, 7.5f, 4.00232f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 12f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 12f)
        lineTo(10f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        lineTo(19f, 12f)
        }
        }.build()

        return _alignVerticalCenter!!
    }

private var _alignVerticalCenter: ImageVector? = null
