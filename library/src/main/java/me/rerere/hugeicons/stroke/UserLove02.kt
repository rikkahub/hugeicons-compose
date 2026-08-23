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

val HugeIcons.UserLove02: ImageVector
    get() {
        if (_userLove02 != null) {
            return _userLove02!!
        }
        _userLove02 = ImageVector.Builder(
            name = "UserLove02",
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
            moveTo(14f, 7f)
            arcTo(4f, 4f, 0f, true, false, 6f, 7f)
            arcTo(4f, 4f, 0f, true, false, 14f, 7f)
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
            moveTo(10f, 14f)
            curveTo(5f, 14f, 2f, 16.5f, 2f, 19f)
            curveTo(2f, 20.1046f, 2.89543f, 21f, 4f, 21f)
            horizontalLineTo(16f)
            curveTo(17.1046f, 21f, 18f, 20.1046f, 18f, 19f)
            curveTo(18f, 16.5f, 15f, 14f, 10f, 14f)
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
            moveTo(18.5232f, 13.8434f)
            curveTo(17.6768f, 13.2229f, 16f, 11.8043f, 16f, 10.5278f)
            curveTo(16f, 9.684f, 16.6316f, 9f, 17.5f, 9f)
            curveTo(17.95f, 9f, 18.4f, 9.14706f, 19f, 9.73529f)
            curveTo(19.6f, 9.14706f, 20.05f, 9f, 20.5f, 9f)
            curveTo(21.3684f, 9f, 22f, 9.684f, 22f, 10.5278f)
            curveTo(22f, 11.8043f, 20.3232f, 13.2229f, 19.4768f, 13.8434f)
            curveTo(19.192f, 14.0522f, 18.808f, 14.0522f, 18.5232f, 13.8434f)
            close()
        }
        }.build()

        return _userLove02!!
    }

private var _userLove02: ImageVector? = null
