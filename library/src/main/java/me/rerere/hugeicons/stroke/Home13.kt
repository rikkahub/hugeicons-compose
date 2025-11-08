package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Home13: ImageVector
    get() {
        if (_home13 != null) {
            return _home13!!
        }
        _home13 = ImageVector.Builder(
            name = "Home13",
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
        moveTo(22f, 10.5f)
        lineTo(12.8825f, 2.82207f)
        curveTo(12.6355f, 2.61407f, 12.3229f, 2.5f, 12f, 2.5f)
        curveTo(11.6771f, 2.5f, 11.3645f, 2.61407f, 11.1175f, 2.82207f)
        lineTo(2f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 5f)
        verticalLineTo(15.5f)
        curveTo(20.5f, 18.3284f, 20.5f, 19.7426f, 19.6213f, 20.6213f)
        curveTo(18.7426f, 21.5f, 17.3284f, 21.5f, 14.5f, 21.5f)
        horizontalLineTo(9.5f)
        curveTo(6.67157f, 21.5f, 5.25736f, 21.5f, 4.37868f, 20.6213f)
        curveTo(3.5f, 19.7426f, 3.5f, 18.3284f, 3.5f, 15.5f)
        verticalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 11.5f)
        horizontalLineTo(9.5f)
        verticalLineTo(12.5f)
        horizontalLineTo(10.5f)
        verticalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 11.5f)
        horizontalLineTo(13.5f)
        verticalLineTo(12.5f)
        horizontalLineTo(14.5f)
        verticalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 15.5f)
        horizontalLineTo(9.5f)
        verticalLineTo(16.5f)
        horizontalLineTo(10.5f)
        verticalLineTo(15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 15.5f)
        horizontalLineTo(13.5f)
        verticalLineTo(16.5f)
        horizontalLineTo(14.5f)
        verticalLineTo(15.5f)
        }
        }.build()

        return _home13!!
    }

private var _home13: ImageVector? = null
