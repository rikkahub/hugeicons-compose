package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CursorAddSelection02: ImageVector
    get() {
        if (_cursorAddSelection02 != null) {
            return _cursorAddSelection02!!
        }
        _cursorAddSelection02 = ImageVector.Builder(
            name = "CursorAddSelection02",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.0469f, 4.44865f)
        lineTo(14.4101f, 6.54728f)
        lineTo(14.4101f, 6.54728f)
        curveTo(17.5034f, 7.75771f, 19.05f, 8.36293f, 18.9988f, 9.32296f)
        curveTo(18.9475f, 10.283f, 17.3334f, 10.7232f, 14.1051f, 11.6036f)
        curveTo(13.1439f, 11.8658f, 12.6633f, 11.9969f, 12.3301f, 12.3301f)
        curveTo(11.9969f, 12.6633f, 11.8658f, 13.1439f, 11.6036f, 14.1051f)
        curveTo(10.7232f, 17.3334f, 10.283f, 18.9475f, 9.32296f, 18.9988f)
        curveTo(8.36293f, 19.05f, 7.75771f, 17.5034f, 6.54728f, 14.4101f)
        lineTo(6.54728f, 14.4101f)
        lineTo(4.44865f, 9.0469f)
        curveTo(3.18138f, 5.80831f, 2.54774f, 4.18901f, 3.36837f, 3.36837f)
        curveTo(4.18901f, 2.54774f, 5.80831f, 3.18138f, 9.0469f, 4.44865f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 14f)
        verticalLineTo(21f)
        moveTo(21f, 17.5f)
        lineTo(14f, 17.5f)
        }
        }.build()

        return _cursorAddSelection02!!
    }

private var _cursorAddSelection02: ImageVector? = null
