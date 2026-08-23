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

val HugeIcons.UserSearch02: ImageVector
    get() {
        if (_userSearch02 != null) {
            return _userSearch02!!
        }
        _userSearch02 = ImageVector.Builder(
            name = "UserSearch02",
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
            moveTo(14.0195f, 7f)
            arcTo(4f, 4f, 0f, true, false, 6.019500000000001f, 7f)
            arcTo(4f, 4f, 0f, true, false, 14.0195f, 7f)
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
            moveTo(10.0195f, 14f)
            curveTo(5.01953f, 14f, 2.01953f, 16.5f, 2.01953f, 19f)
            curveTo(2.01953f, 20.1046f, 2.91496f, 21f, 4.01953f, 21f)
            horizontalLineTo(16.0195f)
            curveTo(17.1241f, 21f, 18.0195f, 20.1046f, 18.0195f, 19f)
            curveTo(18.0195f, 16.5f, 15.0195f, 14f, 10.0195f, 14f)
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
            moveTo(20.3178f, 12.8383f)
            lineTo(21.9805f, 14.5f)
            moveTo(20.9805f, 11f)
            curveTo(20.9805f, 9.61929f, 19.8612f, 8.5f, 18.4805f, 8.5f)
            curveTo(17.0998f, 8.5f, 15.9805f, 9.61929f, 15.9805f, 11f)
            curveTo(15.9805f, 12.3807f, 17.0998f, 13.5f, 18.4805f, 13.5f)
            curveTo(19.8612f, 13.5f, 20.9805f, 12.3807f, 20.9805f, 11f)
            close()
        }
        }.build()

        return _userSearch02!!
    }

private var _userSearch02: ImageVector? = null
