package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CursorHold02: ImageVector
    get() {
        if (_cursorHold02 != null) {
            return _cursorHold02!!
        }
        _cursorHold02 = ImageVector.Builder(
            name = "CursorHold02",
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
        curveTo(16.5034f, 6.75771f, 18.05f, 7.36293f, 17.9988f, 8.32296f)
        curveTo(17.9475f, 9.28299f, 16.3334f, 9.7232f, 13.1051f, 10.6036f)
        curveTo(12.1439f, 10.8658f, 11.6633f, 10.9969f, 11.3301f, 11.3301f)
        curveTo(10.9969f, 11.6633f, 10.8658f, 12.1439f, 10.6036f, 13.1051f)
        curveTo(9.7232f, 16.3334f, 9.28299f, 17.9475f, 8.32296f, 17.9988f)
        curveTo(7.36293f, 18.05f, 6.75771f, 16.5034f, 5.54728f, 13.4101f)
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
        moveTo(17.05f, 17.95f)
        lineTo(18.85f, 16.15f)
        moveTo(22f, 17.5f)
        curveTo(22f, 19.9853f, 19.9853f, 22f, 17.5f, 22f)
        curveTo(15.0147f, 22f, 13f, 19.9853f, 13f, 17.5f)
        curveTo(13f, 15.0147f, 15.0147f, 13f, 17.5f, 13f)
        curveTo(19.9853f, 13f, 22f, 15.0147f, 22f, 17.5f)
        }
        }.build()

        return _cursorHold02!!
    }

private var _cursorHold02: ImageVector? = null
