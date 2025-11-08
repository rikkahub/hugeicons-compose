package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DistributeHorizontalRight: ImageVector
    get() {
        if (_distributeHorizontalRight != null) {
            return _distributeHorizontalRight!!
        }
        _distributeHorizontalRight = ImageVector.Builder(
            name = "DistributeHorizontalRight",
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
        moveTo(22f, 2f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 2f)
        verticalLineTo(22f)
        }

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
        moveTo(4.5f, 5.00232f)
        curveTo(5.34389f, 5.00232f, 6.31789f, 4.91895f, 6.79904f, 5.75232f)
        curveTo(7f, 6.10039f, 7f, 6.5677f, 7f, 7.50232f)
        lineTo(7f, 16.5023f)
        curveTo(7f, 17.4369f, 7f, 17.9042f, 6.79904f, 18.2523f)
        curveTo(6.31789f, 19.0857f, 5.34389f, 19.0023f, 4.5f, 19.0023f)
        curveTo(3.65611f, 19.0023f, 2.68211f, 19.0857f, 2.20096f, 18.2523f)
        curveTo(2f, 17.9042f, 2f, 17.4369f, 2f, 16.5023f)
        lineTo(2f, 7.50232f)
        curveTo(2f, 6.5677f, 2f, 6.10039f, 2.20096f, 5.75232f)
        curveTo(2.68211f, 4.91895f, 3.65611f, 5.00232f, 4.5f, 5.00232f)
        }
        }.build()

        return _distributeHorizontalRight!!
    }

private var _distributeHorizontalRight: ImageVector? = null
