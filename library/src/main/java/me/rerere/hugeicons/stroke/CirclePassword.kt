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

val HugeIcons.CirclePassword: ImageVector
    get() {
        if (_circlePassword != null) {
            return _circlePassword!!
        }
        _circlePassword = ImageVector.Builder(
            name = "CirclePassword",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5f, 15f)
            curveTo(5f, 11.134f, 8.13401f, 8f, 12f, 8f)
            curveTo(15.866f, 8f, 19f, 11.134f, 19f, 15f)
            curveTo(19f, 18.866f, 15.866f, 22f, 12f, 22f)
            curveTo(8.13401f, 22f, 5f, 18.866f, 5f, 15f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16.5f, 9.5f)
            verticalLineTo(6.5f)
            curveTo(16.5f, 4.01472f, 14.4853f, 2f, 12f, 2f)
            curveTo(9.51472f, 2f, 7.5f, 4.01472f, 7.5f, 6.5f)
            verticalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10.125f, 15f)
            horizontalLineTo(10f)
            moveTo(10.25f, 15f)
            curveTo(10.25f, 15.1381f, 10.1381f, 15.25f, 10f, 15.25f)
            curveTo(9.86193f, 15.25f, 9.75f, 15.1381f, 9.75f, 15f)
            curveTo(9.75f, 14.8619f, 9.86193f, 14.75f, 10f, 14.75f)
            curveTo(10.1381f, 14.75f, 10.25f, 14.8619f, 10.25f, 15f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.125f, 15f)
            horizontalLineTo(14f)
            moveTo(14.25f, 15f)
            curveTo(14.25f, 15.1381f, 14.1381f, 15.25f, 14f, 15.25f)
            curveTo(13.8619f, 15.25f, 13.75f, 15.1381f, 13.75f, 15f)
            curveTo(13.75f, 14.8619f, 13.8619f, 14.75f, 14f, 14.75f)
            curveTo(14.1381f, 14.75f, 14.25f, 14.8619f, 14.25f, 15f)
            close()
        }
        }.build()

        return _circlePassword!!
    }

private var _circlePassword: ImageVector? = null
