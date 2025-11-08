package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DistributeVerticalBottom: ImageVector
    get() {
        if (_distributeVerticalBottom != null) {
            return _distributeVerticalBottom!!
        }
        _distributeVerticalBottom = ImageVector.Builder(
            name = "DistributeVerticalBottom",
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
        moveTo(1.99988f, 22f)
        lineTo(21.9999f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(1.99994f, 10f)
        lineTo(21.9999f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00232f, 4.5f)
        curveTo(8.00232f, 5.34389f, 7.91895f, 6.31789f, 8.75232f, 6.79904f)
        curveTo(9.10039f, 7f, 9.5677f, 7f, 10.5023f, 7f)
        horizontalLineTo(13.5023f)
        curveTo(14.4369f, 7f, 14.9042f, 7f, 15.2523f, 6.79904f)
        curveTo(16.0857f, 6.31789f, 16.0023f, 5.34389f, 16.0023f, 4.5f)
        curveTo(16.0023f, 3.65611f, 16.0857f, 2.68211f, 15.2523f, 2.20096f)
        curveTo(14.9042f, 2f, 14.4369f, 2f, 13.5023f, 2f)
        lineTo(10.5023f, 2f)
        curveTo(9.5677f, 2f, 9.10039f, 2f, 8.75232f, 2.20096f)
        curveTo(7.91895f, 2.68211f, 8.00232f, 3.65611f, 8.00232f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.00232f, 16.5f)
        curveTo(5.00232f, 17.3439f, 4.91895f, 18.3179f, 5.75232f, 18.799f)
        curveTo(6.10039f, 19f, 6.5677f, 19f, 7.50232f, 19f)
        lineTo(16.5023f, 19f)
        curveTo(17.4369f, 19f, 17.9042f, 19f, 18.2523f, 18.799f)
        curveTo(19.0857f, 18.3179f, 19.0023f, 17.3439f, 19.0023f, 16.5f)
        curveTo(19.0023f, 15.6561f, 19.0857f, 14.6821f, 18.2523f, 14.201f)
        curveTo(17.9042f, 14f, 17.4369f, 14f, 16.5023f, 14f)
        lineTo(7.50232f, 14f)
        curveTo(6.5677f, 14f, 6.10039f, 14f, 5.75232f, 14.201f)
        curveTo(4.91895f, 14.6821f, 5.00232f, 15.6561f, 5.00232f, 16.5f)
        }
        }.build()

        return _distributeVerticalBottom!!
    }

private var _distributeVerticalBottom: ImageVector? = null
