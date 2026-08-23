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

val HugeIcons.UserUnlock01: ImageVector
    get() {
        if (_userUnlock01 != null) {
            return _userUnlock01!!
        }
        _userUnlock01 = ImageVector.Builder(
            name = "UserUnlock01",
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
            moveTo(11.9969f, 13.5663f)
            lineTo(11.0019f, 13.5f)
            curveTo(10.6465f, 13.5097f, 10.3152f, 13.5226f, 10.0027f, 13.5379f)
            curveTo(6.30189f, 13.7193f, 3.28606f, 16.8058f, 3.00189f, 20.5002f)
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
            moveTo(15.0019f, 6.5f)
            arcTo(4f, 4f, 0f, true, false, 7.001899999999999f, 6.5f)
            arcTo(4f, 4f, 0f, true, false, 15.0019f, 6.5f)
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
            moveTo(15.5019f, 17f)
            verticalLineTo(15.5f)
            curveTo(15.5019f, 14.3954f, 16.3973f, 13.5f, 17.5019f, 13.5f)
            curveTo(18.0542f, 13.5f, 18.5542f, 13.7239f, 18.9161f, 14.0858f)
            moveTo(15.5019f, 17f)
            horizontalLineTo(19.5019f)
            horizontalLineTo(20.0019f)
            curveTo(20.5542f, 17f, 21.0019f, 17.4477f, 21.0019f, 18f)
            verticalLineTo(20.5f)
            curveTo(21.0019f, 21.0523f, 20.5542f, 21.5f, 20.0019f, 21.5f)
            horizontalLineTo(15.0019f)
            curveTo(14.4496f, 21.5f, 14.0019f, 21.0523f, 14.0019f, 20.5f)
            verticalLineTo(18f)
            curveTo(14.0019f, 17.4477f, 14.4496f, 17f, 15.0019f, 17f)
            horizontalLineTo(15.5019f)
            close()
        }
        }.build()

        return _userUnlock01!!
    }

private var _userUnlock01: ImageVector? = null
