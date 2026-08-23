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

val HugeIcons.UserRound: ImageVector
    get() {
        if (_userRound != null) {
            return _userRound!!
        }
        _userRound = ImageVector.Builder(
            name = "UserRound",
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
            moveTo(17f, 8.5f)
            curveTo(17f, 5.73858f, 14.7614f, 3.5f, 12f, 3.5f)
            curveTo(9.23858f, 3.5f, 7f, 5.73858f, 7f, 8.5f)
            curveTo(7f, 11.2614f, 9.23858f, 13.5f, 12f, 13.5f)
            curveTo(14.7614f, 13.5f, 17f, 11.2614f, 17f, 8.5f)
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
            moveTo(19f, 20.5f)
            curveTo(19f, 16.634f, 15.866f, 13.5f, 12f, 13.5f)
            curveTo(8.13401f, 13.5f, 5f, 16.634f, 5f, 20.5f)
        }
        }.build()

        return _userRound!!
    }

private var _userRound: ImageVector? = null
