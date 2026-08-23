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

val HugeIcons.Smartphone: ImageVector
    get() {
        if (_smartphone != null) {
            return _smartphone!!
        }
        _smartphone = ImageVector.Builder(
            name = "Smartphone",
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
            moveTo(13.4929f, 2.00049f)
            horizontalLineTo(10.4929f)
            curveTo(8.1359f, 2.00049f, 6.95739f, 2.00049f, 6.22515f, 2.73272f)
            curveTo(5.49292f, 3.46495f, 5.49292f, 4.64347f, 5.49292f, 7.00049f)
            verticalLineTo(17.0005f)
            curveTo(5.49292f, 19.3575f, 5.49292f, 20.536f, 6.22515f, 21.2683f)
            curveTo(6.95739f, 22.0005f, 8.1359f, 22.0005f, 10.4929f, 22.0005f)
            horizontalLineTo(13.4929f)
            curveTo(15.8499f, 22.0005f, 17.0285f, 22.0005f, 17.7607f, 21.2683f)
            curveTo(18.4929f, 20.536f, 18.4929f, 19.3575f, 18.4929f, 17.0005f)
            verticalLineTo(7.00049f)
            curveTo(18.4929f, 4.64347f, 18.4929f, 3.46495f, 17.7607f, 2.73272f)
            curveTo(17.0285f, 2.00049f, 15.8499f, 2.00049f, 13.4929f, 2.00049f)
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
            moveTo(13.9929f, 2.00049f)
            horizontalLineTo(9.99292f)
            lineTo(10.2165f, 2.4477f)
            curveTo(10.3859f, 2.78649f, 10.7322f, 3.00049f, 11.111f, 3.00049f)
            horizontalLineTo(12.8749f)
            curveTo(13.2537f, 3.00049f, 13.5999f, 2.78649f, 13.7693f, 2.4477f)
            lineTo(13.9929f, 2.00049f)
            close()
        }
        }.build()

        return _smartphone!!
    }

private var _smartphone: ImageVector? = null
