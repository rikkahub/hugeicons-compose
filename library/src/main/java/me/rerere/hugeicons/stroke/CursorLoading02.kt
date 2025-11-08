package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CursorLoading02: ImageVector
    get() {
        if (_cursorLoading02 != null) {
            return _cursorLoading02!!
        }
        _cursorLoading02 = ImageVector.Builder(
            name = "CursorLoading02",
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
        moveTo(8.5469f, 3.44865f)
        lineTo(13.9101f, 5.54728f)
        lineTo(13.9101f, 5.54728f)
        curveTo(17.0034f, 6.75771f, 18.55f, 7.36293f, 18.4988f, 8.32296f)
        curveTo(18.4475f, 9.28299f, 16.8334f, 9.7232f, 13.6051f, 10.6036f)
        curveTo(12.6439f, 10.8658f, 12.1633f, 10.9969f, 11.8301f, 11.3301f)
        curveTo(11.4969f, 11.6633f, 11.3658f, 12.1439f, 11.1036f, 13.1051f)
        curveTo(10.2232f, 16.3334f, 9.78299f, 17.9475f, 8.82296f, 17.9988f)
        curveTo(7.86293f, 18.05f, 7.25771f, 16.5034f, 6.04728f, 13.4101f)
        lineTo(6.04728f, 13.4101f)
        lineTo(3.94865f, 8.0469f)
        curveTo(2.68138f, 4.80831f, 2.04774f, 3.18901f, 2.86837f, 2.36837f)
        curveTo(3.68901f, 1.54774f, 5.30831f, 2.18138f, 8.5469f, 3.44865f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.9999f, 17.5f)
        curveTo(19.9329f, 17.5f, 21.4999f, 15.989f, 21.4999f, 14.125f)
        curveTo(21.4999f, 13.5037f, 20.9776f, 13f, 20.3333f, 13f)
        horizontalLineTo(15.6666f)
        curveTo(15.0223f, 13f, 14.4999f, 13.5037f, 14.4999f, 14.125f)
        curveTo(14.4999f, 15.989f, 16.0669f, 17.5f, 17.9999f, 17.5f)
        moveTo(17.9999f, 17.5f)
        curveTo(19.9329f, 17.5f, 21.4999f, 19.011f, 21.4999f, 20.875f)
        curveTo(21.4999f, 21.4963f, 20.9776f, 22f, 20.3333f, 22f)
        horizontalLineTo(15.6666f)
        curveTo(15.0223f, 22f, 14.4999f, 21.4963f, 14.4999f, 20.875f)
        curveTo(14.4999f, 19.011f, 16.0669f, 17.5f, 17.9999f, 17.5f)
        }
        }.build()

        return _cursorLoading02!!
    }

private var _cursorLoading02: ImageVector? = null
