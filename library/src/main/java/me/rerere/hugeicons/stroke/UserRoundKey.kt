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

val HugeIcons.UserRoundKey: ImageVector
    get() {
        if (_userRoundKey != null) {
            return _userRoundKey!!
        }
        _userRoundKey = ImageVector.Builder(
            name = "UserRoundKey",
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
            moveTo(15.5f, 7.5f)
            curveTo(15.5f, 4.73858f, 13.2614f, 2.5f, 10.5f, 2.5f)
            curveTo(7.73858f, 2.5f, 5.5f, 4.73858f, 5.5f, 7.5f)
            curveTo(5.5f, 10.2614f, 7.73858f, 12.5f, 10.5f, 12.5f)
            curveTo(13.2614f, 12.5f, 15.5f, 10.2614f, 15.5f, 7.5f)
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
            moveTo(15f, 14.1379f)
            curveTo(13.7832f, 13.1157f, 12.2135f, 12.5f, 10.5f, 12.5f)
            curveTo(6.63401f, 12.5f, 3.5f, 15.634f, 3.5f, 19.5f)
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
            moveTo(16f, 18f)
            lineTo(20.5f, 13.5f)
            moveTo(19.5f, 15f)
            lineTo(20.5f, 16f)
            moveTo(16.5f, 19.5f)
            curveTo(16.5f, 20.6046f, 15.6046f, 21.5f, 14.5f, 21.5f)
            curveTo(13.3954f, 21.5f, 12.5f, 20.6046f, 12.5f, 19.5f)
            curveTo(12.5f, 18.3954f, 13.3954f, 17.5f, 14.5f, 17.5f)
            curveTo(15.6046f, 17.5f, 16.5f, 18.3954f, 16.5f, 19.5f)
            close()
        }
        }.build()

        return _userRoundKey!!
    }

private var _userRoundKey: ImageVector? = null
