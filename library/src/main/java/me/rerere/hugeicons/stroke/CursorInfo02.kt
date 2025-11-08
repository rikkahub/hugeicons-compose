package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CursorInfo02: ImageVector
    get() {
        if (_cursorInfo02 != null) {
            return _cursorInfo02!!
        }
        _cursorInfo02 = ImageVector.Builder(
            name = "CursorInfo02",
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
        moveTo(10.0469f, 3.44865f)
        lineTo(15.4101f, 5.54728f)
        lineTo(15.4101f, 5.54728f)
        curveTo(18.5034f, 6.75771f, 20.05f, 7.36293f, 19.9988f, 8.32296f)
        curveTo(19.9475f, 9.28299f, 18.3334f, 9.7232f, 15.1051f, 10.6036f)
        curveTo(14.1439f, 10.8658f, 13.6633f, 10.9969f, 13.3301f, 11.3301f)
        curveTo(12.9969f, 11.6633f, 12.8658f, 12.1439f, 12.6036f, 13.1051f)
        curveTo(11.7232f, 16.3334f, 11.283f, 17.9475f, 10.323f, 17.9988f)
        curveTo(9.36293f, 18.05f, 8.75771f, 16.5034f, 7.54728f, 13.4101f)
        lineTo(7.54728f, 13.4101f)
        lineTo(5.44865f, 8.0469f)
        curveTo(4.18138f, 4.80831f, 3.54774f, 3.18901f, 4.36837f, 2.36837f)
        curveTo(5.18901f, 1.54774f, 6.80831f, 2.18138f, 10.0469f, 3.44865f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 21.99f)
        verticalLineTo(22f)
        moveTo(16f, 15.9976f)
        curveTo(16f, 14.8944f, 16.8954f, 14f, 18f, 14f)
        curveTo(19.1046f, 14f, 20f, 14.8944f, 20f, 15.9976f)
        curveTo(20f, 16.5747f, 19.755f, 17.0946f, 19.3632f, 17.4593f)
        curveTo(18.7572f, 18.0234f, 18f, 18.666f, 18f, 19.4935f)
        }
        }.build()

        return _cursorInfo02!!
    }

private var _cursorInfo02: ImageVector? = null
