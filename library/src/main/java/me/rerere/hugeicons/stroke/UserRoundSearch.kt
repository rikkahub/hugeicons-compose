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

val HugeIcons.UserRoundSearch: ImageVector
    get() {
        if (_userRoundSearch != null) {
            return _userRoundSearch!!
        }
        _userRoundSearch = ImageVector.Builder(
            name = "UserRoundSearch",
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
            moveTo(15f, 7.5f)
            curveTo(15f, 4.73858f, 12.7614f, 2.5f, 10f, 2.5f)
            curveTo(7.23858f, 2.5f, 5f, 4.73858f, 5f, 7.5f)
            curveTo(5f, 10.2614f, 7.23858f, 12.5f, 10f, 12.5f)
            curveTo(12.7614f, 12.5f, 15f, 10.2614f, 15f, 7.5f)
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
            moveTo(21f, 21.5f)
            lineTo(19.5f, 20f)
            moveTo(20f, 17.5f)
            curveTo(20f, 15.8431f, 18.6569f, 14.5f, 17f, 14.5f)
            curveTo(15.3431f, 14.5f, 14f, 15.8431f, 14f, 17.5f)
            curveTo(14f, 19.1569f, 15.3431f, 20.5f, 17f, 20.5f)
            curveTo(18.6569f, 20.5f, 20f, 19.1569f, 20f, 17.5f)
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
            moveTo(3f, 19.5f)
            curveTo(3f, 15.634f, 6.13401f, 12.5f, 10f, 12.5f)
            curveTo(11.0736f, 12.5f, 12.0907f, 12.7417f, 13f, 13.1736f)
        }
        }.build()

        return _userRoundSearch!!
    }

private var _userRoundSearch: ImageVector? = null
