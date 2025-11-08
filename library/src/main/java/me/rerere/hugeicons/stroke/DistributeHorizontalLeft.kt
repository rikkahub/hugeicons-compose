package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DistributeHorizontalLeft: ImageVector
    get() {
        if (_distributeHorizontalLeft != null) {
            return _distributeHorizontalLeft!!
        }
        _distributeHorizontalLeft = ImageVector.Builder(
            name = "DistributeHorizontalLeft",
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
        moveTo(2f, 2f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 2f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 8.00232f)
        curveTo(18.6561f, 8.00232f, 17.6821f, 7.91895f, 17.201f, 8.75232f)
        curveTo(17f, 9.10039f, 17f, 9.5677f, 17f, 10.5023f)
        verticalLineTo(13.5023f)
        curveTo(17f, 14.4369f, 17f, 14.9042f, 17.201f, 15.2523f)
        curveTo(17.6821f, 16.0857f, 18.6561f, 16.0023f, 19.5f, 16.0023f)
        curveTo(20.3439f, 16.0023f, 21.3179f, 16.0857f, 21.799f, 15.2523f)
        curveTo(22f, 14.9042f, 22f, 14.4369f, 22f, 13.5023f)
        verticalLineTo(10.5023f)
        curveTo(22f, 9.5677f, 22f, 9.10039f, 21.799f, 8.75232f)
        curveTo(21.3179f, 7.91895f, 20.3439f, 8.00232f, 19.5f, 8.00232f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.49805f, 5.00232f)
        curveTo(6.65415f, 5.00232f, 5.68016f, 4.91895f, 5.19901f, 5.75232f)
        curveTo(4.99805f, 6.10039f, 4.99805f, 6.5677f, 4.99805f, 7.50232f)
        lineTo(4.99805f, 16.5023f)
        curveTo(4.99805f, 17.4369f, 4.99805f, 17.9042f, 5.19901f, 18.2523f)
        curveTo(5.68016f, 19.0857f, 6.65415f, 19.0023f, 7.49805f, 19.0023f)
        curveTo(8.34194f, 19.0023f, 9.31594f, 19.0857f, 9.79709f, 18.2523f)
        curveTo(9.99805f, 17.9042f, 9.99805f, 17.4369f, 9.99805f, 16.5023f)
        lineTo(9.99805f, 7.50232f)
        curveTo(9.99805f, 6.5677f, 9.99805f, 6.10039f, 9.79708f, 5.75232f)
        curveTo(9.31594f, 4.91895f, 8.34194f, 5.00232f, 7.49805f, 5.00232f)
        }
        }.build()

        return _distributeHorizontalLeft!!
    }

private var _distributeHorizontalLeft: ImageVector? = null
