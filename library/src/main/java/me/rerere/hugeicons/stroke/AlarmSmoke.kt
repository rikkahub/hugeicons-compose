package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlarmSmoke: ImageVector
    get() {
        if (_alarmSmoke != null) {
            return _alarmSmoke!!
        }
        _alarmSmoke = ImageVector.Builder(
            name = "AlarmSmoke",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4f, 8f)
            horizontalLineTo(20f)
            curveTo(20.465f, 8f, 20.6975f, 8f, 20.8882f, 7.94889f)
            curveTo(21.4059f, 7.81019f, 21.8102f, 7.40587f, 21.9489f, 6.88823f)
            curveTo(22f, 6.69748f, 22f, 6.46499f, 22f, 6f)
            curveTo(22f, 5.53501f, 22f, 5.30252f, 21.9489f, 5.11177f)
            curveTo(21.8102f, 4.59413f, 21.4059f, 4.18981f, 20.8882f, 4.05111f)
            curveTo(20.6975f, 4f, 20.465f, 4f, 20f, 4f)
            horizontalLineTo(4f)
            curveTo(3.53501f, 4f, 3.30252f, 4f, 3.11177f, 4.05111f)
            curveTo(2.59413f, 4.18981f, 2.18981f, 4.59413f, 2.05111f, 5.11177f)
            curveTo(2f, 5.30252f, 2f, 5.53501f, 2f, 6f)
            curveTo(2f, 6.46499f, 2f, 6.69748f, 2.05111f, 6.88823f)
            curveTo(2.18981f, 7.40587f, 2.59413f, 7.81019f, 3.11177f, 7.94889f)
            curveTo(3.30252f, 8f, 3.53501f, 8f, 4f, 8f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5f, 8f)
            lineTo(5.34164f, 8.68328f)
            curveTo(6.14852f, 10.297f, 6.55195f, 11.1039f, 7.27691f, 11.552f)
            curveTo(8.00186f, 12f, 8.90398f, 12f, 10.7082f, 12f)
            horizontalLineTo(13.2918f)
            curveTo(15.096f, 12f, 15.9981f, 12f, 16.7231f, 11.552f)
            curveTo(17.448f, 11.1039f, 17.8515f, 10.297f, 18.6584f, 8.68328f)
            lineTo(19f, 8f)
            horizontalLineTo(5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 16f)
            verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16f, 16f)
            verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 16f)
            verticalLineTo(20f)
        }
        }.build()

        return _alarmSmoke!!
    }

private var _alarmSmoke: ImageVector? = null
