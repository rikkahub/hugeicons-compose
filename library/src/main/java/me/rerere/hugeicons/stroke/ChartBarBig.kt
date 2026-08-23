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

val HugeIcons.ChartBarBig: ImageVector
    get() {
        if (_chartBarBig != null) {
            return _chartBarBig!!
        }
        _chartBarBig = ImageVector.Builder(
            name = "ChartBarBig",
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
            moveTo(7f, 15f)
            verticalLineTo(16f)
            curveTo(7f, 16.5523f, 7.44772f, 17f, 8f, 17f)
            horizontalLineTo(14f)
            curveTo(14.5523f, 17f, 15f, 16.5523f, 15f, 16f)
            verticalLineTo(15f)
            curveTo(15f, 14.4477f, 14.5523f, 14f, 14f, 14f)
            horizontalLineTo(8f)
            curveTo(7.44772f, 14f, 7f, 14.4477f, 7f, 15f)
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
            moveTo(7f, 8f)
            verticalLineTo(9f)
            curveTo(7f, 9.55228f, 7.44772f, 10f, 8f, 10f)
            horizontalLineTo(18f)
            curveTo(18.5523f, 10f, 19f, 9.55228f, 19f, 9f)
            verticalLineTo(8f)
            curveTo(19f, 7.44772f, 18.5523f, 7f, 18f, 7f)
            horizontalLineTo(8f)
            curveTo(7.44772f, 7f, 7f, 7.44772f, 7f, 8f)
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
            moveTo(3f, 3f)
            verticalLineTo(13f)
            curveTo(3f, 16.7712f, 3f, 18.6569f, 4.17157f, 19.8284f)
            curveTo(5.34315f, 21f, 7.22876f, 21f, 11f, 21f)
            horizontalLineTo(21f)
        }
        }.build()

        return _chartBarBig!!
    }

private var _chartBarBig: ImageVector? = null
