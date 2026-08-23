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

val HugeIcons.UserSettings02: ImageVector
    get() {
        if (_userSettings02 != null) {
            return _userSettings02!!
        }
        _userSettings02 = ImageVector.Builder(
            name = "UserSettings02",
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
            moveTo(13.99855f, 6f)
            arcTo(4f, 4f, 0f, true, false, 5.99855f, 6f)
            arcTo(4f, 4f, 0f, true, false, 13.99855f, 6f)
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
            moveTo(19.3949f, 7f)
            verticalLineTo(8.5f)
            moveTo(19.3949f, 11.5f)
            verticalLineTo(13f)
            moveTo(21.9955f, 8.49569f)
            lineTo(20.6964f, 9.24569f)
            moveTo(18.0984f, 10.7457f)
            lineTo(16.7993f, 11.4957f)
            moveTo(22.0015f, 11.4961f)
            lineTo(20.7024f, 10.7461f)
            moveTo(18.1043f, 9.24611f)
            lineTo(16.8053f, 8.49611f)
            moveTo(20.891f, 10f)
            curveTo(20.891f, 10.8284f, 20.2194f, 11.5f, 19.391f, 11.5f)
            curveTo(18.5626f, 11.5f, 17.891f, 10.8284f, 17.891f, 10f)
            curveTo(17.891f, 9.17157f, 18.5626f, 8.5f, 19.391f, 8.5f)
            curveTo(20.2194f, 8.5f, 20.891f, 9.17157f, 20.891f, 10f)
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
            moveTo(9.99855f, 13f)
            curveTo(4.99855f, 13f, 1.99855f, 15.5f, 1.99855f, 18f)
            curveTo(1.99855f, 19.1046f, 2.89398f, 20f, 3.99855f, 20f)
            horizontalLineTo(15.9986f)
            curveTo(17.1031f, 20f, 17.9986f, 19.1046f, 17.9986f, 18f)
            curveTo(17.9986f, 15.5f, 14.9986f, 13f, 9.99855f, 13f)
            close()
        }
        }.build()

        return _userSettings02!!
    }

private var _userSettings02: ImageVector? = null
