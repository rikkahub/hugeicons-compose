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

val HugeIcons.UserRoundPen: ImageVector
    get() {
        if (_userRoundPen != null) {
            return _userRoundPen!!
        }
        _userRoundPen = ImageVector.Builder(
            name = "UserRoundPen",
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
            moveTo(15.5f, 8f)
            curveTo(15.5f, 5.23858f, 13.2614f, 3f, 10.5f, 3f)
            curveTo(7.73858f, 3f, 5.5f, 5.23858f, 5.5f, 8f)
            curveTo(5.5f, 10.7614f, 7.73858f, 13f, 10.5f, 13f)
            curveTo(13.2614f, 13f, 15.5f, 10.7614f, 15.5f, 8f)
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
            moveTo(3.5f, 20f)
            curveTo(3.5f, 16.134f, 6.63401f, 13f, 10.5f, 13f)
            curveTo(11.775f, 13f, 12.9704f, 13.3409f, 14f, 13.9365f)
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
            moveTo(20.3536f, 15.4393f)
            lineTo(19.0607f, 14.1464f)
            curveTo(18.8654f, 13.9512f, 18.5489f, 13.9512f, 18.3536f, 14.1464f)
            lineTo(14f, 18.5f)
            lineTo(13.5f, 21f)
            lineTo(16f, 20.5f)
            lineTo(20.3536f, 16.1464f)
            curveTo(20.5489f, 15.9512f, 20.5489f, 15.6346f, 20.3536f, 15.4393f)
            close()
        }
        }.build()

        return _userRoundPen!!
    }

private var _userRoundPen: ImageVector? = null
