package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CursorDisabled02: ImageVector
    get() {
        if (_cursorDisabled02 != null) {
            return _cursorDisabled02!!
        }
        _cursorDisabled02 = ImageVector.Builder(
            name = "CursorDisabled02",
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
        moveTo(8.0469f, 3.44865f)
        lineTo(13.4101f, 5.54728f)
        lineTo(13.4101f, 5.54728f)
        curveTo(16.5034f, 6.75771f, 18.05f, 7.36293f, 17.9988f, 8.32296f)
        curveTo(17.9475f, 9.28299f, 16.3334f, 9.7232f, 13.1051f, 10.6036f)
        curveTo(12.1439f, 10.8658f, 11.6633f, 10.9969f, 11.3301f, 11.3301f)
        curveTo(10.9969f, 11.6633f, 10.8658f, 12.1439f, 10.6036f, 13.1051f)
        curveTo(9.7232f, 16.3334f, 9.28299f, 17.9475f, 8.32296f, 17.9988f)
        curveTo(7.36293f, 18.05f, 6.75771f, 16.5034f, 5.54728f, 13.4101f)
        lineTo(5.54728f, 13.4101f)
        lineTo(3.44865f, 8.0469f)
        curveTo(2.18138f, 4.80831f, 1.54774f, 3.18901f, 2.36837f, 2.36837f)
        curveTo(3.18901f, 1.54774f, 4.80831f, 2.18138f, 8.0469f, 3.44865f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.318f, 20.682f)
        curveTo(16.0754f, 22.4393f, 18.9246f, 22.4393f, 20.682f, 20.682f)
        curveTo(22.4393f, 18.9246f, 22.4393f, 16.0754f, 20.682f, 14.318f)
        moveTo(14.318f, 20.682f)
        curveTo(12.5607f, 18.9246f, 12.5607f, 16.0754f, 14.318f, 14.318f)
        curveTo(16.0754f, 12.5607f, 18.9246f, 12.5607f, 20.682f, 14.318f)
        moveTo(14.318f, 20.682f)
        lineTo(20.682f, 14.318f)
        }
        }.build()

        return _cursorDisabled02!!
    }

private var _cursorDisabled02: ImageVector? = null
