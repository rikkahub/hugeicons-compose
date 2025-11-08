package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WifiError02: ImageVector
    get() {
        if (_wifiError02 != null) {
            return _wifiError02!!
        }
        _wifiError02 = ImageVector.Builder(
            name = "WifiError02",
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
        moveTo(8.25f, 17.0001f)
        curveTo(8.67265f, 16.5774f, 9.16229f, 16.2441f, 9.6906f, 16.0001f)
        moveTo(15.75f, 17.0001f)
        curveTo(15.3274f, 16.5774f, 14.8377f, 16.2441f, 14.3094f, 16.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 14.0001f)
        curveTo(17.4308f, 13.0692f, 16.2435f, 12.4026f, 15f, 12.0001f)
        moveTo(5.5f, 14.0001f)
        curveTo(6.59299f, 13.1038f, 7.778f, 12.4525f, 9f, 12.046f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 11f)
        curveTo(3.92227f, 9.3768f, 5.94206f, 8.1353f, 8f, 7.50015f)
        moveTo(22f, 10.9999f)
        curveTo(20.0778f, 9.37675f, 18.0579f, 8.13529f, 16f, 7.50015f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 20f)
        horizontalLineTo(12.0118f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5864f, 4.32714f)
        curveTo(12.6577f, 3.89104f, 11.3422f, 3.89102f, 10.4136f, 4.32714f)
        curveTo(10.0852f, 4.48134f, 9.95517f, 4.84478f, 10.0135f, 5.19157f)
        lineTo(12f, 17.0001f)
        lineTo(13.9865f, 5.19159f)
        curveTo(14.0448f, 4.84479f, 13.9148f, 4.48134f, 13.5864f, 4.32714f)
        }
        }.build()

        return _wifiError02!!
    }

private var _wifiError02: ImageVector? = null
