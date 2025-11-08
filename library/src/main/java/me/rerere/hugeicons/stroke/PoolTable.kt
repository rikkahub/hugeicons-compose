package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PoolTable: ImageVector
    get() {
        if (_poolTable != null) {
            return _poolTable!!
        }
        _poolTable = ImageVector.Builder(
            name = "PoolTable",
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
        moveTo(5.35f, 17f)
        curveTo(4.0065f, 17f, 3.33475f, 17f, 2.91737f, 16.5607f)
        curveTo(2.5f, 16.1213f, 2.5f, 15.4142f, 2.5f, 14f)
        lineTo(2.5f, 6f)
        curveTo(2.5f, 4.58579f, 2.5f, 3.87868f, 2.91737f, 3.43934f)
        curveTo(3.33475f, 3f, 4.0065f, 3f, 5.35f, 3f)
        lineTo(18.65f, 3f)
        curveTo(19.9935f, 3f, 20.6653f, 3f, 21.0826f, 3.43934f)
        curveTo(21.5f, 3.87868f, 21.5f, 4.58579f, 21.5f, 6f)
        verticalLineTo(14f)
        curveTo(21.5f, 15.4142f, 21.5f, 16.1213f, 21.0826f, 16.5607f)
        curveTo(20.6653f, 17f, 19.9935f, 17f, 18.65f, 17f)
        lineTo(5.35f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0119f, 9f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 14f)
        curveTo(4.65685f, 14f, 6f, 15.3431f, 6f, 17f)
        moveTo(3f, 6f)
        curveTo(4.65685f, 6f, 6f, 4.65685f, 6f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 14f)
        curveTo(19.3431f, 14f, 18f, 15.3431f, 18f, 17f)
        moveTo(21f, 6f)
        curveTo(19.3431f, 6f, 18f, 4.65685f, 18f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 17f)
        curveTo(14f, 15.8954f, 13.1046f, 15f, 12f, 15f)
        curveTo(10.8954f, 15f, 10f, 15.8954f, 10f, 17f)
        moveTo(14f, 3f)
        curveTo(14f, 4.10457f, 13.1046f, 5f, 12f, 5f)
        curveTo(10.8954f, 5f, 10f, 4.10457f, 10f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 11.5f)
        lineTo(4f, 21f)
        }
        }.build()

        return _poolTable!!
    }

private var _poolTable: ImageVector? = null
