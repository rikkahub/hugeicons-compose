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

val HugeIcons.UserSearch01: ImageVector
    get() {
        if (_userSearch01 != null) {
            return _userSearch01!!
        }
        _userSearch01 = ImageVector.Builder(
            name = "UserSearch01",
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
            moveTo(11.5f, 13.5f)
            curveTo(11.1446f, 13.5097f, 10.8134f, 13.5226f, 10.5008f, 13.5379f)
            curveTo(6.8f, 13.7193f, 3.78417f, 16.8058f, 3.5f, 20.5002f)
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
            moveTo(20.5f, 21.5f)
            lineTo(19f, 20f)
            moveTo(19.5f, 17.5f)
            curveTo(19.5f, 15.8431f, 18.1569f, 14.5f, 16.5f, 14.5f)
            curveTo(14.8431f, 14.5f, 13.5f, 15.8431f, 13.5f, 17.5f)
            curveTo(13.5f, 19.1569f, 14.8431f, 20.5f, 16.5f, 20.5f)
            curveTo(18.1569f, 20.5f, 19.5f, 19.1569f, 19.5f, 17.5f)
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
            moveTo(15.5f, 6.5f)
            arcTo(4f, 4f, 0f, true, false, 7.5f, 6.5f)
            arcTo(4f, 4f, 0f, true, false, 15.5f, 6.5f)
            close()
        }
        }.build()

        return _userSearch01!!
    }

private var _userSearch01: ImageVector? = null
