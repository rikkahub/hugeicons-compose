package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WifiDisconnected03: ImageVector
    get() {
        if (_wifiDisconnected03 != null) {
            return _wifiDisconnected03!!
        }
        _wifiDisconnected03 = ImageVector.Builder(
            name = "WifiDisconnected03",
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
        moveTo(12f, 18f)
        horizontalLineTo(12.0118f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.25f, 15f)
        curveTo(10.25f, 13f, 13.75f, 13f, 15.75f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 12f)
        curveTo(18.4235f, 11.9323f, 18.3464f, 11.866f, 18.2687f, 11.801f)
        moveTo(5.5f, 12f)
        curveTo(8.06378f, 9.86352f, 11.1338f, 9.0964f, 14f, 9.69866f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 9f)
        curveTo(5.46566f, 6.07345f, 9.24828f, 4.75279f, 13f, 5.03799f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22.0002f, 5f)
        lineTo(16.0002f, 11f)
        moveTo(22.0002f, 11f)
        lineTo(16.0002f, 5f)
        }
        }.build()

        return _wifiDisconnected03!!
    }

private var _wifiDisconnected03: ImageVector? = null
