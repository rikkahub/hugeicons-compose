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

val HugeIcons.CircleUnlock01: ImageVector
    get() {
        if (_circleUnlock01 != null) {
            return _circleUnlock01!!
        }
        _circleUnlock01 = ImageVector.Builder(
            name = "CircleUnlock01",
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
            moveTo(7.5f, 9.5f)
            verticalLineTo(6.5f)
            curveTo(7.5f, 4.01472f, 9.51472f, 2f, 12f, 2f)
            curveTo(13.5602f, 2f, 14.935f, 2.79401f, 15.7422f, 4f)
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
            moveTo(12.125f, 15f)
            horizontalLineTo(12f)
            moveTo(12.25f, 15f)
            curveTo(12.25f, 15.1381f, 12.1381f, 15.25f, 12f, 15.25f)
            curveTo(11.8619f, 15.25f, 11.75f, 15.1381f, 11.75f, 15f)
            curveTo(11.75f, 14.8619f, 11.8619f, 14.75f, 12f, 14.75f)
            curveTo(12.1381f, 14.75f, 12.25f, 14.8619f, 12.25f, 15f)
            close()
        }
        }.build()

        return _circleUnlock01!!
    }

private var _circleUnlock01: ImageVector? = null
